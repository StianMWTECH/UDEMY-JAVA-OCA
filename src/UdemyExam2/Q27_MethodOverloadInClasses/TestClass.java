package UdemyExam2.Q27_MethodOverloadInClasses;

class A {
    public int getCode(){ return 2;}
}

class AA extends A {
    public long getCode(long l){ return 3;}
}

public class TestClass {

    public static void main(String[] args) throws Exception {
        A a = new A();
        A aa = new AA();
        System.out.println(a.getCode()+" "+ ((AA) aa).getCode(1));
    }

    public int getCode() {
        return 1;
    }
}


// if you override like above then the method return type AND params need to match

// Unless we overload BUT then we have to CAST aa to get the correct method
// BUT overloading means the method name is the same but the params and return type is different
// or at least the params