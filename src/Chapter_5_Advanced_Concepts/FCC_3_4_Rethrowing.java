package Chapter_5_Advanced_Concepts;

import java.io.IOException;

public class FCC_3_4_Rethrowing {

    public static void main(String[] args) {
        try {
            testRethrow();
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testRethrow() throws IOException, RuntimeException {
        try {
            // Some code that throws an exception
            throw new IOException("IO exception");
        } catch (Exception e) {
            // Re-throwing the exception with enhanced type-checking
            throw e;
        }
    }
}