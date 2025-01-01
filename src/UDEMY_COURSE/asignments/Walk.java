package UDEMY_COURSE.asignments;

public abstract class Walk implements Exercise{
    private double distanceKm;
    
    public Walk(double distanceKm){
        this.distanceKm = distanceKm;
    }
    @Override
    public double distanceCovered(){
        return distanceKm;
    }
}
class Stroll extends Run {
    Stroll(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("Stroll::moving()");
    }
}
class RaceWalking extends Run implements OlympicSport{
    RaceWalking(double distanceKm){
        super(distanceKm);
    }
    @Override
    public void move(){
        System.out.println("RaceWalking::moving()");
    }
}
