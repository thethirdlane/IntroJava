package ttl.introjava.bank.app;


import ttl.introjava.bank.domain.Account;
import ttl.introjava.bank.domain.DefaultAccount;
import ttl.introjava.bank.domain.SavingsAccount;
import ttl.introjava.bank.xyz.CheckingAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whynot
 */
public class BankApp {

    public static void main(String[] args) throws Exception {
        go2();
    }

    public static void go1() {
        //Account account = new Account();
        /*
        Account account = new Account(10, "AJoe", 333.74);
        account.withdraw(10);
         */


        CheckingAccount ca = new CheckingAccount(20, "ASammy", 0, 500);
        ca.withdraw(4000);
        System.out.println("Ca balance is " + ca.getBalance());

        SavingsAccount sca = new SavingsAccount(20, "ASammy", 0, 500);
        sca.withdraw(33.4);

    }

    public static void go2() {

        Account ac = new CheckingAccount(20, "ASammy", 5000, 500);

        List<Account> accountL = new ArrayList<>();
        Account accounts [] = new DefaultAccount[3];
        /*
        accounts[0] = new Account(10, "AJoe", 333.74);
        accounts[1] = new CheckingAccount(20, "ASammy", 50000, 500);
        accounts[2] = new SavingsAccount(20, "ASammy", 5000, 500);
        for(int i = 0; i < accounts.length; i++) {
            accounts[i].monthEnd();
        }
         */
        //accountL.add(new Account(10, "AJoe", 333.74));
        accountL.add(new CheckingAccount(20, "ASammy", 50000, 500));
        accountL.add(new CheckingAccount(20, "ASammy", 50000, 500));
        accountL.add(new SavingsAccount(20, "ASammy", 5000, 500));



        for(int i = 0; i < accountL.size(); i++) {
            accountL.get(i).monthEnd();
        }

    }
}

