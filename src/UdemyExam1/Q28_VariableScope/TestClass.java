package UdemyExam1.Q28_VariableScope;

public class TestClass {

//    which of the below variables are accessible from outside the package

    int i; // NO: default means only this package
    public int j; // YES: anywhere
    protected int k; // YES: in subclasses in other packages (inheritance)
    private int l; // NO: only in class

}
