package Lesson1.Task4;

public class Computer {
    public Computer() {
        System.out.println("Checking adding data to mas.");
    }

    public void addDataToMas(Computer[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = new Computer();
        }
    }
}
