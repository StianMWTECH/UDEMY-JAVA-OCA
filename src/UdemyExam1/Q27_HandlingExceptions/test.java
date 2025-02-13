package UdemyExam1.Q27_HandlingExceptions;

import java.io.IOException;

public class test {

    public static void m1() {
        m2();

//        To handle the IOException (Checked) we can either throw it in the m1 method
//        Or use a try-catch block
        try {
            m3();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void m2() {}

    public static void m3() throws IOException {}

}