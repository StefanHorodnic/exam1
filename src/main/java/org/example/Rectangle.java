package org.example;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateSurface() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }
}
