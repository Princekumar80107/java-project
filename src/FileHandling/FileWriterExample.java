package FileHandling;

// FileWriter class is used to write streams of character to a file.
// FileWriter(String fileName) or FileWriter(File file)
// methods: write() (use to write in the file), flush() (it ensures that data is written immediately in the file), close() (This is close the file or object)

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        String fileName = "new_file.txt";
        // try with resource
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Hello, I am learning File Handling.\n");
            writer.write("This is Advance concept in java");

            for(int i = 0; i < 1000; i++) {
                writer.write("This is Advance concept in java\n");
            }

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
