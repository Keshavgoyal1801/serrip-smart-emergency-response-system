package com.serrip.backend.routing;

public class GraphEdge {

    private int destination;
    private double distance;

    public GraphEdge(
            int destination,
            double distance) {

        this.destination = destination;
        this.distance = distance;
    }

    public int getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "(" +
                destination +
                ", " +
                distance +
                ")";
    }
}