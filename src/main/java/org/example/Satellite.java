package org.example;

public class Satellite {
    private String name;
    private double mass;
    private String color;

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public String getColor() {
        return color;
    }

    public Satellite(String name, double mass, String color) {
        this.name = name;
        this.mass = mass;
        this.color = color;
    }
}
