package UdemyExam1;

import java.util.Arrays;

public class Q11_2dArray {
    public static void main(String[] args) {

//        int[][] cA = {{1,2,3 }, {1,2,3}}; // [2][3] is out of bound

        int[][] cA = new int[3][]; // length is 3 for cA
        for (int i = 0; i < cA.length; i++) { // i = 0, 1, 2
            cA[i] = new int[4]; // {0,0,0,0} in each cA[i]
        } //Becomes {{0,0,0,0},{0,0,0,0},{0,0,0,0}}

//        int[][] cA = {new int[]{1,2,3}, new int[]{1,2,3}}; // [2][3] is out of bounds

//        int[3][2] cA = new int[][]{{1,2,3}, {1,2,3}}; // will not compile

//        int[][] cA = {1.0, 1.0, 1.0, 1.0}; // not an int[] = will not compile

        System.out.println(cA[2][3]);
        System.out.println(Arrays.deepToString(cA));

    }
}
