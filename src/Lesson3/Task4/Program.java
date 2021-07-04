package Lesson3.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String key = bufferedReader.readLine();

        switch (key){
            case "pro":
                DocumentWorker proDocumentWorker = new ProDocumentWorker();
            case "exp":
                DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            default:
                DocumentWorker documentWorker = new DocumentWorker();
        }
    }
}
