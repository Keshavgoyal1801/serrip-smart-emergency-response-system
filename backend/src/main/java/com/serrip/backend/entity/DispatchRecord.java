package com.serrip.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dispatch_records")
public class DispatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long emergencyRequestId;

    private Long ambulanceId;

    private String dispatchStatus;

    private LocalDateTime dispatchedAt;

    public DispatchRecord() {
        this.dispatchedAt = LocalDateTime.now();
        this.dispatchStatus = "DISPATCHED";
    }

    public Long getId() {
        return id;
    }

    public Long getEmergencyRequestId() {
        return emergencyRequestId;
    }

    public void setEmergencyRequestId(Long emergencyRequestId) {
        this.emergencyRequestId = emergencyRequestId;
    }

    public Long getAmbulanceId() {
        return ambulanceId;
    }

    public void setAmbulanceId(Long ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public String getDispatchStatus() {
        return dispatchStatus;
    }

    public void setDispatchStatus(String dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public LocalDateTime getDispatchedAt() {
        return dispatchedAt;
    }
}