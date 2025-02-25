package ExceptionHandling;

public class UncheckedExceptionExample {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
