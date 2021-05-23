package testdome;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void cannotWithdrawAndDepositMinus() {
        Account account = new Account(100);
        Assert.assertEquals(account.deposit(-10), false);
        Assert.assertEquals(account.withdraw(-10), false);
    }

    @Test
    public void cannotWithdraw() {
        Account account = new Account(100);
        Assert.assertEquals(account.withdraw(120), false);
    }

    @Test
    public void correctAmount() {
        Account account = new Account(100);
        account.deposit(10);
        Assert.assertEquals(10.0, account.getBalance(), 0);
        account.withdraw(10);
        Assert.assertEquals(0.0, account.getBalance(), 0);
    }

    @Test
    public void withdrawAndDeposit() {
        Account account = new Account(10);
        Assert.assertEquals(true, account.withdraw(10));
        Assert.assertEquals(true, account.deposit(10));
    }
}