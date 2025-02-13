package UdemyExam1.Q45_OverridingMethodSubClass;

public class test {
}


class A{ }
class B extends A{ }
class C extends B{ }

class X{
    B getB(){ return new B(); }
}
class Y extends X{
    //method declaration here

    // This works:

//    protected B getB() {return new C();}

    C getB() {return new C();}


    // This won't compile:

//    public C getB(){ return new B(); } // can't get B from C, only C from B

//    A getB(){ return new A(); } // can't use SuperClass in override

}