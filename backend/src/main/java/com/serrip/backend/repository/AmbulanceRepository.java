package com.serrip.backend.repository;

import com.serrip.backend.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AmbulanceRepository
        extends JpaRepository<Ambulance, Long> {

    Optional<Ambulance> findFirstByStatus(String status);

    List<Ambulance> findByStatus(String status);
}