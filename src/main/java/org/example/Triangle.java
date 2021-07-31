package org.example;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{

    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculatePerimeter(){
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double calculateSurface(){
        double sP = this.calculatePerimeter()/2;
        return sqrt(sP*(sP- firstSide)*(sP- secondSide)*(sP- thirdSide));
    }
}
