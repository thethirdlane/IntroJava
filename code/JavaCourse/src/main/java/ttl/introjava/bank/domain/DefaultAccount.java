package ttl.introjava.bank.domain;

/**
 * @author whynot
 */
abstract public class DefaultAccount implements Account {

    int id;
    private String name;
    protected double balance;

    private double interestRate = .5;

//    public Account() {}


    public DefaultAccount(int id, String name, double balance) {
        myInit(id, name, balance);
    }

    public DefaultAccount(int id, String name) {
        myInit(id, name, 0);
    }

    //public Account() {}


    private void myInit(int id, String name, double balance) {
        if(!name.startsWith("A")) {
            throw new RuntimeException("Names must start with A: " + name);
        }
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getBalance() {
        return balance;
    }


    @Override
    public void withdraw(double amt) {

        if(balance - amt >= 0) {
            balance -= amt;
        }
        else {
            //throw new RuntimeException("Not enough money");
            throw new RuntimeException("Not enough money");
        }
    }

    @Override
    public void deposit(double amt) {
        balance += amt;
    }

    /*
    public void monthEnd() {
        balance += balance * interestRate;
    }

     */

}
