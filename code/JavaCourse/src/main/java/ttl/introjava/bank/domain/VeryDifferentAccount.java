package ttl.introjava.bank.domain;

/**
 * @author whynot
 */
public class VeryDifferentAccount implements Account {
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public void withdraw(double amt) {

    }

    @Override
    public void deposit(double amt) {

    }

    @Override
    public void monthEnd() {

    }
}
