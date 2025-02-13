package UdemyExam1.Q23_InsertOptionsInExtendingInterface;

interface Account {
    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {

    // The below is FINE

//    String getId(); // INSTANCE CAN BE HERE BUT DOES NOT OVERRIDE STATIC, ONLY DEFAULT AND INSTANCE

    default String getId() { // DEFAULT CAN OVERRIDE DEFAULT AND INSTANCE BUT NOT STATIC
        return "1111";
    } // HOWEVER IT CAN STILL HAVE THE SAME NAME AS STATIC IN PARENT SINCE IT DOES NOT CLASH


//    The below will NOT WORK

//    Static can't override instance in parent or vice versa
//    static String getId() {
//        return "1111";
//    }
//    abstract static String getName(); // Both abstract and static
//    static String getName();
//    default String getName();

}

public class test {
}
