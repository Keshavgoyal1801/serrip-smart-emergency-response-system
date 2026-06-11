package com.serrip.backend.controller;

import com.serrip.backend.dto.HospitalDTO;
import com.serrip.backend.entity.Hospital;
import com.serrip.backend.response.ApiResponse;
import com.serrip.backend.service.HospitalService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {

    private final HospitalService service;

    public HospitalController(HospitalService service) {
        this.service = service;
    }

    @PostMapping
    public ApiResponse<Hospital> createHospital(
            @Valid @RequestBody HospitalDTO dto) {

        Hospital saved =
                service.createHospital(dto);

        return new ApiResponse<>(
                true,
                "Hospital created successfully",
                saved
        );
    }

    @GetMapping
    public List<Hospital> getAllHospitals() {
        return service.getAllHospitals();
    }

    @GetMapping("/{id}")
    public Hospital getHospitalById(
            @PathVariable Long id) {

        return service.getHospitalById(id);
    }
}