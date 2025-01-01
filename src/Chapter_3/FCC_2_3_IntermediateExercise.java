package Chapter_3;

import java.util.Arrays;
import java.util.Scanner;

public class FCC_2_3_IntermediateExercise {

    public static int[] addScore(int n, int[] arr, int x) {

        int[] scores = new int[n + 1];

        for (int i = 0; i < n; i++) {
            scores[i] = arr[i];
        }

        scores[n] = x;

        return scores;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3};
        int n = array.length;

        Scanner scoreInput = new Scanner(System.in);
        String maybeExit;

        do {
            System.out.print("Enter High Score: ");

            int score = Integer.parseInt(scoreInput.nextLine());

            array = addScore(n, array, score);
            n++;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (array[i] < array[j]) {
                        int tempScore = array[i];
                        array[i] = array[j];
                        array[j] = tempScore;
                    }

                }
            }

            System.out.println(Arrays.toString(array));

            System.out.println("Maybe Exit? ");
            maybeExit = scoreInput.nextLine();

        }  while(maybeExit.equalsIgnoreCase("no"));

        scoreInput.close();
        System.out.println("Final: " + Arrays.toString(array));
    }
}
