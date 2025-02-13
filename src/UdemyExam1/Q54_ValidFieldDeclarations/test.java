package UdemyExam1.Q54_ValidFieldDeclarations;

interface Runnable {}

class Thread implements Runnable {}

public class test {
    public static void main(String[] args) {

        char c = 10;
        System.out.println(c);

        Boolean b = false;

        Runnable r = new Thread();

        Object o = new java.io.File("a.txt");

    }
}
