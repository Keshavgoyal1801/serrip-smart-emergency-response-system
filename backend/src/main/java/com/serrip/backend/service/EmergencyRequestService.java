package com.serrip.backend.service;

import com.serrip.backend.entity.EmergencyRequest;
import com.serrip.backend.repository.EmergencyRequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmergencyRequestService {

    private final EmergencyRequestRepository repository;

    public EmergencyRequestService(EmergencyRequestRepository repository) {
        this.repository = repository;
    }

    public EmergencyRequest createEmergency(EmergencyRequest request) {
        return repository.save(request);
    }

    public List<EmergencyRequest> getAllEmergencies() {
        return repository.findAll();
    }

    public EmergencyRequest getEmergencyById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Emergency Request Not Found"));
    }
}