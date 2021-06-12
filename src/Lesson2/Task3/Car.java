package Lesson2.Task3;

public class Car {
    private String color;
    private int year;
    private double speed;
    private int weight;

    public Car() {
        this.color = "Green";
        this.year = 2019;
        this.weight = 15000;
        this.speed = 80;
    }

    public Car(String color) {
        this.color = color;
        this.speed = 195.5;
        this.weight = 1000;
        this.year = 2021;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
        this.weight = 2000;
        this.speed = 120;
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
        this.year = year;
        this.color = "White";
        this.speed = 200.5;
        this.weight = 1100;
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
