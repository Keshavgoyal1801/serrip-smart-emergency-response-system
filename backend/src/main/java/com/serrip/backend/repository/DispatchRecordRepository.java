package com.serrip.backend.repository;

import com.serrip.backend.entity.DispatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispatchRecordRepository
        extends JpaRepository<DispatchRecord, Long> {
}