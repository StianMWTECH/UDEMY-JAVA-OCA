package Chapter_5_Advanced_Concepts;

public class FCC_3_3_ExceptionChaining {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Caused by: " + e.getCause().getMessage());
        }
    }

    static void someMethod() throws Exception {
        try {
            // Some code that throws an exception
            throw new RuntimeException("Initial exception");
        } catch (RuntimeException e) {
            throw new Exception("New exception", e);  // Chain the caught exception
        }
    }
}