package com.serrip.backend.controller;

import com.serrip.backend.routing.DijkstraService;
import com.serrip.backend.routing.RouteNetworkService;
import com.serrip.backend.routing.RouteResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @PostMapping("/api/routes/block")
    public String blockRoad(
            @RequestParam int source,
            @RequestParam int destination) {

        service.blockRoad(
                source,
                destination);

        return "Road blocked between "
                + source
                + " and "
                + destination;
    }

    @PostMapping("/api/routes/unblock")
    public String unblockRoad(
            @RequestParam int source,
            @RequestParam int destination) {

        service.unblockRoad(
                source,
                destination);

        return "Road unblocked between "
                + source
                + " and "
                + destination;
    }

    @PostMapping("/api/routes/traffic")
    public String setTrafficDelay(
            @RequestParam int source,
            @RequestParam int destination,
            @RequestParam double delay) {

        service.setTrafficDelay(
                source,
                destination,
                delay);

        return "Traffic delay set between "
                + source
                + " and "
                + destination
                + " = "
                + delay;
    }

    @PostMapping("/api/routes/traffic/clear")
    public String clearTrafficDelay(
            @RequestParam int source,
            @RequestParam int destination) {

        service.clearTrafficDelay(
                source,
                destination);

        return "Traffic delay cleared between "
                + source
                + " and "
                + destination;
    }
}