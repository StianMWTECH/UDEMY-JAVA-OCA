package Chapter_5_Advanced_Concepts;

// Define interfaces for different robot capabilities
interface Walkable {
    void walk();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Class representing a Robot that can combine multiple capabilities through interfaces
class Robot implements Walkable, Flyable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Robot is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Robot is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Robot is swimming.");
    }
}

public class FCC_1_2_MultipleInheritance {
    public static void main(String[] args) {
        Robot robot = new Robot();

        // Demonstrate the robot's capabilities
        robot.walk();
        robot.fly();
        robot.swim();
    }
}