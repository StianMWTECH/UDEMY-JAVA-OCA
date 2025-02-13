package UdemyExam2.Q5_AllRunTimeExceptions;

public class test {

    static void method1() {
        throw new IndexOutOfBoundsException();
    }
    static void method2() {
        throw new ClassCastException();
    }
    static void method3() {
        throw new NullPointerException();
    }
    static void method4() {
        throw new SecurityException();
    }
    static void method5() {
        throw new IllegalArgumentException();
    }
    static void method6() {
        throw new IllegalStateException();
    }

    public static void main(String[] args) {

    }

}
