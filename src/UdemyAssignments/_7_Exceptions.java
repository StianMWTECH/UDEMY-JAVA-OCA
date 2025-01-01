package UdemyAssignments;

import jdk.jfr.StackTrace;

import java.io.IOException;

class Parent {
    public void process() throws IOException {
        System.out.println("parent process");
        throw new IOException("IO test");
    }
}

class Child extends Parent {
    public void process() throws IOException {
        System.out.println("child process");
        try {
            throw new NoSuchMethodException("test");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException: "+e);
        }
    }
}

public class _7_Exceptions {

    public static void main(String[] args) throws IOException, NoSuchMethodException {

//        System.out.println(a());
//        System.out.println(b());
//        System.out.println(c());

        Parent p = new Child();
        try {
            p.process();
        }
        // must catch IOException since the compiler checks the Parent SIGNATURE
        // (Parent p = reference type) at runtime
        catch (IOException e) {
            System.out.println("Exception caught");
        }

    }

    public static String a() {
        try {
            System.out.println("Try block:");
//            empty
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return e.getMessage();
        } finally {
            System.out.println("finally section…");
            return "finally";
        }
    }

    public static String b() {
        try {
            System.out.println("Try block:");
            return "ok";
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return e.getMessage();
        } finally {
            System.out.println("finally section…");
            return "finally";
        }
    }

    public static String c() {
        try {
            throw new Exception("test");
        } catch (Exception e) {
            System.out.println("Exception occurred");
            return e.getMessage();
        } finally {
            System.out.println("finally section…");
            return "finally";
        }
    }

    public static String d() {
        try {
            System.out.println("Try block:");
            return "ok";
        }
//        catch (IOException e) {
//            System.out.println("Exception occurred");
//            return e.getMessage();
//        }
//        catch (NoSuchMethodException e) {
//            System.out.println("Exception occurred");
//            return e.getMessage();
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("Exception occurred");
//            return e.getMessage();
//        }
        finally {
            System.out.println("finally section…");
            return "finally";
        }
    }

}
