package com.serrip.backend.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter
        extends OncePerRequestFilter {

    private final JwtService jwtService;

    private final CustomUserDetailsService customUserDetailsService;

    public JwtAuthenticationFilter(

            JwtService jwtService,

            CustomUserDetailsService customUserDetailsService) {

        this.jwtService = jwtService;

        this.customUserDetailsService = customUserDetailsService;
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

        try {

            String username =
                    jwtService.extractUsername(jwt);

            var userDetails =
                    customUserDetailsService
                            .loadUserByUsername(username);

            if (jwtService.isTokenValid(
                    jwt,
                    userDetails.getUsername())) {

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