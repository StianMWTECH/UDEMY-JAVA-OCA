package Chapter_3;

import java.util.Scanner;

public class FCC_5_2_IntermediateMenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item1 = "Item1";
        String item2 = "Item1";
        String item3 = "exit";

        String input;

        do {
            System.out.println(item1);
            System.out.println(item2);
            System.out.println(item3);
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "item1":
                    System.out.println("You chose item 1");
                    break;
                case "item2":
                    System.out.println("You chose item 2");
                    break;
                case "exit":
                    System.out.println("Cheers");
                    break;
                default:
                    System.out.println("wOT?");
                    break;
            }

        } while (!input.equals(item3));

        scanner.close();
    }
}
