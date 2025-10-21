package com.pbl.internjava.practice1;

public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void display() {
        System.out.println("Rectangle - Width: " + width + ", Height: " + height + ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}
