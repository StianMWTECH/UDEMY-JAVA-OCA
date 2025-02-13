package UdemyExam2.Q17_ContinueLoop;

public class TestClass{

    public void loopTest(int x){
        loop: for (int i = 1; i < 5; i++){
            for (int j = 1; j < 5; j++){
                System.out.println(i);
                if (x == 0) {  continue loop;  }
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        new TestClass().loopTest(0);
    }
}

//OUTPUT
//1
//2
//3
//4
