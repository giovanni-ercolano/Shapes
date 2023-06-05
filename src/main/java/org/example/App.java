package org.example;

public class App 
{
    public static void main( String[] args )
    {

       Rectangle r1 = new Rectangle(5, 5,4,6);
       Rectangle r2 = new Rectangle(8, 8,8,12);
       System.out.println("Intersezione rettangolo:" + r1.intersects(r2));
       Rectangle r3 = r1.getIntersection(r2);
       System.out.println("Rettangolo intersezione:\nX:" + r3.getX() + "\nY:" + r3.getY() + "\nWidth:" + r3.getWidth() + "\nHeight:" + r3.getHeight());
       System.out.println("Area r3: " + r3.getArea());
    }
}
