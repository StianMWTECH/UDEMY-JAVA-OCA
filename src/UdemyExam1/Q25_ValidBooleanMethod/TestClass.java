package UdemyExam1.Q25_ValidBooleanMethod;

public class TestClass {

    // Valid testers

//    public boolean tester() {
//        return false;
//    }

    public Boolean tester() {
        return false;
    }


    // Not Valid testers

//    no return type
//    public tester() {
//        return false;
//    }

//    needs to return Boolean or boolean
//    public int tester() {
//        return 0;
//    }


    public static void main(String[] args) {

        TestClass tc = new TestClass();
        while(tc.tester()) {
            System.out.println("running...");
        }

    }
}

