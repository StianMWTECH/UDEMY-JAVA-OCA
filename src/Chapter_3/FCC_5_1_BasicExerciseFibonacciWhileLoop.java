package Chapter_3;

import java.util.Scanner;

public class FCC_5_1_BasicExerciseFibonacciWhileLoop {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("N = ");
        int numberOfIterations = scanner.nextInt();

        if (numberOfIterations <= 0) {
            System.out.println("Please enter a number greater than 0");
        } else if (numberOfIterations == 1) {
            System.out.println("0");
        }

        int[] output = new int[numberOfIterations];
        output[0] = 0;
        output[1] = 1;

        System.out.println(output[0]);
        System.out.println(output[1]);
        for (int i = 0; i < numberOfIterations; i++) {
            if (i >= 2) {
                output[i] = output[i - 1] + output[i - 2];
                System.out.println(output[i]);
            }
        }
        scanner.close();
    }
}
