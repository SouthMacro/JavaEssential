package Lesson3.Task2;

public class Pupil {
    private int StudyPoints;
    private int ReadPoints;
    private int WritePoints;
    private int RelaxPoints;

    public Pupil(Integer... data) {
        StudyPoints = data.length > 0 ? data[0] : 0;
        ReadPoints = data.length > 1 ? data[1] : 0;
        WritePoints = data.length > 2 ? data[2] : 0;
        RelaxPoints = data.length > 3 ? data[3] : 0;
    }

    void study(){
        System.out.println("Points: of " + getClass().getName() + " is " + StudyPoints);
    }
    void read(){
        System.out.println("Points: " + getClass().getName() + " is " +  ReadPoints);
    }
    void write(){
        System.out.println("Points: " + getClass().getName() + " is " + WritePoints);
    }
    void relax(){
        System.out.println("Points: " + getClass().getName() + " is " + RelaxPoints);
    }
}
