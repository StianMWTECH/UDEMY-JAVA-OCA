package Chapter_5_Advanced_Concepts;

// Importing necessary classes for demonstration
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FCC_3_1_CheckedAndUncheckedErr {

    public static void main(String[] args) {

        // Demonstrating Checked Exception
        // Checked Exceptions are anticipated by the compiler and we are required to handle them
        try {
            // Attempting to read a file that may not exist
            Scanner fileScanner = new Scanner(new File("somefile.txt"));
        } catch (FileNotFoundException e) {
            // FileNotFoundException is a checked exception
            System.out.println("Checked Exception: File not found.");
        }

        // Demonstrating Unchecked Exception
        // Unchecked Exceptions usually result from logical flaws and manifest during runtime
        try {
            // Dividing by zero - a logical flaw
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // ArithmeticException is an unchecked exception
            System.out.println("Unchecked Exception: Cannot divide by zero.");
        }

        // Note: Errors are different from Exceptions and usually indicate severe problems
        // that a reasonable application should not try to catch.
        // For instance, OutOfMemoryError, StackOverflowError, etc.
    }
}