package com.serrip.backend.controller;

import com.serrip.backend.routing.GraphTestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphController {

    private final GraphTestService service;

    public GraphController(
            GraphTestService service) {

        this.service = service;
    }

    @GetMapping("/api/graph/test")
    public String testGraph() {

        service.testGraph();

        return "Graph Created Successfully";
    }
}