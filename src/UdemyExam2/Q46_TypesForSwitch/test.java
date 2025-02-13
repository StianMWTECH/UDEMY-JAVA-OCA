package UdemyExam2.Q46_TypesForSwitch;

public class test {
    public static void main(String[] args) {

        int m = 1;
        short m1 ;
        char m2 ;
        //other code
        switch( m ){
            case 32  : System.out.println("32");   break;
            case 64  : System.out.println("64");   break;
            case 128 : System.out.println("128");  break;
        }

    }
}


// byte wont work since 128 is outside scope
// long, float, double and boolean will never work