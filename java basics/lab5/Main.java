package lab5;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();

        myAccount.setAccountNumber(1234);

        int  accountNumber = myAccount.getAccountNumber();

        System.out.println(accountNumber);




    }
}