package Chapter_5_Advanced_Concepts;

import java.util.ArrayList;
import java.util.List;

// Define an interface for shapes
interface Shape {
    double calculateArea();
}

// Class representing a Circle that implements the Shape interface
class RoundCircle implements Shape {
    private double radius;

    public RoundCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class representing a Rectangle that implements the Shape interface
class SquareRectangle implements Shape {
    private double width;
    private double height;

    public SquareRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Class to calculate the total area of a list of shapes
class ShapeCalculator {
    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            System.out.println(totalArea);
        }
        return totalArea;
    }
}

public class FCC_1_3_DynamicPolymorphism {
    public static void main(String[] args) {
        // Create a list of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RoundCircle(5.0));
        shapes.add(new SquareRectangle(4.0, 6.0));

        // Calculate and print the total area using dynamic polymorphism
        double totalArea = ShapeCalculator.calculateTotalArea(shapes);
        System.out.println("Total Area of Shapes: " + totalArea);
    }
}
