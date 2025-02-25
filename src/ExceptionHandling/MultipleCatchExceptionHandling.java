package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleCatchExceptionHandling {
    public static void main(String[] args) {


        try {
            int[] arr = {10, 20, 30};
            // int result = arr[2] / 0;

            // System.out.println(result);
            FileReader file = new FileReader("index.txt");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Catch 1");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Catch 2");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Catch 3");
            System.out.println(ex.getMessage());
        }


    }
}
