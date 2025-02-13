package UdemyExam2.Q36_TypeClassAndObjectClassMethods;

class Base{

    int i = 0;

    void methodA(){
        System.out.println("base - MethodA");
    }

}

class Sub extends Base{

    int i = 1;

    public void methodA(){
        System.out.println("sub - MethodA");
    }

    public void methodB(){
        System.out.println("sub - MethodB");
    }

    public static void main(String args[]){

        Base b=new Sub(); //1

        b.methodA(); //2

        System.out.println(b.i);

//        b.methodB(); //3
        ((Sub) b).methodB();
    }

}


// We can't do b.methodB() since the reference type is A,
// it would only work if we ((Sub) b).methodB()