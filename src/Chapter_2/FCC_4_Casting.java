package Chapter_2;

class ImplicitCasting {
    int myInt;
    double myDouble;

    public ImplicitCasting(int myInt, double myDouble) {
        this.myInt = myInt;
        this.myDouble = myDouble;
    }

    public void DisplayImplicitCasting() {
        System.out.println("Integer: " + myInt + " ,Implicitly casted to Double: " + myDouble);
    }
}

class ExplicitCasting {
    double myDouble;
    int myInt;

    public ExplicitCasting(double myDouble, int myInt) {
        this.myDouble = myDouble;
        this.myInt = myInt;
    }

    public void DisplayExplicitCasting() {
        System.out.println("Double: " + myDouble + " ,Explicitly casted to Integer: " + myInt);
    }
}

//Type casting in OOP
//Extends to classes or objects and their types as well
//Upcasting an Object:
class Animal {}
class Dog extends Animal {
    void bark() {};
}


public class FCC_4_Casting {
    public static void main(String[] args) {

//        Implicit
        int myInt = 9;
        double myDouble = myInt; // double can fit int inside it, compiler handles it for us
        ImplicitCasting IntToDouble = new ImplicitCasting(myInt, myDouble);

        IntToDouble.DisplayImplicitCasting();

//        Explicit
        myDouble = 9.78;
        myInt = (int) myDouble; // int cannot fit double so data loss occurs, must be manual
        ExplicitCasting DoubleToInt = new ExplicitCasting(myDouble, myInt);
        DoubleToInt.DisplayExplicitCasting();


    //    Upcasting
        Animal myDog = new Dog();

    //    Downcasting
        Dog myNewDog = (Dog) myDog;

    //    Rather check Object type before downcasting
        if (myDog instanceof Dog) {
            Dog anotherDog = (Dog) myDog;
        }
    //    Exception handling when casting
//        Animal someAnimal = new Dog();
        Animal someAnimal = new Animal();
        try {
            Dog retrieveDog = (Dog) someAnimal;
        } catch (ClassCastException e) {
            System.out.println("Error: " + e);
        }
    }



}
