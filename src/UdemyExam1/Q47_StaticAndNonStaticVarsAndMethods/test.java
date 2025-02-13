package UdemyExam1.Q47_StaticAndNonStaticVarsAndMethods;

class test2 {
    static int i;
    int i2;

    static void method() {};
    void method2() {};
}


public class test {
    public static void main(String[] args) {

        System.out.println(new test2().i2);

    }
}
