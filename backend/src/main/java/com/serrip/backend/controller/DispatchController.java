package com.serrip.backend.controller;

import com.serrip.backend.entity.DispatchRecord;
import com.serrip.backend.response.ApiResponse;
import com.serrip.backend.service.DispatchService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dispatch")
public class DispatchController {

    private final DispatchService service;

    public DispatchController(DispatchService service) {
        this.service = service;
    }

    @PostMapping("/{emergencyId}/{ambulanceId}")
    public ApiResponse<DispatchRecord> dispatch(
            @PathVariable Long emergencyId,
            @PathVariable Long ambulanceId) {

        DispatchRecord record =
                service.dispatch(
                        emergencyId,
                        ambulanceId);

        return new ApiResponse<>(
                true,
                "Ambulance dispatched successfully",
                record
        );
    }
}