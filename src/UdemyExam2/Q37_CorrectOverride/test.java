package UdemyExam2.Q37_CorrectOverride;

interface Set {}

class HashSet implements Set {

    public Set getSet(int a) {
        return new HashSet();
    }


}

abstract class abstractClass extends HashSet {
    abstract public HashSet getSet(int a);
}

public class test extends HashSet{

    public HashSet getSet(int a) {
        return new HashSet();
    }

    public static void main(String[] args) {

    }

}


//To override a method in the subclass, the overriding method (i.e. the one in the subclass) MUST HAVE:
//
//
//
//.same name
//
//.same return type in case of primitives (a subclass is allowed for classes, this is also known
//as covariant return types).
//
//.same type and order of parameters
//
//.it may throw only those exceptions that are declared in the throws clause of the superclass's method
// or exceptions that are subclasses of the declared exceptions. It may also choose NOT to throw any
// exception.
//
//
//
//The names of the parameter types do not matter.
// For example, void methodX(int i) is same as void methodX(int k)