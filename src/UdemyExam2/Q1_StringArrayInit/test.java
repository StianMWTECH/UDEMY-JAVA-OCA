package UdemyExam2.Q1_StringArrayInit;

public class test {
    public static void main(String[] args) {

        int index = 1;
        String[] strArr = new String[5];
        String   myStr  = strArr[index];

//        System.out.println(myStr);

        for (String str : strArr) {
            System.out.println(str);
        }

    }
}
