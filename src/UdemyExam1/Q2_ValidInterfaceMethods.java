package UdemyExam1;

interface myMethodsWork {

    public void method(); // not static or default = can't have {}
//    static void NotGonnaWork();

    public static void staticMethod() {
        System.out.println("Static requires {}");
    }

    default void defaultMethod() {
        System.out.println("Default also requires {}");
    }

//    default static void AlsoNotGonnaWork() {}
//    Can't be BOTH STATIC and DEFAULT

}

public class Q2_ValidInterfaceMethods {
    public static void main(String[] args) {



    }
}
