package lab5;

/**
 * Account
 */


public class Account {

    private String name;
    private int accountNumber;
    private double balance;
    // public void  setAccountNumber(int an ){
    //     accountNumber = an;
    // }

    // public  int getAccountNumber(){
    //     return accountNumber;
    // }

    //  inorder to generate this automatically , right click and choose the source actions and choose the setter and getter. 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    
    

}