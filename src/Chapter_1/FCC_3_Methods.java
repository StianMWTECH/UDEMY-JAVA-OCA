package Chapter_1;

class BusyCat {

//    Method with no return value (void) with action "meow"
    public void meow() {
        System.out.println("Meow!");
    }

//    Method with no return with action "scratch"
    public void scratch() {
        System.out.println("scratch");
    }

//    set mood
    private String mood = "happy";

    public void setMood(String mood) {
        this.mood = mood;
    }
    public String getMood() {
        return mood;
    }

//    Method that changes internal state, mood property is set above
//    private = cannot be called from outside Chapter_1.BusyCat class
    private void changeMood(String newMood) {
        mood = newMood;
        System.out.println("Mood is now: " + mood);
    }

//    method to call other methods
    public void displayBehavior() {
        meow();
        scratch();
        changeMood("curious");
    }
}

public class FCC_3_Methods {
    public static void main(String[] args) {
        BusyCat tabby = new BusyCat();

//        tabby.meow();
//        tabby.scratch();

        tabby.displayBehavior();
    }
}
