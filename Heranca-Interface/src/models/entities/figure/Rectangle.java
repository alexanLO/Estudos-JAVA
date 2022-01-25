package models.entities.figure;

import models.enums.Color;

public class Rectangle extends AbstractShape {

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "RETANGULO: " + "Cor: " + getColor() + "| Base: " + width + "| Altura: " + height;
    }

}
