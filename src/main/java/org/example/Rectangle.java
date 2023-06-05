package org.example;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle( double x, double y, double width, double height) {
        super( x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double thisLeftX() {
        return this.getX() - (this.getWidth() / 2.0);
    }
    public double thisRightX() {
        return this.getX() + (this.getWidth() / 2.0);
    }
    public double thisTopY() {
        return this.getY() - (this.getHeight() / 2.0);
    }
    public double thisBottomY() {
        return this.getY() + (this.getHeight() / 2.0);
    }
    public double otherLeftX(Rectangle other) {
        return other.getX() - (other.getWidth() / 2.0);
    }
    public double otherRightX(Rectangle other) {
        return other.getX() + (other.getWidth() / 2.0);
    }
    public double otherTopY(Rectangle other) {
        return other.getY() - (other.getHeight() / 2.0);
    }
    public double otherBottomY(Rectangle other) {
        return other.getY() + (other.getHeight() / 2.0);
    }

    public boolean intersects(Rectangle other) {
        return !(thisLeftX() >= otherRightX(other) || thisRightX() <= otherLeftX(other) || thisTopY() >= otherBottomY(other) || thisBottomY() <= otherTopY(other));
    }

    public Rectangle getIntersection(Rectangle other) {
        if (!intersects(other)) {
            return null; // no intersection
        }
        double x1 = Math.max(thisLeftX(), otherLeftX(other));
        double y1 = Math.max(thisTopY(), otherTopY(other));
        double x2 = Math.min(thisRightX(), otherRightX(other));
        double y2 = Math.min(thisBottomY(), otherBottomY(other));

        double centerX = (x1 + x2) / 2.0;
        double centerY = (y1 + y2) / 2.0;
        double newWidth = x2 - x1;
        double newHeight = y2 - y1;

        return new Rectangle(centerX, centerY, newWidth, newHeight);
    }
}
