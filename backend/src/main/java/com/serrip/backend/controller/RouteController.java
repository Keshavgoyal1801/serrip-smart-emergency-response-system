package com.serrip.backend.controller;

import com.serrip.backend.routing.RouteNetworkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    private final RouteNetworkService service;

    public RouteController(
            RouteNetworkService service) {

        this.service = service;
    }

    @GetMapping("/api/routes")
    public Object getRoutes() {

        return service
                .getGraph()
                .getAdjacencyList();
    }
}