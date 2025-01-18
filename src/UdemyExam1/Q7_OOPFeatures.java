package UdemyExam1; // every class belongs to a PACKAGE

class InheritMe {
    int i = 1;
}

public class Q7_OOPFeatures {
    public static void main(String[] args) {
        double inherited = new InheritMe().i; // classes may inherit from EachOther
        System.out.println(inherited);
    }
}
