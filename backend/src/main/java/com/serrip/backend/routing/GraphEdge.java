package com.serrip.backend.routing;

public class GraphEdge {

    private int destination;
    private double distance;
    private boolean blocked;
    private double trafficDelay;

    public GraphEdge(
            int destination,
            double distance) {

        this.destination = destination;
        this.distance = distance;
        this.blocked = false;
        this.trafficDelay = 0;
    }

    public int getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public double getTrafficDelay() {
        return trafficDelay;
    }

    public void setTrafficDelay(
            double trafficDelay) {

        this.trafficDelay = trafficDelay;
    }

    @Override
    public String toString() {
        return "(" +
                destination +
                ", " +
                distance +
                ", blocked=" +
                blocked +
                ", trafficDelay=" +
                trafficDelay +
                ")";
    }
}