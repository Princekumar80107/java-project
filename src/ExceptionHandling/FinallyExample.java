package ExceptionHandling;

// keyword: finally
// The finally block always executes, even if an exception occurs or not.

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;

            System.out.println("This is try block");

            System.out.println(result);
        } finally {
            System.out.println("This is finally block");
        }
    }
}
