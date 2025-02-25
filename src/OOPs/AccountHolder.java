package OOPs;

public class AccountHolder {
    public static void main(String[] args) {
        BankAccount sam = new BankAccount();

        System.out.println("Sam Bank Account");
        sam.balance = 1000;
        sam.savingInterest = 4.3;

        sam.debit(200);
        System.out.println(sam.checkBalance());

        sam.credit(13000);

        System.out.println(sam.checkBalance());

        System.out.println("Sukriti Bank Account");
        BankAccount sukriti = new BankAccount();

        sukriti.balance = 2000;
        sam.savingInterest = 5.1;

        sukriti.debit(500);
        System.out.println(sukriti.checkBalance());
    }
}