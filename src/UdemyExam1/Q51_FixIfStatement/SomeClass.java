package UdemyExam1.Q51_FixIfStatement;

//class SomeClass{
//    String s1 = "green mile";   // 0
//    public void generateReport( int n ){
//        String local;   // 1
//        if( n > 0 ) local = "good";   //2
//        System.out.println( s1+" = " + local );   //3
//    }
//}

class SomeClass{
    String s1 = "green mile";   // 0
        String local;   // 1
    public void generateReport( int n ){
        if( n > 0 ) local = "good";   //2
        System.out.println( s1+" = " + local );   //3
    }
}

// We can either move //1 to just below //0
// This works because it is no longer a local variable outside the method generateReport

// OR
// We can insert an else statement