package UdemyExam2.Q4_RuntimeExceptions;

import java.io.IOException;

public class test {

//    Unchecked (Runtime)
//    Does not matter what you throw and does not affect main method
    static void method1 () throws ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

//    Checked
//    If thrown here, must be thrown or caught in main
    static void method2() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {

//        test.method1();

        try {
            test.method2();
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
