package com.serrip.backend.controller;

import com.serrip.backend.entity.EmergencyRequest;
import com.serrip.backend.service.EmergencyRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emergencies")
public class EmergencyRequestController {

    private final EmergencyRequestService service;

    public EmergencyRequestController(EmergencyRequestService service) {
        this.service = service;
    }

    @PostMapping
    public EmergencyRequest createEmergency(
            @RequestBody EmergencyRequest request) {
        return service.createEmergency(request);
    }

    @GetMapping
    public List<EmergencyRequest> getAllEmergencies() {
        return service.getAllEmergencies();
    }

    @GetMapping("/{id}")
    public EmergencyRequest getEmergencyById(
            @PathVariable Long id) {
        return service.getEmergencyById(id);
    }
}