package Lesson3.Task3;

public class Program {
    public static void main(String[] args) {
        Lesson3.Task3.Car car = new Car(10, 10, 10, 10);
        Lesson3.Task3.Plane plane = new Plane(10, 10, 10, 10, 10, 10);
        Lesson3.Task3.Ship ship = new Ship(10, 10, 10, 10, 10, "Port1");

        System.out.println(car.toString());
        System.out.println(plane.toString());
        System.out.println(ship.toString());
    }
}
