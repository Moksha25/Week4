package Banking_System;

public class CustomerAccount {
    private String accountNumber;
    private double balance;

    public CustomerAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", Balance: $" + balance;
    }
}
