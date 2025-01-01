package Chapter_2;

class ProfileData {
    int score;
    byte age;
    short year;
    long population;
    float price;
    double distance;
    boolean isComplete;
    char initial;

    public ProfileData(int score, byte age, short year, long population, float price, double distance, boolean isComplete, char initial) {
        this.score = score;
        this.age = age;
        this.year = year;
        this.population = population;
        this.price = price;
        this.distance = distance;
        this.isComplete = isComplete;
        this.initial = initial;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    public void displayProfileData() {
        System.out.println("Score: "+ getScore() + ", year: " + getYear() + ", Initial:  " + getInitial());
    }
}


public class FCC_1_EightPrimitiveTypes {
    public static void main(String[] args) {
        ProfileData jimmy = new ProfileData(80, (byte) 23, (short) 2001, 7816253000L, 10.99F, 384.4, true, 'J');

        jimmy.displayProfileData();
    }
}
