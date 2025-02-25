package ExceptionHandling;

// keyword: throws
// this keyword is used in the method signature to indicate that the method may throw an exception.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

    static void readFile() throws FileNotFoundException {

        FileReader file = new FileReader("index.txt");
        // rest of the coding
    }

    static void findFile() throws FileNotFoundException {
        readFile();
    }

    public static void main(String[] args) {

        try {
            findFile();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
