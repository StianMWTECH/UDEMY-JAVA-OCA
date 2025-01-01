package Chapter_5_Advanced_Concepts;

public class FCC_3_2_TryCatchFinally {

    public static void main(String[] args) {

        // Resource we want to manage, for the sake of this example let's use a String
        String resource = "exampleResource";

        try {
            // Code that might throw exceptions
            System.out.println("Resource in use: " + resource);

            // This will trigger an ArithmeticException
            int result = 10 / 0;

            // This line will not be executed due to the exception above
            System.out.println(result);

        } catch (ArithmeticException e) {
            // Handle arithmetic exception
            System.out.println("Caught ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            // General exception handler
            System.out.println("Caught General Exception: " + e.getMessage());

        } finally {
            // Clean-up operations
            resource = null;
            System.out.println("Resource has been released.");
        }
    }
}