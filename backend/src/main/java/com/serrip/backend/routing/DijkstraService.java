package com.serrip.backend.routing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DijkstraService {

    @Autowired
    private RouteNetworkService routeNetworkService;

    public RouteResult findShortestPath(
            int start,
            int destination) {

        RoadGraph graph =
                routeNetworkService.getRoadGraph();

        // Validate nodes exist
        if (!graph.getAdjacencyList().containsKey(start)
                || !graph.getAdjacencyList().containsKey(destination)) {

            return new RouteResult(
                    new ArrayList<>(),
                    -1);
        }

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

        while (!queue.isEmpty()) {

            Integer currentNode = queue.poll();

            if (currentNode == destination) {
                break;
            }

            System.out.println(
                    "Visiting Node: "
                            + currentNode);

            for (GraphEdge edge :
                    graph.getAdjacencyList()
                            .get(currentNode)) {

                double newDistance =
                        distances.get(currentNode)
                                + edge.getDistance();

                if (newDistance <
                        distances.get(
                                edge.getDestination())) {

                    distances.put(
                            edge.getDestination(),
                            newDistance);

                    previousNodes.put(
                            edge.getDestination(),
                            currentNode);

                    queue.add(
                            edge.getDestination());

                    System.out.println(
                            "Updated Distance of Node "
                                    + edge.getDestination()
                                    + " = "
                                    + newDistance);
                }
            }
        }

        // No path found
        if (distances.get(destination)
                == Double.MAX_VALUE) {

            return new RouteResult(
                    new ArrayList<>(),
                    -1);
        }

        List<Integer> path =
                new ArrayList<>();

        Integer current = destination;

        while (current != null) {

            path.add(current);

            current =
                    previousNodes.get(current);
        }

        Collections.reverse(path);

        System.out.println(
                "Shortest Path: "
                        + path);

        System.out.println(
                "Total Distance: "
                        + distances.get(destination));

        System.out.println(
                "Distances: "
                        + distances);

        System.out.println(
                "Previous Nodes: "
                        + previousNodes);

        return new RouteResult(
                path,
                distances.get(destination)
                        .intValue());
    }

}