package Chapter_3;

import java.util.HashMap;
import java.util.Map;

class ObjectReferences {
    String str1 = new String("Hello");
    String str2 = new String("Hello");

    boolean checkReference = (str1 == str2); // false since different reference
    boolean checkContent = str1.equals(str2); // true since same content
}

class pitfalls {
    // FLoating-point comparisons
    double result = 0.1 + 0.2;

    boolean isEqual = (result == 0.3); // false due to precision glitch
    boolean isNearlyEqual = Math.abs(result - 0.3) < 0.000001; // true since difference is less than 0.000001

    // Auto-boxing Hazards
    Integer num1 = 127;
    Integer num2 = 127;
    boolean check1 = (num1 == num2); // true because integer caching within range of -128 to 127
    Integer num3 = 200;
    Integer num4 = 200;
    boolean check2 = (num3 == num4); // false, different references
}

class BasicExerciseGradesHASHMAP {

    public void Grades() {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("B", 70);
        grades.put("A", 80);
        grades.put("C", 60);

        for (Map.Entry<String, Integer> grade: grades.entrySet()) {
            System.out.println(grade.getKey()+ " = " + grade.getValue());
        }
    }
}

public class FCC_2_1_RelationalOperators {

    public static void main(String[] args) {
        BasicExerciseGradesHASHMAP sortedGrades = new BasicExerciseGradesHASHMAP();
        sortedGrades.Grades();
    }
}
