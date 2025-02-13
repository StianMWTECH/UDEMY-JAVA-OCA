package UdemyExam2.Q10_SyntaxForArray;

public class TestClass {

    int[][] matrix = new int[2][3];

    int a[] = {1, 2, 3};
    int b[] = {4, 5, 6};

    public int compute(int x, int y){
        //1 : Insert Line of Code here
        return a[x]*b[y];
    }

    public int[][] loadMatrix(){
        for(int x=0; x<matrix.length; x++){
            for(int y=0; y<matrix[x].length; y++){
                //2: Insert Line of Code here
                matrix[x][y] = compute(x, y);
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();

        int[][] ia2 = tc.loadMatrix();

        for (int[] ia : ia2) {
            for (int i : ia) {
                System.out.println(i);
            }
        }
    }

}
