package Lesson3.AdditionalTask;

public class PrinterTest extends Printer{
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(ANSI_RED + "Hello");
    }
}
