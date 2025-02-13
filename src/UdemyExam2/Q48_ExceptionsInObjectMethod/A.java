package UdemyExam2.Q48_ExceptionsInObjectMethod;

public class A {

    public void doA(int k) throws Exception {  // 0
        for(int i=0; i< 10; i++) {
            if(i == k) throw new Exception("Index of k is "+i); // 1
        }
    }

    public void doB(boolean f) throws Exception { // 2
        if(f) {
            doA(15); // 3
        }
        else return;
    }

    public static void main(String[] args) throws Exception { // 4
        A a = new A();
        a.doB(args.length>0); // 5
    }

}

// We needed to add "throws Exception" to doB and main since the exception is thrown in a connected method
//