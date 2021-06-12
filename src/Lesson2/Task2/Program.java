package Lesson2.Task2;

public class Program {
    public static void main(String[] args) {
        Car carWithoutConstructor = new Car();
        Car carWithOneParameterConstructor = new Car("Gold");
        Car carWithTwoParameterConstructor = new Car("Yellow", 2021);

        carWithoutConstructor.Display();
        carWithOneParameterConstructor.Display();
        carWithTwoParameterConstructor.Display();
    }
}
