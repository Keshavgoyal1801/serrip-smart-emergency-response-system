package com.serrip.backend.routing;

import java.util.*;

public class RoadGraph {

    private final Map<Integer,
            List<GraphEdge>> adjacencyList
            = new HashMap<>();

    public void addNode(int nodeId) {

        adjacencyList.putIfAbsent(
                nodeId,
                new ArrayList<>());
    }

    public void addEdge(
            int source,
            int destination,
            double distance) {

        adjacencyList.get(source)
                .add(new GraphEdge(
                        destination,
                        distance));

        adjacencyList.get(destination)
                .add(new GraphEdge(
                        source,
                        distance));
    }

    public Map<Integer,
            List<GraphEdge>>
    getAdjacencyList() {

        return adjacencyList;
    }
}