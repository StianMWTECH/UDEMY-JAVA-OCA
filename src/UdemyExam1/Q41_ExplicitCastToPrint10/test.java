package UdemyExam1.Q41_ExplicitCastToPrint10;

public class test {
    public static void main(String[] args) {

        Object t = new Integer(106);
        int k = ((Integer) t).intValue()/10;
        System.out.println(k); // 10


        System.out.println(100/9.9); // 10.1010101010101

        System.out.println(100/10.0); // 10.0

        System.out.println(100/10); // 10

        System.out.println(3 + 100/10*2-13); // 10

    }
}
