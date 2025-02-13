package UdemyExam2.Q21_TryCatchUnchecked;

public class TestClass{
    public static void main(String args[]){
        try{
            m1();
        }catch(IndexOutOfBoundsException e){
            System.out.println("1");
            throw new NullPointerException();
        }catch(NullPointerException e){
            System.out.println("2");
            return;
        }catch (Exception e) {
            System.out.println("3");
        }finally{
            System.out.println("4");
        }
        System.out.println("END");
    }
    static void m1(){
        System.out.println("m1 Starts");
        throw new IndexOutOfBoundsException( "Big Bang " );
    }
}


// While NullPointerException does not need to be thrown, it still blocks the END
// from being printed
// END would only be printed if no type of exception was thrown inside catch
// if exception was inside finally = would not compile