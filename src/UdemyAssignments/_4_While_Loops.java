package UdemyAssignments;

import java.util.Scanner;

public class _4_While_Loops {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        thirdOrderPolynomial();
//        whileAverage();
//        whileGrades();
//        whileHistogram();
        whileLargestSmallest();

    }

    public static void thirdOrderPolynomial() {
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();

        String keepGoing = new String("yes");

        while (keepGoing.equalsIgnoreCase("yes")) {
            System.out.print("Enter x: ");
            double x = sc.nextDouble();

            double fx = a*(Math.pow(x, 3)) + b*(Math.pow(x, 2)) + c*x + d;
            System.out.println("Result: "+fx);

            System.out.println("Do you want to continue? (yes or no) ");
            sc.nextLine(); // consume leftover line
            keepGoing = sc.nextLine();
            if (!keepGoing.equalsIgnoreCase("yes") && !keepGoing.equalsIgnoreCase("no")) {
                System.out.println("Invalid input, exiting...");
                break;
            }
        }
    }

    public static void whileAverage() {
        System.out.println("How many numbers? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
        } else {

            int[] num = new int[n];
            int total = 0;

            int i = 0;
            while (i < n) {
                System.out.println("Enter a number: ");
                num[i] = sc.nextInt();
                total += num[i];
                i++;
            }

            double average = (double) total/n;
            System.out.println("Average: "+ average);

        }
    }

    public static void whileGrades() {
        String keepGoing = "y";

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;

        while (!keepGoing.equalsIgnoreCase("x")) {
            System.out.println("Enter a grade: ");
            String grade = sc.nextLine();
            if (grade.equalsIgnoreCase("A")) {
                A++;
            } else if (grade.equalsIgnoreCase("B")) {
                B++;
            } else if (grade.equalsIgnoreCase("C")) {
                C++;
            } else if (grade.equalsIgnoreCase("D")) {
                D++;
            } else if (grade.equalsIgnoreCase("E")) {
                E++;
            } else if (grade.equalsIgnoreCase("F")) {
                F++;
            } else {
                System.out.println("Invalid grade: "+grade);
            }

            System.out.println("Enter another grade? (X to exit)");
            keepGoing = sc.nextLine();
        }

        System.out.println("A's: "+A);
        System.out.println("B's: "+B);
        System.out.println("C's: "+C);
        System.out.println("D's: "+D);
        System.out.println("E's: "+E);
        System.out.println("F's: "+F);
    }

    public static void whileHistogram() {
        int rows = 0, cols = 0, i = 0, j = 0;

        System.out.println("Rows: ");
        rows = sc.nextInt();
        System.out.println("Cols: ");
        cols = sc.nextInt();

        while (i < rows) {
            j = 0;
            while (j < cols) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void whileLargestSmallest() {
        int n, smallest, largest;

        System.out.println("Enter n: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error...");
        } else {

            int[] amount = new int[n];
            int i = 0;

            while (i < n) {
                System.out.println("Enter a number: ");
                amount[i] = sc.nextInt();
                i++;
            }

            largest = amount[0];
            smallest = amount[0];

            i = 0;
            while (i < amount.length) {

                if (amount[i] < smallest) {
                    smallest = amount[i];
                }
                if (amount[i] > largest) {
                    largest = amount[i];
                }

                i++;
            }

            System.out.println("Smallest: " + smallest);
            System.out.println("Largest: " + largest);
        }

    }
}
