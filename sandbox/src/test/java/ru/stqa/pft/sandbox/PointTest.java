package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Dmitriy on 04.07.2017.
 */
public class PointTest {

    @Test
    public void testDistance() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(100,100);
        Assert.assertEquals(p1.getDistance(p2), 141.4213562373095);
    }

    @Test
    public void testDistanceBelowZero() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(-100,-100);
        Assert.assertEquals(p1.getDistance(p2), 141.4213562373095);
    }

    @Test
    public void testDistanceBelowZeroSecond() {
        Point p1 = new Point(-100,0);
        Point p2 = new Point(0,100);
        Assert.assertEquals(p1.getDistance(p2), 141.4213562373095);
    }
}
