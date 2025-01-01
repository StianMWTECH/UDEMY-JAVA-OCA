package Chapter_5_Advanced_Concepts;

// Define an interface for shapes with methods for area and perimeter
interface Shape2 {
    double calculateArea();
    double calculatePerimeter();
}

// Class representing a Circle that implements the Shape interface
class RounderCircle implements Shape2 {
    private double radius;

    public RounderCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class representing a Rectangle that implements the Shape interface
class SquarerRectangle implements Shape2 {
    private double width;
    private double height;

    public SquarerRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class FCC_1_4_AbstractionInAPIDesign {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape2 circle = new RounderCircle(5.0);
        Shape2 rectangle = new SquarerRectangle(4.0, 6.0);

        // Calculate and display area and perimeter using the interface
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}