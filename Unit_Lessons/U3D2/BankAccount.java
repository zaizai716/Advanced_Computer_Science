public class BankAccount {
    private double balance;


    public BankAccount() {
        balance = 100;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            throw new IllegalArgumentException("You are attempting to withdraw too much money, chill out!");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("No!");
        }

        balance -= amount;
    }
}