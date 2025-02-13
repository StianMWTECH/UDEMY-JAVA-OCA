package UdemyExam2.Q15_UncheckedException;

class MySpecialException extends RuntimeException {
    public MySpecialException(String e) {
        super(e);
    }
}

public class ExceptionTest {
        public static void main(String[] args) {
                try {
                        doSomething();
                    } catch (MySpecialException e) {
                        System.out.println(e);
                    }
            }

            static void doSomething() {
                int[] array = new int[4];
                array[4] = 4; // out of bounds
                doSomethingElse();
            }

            static void doSomethingElse() {
                throw new MySpecialException("Sorry, can't do something else");
            }
}
