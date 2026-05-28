package com.gloriane;

// =======================Exercise 1====================
    // Fields
public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
            if(accountHolder == null || accountHolder.trim().isEmpty()) {
                throw new IllegalArgumentException("Account holder name cannot be null or empty");
            }
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        if(balance < 0 )  {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    private void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    private void withdraw(double amount) {
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

        @Override
    public String toString() {
        return "BankAccount{accountHolder='" + accountHolder + "', balance=" + balance + "}";
    }
}