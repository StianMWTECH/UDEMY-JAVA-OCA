package UdemyAssignments;

class Spectacles {
    private static int numLenses;

    public Spectacles() {
        Spectacles.numLenses = 2;
    }

    public void setLenses(int numLenses) {
        Spectacles.numLenses = numLenses;
    }

    public int getLenses() {
        return Spectacles.numLenses;
    }
}

public class _5_CallByValue {
    public static void main(String[] args) {

//        int x = 10;
//
//        passPrimitive(x);
//        System.out.println("Value of x after passPrimitive: " + x);
//        x = passPrimitiveAndReturn(x);
//        System.out.println("Value of x after passPrimitiveAndReturn: " + x);

        Spectacles specs = new Spectacles();

        System.out.println("Number of lenses: "+specs.getLenses());
        passObjectReference(specs);
        System.out.println(specs.getLenses());

    }

    public static void passPrimitive(int prim) {
        prim = 50;
    }

    public static int passPrimitiveAndReturn(int prim) {

        prim = 50;

        return prim;
    }

    public static void passObjectReference(Spectacles spectacles) {
        spectacles.setLenses(1);
    }
}
