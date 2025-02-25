package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("index.txt");
        } catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
            System.out.println("File not found. Please check the file path.");
        }



    }
}
