package Chapter_5_Advanced_Concepts;

// Define a basic interface for Drawable objects
interface Drawable {
    void draw();
}

// Define an interface for Modifiable shapes with additional methods
interface ModifiableShape extends Drawable {
    void setSize(double width, double height);
    void setColor(String color);
}

// Class representing a Circle that implements ModifiableShape
class Circle implements ModifiableShape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void setSize(double width, double height) {
        this.radius = Math.max(width, height) / 2;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius + " and color " + color);
    }
}

// Class representing a Rectangle that implements ModifiableShape
class Rectangle implements ModifiableShape {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with dimensions " + width + "x" + height + " and color " + color);
    }
}

public class FCC_1_1_Interfaces{
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        ModifiableShape circle = new Circle(5.0, "Red");
        ModifiableShape rectangle = new Rectangle(4.0, 6.0, "Blue");

        // Modify and draw shapes without knowing their specific implementations
        circle.setSize(8.0, 8.0);
        circle.setColor("Green");
        circle.draw();

        rectangle.setSize(5.0, 7.0);
        rectangle.setColor("Yellow");
        rectangle.draw();
    }
}