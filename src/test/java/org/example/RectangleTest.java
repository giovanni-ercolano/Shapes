package org.example;

import junit.framework.TestCase;

public class RectangleTest extends TestCase {

    public void testTestIntersects() {
        Rectangle r1 = new Rectangle(5, 5,4,6);
        Rectangle r2 = new Rectangle(8, 8,8,12);
        assertTrue(r1.intersects(r2));
    }

    public void testGetIntersection() {
        Rectangle r1 = new Rectangle(5, 5,4,6);
        Rectangle r2 = new Rectangle(8, 8,8,12);
        Rectangle r3 = r1.getIntersection(r2);
        assertEquals(5.5, r3.getX());
        assertEquals(5.0, r3.getY());
        assertEquals(3.0, r3.getWidth());
        assertEquals(6.0, r3.getHeight());
    }
}