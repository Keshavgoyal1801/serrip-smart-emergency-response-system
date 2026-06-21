package com.serrip.backend.controller;

import com.serrip.backend.dto.LoginRequest;
import com.serrip.backend.dto.LoginResponse;
import com.serrip.backend.dto.RegisterRequest;
import com.serrip.backend.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationService authenticationService;

    public AuthController(
            AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
    }

    @GetMapping("/test")
    public String test() {

        return "Authentication Module Working";
    }

    @PostMapping("/register")
    public String register(

            @Valid
            @RequestBody
            RegisterRequest request) {

        return authenticationService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(

            @Valid
            @RequestBody
            LoginRequest request) {

        return authenticationService.login(request);
    }
}