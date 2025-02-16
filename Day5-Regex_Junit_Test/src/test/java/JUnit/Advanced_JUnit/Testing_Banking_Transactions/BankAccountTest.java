package JUnit.Advanced_JUnit.Testing_Banking_Transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest
{
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Deposit should increase balance");
    }

    @Test
    void testWithdrawValidAmount() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), "Withdrawal should decrease balance");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150),
                "Should throw exception for insufficient funds");
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10),
                "Should throw exception for negative deposit");
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10),
                "Should throw exception for negative withdrawal");
    }
}
