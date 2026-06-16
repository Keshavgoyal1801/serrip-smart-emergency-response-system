package com.serrip.backend.controller;

import com.serrip.backend.routing.DijkstraService;
import com.serrip.backend.routing.RouteNetworkService;
import com.serrip.backend.routing.RouteResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    private final RouteNetworkService service;
    private final DijkstraService dijkstraService;

    public RouteController(
            RouteNetworkService service,
            DijkstraService dijkstraService) {

        this.service = service;
        this.dijkstraService = dijkstraService;
    }

    @GetMapping("/api/routes")
    public Object getRoutes() {

        return service
                .getRoadGraph()
                .getAdjacencyList();
    }

    @GetMapping("/api/routes/shortest/{start}/{destination}")
    public RouteResult shortestPath(
            @PathVariable int start,
            @PathVariable int destination) {

        return dijkstraService
                .findShortestPath(
                        start,
                        destination);
    }
}