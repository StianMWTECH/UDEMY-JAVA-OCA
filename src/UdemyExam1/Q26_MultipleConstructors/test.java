package UdemyExam1.Q26_MultipleConstructors;

class A{

    int i;

    public A(int x) { this.i = x; }

}

class B extends A{

    int j;

    public B(int x, int y) { super(x);  this.j = y; }

//    Can be added

//    B(int z) { this(z,z);} // Calls previous B class constructor with 2 parameters which already has super

//    super must be FIRST
//    B(int y) { super(y*2); j = y; } // super calls A class constructor with params so all good


//    Cannot be added

//    this automatically compiles with super() but super() takes no parameters
//    and A constructor has parameters
//    B(int y) { j = y;}

//    B() {}

//    B(int y) { i = y; j = y*2; }

}

public class test {
}
