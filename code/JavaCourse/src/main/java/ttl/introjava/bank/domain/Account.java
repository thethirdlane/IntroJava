package ttl.introjava.bank.domain;

/**
 * @author whynot
 */
public interface Account {
    int getId();

    void setId(int id);

    String getName();

    void setName(String name);

    double getBalance();

    void withdraw(double amt);

    void deposit(double amt);

    void monthEnd();
}
