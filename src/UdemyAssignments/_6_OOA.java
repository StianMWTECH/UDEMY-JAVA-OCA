package UdemyAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Exercise {
    double distanceCovered();
    public void move();
}




abstract class Run implements Exercise {
    private final double distanceKm;

    public Run(double distance) {
        this.distanceKm = distance;
    }

    @Override
    public double distanceCovered() {
        return this.distanceKm;
    }
}

abstract class Walk implements Exercise {
    private final double distanceKm;

    public Walk(double distance) {
        this.distanceKm = distance;
    }

    @Override
    public double distanceCovered() {
        return this.distanceKm;
    }
}




interface BallSport {}

class Soccer extends Run implements BallSport {

    public Soccer(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Soccer::moving()");
    }

}
class Sprint extends Run {

    public Sprint(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Sprint::moving()");
    }
}




interface OlympicSport {}

class RaceWalking extends Walk implements OlympicSport {

    public RaceWalking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("RaceWalking::moving()");
    }
}
class Stroll extends Walk {

    public Stroll(double distanceKm) {
        super(distanceKm);
    }

    @Override
    public void move() {
        System.out.println("Stroll::moving()");
    }
}





public class _6_OOA {

    public static void main(String[] args) {

        List<Exercise> list = new ArrayList<>();

        Exercise soccerObject = new Soccer(12.5);
        list.add(soccerObject);
        Exercise sprintObject = new Sprint(.1);
        list.add(sprintObject);
        Exercise strollObject = new Stroll(10);
        list.add(strollObject);
        Exercise raceWalkingObject = new RaceWalking(5);
        list.add(raceWalkingObject);

        performExercises(list);
    }

    public static void performExercises(List<Exercise> list) {
        for (Exercise item : list) {
//            System.out.println(item instanceof BallSport);
            if (item instanceof BallSport || item instanceof OlympicSport) {
                System.out.println(item.getClass().getSimpleName());
                System.out.println(item.distanceCovered());
            }
        }
    }


}
