package Chapter_3;

public class FCC_5_3_AdvancedPuzzleFizzBuzz {

    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i <= 100; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }
}
