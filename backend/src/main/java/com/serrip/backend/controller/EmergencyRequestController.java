package com.serrip.backend.controller;

import com.serrip.backend.dto.EmergencyRequestDTO;
import com.serrip.backend.entity.EmergencyRequest;
import com.serrip.backend.response.ApiResponse;
import com.serrip.backend.service.EmergencyRequestService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emergencies")
public class EmergencyRequestController {

    private final EmergencyRequestService service;

    public EmergencyRequestController(
            EmergencyRequestService service) {

        this.service = service;
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN','DISPATCHER')")
    public ApiResponse<EmergencyRequest> createEmergency(

            @Valid
            @RequestBody
            EmergencyRequestDTO dto) {

        EmergencyRequest saved =
                service.createEmergency(dto);

        return new ApiResponse<>(
                true,
                "Emergency request created successfully",
                saved
        );
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','DISPATCHER')")
    public List<EmergencyRequest> getAllEmergencies() {

        return service.getAllEmergencies();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN','DISPATCHER')")
    public EmergencyRequest getEmergencyById(

            @PathVariable
            Long id) {

        return service.getEmergencyById(id);
    }
}