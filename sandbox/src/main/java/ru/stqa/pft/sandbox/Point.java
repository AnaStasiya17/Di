package ru.stqa.pft.sandbox;

/**
 * Created by Dmitriy on 03.07.2017.
 */
public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point p) {
            return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "Точка с координатами x: " + this.x + " y: " + this.y;
    }
}
