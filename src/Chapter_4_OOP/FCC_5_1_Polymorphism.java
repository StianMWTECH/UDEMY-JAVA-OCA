package Chapter_4_OOP;

class Animals {
    String name;
    String species;

    int number(int total) {
        return total;
    }

    public Animals(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println("parent");
    }

    void sound() {
        System.out.println("noise");
    }
}

class Dogs extends Animal {
    @Override
    public int number(int total) {
        System.out.println("we used to have: " + super.number(2));
        return total + 1;
    }

    public Dogs(String name, String species) {
        super(name, species);
        System.out.println("child");
    }

    @Override
    void sound() {
        System.out.println(name + " is barking");
    }
}

public class FCC_5_1_Polymorphism {

    public static void main(String[] args) {
        Dog myDog = new Dog("Dude", "pug");
        Animal myAnimal = myDog; // Upcasting

        Animal myNewAnimal = new Dog("Dude2", "pug");
        Dog myNewDog = null;
        if (myNewAnimal instanceof Dog) {
            myNewDog = (Dog) myNewAnimal;
        }

        myAnimal.sound();
        myNewDog.sound();
    }

}
