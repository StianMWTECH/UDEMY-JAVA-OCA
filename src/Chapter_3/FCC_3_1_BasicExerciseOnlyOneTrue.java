package Chapter_3;

public class FCC_3_1_BasicExerciseOnlyOneTrue {

    public static void main(String[] args) {

        boolean a = false;
        boolean b = true;
        boolean c = false;

        if ((a && !b && !c) || (!a && b && !c) || (!a && !b && c)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}
