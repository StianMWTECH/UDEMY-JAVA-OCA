package UdemyExam1.Q50_PolymorphismGetName;

interface Flyer {
    String getName();
}

class Bird implements Flyer {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class TestClass {
    public static void main(String[] args) {

        Flyer f = new Eagle("American Bald Eagle");

//        We have a few ways to print the "name":
        System.out.println(f.getName());

        System.out.println(((Eagle)f).name); // name is inherited from Bird
        System.out.println(((Eagle)f).getName());

        System.out.println(((Bird)f).getName());

    }
}
