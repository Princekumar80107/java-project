package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AboutReadLine {
    public static void main(String[] args) {

        // id = 8218

        try(BufferedReader reader = new BufferedReader(new FileReader("new_file.txt"))) {
            String line = reader.readLine();

            while (line != null) {

                if(line.contains("8218")) {
                    System.out.println(line);
                }
                line = reader.readLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
