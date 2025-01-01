package Chapter_3;

import java.util.Scanner;

public class FCC_4_2_IntermediateTrafficLightSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input light color: ");
        String trafficLight = scanner.nextLine().trim().toLowerCase();

        switch (trafficLight) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }
        scanner.close();
    }
}
