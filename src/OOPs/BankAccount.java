package OOPs;

public class BankAccount {
    // attribute
    int balance;
    double savingInterest;

    // we use a keyword name "this" to manipulation in the attributes of the object
    public void credit(int amount) {
        this.balance += amount;
        System.out.printf("%d Successfully Credited\n", amount);
    }

    public void debit(int amount) {
        this.balance -= amount;
        System.out.printf("%d Successfully Debited\n", amount);
    }

    public int checkBalance() {
        return this.balance;
    }
}
