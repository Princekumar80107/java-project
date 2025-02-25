package ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {

        // Exception is handled through try catch block

        try {
            // In try you have to write that particular code that may cause exception
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Catch Block is run");
            // Jab exception hogi uske baad jo kaam karwana hoga usse catch mein likhte hain
            System.out.println(ex.getMessage());
        }


    }
}
