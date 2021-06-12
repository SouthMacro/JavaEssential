package Lesson2.Task2;

public class Car {
    private String color;
    private int year;

    public Car() {
        this.color = "Green";
        this.year = 2019;
    }

    public Car(String color) {
        this.color = color;
        this.year = 2020;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public void Display(){
        System.out.println("Year: " + year + " and color: " + color);
    }
}
