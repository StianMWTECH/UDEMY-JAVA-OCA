package UdemyExam1.Q53_EqualsObjects;

public class test {
    static Integer i = new Integer(42);
    static Integer i2 = new Integer(42);
    static Long ln = new Long(42);
    static Long ln2 = new Long(42);
    static Double d = new Double(42.0);

    public static void main(String[] args) {
        System.out.println(i.equals(d));
        System.out.println(i.equals(i2)); // true
        System.out.println(ln.equals(ln2)); // true

        System.out.println(d.equals(ln));
        System.out.println(ln.equals(42));
    }
}
