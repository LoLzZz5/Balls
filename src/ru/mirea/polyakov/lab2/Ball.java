package ru.mirea.polyakov.lab2;

public class Ball {
    private double radius;
    private String color;

    public Ball() {
        radius = 1.0;
        color = "Pink";
    }
    public Ball(double r) {
        radius = r;
        color = "Blue";
    }
    public Ball(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
