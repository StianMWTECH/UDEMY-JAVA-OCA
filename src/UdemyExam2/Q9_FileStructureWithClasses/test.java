package UdemyExam2.Q9_FileStructureWithClasses;

abstract class A {
    protected int m1() {return 0;}
}

class B extends A {
//    int m1() { return 1; }
//     package-private is more restrictive than protected so will NOT COMPILE
}

public class test {
    public static void main(String[] args) {

    }
}
