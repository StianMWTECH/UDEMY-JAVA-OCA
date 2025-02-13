package UdemyExam2.Q41_ClassesThatCannotBeInstantiated;


class Automobile{
//    abstract void honk();  //(1)
}
// CANT have abstract meth in normal class


abstract class Automobile1{
//    void honk();   //(2)
}
// Needs a {}
// Abstract classes don't need abstract methods


abstract class Automobile3{
//    abstract void honk(){}   //(4)
}
// abstract CANT have a {}


abstract class Automobile4{
    abstract void honk();   //(5)
}


abstract class Automobile2{
    void honk(){};   //(3)
}


public class test {
}
