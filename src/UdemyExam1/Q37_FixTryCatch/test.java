package UdemyExam1.Q37_FixTryCatch;

public class test {

    public float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2
            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
            return f;     // 5
        }
        finally {
            return f;     // 6
        }
//        return f ;    // 7
    }

    public static void main(String[] args) {

    }

}

// How to fix for compilation:
// Remove duplicate RETURNS
//      Either:
//      line 7 OR
//      line 3 and 6 OR
//      line 3 and 7 OR
//      line 5 and 6
