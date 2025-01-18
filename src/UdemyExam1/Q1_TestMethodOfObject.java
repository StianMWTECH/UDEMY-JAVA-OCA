package UdemyExam1;

class Game {
    public void play() {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball) {
        System.out.println("Playing with "+ball);
    }
}

public class Q1_TestMethodOfObject {
    public static void main(String[] args) throws Exception{
        Game g = new Soccer();
        g.play();
//        g.play("ball"); // Game does not have play(String ball)


//        Soccer s = g; // needs to be casted down to Soccer
        Soccer s = (Soccer) g;
        s.play();
        s.play("ball");
    }
}
