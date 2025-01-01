package Chapter_3;

import java.util.Scanner;

public class FCC_4_1_BasicExerciseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int inputNum1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int inputNum2 = scanner.nextInt();

        System.out.print("Input action: ");
        char action = scanner.next().charAt(0);

        double result;

        switch (action) {
            case '*':
                result = inputNum1 * inputNum2;
                System.out.println(result);
                break;
            case '/':
                if (inputNum2 != 0) {
                    result = (double) inputNum1 / inputNum2;
                    System.out.println(result);
                } else {
                    System.out.println("Can't do that...");
                }
                break;
            case '+':
                result = inputNum1 + inputNum2;
                System.out.println(result);
                break;
            case '-':
                result = inputNum1 - inputNum2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operation...");
        }
    }
}
