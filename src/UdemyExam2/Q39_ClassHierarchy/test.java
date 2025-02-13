package UdemyExam2.Q39_ClassHierarchy;

class A{
    public void m1() {   }
}
class B extends A{
    public void m1() {   }
}
class C extends B{
    public void m1(){
      /*  //1
      ... lot of code.
      */
    }
}

public class test {
}


// What CAN or CANNOR happen here?

// You cannot: access parent m1 from child using 'this'

// You can: access parent m1 using super.m1()