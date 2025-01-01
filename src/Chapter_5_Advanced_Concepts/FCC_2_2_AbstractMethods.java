package Chapter_5_Advanced_Concepts;

// Abstract class with an abstract method
abstract class Shape3 {
    // Abstract method declaration
    public abstract double calculateArea();
}

// Concrete subclass Circle extending Shape
class Circle3 extends Shape3 {
    private double radius;

    public Circle3(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass Rectangle extending Shape
class Rectangle3 extends Shape3 {
    private double width;
    private double height;

    public Rectangle3(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class FCC_2_2_AbstractMethods {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle3 circle = new Circle3(5.0);
        Rectangle3 rectangle = new Rectangle3(4.0, 6.0);

        // Calculate and print the areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}