package Lesson2.Task3;

public class Program {
    public static void main(String[] args) {
        Car carWithoutConstructor = new Car();
        Car carWithOneParameterConstructor = new Car("Brown");
        Car overrideCarWithOneParameterConstructor = new Car(2009);
        Car overrideCarWithOneParameterConstructor1 = new Car(200.6);
        Car carWithTwoParameterConstructor = new Car("Green", 2001);
        // ... and etc.

        carWithoutConstructor.Display();
        carWithOneParameterConstructor.Display();
        overrideCarWithOneParameterConstructor.Display();
        overrideCarWithOneParameterConstructor1.Display();
        carWithTwoParameterConstructor.Display();
        // ... and etc.
    }
}
