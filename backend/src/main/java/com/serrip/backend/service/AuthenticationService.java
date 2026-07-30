package com.serrip.backend.service;

import com.serrip.backend.dto.LoginRequest;
import com.serrip.backend.dto.LoginResponse;
import com.serrip.backend.dto.LogoutResponse;
import com.serrip.backend.dto.RegisterRequest;
import com.serrip.backend.entity.BlacklistedToken;
import com.serrip.backend.entity.User;
import com.serrip.backend.repository.BlacklistedTokenRepository;
import com.serrip.backend.repository.UserRepository;
import com.serrip.backend.security.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;
    private final BlacklistedTokenRepository blacklistedTokenRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationService(
            UserRepository userRepository,
            BlacklistedTokenRepository blacklistedTokenRepository,
            PasswordEncoder passwordEncoder,
            AuthenticationManager authenticationManager,
            JwtService jwtService) {

        this.userRepository = userRepository;
        this.blacklistedTokenRepository = blacklistedTokenRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    public String register(RegisterRequest request) {

        if (userRepository.findByUsername(
                request.getUsername()).isPresent()) {

            return "Username already exists";
        }

        User user = new User();

        user.setUsername(
                request.getUsername());

        user.setPassword(
                passwordEncoder.encode(
                        request.getPassword()));

        // For testing
        user.setRole(request.getRole());

        // Production
        // user.setRole(Role.DISPATCHER);

        userRepository.save(user);

        return "User Registered Successfully";
    }

    public LoginResponse login(
            LoginRequest request) {

        authenticationManager.authenticate(

                new UsernamePasswordAuthenticationToken(

                        request.getUsername(),

                        request.getPassword()));

        String token =
                jwtService.generateToken(
                        request.getUsername());

        return new LoginResponse(token);
    }

    public LogoutResponse logout(String token) {

        BlacklistedToken blacklistedToken =
                new BlacklistedToken();

        blacklistedToken.setToken(token);

        // Token expires after 24 hours (same as JWT validity)
        blacklistedToken.setExpiryTime(
                LocalDateTime.now().plusDays(1));

        blacklistedTokenRepository.save(
                blacklistedToken);

        return new LogoutResponse(
                "Logout successful");
    }
}