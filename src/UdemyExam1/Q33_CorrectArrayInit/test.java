package UdemyExam1.Q33_CorrectArrayInit;

public class test {
    public static void main(String[] args) {

        int[][] a = new int[2][];
        a[0] = new int[2];
        a[1] = new int[4];

//        or
//        int[][] a = new int[2][4];

        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 5;
        a[1][3] = 6;
    }
}
