package Chapter_4_OOP;

class Person {
    String name;
    int age;

    static int personCount = 0;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        personCount++;
    }

    public void Speak() {
        System.out.println("Hi, my name is " + this.name + " and I'm " +age);
    }

    public static void displayCount() {
        System.out.println("There are " + personCount + " people");
    }
}

public class FCC_2_People {

    public static void main(String[] args) {

        Person bj = new Person("Ben", 23);
        Person dj = new Person("Dick", 24);

        bj.Speak();
        dj.Speak();
        Person.displayCount();
    }
}
