package Chapter_5_Advanced_Concepts.Beginner;

interface Displayable {
    public void displayResult(double result);
}

abstract class Calculator {

    double num1;
    double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    abstract void add();
    abstract void subtract();
    abstract void multiply();
    abstract void divide();

}

class BasicCalculator extends Calculator implements Displayable {

    double result;

    public BasicCalculator(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    void add() {
        result = num1 + num2;
        displayResult(result);
    }

    @Override
    void subtract() {
        result = num1 - num2;
        displayResult(result);
    }

    @Override
    void multiply() {
        result = num1 * num2;
        displayResult(result);
    }

    @Override
    void divide() {
        result = num1 / num2;
        displayResult(result);
    }

    @Override
    public void displayResult(double result) {
        this.result = result;
        System.out.println(STR."Answer: \{result}");
    }

}

public class FCC_Calculator {

    public static void main(String[] args) {

        BasicCalculator basicCalc1 = new BasicCalculator(2, 4);

//        basicCalc1.add();
//        basicCalc1.subtract();
        basicCalc1.divide();
//        basicCalc1.multiply();

    }
}
