package UdemyExam2.Q16_ValidClassesInSameFile;

class A {
    protected int i;
    A(int i) {
        this.i = i;
    }
}

// ALL THIS WORKS

//class B {}
//class B {
//    B() {}
//}
class B extends A {
    protected int i;
    B(int i) {
        super(i);
    }
}


public class test {
}
