package UdemyExam1.Q15_ValidDeclarations;

public class Test {

    public static void main(String[] args) {

        // Technically 1.0 and 43e1 can fit in float BUT
        // Implicit narrowing only happens with byte, char, short and int
//        float f1 = 1.0; // 1.0 is double so should be 1.0f to compile
//        float f2 = 43e1; // 43e1 (or 430.0) is double, should be 43e1f

        float f3 = -1;
        f3++;
        System.out.println(f3);

        float f4 = 0x0123; // 291
        System.out.println(f4);

        float f5 = 4;

    }

}
