package com.serrip.backend.repository;

import com.serrip.backend.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepository
        extends JpaRepository<Ambulance, Long> {
}