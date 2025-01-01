package Chapter_4_OOP;

class Animal {
    String name;
    String species;

    int number(int total) {
        return total;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println("parent");
    }

    void sound() {
        System.out.println("noise");
    }
}

class Dog extends Animal {
    @Override
    public int number(int total) {
        System.out.println("we used to have: " + super.number(2));
        return total + 1;
    }

    public Dog(String name, String species) {
        super(name, species);
        System.out.println("child");
    }

    @Override
    void sound() {
        System.out.println(name + " is barking");
    }
}

public class FCC_4_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Dude", "pug");

        System.out.println();
        System.out.println(myDog.name);
        System.out.println(myDog.species);
        System.out.println();

        myDog.sound();
        System.out.println("now we have: " + myDog.number(2));
    }
}
