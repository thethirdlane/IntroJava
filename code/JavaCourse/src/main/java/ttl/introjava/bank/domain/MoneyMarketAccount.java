package ttl.introjava.bank.domain;

/**
 * @author whynot
 */
public class MoneyMarketAccount extends DefaultAccount{

    public MoneyMarketAccount(int id, String name, double balance, double minBalance) {
        super(id, name, balance);
    }

    @Override
    public final void monthEnd() {

        final int i = 10;
    }
}
