package Lesson3.Task3;

public class Plane extends Vehicle{
    private int Height;
    private int PassngersCount;

    public Plane(int coords, int cost, int speed, int yearDue, int height, int passngersCount) {
        super(coords, cost, speed, yearDue);
        Height = height;
        PassngersCount = passngersCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Plane{" +
                "Height=" + Height +
                ", PassngersCount=" + PassngersCount +
                '}';
    }
}
