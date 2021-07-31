package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @Test
    public void shouldAddSquareToDrawingTool(){
        DrawingTool drawingTool = new DrawingTool();
        Shape square = new Square(5);
        drawingTool.addShape(square);
        assertTrue(drawingTool.getShapes().contains(square));
    }

    @Test
    public void shouldAddAllShapesToDrawingTool(){
        DrawingTool drawingTool = new DrawingTool();

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,7);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(4,6,8);

        drawingTool.addShape(square);
        drawingTool.addShape(rectangle);
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);

        assertTrue(drawingTool.getShapes().size() == 4);
    }

    @Test
    public void shouldNotAddTwoSquaresToDrawingTool(){
        DrawingTool drawingTool = new DrawingTool();
        Shape square1 = new Square(5);
        Shape square2 = new Square(8);
        drawingTool.addShape(square1);
        drawingTool.addShape(square2);
        assertTrue(drawingTool.getShapes().size() == 1);
    }

    @Test
    public void shouldCalculateSumOfShapesPerimeter(){
        DrawingTool drawingTool = new DrawingTool();

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,7);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(4,6,8);

        drawingTool.addShape(square);
        drawingTool.addShape(rectangle);
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);

        assertTrue(drawingTool.calculatePerimeterSum() == square.calculatePerimeter()+
                rectangle.calculatePerimeter()+circle.calculatePerimeter()+ triangle.calculatePerimeter());
    }

    @Test
    public void shouldCalculateSumOfShapesSurface(){
        DrawingTool drawingTool = new DrawingTool();

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5,7);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(4,6,8);

        drawingTool.addShape(square);
        drawingTool.addShape(rectangle);
        drawingTool.addShape(circle);
        drawingTool.addShape(triangle);

        assertTrue(drawingTool.calculateSurfaceSum() == square.calculateSurface()+
                rectangle.calculateSurface()+circle.calculateSurface()+ triangle.calculateSurface());
    }
}
