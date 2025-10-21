package com.pbl.internjava.practice1;

public class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Shape() {}

    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
