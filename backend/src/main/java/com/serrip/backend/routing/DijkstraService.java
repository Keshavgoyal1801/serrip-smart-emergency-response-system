package com.serrip.backend.routing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Service
public class DijkstraService {

    @Autowired
    private RouteNetworkService routeNetworkService;

    public RouteResult findShortestPath(
            int start,
            int destination) {

        RoadGraph graph =
                routeNetworkService.getRoadGraph();

        Map<Integer, Double> distances =
                new HashMap<>();

        Map<Integer, Integer> previousNodes =
                new HashMap<>();

        for (Integer node :
                graph.getAdjacencyList().keySet()) {

            distances.put(
                    node,
                    Double.MAX_VALUE);
        }

        distances.put(start, 0.0);

        PriorityQueue<Integer> queue =
                new PriorityQueue<>(
                        (a, b) ->
                                Double.compare(
                                        distances.get(a),
                                        distances.get(b)));

        queue.add(start);

        System.out.println("Distances: " + distances);
        System.out.println("Queue: " + queue);

        return null;
    }
}