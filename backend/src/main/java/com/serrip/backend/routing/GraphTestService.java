package com.serrip.backend.routing;

import org.springframework.stereotype.Service;

@Service
public class GraphTestService {

    public void testGraph() {

        RoadGraph graph = new RoadGraph();

        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);

        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 4, 4);
        graph.addEdge(3, 4, 1);

        System.out.println(
                graph.getAdjacencyList());
    }
}