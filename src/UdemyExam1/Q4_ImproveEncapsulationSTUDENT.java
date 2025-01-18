package UdemyExam1;

import java.util.ArrayList;

public class Q4_ImproveEncapsulationSTUDENT {

//    ArrayList<Integer> scores; MAKE INSTANCE FIELDS PRIVATE
    private ArrayList<Integer> scores;
    private double average;

//    public ArrayList<Integer> getScores() {return scores;} // RETURN COPIES INSTEAD
    public ArrayList<Integer> getScores() {return new ArrayList(scores);}

    public double getAverage() {return average;}

    private void computeAverage() {
        // compute code
        // just an example
        average = 50;
    }

    public Q4_ImproveEncapsulationSTUDENT() {
        computeAverage();
    }

    // other code
}
