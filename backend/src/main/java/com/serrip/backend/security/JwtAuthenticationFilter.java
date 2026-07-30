package com.serrip.backend.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import com.serrip.backend.repository.BlacklistedTokenRepository;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter
        extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final BlacklistedTokenRepository blacklistedTokenRepository;

    private final CustomUserDetailsService customUserDetailsService;

    public JwtAuthenticationFilter(

            JwtService jwtService,

            CustomUserDetailsService customUserDetailsService,

            BlacklistedTokenRepository blacklistedTokenRepository) {

        this.jwtService = jwtService;

        this.customUserDetailsService = customUserDetailsService;

        this.blacklistedTokenRepository = blacklistedTokenRepository;
    }

    @Override
    protected void doFilterInternal(

            HttpServletRequest request,

            HttpServletResponse response,

            FilterChain filterChain)

            throws ServletException, IOException {

        String authHeader =
                request.getHeader("Authorization");

        if (authHeader == null
                || !authHeader.startsWith("Bearer ")) {

            filterChain.doFilter(
                    request,
                    response);

            return;
        }

        String jwt =
                authHeader.substring(7);
        if (blacklistedTokenRepository.existsByToken(jwt)) {

            response.setStatus(
                    HttpServletResponse.SC_UNAUTHORIZED);

            response.setContentType("application/json");

            response.getWriter().write("""
        {
            "success": false,
            "message": "Token has been invalidated. Please login again.",
            "data": null
        }
        """);

            return;
        }

        try {

            String username =
                    jwtService.extractUsername(jwt);

            var userDetails =
                    customUserDetailsService
                            .loadUserByUsername(username);

            if (jwtService.isTokenValid(
                    jwt,
                    userDetails.getUsername())) {

                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(
                                userDetails,
                                null,
                                userDetails.getAuthorities());

                authentication.setDetails(
                        new WebAuthenticationDetailsSource()
                                .buildDetails(request));

                SecurityContextHolder
                        .getContext()
                        .setAuthentication(authentication);

                System.out.println(
                        "Authenticated User: "
                                + username);
            }

        }
        catch (Exception ex) {

            System.out.println(
                    "Invalid JWT Token");

            filterChain.doFilter(
                    request,
                    response);

            return;
        }

        filterChain.doFilter(
                request,
                response);
    }
}