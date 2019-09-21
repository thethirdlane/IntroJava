package ttl.introjava.bank.xyz;

import ttl.introjava.bank.domain.DefaultAccount;

/**
 * @author whynot
 */
public class CheckingAccount extends DefaultAccount {

    private double minBalance = 500;


    public CheckingAccount(int id, String name, double balance, double minBalance) {
        super(id, name, balance);
        this.minBalance = minBalance;
    }

    public CheckingAccount(int id, String name, double minBalance) {
        super(id, name);
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amt) {
        if(balance -  amt >= minBalance) {
            super.withdraw(amt);
        }
        else {
            //throw new RuntimeException("Not enough money");
            throw new RuntimeException("Not enough money in Checking Account");
        }
    }


    @Override
    public void monthEnd() {
        if(getBalance() < 1000) {
            super.withdraw(5);
        }
    }

    public void otherMethod() {

    }

}
