package Chapter_3;

public class FCC_2_2_BasicExercise {

    // BasicExerciseGrades with vanilla ARRAY
    public static String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void sortGradesWithFor2DLoop(int[] scores, String[] grades) {
        // outer loop of scores = 67, 89, 91, 40
        // grades are currently = D, B, A, F

        // will be replaced in correct order, swapping
        // index starts at 0
        for (int i = 0; i < scores.length; i++) {
            // inner loop of scores, index starts at 1 and end at the last score = 89, 91, 40
            // we + 1 so that we don't compare the same number at the same index
            for (int j = i + 1; j < scores.length; j++) {
                // check if outer loop score is LESS than inner loop score
                if (scores[i] < scores[j]) { // is 67 < 89? Yes

                    int tempScore = scores[i]; // store 67 in tempScore

                    scores[i] = scores[j]; // make outer loop score = 89 since it's higher
                    scores[j] = tempScore; // now take 67 and put in new inner loop score
                    // scores[i] = 89 then 91, 89
//                    System.out.println(scores[i]);
                    String tempGrade = grades[i];
                    grades[i] = grades[j];
                    grades[j] = tempGrade;
                    // grades[i] = B then A, B
//                    System.out.println(grades[i]);
                }
            }
            System.out.println(grades[i]);
        }
    }

    public static void main(String[] args) {

        int[] scores = {67, 89, 91, 40};
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            grades[i] = getGrade(scores[i]);
        }

        for (String grade : grades) {
//            System.out.println(grade);
        }

        sortGradesWithFor2DLoop(scores, grades);
        for (String grade : grades) {
            System.out.print(grade + ", "); // A, B, D, F
        }
    }
}
