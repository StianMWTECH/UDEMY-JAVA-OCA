package UdemyExam1.Q49_ValidClassAndInterfaceDefinitions;

interface I1 {
    void setValue(String s);
    String getValue();
}

// Interface can EXTEND each other
interface I2 extends I1 {
    void analyse();
}

// Classes must implement interfaces BUT
// abstract classes don't have to implement any of the methods
abstract class B implements I1 {
    int getValue(int i) {return 0;}
}

public class test {
}
