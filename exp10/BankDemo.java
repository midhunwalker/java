import bank.Account;

public class BankDemo {

    public static void main(String[] args) {
        bank.Account a = new bank.Account(1234, 45000);

        a.deposit(1000);
        System.out.println("Current Balance: " + a.getBalance());

        a.withdraw(2000);
        System.out.println("Current Balance: " + a.getBalance());

        System.out.println("Simple Interest for 1 year at 5% rate: " + a.simpleInterest(5.0));
    }
}

