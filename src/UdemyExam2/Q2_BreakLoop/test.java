package UdemyExam2.Q2_BreakLoop;

public class test {

    void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }

    public static void main(String[] args) {

        new test().crazyLoop();

    }
}
