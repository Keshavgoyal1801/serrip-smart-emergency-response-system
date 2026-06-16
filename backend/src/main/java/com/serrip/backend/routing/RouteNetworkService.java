package com.serrip.backend.routing;

import org.springframework.stereotype.Service;

@Service
public class RouteNetworkService {

    private final RoadGraph graph;

    public RouteNetworkService() {

        graph = new RoadGraph();

        initializeGraph();
    }

    private void initializeGraph() {

        for (int i = 1; i <= 8; i++) {
            graph.addNode(i);
        }

        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 2);

        graph.addEdge(2, 4, 5);
        graph.addEdge(2, 5, 10);

        graph.addEdge(3, 6, 3);

        graph.addEdge(6, 5, 4);

        graph.addEdge(4, 7, 2);

        graph.addEdge(5, 7, 3);

        graph.addEdge(7, 8, 1);
    }

    public RoadGraph getRoadGraph() {
        return graph;
    }
}