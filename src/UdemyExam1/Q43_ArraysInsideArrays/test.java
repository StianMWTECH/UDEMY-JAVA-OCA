package UdemyExam1.Q43_ArraysInsideArrays;

public class test {
    public static void main(String[] args) {

        double daaa[][][] = new double[3][][];
        double d = 100.0;
        double[][] daa = new double[1][1];

//        daaa[0] = d; // d needs to be a 2D array

//        daaa[0] = daa[0]; //daa[0] needs to be a 2D array

//        daa[1][1] = d; // runtime error = out of bounds

        daaa[0] = daa;
        daa = daaa[0];

    }
}
