package Lesson2.Task4;

public class Car {
    private String color;
    private int year;
    private double speed;
    private int weight;

    public Car() {
        this("Green", 2001, 200.9, 10000);
    }

    public Car(String color) {
        this(2005);
        this.color = color;
        this.speed = 195.5;
        this.weight = 1000;
    }

    public Car(String color, int year) {
        this(206.8, 5000);
        this.color = color;
        this.year = year;
    }

    public Car(String color, int year, double speed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.weight = 800;
    }

    public Car(String color, int year, double speed, int weight) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    // override constructors
    public Car(int year) {
        this("Holly", 200.7, 10000);
        this.year = year;
    }

    public Car(double speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public Car(double speed) {
        this.speed = speed;
        this.year = 2000;
        this.color = "Black";
        this.weight = 1400;
    }

    public Car(String color, double speed) {
        this.color = color;
        this.speed = speed;
        this.year = 2001;
        this.weight = 1400;
    }

    public Car(String color, double speed, int weight) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.year = 2005;
    }

    public void Display(){
        System.out.println("Year: " + year + " and color: " + color + " and weight: " + weight + " and speed: " + speed);
    }
}
