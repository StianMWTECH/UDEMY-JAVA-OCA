package UdemyExam1.Q17_StaticMethodsRedo;

class A {
    public static void sM1() {
        System.out.println("in base static");
    }
}

class B extends A {

    public static void sM1() {
        System.out.println("in sub static");
    }

//    public void sM1() {
//        System.out.println("In sub non-static");
//    }
}

public class Test {
    public static void main(String[] args) {
        A x = new B();
        x.sM1(); // when reference is parent, we use static method in parent
        new B().sM1();
    }
}


// static and non-static cannot exist in the same class, WILL NOT COMPILE
// non-static cannot override static method in parent class