package Chapter_5_Advanced_Concepts;

// Interface for Drawable objects
interface Drawable1 {
    void draw();
}

// Abstract class representing a Shape
abstract class Shape1 implements Drawable1 {
    private String color;

    public Shape1(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Concrete method to print the color
    public void printColor() {
        System.out.println("Color: " + color);
    }

    // Implementing the draw method from the Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a shape with color " + color);
    }
}

// Concrete class Circle extending Shape
class Circle1 extends Shape1 {
    private double radius;

    public Circle1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override to provide the area calculation for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class Rectangle extending Shape
class Rectangle1 extends Shape1 {
    private double width;
    private double height;

    public Rectangle1(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Override to provide the area calculation for a rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class FCC_2_1_AbstractClasses {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle1 circle = new Circle1("Red", 5.0);
        Rectangle1 rectangle = new Rectangle1("Blue", 4.0, 6.0);

        // Call methods and demonstrate the use of interfaces
        circle.printColor();
        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.draw();

        System.out.println();

        rectangle.printColor();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        rectangle.draw();
    }
}
