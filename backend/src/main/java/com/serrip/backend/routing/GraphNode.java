package com.serrip.backend.routing;

public class GraphNode {

    private int id;
    private String name;

    public GraphNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}