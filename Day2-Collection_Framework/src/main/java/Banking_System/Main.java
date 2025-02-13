package Banking_System;

public class Main {
    public static void main(String[] args) {
        Bank bankingSystem = new Bank();

        // Add customer accounts
        bankingSystem.addAccount("12345", 1000.00);
        bankingSystem.addAccount("67890", 500.00);
        bankingSystem.addAccount("11223", 1500.00);

        // Deposit money
        bankingSystem.deposit("12345", 200.00);
        bankingSystem.deposit("67890", 100.00);

        // Withdraw money
        bankingSystem.withdraw("12345", 150.00);
        bankingSystem.withdraw("67890", 50.00);

        // Process withdrawals
        bankingSystem.processWithdrawals();

        // Display all accounts
        System.out.println("\nAll Accounts:");
        bankingSystem.displayAccounts();

        // Display accounts sorted by balance
        System.out.println("\nAccounts Sorted by Balance:");
        bankingSystem.displayAccountsSortedByBalance();
    }
}
