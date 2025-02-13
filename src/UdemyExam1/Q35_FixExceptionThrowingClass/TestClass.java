package UdemyExam1.Q35_FixExceptionThrowingClass;

import java.io.FileNotFoundException;
import java.io.IOException;

class Great {
//    public void doStuff() throws FileNotFoundException {}
    public void doStuff() throws IOException {} // FINE
}

class Amazing extends Great {
    public void doStuff() throws IOException, IllegalArgumentException {}
//    public void doStuff() throws IllegalArgumentException {} // FINE, IllegalArgumentException is RuntimeException and does not matter
//    public void doStuff() {} // FINE
}

public class TestClass {
    public static void main(String[] args) throws IOException {

        Great g = new Amazing();

        g.doStuff();

    }
}


// We can either COMPLETELY REMOVE IOEXCEPTION from Amazing
// Or we can ADD IOEXCEPTION to Great

//NB: Overriding methods can't throw new exceptions
// IOException is super broad and would therefore include new exceptions

// Compiler looks at REFERENCE TYPE before compiling and at Run Time the program
// looks at the OBJECT TYPE