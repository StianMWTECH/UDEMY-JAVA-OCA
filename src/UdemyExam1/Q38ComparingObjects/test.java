package UdemyExam1.Q38ComparingObjects;

public class test extends Object {



    public static void main(String[] args) {

        String t1 = "same";

        String t2 = "same";

        System.out.println(t1.equals(t2)); // only true if object value is same
        System.out.println(t1 == t2); // TRUE since we're looking at string literals in string pool
        System.out.println(t1.hashCode() == t2.hashCode()); // will be true if hashcode is same, may happen if same characters

        t1 = new String("sameButDifferent");

        t2 = new String("sameButDifferent");

        System.out.println(t1 == t2);

    }

}
