package Chapter_3;

import java.util.Arrays;

public class FCC_2_4_AdvancedExercise_Filtering {

    private static final String[] Database = {
        "Product A: Price $100, Category Electronics",
        "Product B: Price $50, Category Books",
        "Product C: Price $150, Category Electronics",
        "Product D: Price $30, Category Apparel",
    };

    public static void filterByPriceRange(int min, int max) {
        for (String entry : Database) {
            String[] splitEntry = entry.split(" ");
            int price = Integer.parseInt(splitEntry[3].replaceAll(",", "").substring(1));  // Extract price
            if (price <= max && price >= min) {
                System.out.println(entry);
            }
        }
    }

    public static void main(String[] args) {

        filterByPriceRange(50, 150);

    }
}
