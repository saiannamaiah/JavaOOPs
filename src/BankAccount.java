public class BankAccount {

    private int accountNumber;

    private int accountBalance;

    private String accountName;

    private String accountEmail;

    private int accountPhoneNumber;


public BankAccount() {
    System.out.println("This first constructor is called");
}

public BankAccount(int accountNumber, int accountBalance, String accountName,
                   int accountPhoneNumber, String accountEmail) {
    this.accountBalance = accountBalance;
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    this.accountEmail = accountEmail;
    this.accountPhoneNumber = accountPhoneNumber;
}
    public void toDepositFunds(int depositAmount) {

        accountBalance += depositAmount;
        System.out.println(depositAmount + " Deposited Amount and Balance is :  " + accountBalance );
    }

    public void withDrawFunds(int withDrawalAmount) {
        if (accountBalance - withDrawalAmount < 0) {
            System.out.println("Insuffient Funds");
        } else {
            accountBalance -= withDrawalAmount;
            System.out.println(withDrawalAmount + " amount withdrawn and new balance is " + this.accountBalance);
        }
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountPhoneNumber(int accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

}
