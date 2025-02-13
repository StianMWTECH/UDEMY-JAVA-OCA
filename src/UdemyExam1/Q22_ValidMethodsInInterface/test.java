package UdemyExam1.Q22_ValidMethodsInInterface;

interface testInterface {

    void compute();

    public void compute1();

//    THESE WON'T WORK:
//    public final void compute2(); // FINAL not allowed in Interface
//    static void compute3(); // STATIC and DEFAULT must have code block {}
//    protected void compute4(); // PROTECTED not allowed in interface

}

public class test implements testInterface{
    @Override
    public void compute() {

    }

    @Override
    public void compute1() {

    }

    public static void main(String[] args) {

    }
}
