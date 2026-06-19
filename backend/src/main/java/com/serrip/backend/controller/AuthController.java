package com.serrip.backend.controller;

import com.serrip.backend.dto.RegisterRequest;
import com.serrip.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {

        return "Authentication Module Working";
    }

    @PostMapping("/register")
    public String registerUser(
            @Valid
            @RequestBody RegisterRequest request) {

        return userService.registerUser(request);
    }
}