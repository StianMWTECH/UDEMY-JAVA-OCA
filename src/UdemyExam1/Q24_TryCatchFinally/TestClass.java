package UdemyExam1.Q24_TryCatchFinally;

import java.io.IOException;

//public class TestClass {
//    public static void main(String[] args) throws Exception {
//
//        try {
//            amethod();
//            System.out.println("try");
//        } catch (IOException e) // IOException is not thrown by amethod() so will not compile if used
//        {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//        System.out.println("out");
//    }
//
//
//    public static void amethod() throws IOException{}
//}


// OUTPUT:
// try
// finally
// out

public class TestClass {
    public static void main(String[] args) throws Exception {

        try {
            amethod();
            System.out.println("try");
        }
        catch (Exception e) // IOException is not thrown by amethod() so will not compile if used
        {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("out");
    }


    public static void amethod() throws Exception {
        throw new Exception();
    }
}