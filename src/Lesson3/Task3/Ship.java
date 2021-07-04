package Lesson3.Task3;

public class Ship extends Vehicle{
    private int PassngersCount;
    private String PortPripiski;

    public Ship(int coords, int cost, int speed, int yearDue, int passngersCount, String portPripiski) {
        super(coords, cost, speed, yearDue);
        PassngersCount = passngersCount;
        PortPripiski = portPripiski;
    }

    @Override
    public String toString() {
        return super.toString() + "Ship{" +
                "PassngersCount=" + PassngersCount +
                ", PortPripiski='" + PortPripiski + '\'' +
                '}';
    }
}
