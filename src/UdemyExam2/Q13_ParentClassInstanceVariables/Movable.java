package UdemyExam2.Q13_ParentClassInstanceVariables;

public interface Movable {
    int location = 0; // automatically public static final in interface
    void move(int by); // automatically public in interface
    public void moveBack(int by);
}
