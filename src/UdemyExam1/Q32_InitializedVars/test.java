package UdemyExam1.Q32_InitializedVars;

public class test {

    int i;
    static float f;
    static Object o;
    Object o2;

    void testInit() {
        int i3;
//        System.out.println(i3); // Local variables need to be init!!!
    }
    static {
        int i2;
//        System.out.println(i2); // Local variables need to be init!!!
    }

    public static void main(String[] args) {

        System.out.println(new test().i);
        System.out.println(test.f);
        System.out.println(test.o);
        System.out.println(new test().o2);

    }
}
