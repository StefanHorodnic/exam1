package org.example;

import static java.lang.Math.PI;

public class Circle implements Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return PI*radius*radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
