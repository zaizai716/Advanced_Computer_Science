public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    // constructor
    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // methods
    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // getters
    public double getBalance() {
        return this.balance;
    }

    public String getAccountDetails() {
        return "Your account number is " + this.accountNumber + " and this account is registered under " + this.accountHolder + ". Thank you.";
    }


}
