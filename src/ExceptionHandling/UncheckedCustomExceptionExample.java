package ExceptionHandling;


class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

public class UncheckedCustomExceptionExample {

    static void withdraw(double balance, double amount) throws NegativeBalanceException {
        if (amount > balance) {
            throw new NegativeBalanceException("Insufficient balance for withdrawal.");
        } else {
            System.out.printf("Withdrawal successful. Remaining balance: %.2f ", balance - amount);
        }
    }

    public static void main(String[] args) {

        try {
            withdraw(50000000, 1000);
        } catch (NegativeBalanceException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
