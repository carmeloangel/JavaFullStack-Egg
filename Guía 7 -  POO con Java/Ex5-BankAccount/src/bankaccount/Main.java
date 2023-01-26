package bankaccount;

import bankaccount.entity.Account;
import bankaccount.service.AccountService;

/**
 *
 * @author Angel Campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AccountService as = new AccountService();

        Account a = as.createAccount();

        if (a != null) {
            System.out.println(a.toString());

            as.makeDeposit(a);

            System.out.println(a.toString());

            as.makeWithdrawal(a);

            System.out.println(a.toString());
            
            as.fastWithdrawal(a);

            System.out.println(a.toString());
            
            as.getCurrentBalance(a);
            
            as.getAccountData(a);
        }

    }

}
