package org.example;

public class Square extends Shape{

    private double side;

    public Square( double x, double y, double side) {
        super( x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}
