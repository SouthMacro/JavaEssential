package Lesson2.Task4;

import Lesson2.Task3.Car;

public class Program {
    public static void main(String[] args) {
        Lesson2.Task3.Car carWithoutConstructor = new Lesson2.Task3.Car();
        Lesson2.Task3.Car carWithOneParameterConstructor = new Lesson2.Task3.Car("Brown");
        Lesson2.Task3.Car overrideCarWithOneParameterConstructor = new Lesson2.Task3.Car(2009);
        Lesson2.Task3.Car overrideCarWithOneParameterConstructor1 = new Lesson2.Task3.Car(200.6);
        Lesson2.Task3.Car carWithTwoParameterConstructor = new Car("Green", 2001);
        // ... and etc.

        carWithoutConstructor.Display();
        carWithOneParameterConstructor.Display();
        overrideCarWithOneParameterConstructor.Display();
        overrideCarWithOneParameterConstructor1.Display();
        carWithTwoParameterConstructor.Display();
        // ... and etc.
    }
}
