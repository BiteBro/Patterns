package org.example;

public class Cube extends Shape{
    public Cube(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("draw cube");
        color.paint();
    }
}
