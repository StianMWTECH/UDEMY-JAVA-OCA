package UdemyExam2.Q28_PointOfCheckedExceptions;

import java.io.IOException;

class MyException extends IOException {
}

public class test {
    public static void main(String[] args) {

        try {
            throw new MyException();
        } catch (MyException me) {
            System.out.println("Checked and anticipated");
            int a = 1/0; // not checked and should be fixed during testing
        }

    }
}
