package FileHandling;

// FileReader class is used to read streams of character from a file.
// FileReader(String fileName) or FileReader(File file)
// methods: read() (use to write in the file), close() (This is close the file or object)

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        String fileName = "new_file.txt";

        try (FileReader reader = new FileReader(fileName);) {

            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.printf("%c", (char) ch);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
