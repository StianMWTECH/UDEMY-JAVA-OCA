package UdemyExam2.Q18_TestArray;

public class OrderTest {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
//            str.concat(str+" "+ind); // str is null so causes RuntimeException
            ind++;
        }
    }
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        String[] arr = new String[2];
        System.out.println(arr[0]);
//        String s = arr[0].toString();
        String s = arr[0];
        ot.initData(arr);
        ot.printData(arr);
    }
}
