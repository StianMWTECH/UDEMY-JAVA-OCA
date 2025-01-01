package UdemyAssignments;

import java.util.Scanner;

public class _2_ConditionalLogic {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        preAndPostDifference();
//        booleanLogicShortCircuitOps();
//        booleanBitwiseOps();
//        compareStrings();
//
//        System.out.println("Enter Certification of film: ");
//        int cert = scanner.nextInt();
//        System.out.println("Age: ");
//        int age = scanner.nextInt();
//        System.out.println(admitToFilm(cert, age));
//
//        switchVowelOrConsonant();
//        ifMonth();
//        ifGrade();
//        switchMathOperation();
//        ifTemperature();
        switchDaysInMonth();
    }

    public static void preAndPostDifference() {
        int x = 5;
        int y =  10;

        System.out.println("The value of x is "+ x);
        System.out.println("The value of ++x is "+ ++x);
        System.out.println("The value of x++ is "+ x++);
        System.out.println("The value of x is "+ x);

        System.out.println("The value of y is "+ y);
        System.out.println("The value of --y is "+ --y);
        System.out.println("The value of y-- is "+ y--);
        System.out.println("The value of y is "+ y);
    }
    public static void booleanLogicShortCircuitOps() {
        boolean b = false;
        int x = 3;

        if (x < 0 || (b = true)) {}
        System.out.println(b);

        if (x < 0 && (b = true)) {}
        System.out.println(b);
    }
    public static void booleanBitwiseOps() {
        boolean b = false;
        int x = 3;

        if (x < 0 | (b = true)) {}
        System.out.println(b);

        if (x < 0 & (b = true)) {}
        System.out.println(b);
    }
    public static void compareStrings() {
        System.out.println("String 1: ");
        String s1 = scanner.nextLine();
        System.out.println("String 2: ");
        String s2 = scanner.nextLine();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        the output is different because the s1==s2 uses the object references which are not the same
//        and s1.equals(s2) looks at the actual values
    }
    public static boolean admitToFilm(int cert, int age) {
        return age >= cert;
    }
    public static void switchVowelOrConsonant() {
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            int ascii = (int) letter;
            switch (ascii){
                default:
                    System.out.println(letter + " is a consonant");
                    break;
                case 97, 101, 105, 111, 117, 65, 69, 73, 79, 85:
                    System.out.println(letter + " is a vowel");
                    break;
                }
            } else {
            System.out.println("Error in letter!");
        }
    }
    public static void ifMonth() {
        System.out.println("Enter a month between 1-12: ");
        int month = scanner.nextInt();
        final int JAN=1, FEB=2, MAR=3, APR=4, MAY=5, JUN=6, JUL=7, AUG=8, SEP=9, OCT=10, NOV=11, DEC=12;
        if (month == JAN) {
            System.out.println("January");
        } else if (month == FEB) {
            System.out.println("February");
        } else if (month == MAR) {
            System.out.println("March");
        } else if (month == APR) {
            System.out.println("April");
        } else if (month == MAY) {
            System.out.println("May");
        } else if (month == JUN) {
            System.out.println("June");
        } else if (month == JUL) {
            System.out.println("July");
        } else if (month == AUG) {
            System.out.println("August");
        } else if (month == SEP) {
            System.out.println("September");
        } else if (month == OCT) {
            System.out.println("October");
        } else if (month == NOV) {
            System.out.println("November");
        } else if (month == DEC) {
            System.out.println("December");
        } else {
            System.out.println("Out of range!");
        }
    }
    public static void ifGrade() {
        System.out.println("Enter grade between 1 - 100: ");
        int mark = scanner.nextInt();
        if (mark > 100 || mark < 0) {
            System.out.println("Not in range, dude!");
        } else if (mark >= 70) {
            System.out.println("A");
        } else if (mark >= 60) {
            System.out.println("B");
        } else if (mark >= 50) {
            System.out.println("C");
        } else if (mark >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail, lol!");
        }
    }
    public static void switchMathOperation() {
        double answer = 0.0;
        boolean operationOK = true;

        System.out.println("Input double num1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Input double num2: ");
        double num2 = scanner.nextDouble();
        System.out.println("Input a character: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num2 - num1;
                break;
            case '*':
                answer = num1*num2;
                break;
            case '/':
                answer = num1/num2;
                break;
            default:
                operationOK = false;
                System.out.println("Unknown mathematical operator, don't be weird!");
                break;
        }
        
        if (operationOK) {
            System.out.println(answer);
        }
    }
    public static void ifTemperature() {
        int temp = 0;
        final int COLD = 0, MILD = 15, WARM = 20, VERY_WARM = 25, HOT = 30;
        
        System.out.println("Enter a temperature like a normal person: ");
        temp = scanner.nextInt();
        
        if (temp <= COLD) {
            System.out.println("Cold, af...");
        } else if (temp < MILD) {
            System.out.println("a little cold but ok...");
        } else if (temp < WARM) {
            System.out.println("mid");
        } else if (temp < VERY_WARM) {
            System.out.println("warm, yoy");
        } else if (temp < HOT) {
            System.out.println("very warm, bro!");
        } else {
            System.out.println("Hot, af");
        }
    }
    public static void switchDaysInMonth() {
        int numDays = 0;

        final int JAN=1, FEB=2, MAR=3, APR=4, MAY=5, JUN=6, JUL=7, AUG=8, SEP=9, OCT=10, NOV=11, DEC=12;

        System.out.println("Enter a month between 1 - 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case JAN,MAR,MAY,JUL,AUG,OCT,DEC:
                numDays = 31;
                break;
            case APR,JUN,SEP,NOV:
                numDays = 30;
                break;
            case FEB:
                System.out.println("Enter current year: ");
                int year = scanner.nextInt();
                if ( (year % 400 == 0)
                        ||
                        (year % 4 == 0)
                                &&
                                (year % 100 != 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Nope!");
                break;
        }

        System.out.println(numDays);
    }

}
