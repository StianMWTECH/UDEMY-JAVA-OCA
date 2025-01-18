package UdemyExam1;

public class Q5_InterruptForLoop {
    public static void main(String[] args) {

        int k = 0;
        int m = 0;

        for (int i = 0; i <= 3; i++) {

            k++;
            System.out.println(k);
//            if (i == 2) break;
            if (i == 2) continue;
//            if (i == 2) i = 4;
//            if (i == 2) i = m++;

            m++;
            System.out.println(m);

        }
        System.out.println("k= "+k+", m= "+m);

    }
}
