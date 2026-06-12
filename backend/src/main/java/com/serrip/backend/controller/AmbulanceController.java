package com.serrip.backend.controller;

import com.serrip.backend.dto.AmbulanceDTO;
import com.serrip.backend.entity.Ambulance;
import com.serrip.backend.response.ApiResponse;
import com.serrip.backend.service.AmbulanceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ambulances")
public class AmbulanceController {

    private final AmbulanceService service;

    public AmbulanceController(AmbulanceService service) {
        this.service = service;
    }

    @PostMapping
    public ApiResponse<Ambulance> createAmbulance(
            @Valid @RequestBody AmbulanceDTO dto) {

        Ambulance saved =
                service.createAmbulance(dto);

        return new ApiResponse<>(
                true,
                "Ambulance created successfully",
                saved
        );
    }

    @GetMapping
    public List<Ambulance> getAllAmbulances() {
        return service.getAllAmbulances();
    }

    @GetMapping("/{id}")
    public Ambulance getAmbulanceById(
            @PathVariable Long id) {

        return service.getAmbulanceById(id);
    }
}