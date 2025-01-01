package UdemyAssignments;

import java.util.Scanner;

public class _3_For_loops {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        forLargestSmallest();
//        forHistogram();
//        forAverage();
        twelveDaysOfChristmas();

    }

    public static void forLargestSmallest() {
        System.out.print("Give me an amount n: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        if (n <= 0) {
            System.out.println("Too small...");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a number: ");
                num[i] = sc.nextInt();
            }
            int max = num[0];
            int min = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
                if (num[i] < min) {
                    min = num[i];
                }
            }
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }

    public static void forHistogram() {
        System.out.print("Number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Number of cols: ");
        int cols = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void forAverage() {
        System.out.print("How many numbers: ");
        int n = sc.nextInt();
        int total = 0;
        if (n <= 0) {
            System.out.println("Nope...");
        } else {
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a number: ");
                numbers[i] = sc.nextInt();
                total += numbers[i];
            }
            double average = (double) total/n;
            System.out.println(average);
        }
    }

    public static void twelveDaysOfChristmas() {

        System.out.println();
        for (int i = 1; i <= 12; i++) {
            System.out.print("On the ");
            switch (i) {
                case 1:
                    System.out.print("first");
                    break;
                case 2:
                    System.out.print("second");
                    break;
                case 3:
                    System.out.print("third");
                    break;
                case 4:
                    System.out.print("fourth");
                    break;
                case 5:
                    System.out.print("fifth");
                    break;
                case 6:
                    System.out.print("sixth");
                    break;
                case 7:
                    System.out.print("seventh");
                    break;
                case 8:
                    System.out.print("eighth");
                    break;
                case 9:
                    System.out.print("ninth");
                    break;
                case 10:
                    System.out.print("tenth");
                    break;
                case 11:
                    System.out.print("eleventh");
                    break;
                case 12:
                    System.out.print("twelfth");
                    break;
            }
            System.out.print(" day of Christmas,");
            System.out.println();
            System.out.println("My true love sent to me:");
            switch (i) {
                case 1:
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 11:
                    System.out.println("Eleven pipers piping,");
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
                case 12:
                    System.out.println("Twelve drummers drumming,");
                    System.out.println("Eleven pipers piping,");
                    System.out.println("Ten lords a-leaping,");
                    System.out.println("Nine ladies dancing,");
                    System.out.println("Eight maids a-milking,");
                    System.out.println("Seven swans a-swimming,");
                    System.out.println("Six geese a-laying,");
                    System.out.println("Five golden rings,");
                    System.out.println("Four calling birds,");
                    System.out.println("Three French hens,");
                    System.out.println("Two turtle doves, and");
                    System.out.println("A partridge in a pear tree.");
                    System.out.println();
                    break;
            }
            System.out.println();
        }
    }
}
