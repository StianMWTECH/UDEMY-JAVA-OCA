package UdemyExam1;

public class Q3_ValidDeclarationOfint {

    int u;
    public int x = 1;
//    Int x1;
//    public Int x2; // Int is not real
    static int y;
//    final int z; // z must be initialized in CONSTRUCTOR or here
    final int z1 = 1;

    void switchStatement() {

        switch(y) {
            case(1):
                System.out.println("yup");
                break;
            default:
                System.out.println("nope");
                break;
        }

    }


    public static void main(String[] args) {

//        public int x; // no public in main
        final int y;
//        private int z; // no private in MAIN
//        global int a; // global is NOT REAL

        new Q3_ValidDeclarationOfint().switchStatement();

    }
}
