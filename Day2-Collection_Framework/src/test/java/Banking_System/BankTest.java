package Banking_System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest
{
    private Bank bankingSystem;

    @BeforeEach
    public void setUp() {
        bankingSystem = new Bank();
        bankingSystem.addAccount("12345", 1000.00);
        bankingSystem.addAccount("67890", 500.00);
        bankingSystem.addAccount("11223", 1500.00);
    }

    @Test
    public void testAddAccount() {
        bankingSystem.addAccount("54321", 2000.00);
        CustomerAccount account = bankingSystem.getAccount("54321");
        assertNotNull(account);
        assertEquals("54321", account.getAccountNumber());
        assertEquals(2000.00, account.getBalance());
    }

    @Test
    public void testDeposit() {
        bankingSystem.deposit("12345", 500.00);
        CustomerAccount account = bankingSystem.getAccount("12345");
        assertEquals(1500.00, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        bankingSystem.withdraw("67890", 200.00);
        CustomerAccount account = bankingSystem.getAccount("67890");
        assertEquals(300.00, account.getBalance());
    }

}
