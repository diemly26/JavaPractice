package com.pbl.internjava.practice1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(10, 5);
        Rectangle rectangle = new Rectangle(4, 7);
        Circle circle = new Circle(3.5);

        shape.display();
        rectangle.display();
        circle.display();
    }
}
