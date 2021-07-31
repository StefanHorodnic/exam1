package org.example;

public class Square implements Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateSurface() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4* side;
    }
}
