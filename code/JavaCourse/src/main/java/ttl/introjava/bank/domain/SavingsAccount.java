package ttl.introjava.bank.domain;

/**
 * @author whynot
 */
public class SavingsAccount extends DefaultAccount {

    public SavingsAccount(int id, String name, double balance, double minBalance) {
        super(id, name, balance);
    }

    @Override
    public void monthEnd() {

    }
}
