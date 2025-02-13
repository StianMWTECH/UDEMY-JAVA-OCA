package UdemyExam1.Q21_ClassCast;

public class TestClass {
    public static void main(String[] args) {

        A[] a, a1;
        B[] b;

        a = new A[10];
        a1 = a;
        b = new B[20];

        a = b; // casting up is automatic
        b = (B[]) a; // Even though this is the same object
//        the reference type is different so we need a class cast

        b = (B[]) a1; // will cause ClassCastException since the OBJECT is A
//        you can't cast the OBJECT DOWN

    }
}

class A {}
class B extends A {}