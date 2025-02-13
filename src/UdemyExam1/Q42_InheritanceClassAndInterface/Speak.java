package UdemyExam1.Q42_InheritanceClassAndInterface;

public class Speak {
    public static void main(String[] args) {

        Speak s = new GoodSpeak();

        // s can be cast to child class since the object itself is GoodSpeak
        ((GoodSpeak)s).up();

        // s can be cast to Tone since GoodSpeak implements Tone
        ((Tone)s).up();

    }
}

class GoodSpeak extends Speak implements Tone {
    public void up() {
        System.out.println("UP UP UP");
    }
}

interface Tone {
    void up();
}
