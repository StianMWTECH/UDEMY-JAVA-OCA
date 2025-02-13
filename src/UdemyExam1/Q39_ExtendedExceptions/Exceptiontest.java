package UdemyExam1.Q39_ExtendedExceptions;

class MyException extends Throwable {}
class MyException1 extends MyException {}
class MyException2 extends MyException1 {}
class MyException3 extends MyException2 {}

public class Exceptiontest {

    void myMethod() throws MyException {
        throw new MyException3();
    }

    public static void main(String[] args) {

        Exceptiontest et = new Exceptiontest();

        try {
            et.myMethod();
        }
        catch (MyException me) {
            System.out.println("MyException thrown");
        }
//        catch (MyException3 me3) {
//            System.out.println("MyException thrown");
//        }
        finally {
            System.out.println(" Done");
        }

    }

}

//Output:
// Compile error since the 2nd exception is unnecessary as the previous catch already covers MyException3's