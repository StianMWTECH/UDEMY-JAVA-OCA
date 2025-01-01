package Chapter_5_Advanced_Concepts.Intermediate;

interface Displayable {
    public void displayResult(String type, double result);
}

abstract class BaseCalculator {

    abstract void add();
    abstract void subtract();
    abstract void multiply();
    abstract void divide();
    abstract void sin();
    abstract void cos();
    abstract void tan();

}

class ExtendedCalculator extends BaseCalculator implements Displayable {

    double result;

    double num1;
    double num2;

    public ExtendedCalculator(double num1) {
        this.num1 = num1;
    }

    public ExtendedCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    void add() {
        result = num1 + num2;
        displayResult("add",result);
    }

    @Override
    void subtract() {
        result = num1 - num2;
        displayResult("subtract", result);
    }

    @Override
    void multiply() {
            result = num1 * num2;
            displayResult("multiply", result);
    }

    @Override
    void divide() {
        if(num2 != 0) {
            result = num1 / num2;
            displayResult("divide", result);
        } else {
            System.out.println("Cannot divide by zero...");
        }
    }

    @Override
    public void displayResult(String type, double result) {
        this.result = result;
        System.out.println(type + ": " + result);
    }

    @Override
    void sin() {
        double radians = Math.toRadians(num1);
        result = Math.sin(radians);
        displayResult("sin", result);
    }

    @Override
    void cos() {
        double radians = Math.toRadians(num1);
        result = Math.cos(radians);
        displayResult("cos", result);
    }

    @Override
    void tan() {
        double radians = Math.toRadians(num1);
        result = Math.tan(radians);
        displayResult("tan", result);
    }

}

public class FCC_ExtendedCalculator {

    public static void main(String[] args) {

        ExtendedCalculator arithmetic = new ExtendedCalculator(20, 0);
        arithmetic.divide();

        ExtendedCalculator scientific = new ExtendedCalculator(20);
        scientific.sin();
    }
}
