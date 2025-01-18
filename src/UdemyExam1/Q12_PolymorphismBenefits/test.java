package UdemyExam1.Q12_PolymorphismBenefits;

interface Noise {
    void makeSounds();
}

abstract class Animal {
    abstract String getAnimal();
}

class Pig extends Animal implements Noise{

    String name;

    public Pig(String name) {
        this.name = name;
    }

    public void makeSounds() {
        System.out.println("Oink");
    }

    String getAnimal() {
        return name;
    }
}

class Dog extends Animal implements Noise {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSounds() {
        System.out.println("Bark");
    }

    String getAnimal() {
        return name;
    }
}

public class test {
    public static void main(String[] args) {
        Animal pig = new Pig("pig");
        System.out.println(pig.getAnimal()+" ");
        ((Pig)pig).makeSounds();
//        pig.makeSounds(); // won't work since the reference is ANIMAL


        Animal dog = new Dog("dog");
        System.out.println(dog.getAnimal());
        ((Dog)dog).makeSounds();
    }
}
