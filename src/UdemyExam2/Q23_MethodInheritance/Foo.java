package UdemyExam2.Q23_MethodInheritance;

interface Bar{
    void bar();
}
abstract class FooBase{
    private static void bar(){
        System.out.println("In static bar");
    }
}


public class Foo extends FooBase implements Bar {

    public void bar() {}

    public static void main(String[] args) {

    }
}

// FooBase and Bar clashes, static cannot override non-static methods
// there is no fix unless code is removed
// the methods may have the same names but if the signature is different in this case we
// have a clash
// we can also make the static bar() private