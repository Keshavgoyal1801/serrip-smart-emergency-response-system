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

    public void blockRoad(
            int source,
            int destination) {

        for (GraphEdge edge :
                adjacencyList.get(source)) {

            if (edge.getDestination()
                    == destination) {

                edge.setBlocked(true);
            }
        }

        for (GraphEdge edge :
                adjacencyList.get(destination)) {

            if (edge.getDestination()
                    == source) {

                edge.setBlocked(true);
            }
        }
    }

    public void unblockRoad(
            int source,
            int destination) {

        for (GraphEdge edge :
                adjacencyList.get(source)) {

            if (edge.getDestination()
                    == destination) {

                edge.setBlocked(false);
            }
        }

        for (GraphEdge edge :
                adjacencyList.get(destination)) {

            if (edge.getDestination()
                    == source) {

                edge.setBlocked(false);
            }
        }
    }

    public void setTrafficDelay(
            int source,
            int destination,
            double delay) {

        for (GraphEdge edge :
                adjacencyList.get(source)) {

            if (edge.getDestination()
                    == destination) {

                edge.setTrafficDelay(delay);
            }
        }

        for (GraphEdge edge :
                adjacencyList.get(destination)) {

            if (edge.getDestination()
                    == source) {

                edge.setTrafficDelay(delay);
            }
        }
    }

    public void clearTrafficDelay(
            int source,
            int destination) {

        for (GraphEdge edge :
                adjacencyList.get(source)) {

            if (edge.getDestination()
                    == destination) {

                edge.setTrafficDelay(0);
            }
        }

        for (GraphEdge edge :
                adjacencyList.get(destination)) {

            if (edge.getDestination()
                    == source) {

                edge.setTrafficDelay(0);
            }
        }
    }

    public Map<Integer,
            List<GraphEdge>>
    getAdjacencyList() {

        return adjacencyList;
    }
}