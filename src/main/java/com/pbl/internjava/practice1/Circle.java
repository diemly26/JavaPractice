package com.pbl.internjava.practice1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(radius, radius);
    }

    public double area() {
        return Math.PI * width * width;
    }

    public double perimeter() {
        return 2 * Math.PI * width;
    }

    @Override
    public void display() {
        System.out.println("Circle - Radius: " + width + ", Area: " + area() + ", Perimeter: " + perimeter());
    }

}
