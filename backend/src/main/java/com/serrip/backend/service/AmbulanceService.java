package com.serrip.backend.service;

import com.serrip.backend.dto.AmbulanceDTO;
import com.serrip.backend.entity.Ambulance;
import com.serrip.backend.exception.ResourceNotFoundException;
import com.serrip.backend.repository.AmbulanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbulanceService {

    private final AmbulanceRepository repository;

    public AmbulanceService(AmbulanceRepository repository) {
        this.repository = repository;
    }

    public Ambulance createAmbulance(AmbulanceDTO dto) {

        Ambulance ambulance = new Ambulance();

        ambulance.setAmbulanceNumber(dto.getAmbulanceNumber());
        ambulance.setDriverName(dto.getDriverName());
        ambulance.setPhone(dto.getPhone());
        ambulance.setLatitude(dto.getLatitude());
        ambulance.setLongitude(dto.getLongitude());

        return repository.save(ambulance);
    }

    public List<Ambulance> getAllAmbulances() {
        return repository.findAll();
    }

    public Ambulance getAmbulanceById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Ambulance Not Found"));
    }
}