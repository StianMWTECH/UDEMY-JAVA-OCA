package UdemyAssignments;

import java.util.Scanner;

public class _1_Operators {

    public static void main(String[] args) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();

        logicalOps(x, y);
        simpleMaths(x, y);
        modulus(x, y);
        System.out.println(modulus(x, y));
        incrDecr();
    }

    public static void logicalOps(int x, int y) {
        if (x >= 0 && y >= 0) {
            System.out.println("Both Positive");
        } else if (x < 0 && y < 0) {
            System.out.println("Both Negative");
        } else {
            System.out.println("Either Negative");
        }
    }

    public static void simpleMaths(int x, int y) {
        int sum = x + y;
        int product = x * y;
        int difference = x - y;
        int quotient = x / y;

        System.out.println("The sum of "+x+" and "+y+" is "+sum);
        System.out.println("The product of "+x+" and "+y+" is "+product);
        System.out.println("The difference of "+x+" and "+y+" is "+difference);
        System.out.println("The quotient of "+x+" and "+y+" is "+quotient);
    }

    public static boolean modulus(int x, int y) {
        int result = x % y;

        if (result == 0) {
            System.out.println("x is a multiple of y");
        } else {
            System.out.println("x is not a multiple of y");
        }
        return result == 0;
    }

    public static void incrDecr() {
        int x=0, w=0, y=0, z=0;
        x=4;
        System.out.println(++x); // output 5
        System.out.println(x++); // output 5 // becomes 6
        System.out.println(x); // output 6
        System.out.println(--x); // output 5
        System.out.println(x--); // output 5, becomes 4
        System.out.println(x); // output 4
        w=20;
        x=10;
        y=-5;
        z=0;
        System.out.println( w == x && y != z  ); // 20 == 10 &&...output false
        System.out.println( w == x || y != z  ); // 20 == 10 || -5 != 0.. output true
        System.out.println( ! ( w == (x + z) )  ); // (20 == (10 + 0)) is !false is true
    }

}


