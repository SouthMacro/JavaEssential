package Lesson3.Task3;

public class Vehicle {
    private int Coords;
    private int Cost;
    private int Speed;
    private int YearDue;

    public Vehicle(int coords, int cost, int speed, int yearDue) {
        Coords = coords;
        Cost = cost;
        Speed = speed;
        YearDue = yearDue;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Coords=" + Coords +
                ", Cost=" + Cost +
                ", Speed=" + Speed +
                ", YearDue=" + YearDue +
                '}';
    }
}
