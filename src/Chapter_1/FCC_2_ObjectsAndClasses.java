package Chapter_1;

// Class is a blueprint
class Cat {
//  private means variables can only be accessed inside this class
    private String color;
    private String mood;

//  Constructor for Class
    public Cat(String color, String mood) {
//  this refers to current instance of this class
        this.color = color;
        this.mood = mood;
    }

//  Method is an action
    void purr() {
        System.out.println("purring");
    }

//  Method to return color of Chapter_1.Cat
    public String getColor() {
        return color;
    }

//  Method to return mood of Chapter_1.Cat
    public String getMood() {
        return mood;
    }

//  Private Method only accessed in this class
    private void changeMood(String newMood) {
        mood = newMood;
    }

//  Public Method to interact with private method, changeMood
    public void makeHappy() {
        changeMood("happy");
        purr();
    }
}


    public class FCC_2_ObjectsAndClasses {
    public static void main(String[] args) {
//        Creating a new Chapter_1.Cat object with "new" keyword and constructor
        Cat myCat = new Cat("ginger", "sleepy");
//        Accessing the public methods
        System.out.println("The cat is "+ myCat.getColor()+ " and feels "+ myCat.getMood());
        myCat.makeHappy(); // changes "mood" variable
        System.out.println("The cat is "+ myCat.getColor()+ " and feels "+ myCat.getMood());
        }
    }
