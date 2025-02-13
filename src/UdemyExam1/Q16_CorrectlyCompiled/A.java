package UdemyExam1.Q16_CorrectlyCompiled;

//import java.io.*;
//
//public class A {
//
//    public static void main(String[] args) {
//
//        System.out.println(new A().main);
//
//    }
//
//    int main;
//
//}

//The above will compile since main is declared and accessible by A()

import java.io.*;

class B {
    public static void main() throws IOException { }
}

// The above will also compile since the IOException makes no difference
// and declaring the package is optional
// and main is just another method now which is still fine