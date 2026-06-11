package com.serrip.backend.service;

import com.serrip.backend.dto.HospitalDTO;
import com.serrip.backend.entity.Hospital;
import com.serrip.backend.exception.ResourceNotFoundException;
import com.serrip.backend.repository.HospitalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    private final HospitalRepository repository;

    public HospitalService(HospitalRepository repository) {
        this.repository = repository;
    }

    public Hospital createHospital(HospitalDTO dto) {

        Hospital hospital = new Hospital();

        hospital.setHospitalName(dto.getHospitalName());
        hospital.setAddress(dto.getAddress());
        hospital.setLatitude(dto.getLatitude());
        hospital.setLongitude(dto.getLongitude());
        hospital.setAvailableBeds(dto.getAvailableBeds());
        hospital.setContactNumber(dto.getContactNumber());

        return repository.save(hospital);
    }

    public List<Hospital> getAllHospitals() {
        return repository.findAll();
    }

    public Hospital getHospitalById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Hospital Not Found"));
    }
}