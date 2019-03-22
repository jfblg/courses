package com.jfblg;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class testAccount {

    private Account account;

    @Before
    public void initialize() {
        account = new Account();
    }

    @Test
    public void testDeposit() {
        account.deposit(10.0);
        assertEquals("1 deposit", 10.0, account.getBalance(), 0);
        account.deposit(10.0);
        assertEquals("2 deposit", 20.0, account.getBalance(), 0);
        account.deposit(10.0);
        assertEquals("3 deposit", 30.0, account.getBalance(), 0);
        account.deposit(10.0);
        assertEquals("4 deposit", 40.0, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawAboveBalance() {
        account.deposit(1000.0);
        account.withdraw(250.0);
        assertEquals("1 withdrawal", 750.0, account.getBalance());
        account.withdraw(250.0);
        assertEquals("2 withdrawal", 500.0, account.getBalance());
        account.withdraw(250.0);
        assertEquals("3 withdrawal", 250.0, account.getBalance());
        account.withdraw(250.0);
        assertEquals("4 withdrawal", 0.0, account.getBalance());
    }

    @Test
    public void testWithdrawBelowBalance() {
        account.deposit(1000.0);
        account.withdraw(1000.1);
        assertEquals("Should not withdraw anything", 1000.0, account.getBalance());
    }
}
