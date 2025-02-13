package Banking_System;

import java.util.*;

public class Bank
{
    private Map<String, CustomerAccount> accounts = new HashMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void addAccount(String accountNumber, double initialBalance)
    {
        CustomerAccount account = new CustomerAccount(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
    }

    public CustomerAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(String accountNumber, double amount)
    {
        CustomerAccount account = accounts.get(accountNumber);
        if (account != null)
        {
            account.setBalance(account.getBalance() + amount);
        }
    }

    public void withdraw(String accountNumber, double amount)
    {
        CustomerAccount account = accounts.get(accountNumber);
        if (account != null && account.getBalance() >= amount)
        {
            account.setBalance(account.getBalance() - amount);
            withdrawalQueue.add(accountNumber);
        }
        else
        {
            System.out.println("Insufficient funds or account not found.");
        }
    }

    public void processWithdrawals()
    {
        while (!withdrawalQueue.isEmpty())
        {
            String accountNumber = withdrawalQueue.poll();
            CustomerAccount account = accounts.get(accountNumber);
            if (account != null)
            {
                System.out.println("Processed withdrawal for " + account);
            }
        }
    }

    public void displayAccounts()
    {
        accounts.forEach((accountNumber, account) -> {
            System.out.println(account);
        });
    }

    public void displayAccountsSortedByBalance()
    {
        TreeMap<Double, List<CustomerAccount>> sortedAccounts = new TreeMap<>();
        accounts.values().forEach(account -> {
            sortedAccounts
                    .computeIfAbsent(account.getBalance(), k -> new ArrayList<>())
                    .add(account);
        });
        sortedAccounts.forEach((balance, accountList) -> {
            accountList.forEach(account -> {
                System.out.println(account);
            });
        });
    }
}
