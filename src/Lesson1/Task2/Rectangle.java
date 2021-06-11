package Lesson1.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double side1 = Double.parseDouble(bufferedReader.readLine());
        double side2 = Double.parseDouble(bufferedReader.readLine());

        System.out.println("Plashed: " + areaCalculator(side1, side2));
        System.out.println("Perimeter: " + perimeterCalculator(side1, side2));
    }

    public static double areaCalculator (double side1, double side2){
        return side1 * side2;
    }

    public static double perimeterCalculator (double side1, double side2){
        return 2 * (side1 + side2);
    }

}
