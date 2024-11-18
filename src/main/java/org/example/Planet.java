package org.example;

import java.util.List;

public class Planet {
    private String name;
    private double mass;

    private List<Satellite> satellites;

    public Planet(String name, double mass, List<Satellite> satellites) {
        this.name = name;
        this.mass = mass;
        this.satellites = satellites;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public List<Satellite> getSatellites() {
        return satellites;
    }
}
