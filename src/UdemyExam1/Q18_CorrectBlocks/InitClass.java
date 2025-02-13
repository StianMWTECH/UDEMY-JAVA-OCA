package UdemyExam1.Q18_CorrectBlocks;

public class InitClass {

    private static int loop = 15;

    static final int INTERVAL = 10;

    boolean flag;

//    The below can be inserted without errors
    static {
    System.out.println("static");
    }
    static {
            loop = 1;
    }
    static {
            loop += INTERVAL;
    }
    {
        flag = true; loop = 0;
    }


//    The below will cause errors
//static {
//        INTERVAL = 10;
//}

    public static void main(String[] args) {
        loop = 10; // can be accessed without instance object since it is static, same for methods

//        static blocks are run even without creating an instance

//        but instance blocks requires an instance to be initialized as we see below

        System.out.println(new InitClass().flag); // will print true since we created an instance
//        And instance block code also gets executed making it TRUE
    }

}



// These are static blocks and instance blocks
// static to static is okay
// blocks can't change FINAL
// instance blocks can access static and instance variables