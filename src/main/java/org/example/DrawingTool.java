package org.example;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {

    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }

    public DrawingTool() {
        this.shapes = new ArrayList<Shape>();
    }

    public double calculatePerimeterSum(){
        double sum = 0;
        for (Shape shape: shapes) {
            sum = sum + shape.calculatePerimeter();
        }
        return sum;
    }

    public double calculateSurfaceSum(){
        double sum = 0;
        for (Shape shape:shapes) {
            sum = sum + shape.calculateSurface();
        }
        return sum;
    }

    public void addShape(Shape shape){
        if(!checkIfShapeTypeIsInList(shape)){
            shapes.add(shape);
        }
        else{
            System.out.println("Nu poți adăuga mai multe forme de același tip.");
        }
    }

    private boolean checkIfShapeTypeIsInList(Shape shape){

        boolean a = false;

        for(Shape s : shapes){
            if (s.getClass() == shape.getClass()){
                a = true;
            }
        }
        return a;
    }
}
