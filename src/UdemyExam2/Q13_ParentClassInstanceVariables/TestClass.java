package UdemyExam2.Q13_ParentClassInstanceVariables;

public class TestClass {
    public static void main(String[] args) {

        Movable m = new Donkey();

        m.move(10); // refers to Child method
        m.moveBack(20); // refers to Child method

        System.out.println(m.location); // refers to Parent (or reference type) variable
        System.out.println(((Donkey)m).location); // refers to Parent (or reference type) variable

    }
}
