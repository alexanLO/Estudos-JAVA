package models.entities.figure;

import models.enums.Color;

public class Cicle extends AbstractShape {

    private double radius;
    private static final double PI = 3.1416;

    public Cicle(Color color, double radius) {
        super(color);
        this.setRadius(radius);
    }

    public Cicle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius;
    }

    @Override
    public String toString() {
        return "CIRCULO: " + "Cor: " + getColor() + "| PI: " + PI + "| Radius: " + radius;
    }
}
