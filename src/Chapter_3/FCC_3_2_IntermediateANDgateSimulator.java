package Chapter_3;

public class FCC_3_2_IntermediateANDgateSimulator {
    public static void main(String[] args) {
        boolean A = true;
        boolean B = true;

        boolean result = !(!A || !B);

        System.out.println(result);
    }
}
