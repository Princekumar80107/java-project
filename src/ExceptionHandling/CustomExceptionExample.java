package ExceptionHandling;

// we need to inherit the methods and attributes of the Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
