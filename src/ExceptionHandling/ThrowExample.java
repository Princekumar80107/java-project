package ExceptionHandling;

// keyword: throw
// This is used to explicitly throw an exception

public class ThrowExample {

    static void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
