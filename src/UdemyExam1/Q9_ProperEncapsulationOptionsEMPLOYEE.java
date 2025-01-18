package UdemyExam1;

class Person {
    private int age; // can only be PRIVATE, not public or protected

    public void setAge(int age) { // can only be public or protected, not private
        this.age = age;
    }

    public int getAge() { // can only be public or protected, not private
        return age;
    }
}

public class Q9_ProperEncapsulationOptionsEMPLOYEE extends Person {
    public static void main(String[] args) {
        Q9_ProperEncapsulationOptionsEMPLOYEE e = new Q9_ProperEncapsulationOptionsEMPLOYEE();

        e.setAge(29);
        System.out.println(e.getAge());
    }
}
