package Chapter_2;

//example of a class
class Calculation {
    int a,b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int addition() {
        return a + b;
    }

    int subtraction() {
        return a - b;
    }

    public void displayCalculations() {
        System.out.println(a + " + " + b + " = " + addition());
        System.out.println(a + " - " + b + " = " + subtraction());
    }
}

// interface is like a contract, once used it expects implementations for all its methods (see class Solve)
interface Operations {
    int addition(int a, int b);
    int subtraction(int a, int b);
}

class Solve implements Operations {

    private int a,b;

    public Solve(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    public void displayCalculations() {
        System.out.println(a + " + " + b + " = " + addition(a,b));
        System.out.println(a + " - " + b + " = " + subtraction(a,b));
    }
}

// example of class that works with Strings
class TextData {
    String s1;
    String s2;

    public TextData(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    public void displayTextData() {
        System.out.println(s1 + " " + s2);
    }
}

//example of class that works with Arrays
class ArrayData {
    int[] arr1;
    double[] arr2;

    public ArrayData(int[] arr1, double[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public void displayArrays() {
        System.out.println(java.util.Arrays.toString(arr1) + " ," + java.util.Arrays.toString(arr2));
    }
}

public class FCC_3_NonPrimitiveDataTypes {
    public static void main(String[] args) {

//        Here we create an instance of a Non-Primitive data type hence the word "new", "calculation" is a reference to the actual data in memory
        Calculation calculation = new Calculation(5,3);

        calculation.displayCalculations();
        System.out.println();

        String s1 = "Scaler";
        String s2 = new String("Academy");
        TextData data = new TextData(s1, s2);

        data.displayTextData();
        System.out.println();

        ArrayData arrays = new ArrayData(new int[]{1, 2, 3}, new double[]{1.1 , 2.2 , 3.3});

        arrays.displayArrays();

        Solve solve = new Solve(2,3);
        solve.displayCalculations();
    }
}
