package UdemyExam2.Q32_ExceptionInit;

public class AX{

    static int[] x = new int[0];

    static{
        x[0] = 10;
    }

    public static void main(String[] args){
        AX ax = new AX();
    }

}
