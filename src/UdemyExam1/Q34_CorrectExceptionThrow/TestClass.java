package UdemyExam1.Q34_CorrectExceptionThrow;

class MyException extends Exception {}

public class TestClass {
    public static void main(String[] args) throws
//            MyException
//            Exception
            Throwable
            {

        throw new MyException();

    }
}


// MyException, Exception and Throwable works since they are in the same hierarchy
// MyException --> Exception --> Throwable
// RuntimeException would not work
// RuntimeException and MyException may have the same parent but are not actually connected