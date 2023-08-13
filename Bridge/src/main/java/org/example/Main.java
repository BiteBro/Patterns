package org.example;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Triangle(new Black());
        shape.draw();
        Shape shape2 = new Cube(new Red());
        shape2.draw();
    }
}