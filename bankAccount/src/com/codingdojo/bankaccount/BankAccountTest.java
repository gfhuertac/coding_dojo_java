package com.codingdojo.bankaccount;

/**
 * BankAccountTest
 */
public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        try {
            ba.deposit(BankAccount.ACCOUNT_TYPES.CHECKING, 1000);
            ba.deposit(BankAccount.ACCOUNT_TYPES.SAVING, 500);
            ba.withdraw(BankAccount.ACCOUNT_TYPES.CHECKING, 1000);
            ba.withdraw(BankAccount.ACCOUNT_TYPES.SAVING, 500);
            System.out.println(ba.totalBalance());
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        System.out.println(BankAccount.totalMoney());
    }
}