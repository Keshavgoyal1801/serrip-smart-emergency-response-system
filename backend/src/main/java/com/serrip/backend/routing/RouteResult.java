package com.serrip.backend.routing;

import java.util.List;

public class RouteResult {

    private List<Integer> path;
    private int totalDistance;

    public RouteResult() {
    }

    public RouteResult(List<Integer> path, int totalDistance) {
        this.path = path;
        this.totalDistance = totalDistance;
    }

    public List<Integer> getPath() {
        return path;
    }

    public void setPath(List<Integer> path) {
        this.path = path;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }
}