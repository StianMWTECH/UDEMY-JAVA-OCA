package Chapter_3;

public class FCC_3_3_AdvancedPuzzle {
    public static void main(String[] args) {
        int[] binaryInput = {0,1,0,1,0};

        int ANDoperation = binaryInput[0];
        int ORoperation = binaryInput[0];
        int XORoperation = binaryInput[0];

        for (int i = 0; i < binaryInput.length; i++) {
            ANDoperation &= binaryInput[i];
            ORoperation |= binaryInput[i];
            XORoperation ^= binaryInput[i];

        }
        System.out.println(ANDoperation);
        System.out.println(ORoperation);
        System.out.println(XORoperation);
    }
}
