package OOPs.Encapsulation;

public class BankAccount {
    // access modifiers

    // Private -> access from same class only
    // Public -> access from same class, different class, different package
    // Protected -> access from same class, different class, and from the child class(inheritance)
    // Default -> access from same class, different class but not from different package

    // attribute
    private static long accNo;
    private double balance;
    private int pin;

    public int random = 5263;

    int age = 60; // default

    protected String gender = "Male";

    // we use a keyword name "this" to manipulation in the attributes of the object
    public void credit(int amount) {
        this.balance += amount;
        System.out.printf("%d Successfully Credited\n", amount);
    }

    public void debit(int amount) {
        this.balance -= amount;
        System.out.printf("%d Successfully Debited\n", amount);
    }

    public void setAccNo() {
        long value = (long) (1000000000000L * Math.random() + 1);
        this.accNo = value;
    }

    public double checkBalance() {
        return this.balance;
    }

    public long getAccNo() {
        return this.accNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getPin() {
        return this.pin;
    }

}
