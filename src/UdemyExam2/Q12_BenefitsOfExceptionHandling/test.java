package UdemyExam2.Q12_BenefitsOfExceptionHandling;

class MyException extends Exception {} // error handling code is separate from main logic

public class test {

    public static void main(String[] args) throws MyException {

        throw new MyException(); // Custom exceptions

    }

}
