package com.serrip.backend.repository;

import com.serrip.backend.entity.EmergencyRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyRequestRepository
        extends JpaRepository<EmergencyRequest, Long> {
}