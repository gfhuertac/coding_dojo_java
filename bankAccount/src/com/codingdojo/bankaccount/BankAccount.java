package com.codingdojo.bankaccount;

import java.util.Random;

/**
 * BankAccount
 */
public class BankAccount {

    public static enum ACCOUNT_TYPES {
        CHECKING,
        SAVING
    };

    protected static int numberOfAccounts = 0;
    protected static double totalAmountOfSavings = 0;

    public static String createAccountNumber() {
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<10; ++i) {
            sb.append(rnd.nextInt(9));
        }
        return sb.toString();
    }

    public static double totalMoney() {
        return totalAmountOfSavings;
    }

    protected String accountNumber;
    protected double checkingBalance;
    protected double savingsBalance;

    public BankAccount() {
        accountNumber = BankAccount.createAccountNumber();
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        ++numberOfAccounts;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(BankAccount.ACCOUNT_TYPES accountType, double amount) throws IllegalArgumentException {
        if (amount < 0.0)
            throw new IllegalArgumentException("amount cannot be negative");
        if (accountType == BankAccount.ACCOUNT_TYPES.CHECKING) {
            checkingBalance += amount;
        } else if (accountType == BankAccount.ACCOUNT_TYPES.SAVING) {
            savingsBalance += amount;
        }
        BankAccount.totalAmountOfSavings += amount;
    }    

    public void withdraw(BankAccount.ACCOUNT_TYPES accountType, double amount) throws IllegalArgumentException, IllegalAccessException {
        if (amount < 0.0)
            throw new IllegalArgumentException("amount cannot be negative");
        if (accountType == BankAccount.ACCOUNT_TYPES.CHECKING) {
            if (checkingBalance < amount)
                throw new IllegalAccessException("amount cannot be greater than checking balance");
            checkingBalance -= amount;
        } else if (accountType == BankAccount.ACCOUNT_TYPES.SAVING) {
            if (savingsBalance < amount)
                throw new IllegalAccessException("amount cannot be greater than saving balance");
            savingsBalance -= amount;
        }
        BankAccount.totalAmountOfSavings -= amount;
    }

    public double totalBalance() {
        return checkingBalance + savingsBalance;
    }

}