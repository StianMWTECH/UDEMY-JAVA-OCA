package Chapter_2;

public class FCC_2_OverflowAndUnderflow {
    public static void main(String[] args) {
        ProfileData jimmy = new ProfileData(80, (byte) 23, (short) 2001, 7816253000L, 10.99F, 384.4, true, 'J');

        int maxValue = Integer.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("Max Value for Integer: " + maxValue);
        System.out.println("Max Value for Character: " + maxChar);
        System.out.println("Max Value for Short: " + maxShort);
        System.out.println("Max Value for Byte: " + maxByte);
        System.out.println("Max Value for Long: " + maxLong);
        System.out.println("Max Value for Float: " + maxFloat);
        System.out.println("Max Value for Double: " + maxDouble);

        int overflow = maxValue + 1;
        System.out.println();
        System.out.println("Overflow for Integer: " + overflow);
    }
}
