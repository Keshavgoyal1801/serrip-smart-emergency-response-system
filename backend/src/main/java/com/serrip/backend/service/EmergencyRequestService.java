package com.serrip.backend.service;

import com.serrip.backend.entity.EmergencyRequest;
import com.serrip.backend.repository.EmergencyRequestRepository;
import org.springframework.stereotype.Service;
import com.serrip.backend.exception.ResourceNotFoundException;
import com.serrip.backend.dto.EmergencyRequestDTO;

import java.util.List;

@Service
public class EmergencyRequestService {

    private final EmergencyRequestRepository repository;

    public EmergencyRequestService(EmergencyRequestRepository repository) {
        this.repository = repository;
    }

    public EmergencyRequest createEmergency(
            EmergencyRequestDTO dto) {

        EmergencyRequest request = new EmergencyRequest();

        request.setCallerName(dto.getCallerName());
        request.setPhone(dto.getPhone());
        request.setLatitude(dto.getLatitude());
        request.setLongitude(dto.getLongitude());
        request.setEmergencyType(dto.getEmergencyType());
        request.setPriority(dto.getPriority());

        return repository.save(request);
    }
    public List<EmergencyRequest> getAllEmergencies() {
        return repository.findAll();
    }

    public EmergencyRequest getEmergencyById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Emergency Request Not Found"));
    }
}