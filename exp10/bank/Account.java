package bank;

public class Account {

    private int accNo;
    private double balance;

    public Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double simpleInterest(double rate) {
        return (balance * rate * 1.0 / 100);
    }

    public double compoundInterest(double rate, int n) {
        return balance * Math.pow((1 + rate / 100), n) - balance;
    }
}
