package com.serrip.backend.service;

import com.serrip.backend.entity.Ambulance;
import com.serrip.backend.entity.DispatchRecord;
import com.serrip.backend.entity.EmergencyRequest;
import com.serrip.backend.exception.ResourceNotFoundException;
import com.serrip.backend.repository.AmbulanceRepository;
import com.serrip.backend.repository.DispatchRecordRepository;
import com.serrip.backend.repository.EmergencyRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class DispatchService {

    private final DispatchRecordRepository dispatchRepository;
    private final EmergencyRequestRepository emergencyRepository;
    private final AmbulanceRepository ambulanceRepository;

    public DispatchService(
            DispatchRecordRepository dispatchRepository,
            EmergencyRequestRepository emergencyRepository,
            AmbulanceRepository ambulanceRepository) {

        this.dispatchRepository = dispatchRepository;
        this.emergencyRepository = emergencyRepository;
        this.ambulanceRepository = ambulanceRepository;
    }

    public DispatchRecord dispatch(Long emergencyId,
                                   Long ambulanceId) {

        EmergencyRequest emergency =
                emergencyRepository.findById(emergencyId)
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Emergency Request Not Found"));

        Ambulance ambulance =
                ambulanceRepository.findById(ambulanceId)
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Ambulance Not Found"));

        if (!ambulance.getStatus().equals("AVAILABLE")) {
            throw new RuntimeException(
                    "Ambulance is not available");
        }

        ambulance.setStatus("ON_ROUTE");

        ambulanceRepository.save(ambulance);

        DispatchRecord record =
                new DispatchRecord();

        record.setEmergencyRequestId(
                emergency.getId());

        record.setAmbulanceId(
                ambulance.getId());

        return dispatchRepository.save(record);
    }
}