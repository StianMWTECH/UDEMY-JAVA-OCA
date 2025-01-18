package UdemyExam1;

public class Q8_Equals {
    public static void main(String[] args) {

        String a = "java"; // goes into STRING CONSTANT POOL

        char[] b = {'j','a','v','a'};
//        char bb = 'j';

        String c = new String(b); // value becomes "java" but different OBJECT

        String d = a;

        // TRUE
        System.out.println(a == d);
        System.out.println(a == "java"); // since a is pointing to SCP, value is REUSED
        System.out.println(a.equals(c));

        // FALSE or ERROR
//        System.out.println(a == (String) bb); // cannot cast char[] or char to String
//        System.out.println(b == d); // cannot compile since char[] or char cannot be used with "=="
        System.out.println(a == c);

    }
}
