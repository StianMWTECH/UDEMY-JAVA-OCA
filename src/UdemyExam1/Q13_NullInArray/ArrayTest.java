package UdemyExam1.Q13_NullInArray;

public class ArrayTest {
    public static void main(String[] args) {

        int[][] twoD = {{1,2},null};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println(i+":"+j+"= "+twoD[i][j]); // twoD[1][0] is null and therefore we get an Exception

            }
        }

    }
}
