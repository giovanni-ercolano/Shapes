package org.example;

public class Shape extends CPoint {

    private double Area = 0;
    private double Perimeter = 0;

    public Shape(double x, double y) {
        super(x, y);
    }


    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }
}
