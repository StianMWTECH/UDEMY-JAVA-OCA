package UdemyAssignments;

public class _8_ArraysPgm_ {

    public static void main(String[] args) {

        studentGrades();

    }

    public static void studentGrades() {

        int[][] studentsGrades = {{77, 68, 86}, {96, 76, 45}};
        outputGrades(studentsGrades);

    }

    public static int calcMinimumGrade(int[] number1DArray) {

        int minimum = number1DArray[0];

        for (int grades : number1DArray) {
            if (grades < minimum) minimum = grades;
        }

        return minimum;
    }

    public static int calcMaximumGrade(int[] number1DArray) {

        int maximum = number1DArray[0];

        for (int grades : number1DArray) {
            if (grades > maximum) maximum = grades;
        }

        return maximum;
    }

    public static double calcAverage(int[] number1DArray) {

        double average = 0.0;
        double total = 0.0;

        for (int grades : number1DArray) {
            total += grades;
        }
        average = total/number1DArray.length;
        return average;
    }

    public static void outputGrades(int[][] number2DArray) {

        int numberOfStudents = 0;

        for (int[] student : number2DArray) {

            numberOfStudents++;

            System.out.println("Student "+numberOfStudents+" grades: ");

            for (int i = 0; i < student.length; i++) {
                System.out.print(student[i] + " ");
            }

            System.out.println();
            System.out.println("Average: " + calcAverage(student));
            System.out.println("Minimum: " + calcMinimumGrade(student));
            System.out.println("Maximum: " + calcMaximumGrade(student));
            System.out.println();
        }
    }

}
