package UdemyExam2.Q7_TryCatchElseException;

public class FinallyTest {
    public static void main(String args[]){
        try{
            if (args.length == 0) return;
            else throw new Exception("Some Exception");
        } catch(Exception e){
            System.out.println("Exception in Main");
        } finally{
            System.out.println("The end");
        }
    }
}

// Finally is always executed, regardless of number of args
// No args is = "" NOT null