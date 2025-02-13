package UdemyExam1.Q19_ExceptionHandling;

class MyException extends Exception {} // this means MyException is now a CHECKED exception

public class TestClass {
    public static void main(String[] args) throws MyException{

        TestClass tc = new TestClass();

        try {
            System.out.println("try");
            tc.m1();
        } catch (MyException e) {
            System.out.println("catch");
            tc.m1();
//            Will not compile: This calls the m1() again but it is
//            UNHANDLED since there are no try-catch blocks in the catch block
//            Fix this by adding in Exception in main method
        } finally {
            System.out.println("finally");
            tc.m2();
        }

    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }

}
