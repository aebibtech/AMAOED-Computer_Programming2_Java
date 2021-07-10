/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
public final class SavingsAccountCamano extends BankAccountCamano {
    private String accountNo;
    private double balance;
    private double interestRate;
    
    public SavingsAccountCamano() {
        super("", "", "", "");
        this.setAccountNo("");
        this.setBalance(0);
        this.setInterestRate(0.05);
    }
    
    public SavingsAccountCamano(String accountName, String address, String birthday, String contactNumber,
            String accountNo, double balance, double interestRate) {
        super(accountName, address, birthday, contactNumber);
        this.setAccountNo(accountNo);
        this.setBalance(balance);
        this.setInterestRate(interestRate);
    }
    
    /**
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * @param interestRate the interestRate to set
     */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public boolean balanceInquiry(String accountNumber) {
        boolean success = true;
        if(this.validateAcctNumber(accountNumber)) {
            System.out.println("\n***************BALANCE INQUIRY**************");
            System.out.println("Account Name: " + this.getAccountName());
            System.out.println("Balance: Php " + this.getBalance());
            System.out.println();
        } else {
            success = false;
        }
        return success;
    }
    
    public void deposit(String accountNumber, double amount) {
        if(this.validateAcctNumber(accountNumber)) {
            this.setBalance(this.getBalance() + amount);
            double interest = this.getBalance() * this.getInterestRate();
            this.setBalance(this.getBalance() + interest);
            System.out.println("Php " + amount
                    + " is deposited to " + this.getAccountName() + "'s account"
                    + " with account number " + this.getAccountNo()
                    + ". "
                    + "New balance is Php " + this.getBalance() + ".\n"
            );
        }
    }
    
    public void withdraw(String accountNumber, double amount) {
        if(this.validateAcctNumber(accountNumber)) {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Php " + amount
                    + " is withdrawn from " + this.getAccountName() + "'s account"
                    + " with account number " + this.getAccountNo()
                    + ". "
                    + "New balance is Php " + this.getBalance() + ".\n"
            );
        }
    }
    
    public boolean validateAcctNumber(String accountNumber) {  
        return this.getAccountNo().equals(accountNumber);
    }
    
    public void closeAccount(String accountNumber) {
        if(this.validateAcctNumber(accountNumber)) {
            this.setBalance(0);
            System.out.println(this.getAccountName()
                    + "'s account with account number " + this.getAccountNo()
                    + " is closed.\n"
            );
        }
    }
    
}
