package Chapter_4_OOP;

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent Constructor");
        System.out.println(name);
    }
}

class Child extends Parent {
    String name;

    public Child(String name) {
        super(name);
        this.name = name;
        System.out.println("Child Constructor");
        System.out.println(name);
    }
}

public class FCC_3_5_ExpertConstructorFlow {
    public static void main(String[] args) {
        Child obj = new Child("Piet");
    }
}