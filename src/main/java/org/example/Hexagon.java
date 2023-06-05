package org.example;

public class Hexagon extends Shape {

    private double side;

    public Hexagon(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (3*Math.sqrt(3)*side*side)/2;
    }

    public double getPerimeter() {
        return side * 6;
    }
}
