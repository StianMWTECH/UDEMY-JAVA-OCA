package Chapter_3;

class BasicArithmeticOperators {

    int sum = 3 + 4;
    int diff = 10 - 3;
    int product = 7 * 3;
    double quotient = 20.0 / 3;
    int remainder = 7 % 3;

    public void printAllBasicArithmeticAnswers() {
        System.out.println("sum: 3 + 4 = " + sum);
        System.out.println("difference: 10 - 3 = " + diff);
        System.out.println("product: 7 * 3 = " + product);
        System.out.println("quotient: 20.0 / 3 = " + quotient);
        System.out.println("remainder: 7 % 3 = " + remainder);
    }
}

class UnaryOperators {

    int x = 5;
    int y = --x; // y is 4, since it is a prefix
    // x is 4
    int z = x++; // z is also 4, since it is a POSTFIX
    // now x is 5 again
    int t = ++x + y + z; // x is still 5 when calculating t
    // x is now 6 but will only show up when printing x

    public void printUnaryAnswer() {
        System.out.println("t: 5 + 4 + 5" + t);
        System.out.println("z: " + z);
        System.out.println("y: " + y);
        System.out.println("x: " + x);
    }

}

class CompoundAssignmentOperators {
    int x = 10;
    {
        x += 5;
    }

    public void printCompoundedValues() {
        System.out.println("Compound: x += 5 is " + x);
    }
}

class ImportanceOfDataTypes {
    double floatingPointArith = 10.0 / 3;
    int wholeNumber = 10 / 3;

    double sumAbove = floatingPointArith + wholeNumber; // can promote wholeNumber
//    int sumAbove1 = floatingPointArith + wholeNumber; // can't demote double to int

    public void printExceptions() {
        System.out.println("Floating Point Arithmetic: 10.0 / 3 = " + floatingPointArith);
        System.out.println("Integer Arithmetic: 10 / 3 = " + wholeNumber);
        System.out.println("Auto promotion: " + sumAbove);
    }
}

class MathMethodsAndClasses {
    double mathPow = Math.pow(2, 3);
    double mathSqrt = Math.sqrt(64);

    public void printMath() {
        System.out.println("Math.pow(2,3) = " + mathPow);
        System.out.println("Math.sqrt(64) = " + mathSqrt);
    }
}


public class FCC_1_ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println();

        BasicArithmeticOperators basic = new BasicArithmeticOperators();
        basic.printAllBasicArithmeticAnswers();

        System.out.println();

        UnaryOperators unary = new UnaryOperators();
        unary.printUnaryAnswer();

        System.out.println();

        CompoundAssignmentOperators compound = new CompoundAssignmentOperators();
        compound.printCompoundedValues();

        System.out.println();

        ImportanceOfDataTypes types = new ImportanceOfDataTypes();
        types.printExceptions();

        System.out.println();

        MathMethodsAndClasses math = new MathMethodsAndClasses();
        math.printMath();

    }
}
