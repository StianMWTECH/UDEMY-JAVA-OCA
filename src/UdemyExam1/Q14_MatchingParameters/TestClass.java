package UdemyExam1.Q14_MatchingParameters;

public class TestClass {

    void probe(int... x) {
        System.out.println("In..."); // 1
    }

    void probe(Integer x) {
        System.out.println("In Integer"); // 2
    }

//    void probe(long x) {
//        System.out.println("In long"); // 3
//    }

//    void probe(Long x) {
//        System.out.println("In LONG"); // 4
//    }

    public static void main(String[] args) {

        Integer a = 4;
        // Will first go to probe(Integer x) then probe(long x) then probe(int... x)
        // never probe(Long x)
        new TestClass().probe(a);

        int b = 4;
        // Will first go to probe(long x) then probe(Integer x) then probe(int... x)
        // never probe(Long x)
        new TestClass().probe(b);

    }

}
