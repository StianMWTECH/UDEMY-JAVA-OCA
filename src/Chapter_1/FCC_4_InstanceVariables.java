package Chapter_1;

class SpecificCat {
//  private instance vars, encapsulating state of SpecificCat
    private String name;
    private int age;

//    Constructor of SpecificCat with given name and age
    public SpecificCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

//    public method to display SpecificCat's attributes
    public void displayInfo() {
        System.out.println(this.name + " is " + this.age + " year(s) old.");
    }

}

public class FCC_4_InstanceVariables {
    public static void main(String[] args) {

        SpecificCat newCat = new SpecificCat("name", 3);

        newCat.setName("Tabby");
        newCat.setAge(4);

//        System.out.println("Name: " + newCat.getName() + ", age: " + newCat.getAge());
        newCat.displayInfo();
    }
}
