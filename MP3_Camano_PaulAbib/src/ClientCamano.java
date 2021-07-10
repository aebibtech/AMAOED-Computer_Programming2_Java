/**
 *
 * @author Paul Abib S. Camano
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class ClientCamano {
    static SavingsAccountCamano[] accounts;
    static int count;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        accounts = new SavingsAccountCamano[100];
        count = 0;
        byte choice;
        
        do {
            choice = getMenuChoice();
            switch(choice) {
                case 1: // New Account
                    SavingsAccountCamano newAccount;

                    if(count == 100) {
                        System.out.println("Maximum number of accounts is reached (100)!\nDelete some to add more.\n");
                    } else if(count < 100) {
                        newAccount = createAccount();
                        for(int i = 0; i < 100; i++) {
                            if(accounts[i] == null) {
                                accounts[i] = newAccount;
                                count++;
                                break;
                            }
                        }
                    }
                    
                    break;
                case 2: // Balance Inquiry
                    if(count == 0) {
                        System.out.println("No accounts yet.\n");
                    } else {
                        boolean success = balanceInquiry();
                        
                        if(!success) {
                            System.out.println("Account does not exist.\n");
                        }
                    }
                    
                    break;
                case 3: // Deposit
                    if(count == 0) {
                        System.out.println("No accounts yet.\n");
                    } else {
                        boolean success = deposit();
                        
                        if(!success) {
                            System.out.println("Account does not exist.\n");
                        }
                    }
                    
                    break;
                case 4: // Withdraw
                    if(count == 0) {
                        System.out.println("No accounts yet.\n");
                    } else {
                        boolean success = withdraw();
                        
                        if(!success) {
                            System.out.println("Account does not exist.\n");
                        }
                    }
                    
                    break;
                case 5: // Client Profile
                    if(count == 0) {
                        System.out.println("No accounts yet.\n");
                    } else {
                        boolean success = clientProfile();
                        
                        if(!success) {
                            System.out.println("Account does not exist.\n");
                        }                        
                    }
                    
                    break;
                case 6: // Close Account
                    if(count == 0) {
                        System.out.println("No accounts yet.\n");
                    } else {
                        boolean success = closeAccount();
                        
                        if(!success) {
                            System.out.println("Account does not exist.\n");
                        }
                    }
                    
                    break;
            }
        } while(choice > 0 || choice < 7);
    }
    
    /**
     * Displays the main menu.
     */
    public static void displayMainMenu(){
        System.out.println("JBank Main Menu");
        System.out.println("[1] New Account");
        System.out.println("[2] Balance Inquiry");
        System.out.println("[3] Deposit");
        System.out.println("[4] Withdraw");
        System.out.println("[5] Client Profile");
        System.out.println("[6] Close Account");
        System.out.println("[7] Exit");
    }
    
    /**
     * Gets a menu choice from the user and returns the choice as a byte.
     * @return 
     */
    public static byte getMenuChoice() {
        Scanner input = new Scanner(System.in);
        byte choice;
        
        try {
            displayMainMenu();
            System.out.print("Enter choice --> ");
            choice = input.nextByte();
            
            if(choice < 0 || choice > 7) {
                System.out.println("INVALID INPUT!\n");
            }
            
            if(choice == 7) {
                System.exit(0);
            }
        } catch(InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            choice = getMenuChoice();
        }
        
        return choice;
    }
    
    /**
     * Gets client details and returns a SavingsAccountCamano object.
     * @return 
     */
    public static SavingsAccountCamano createAccount(){
        String name, address, birthday, contactNumber, accountNumber;
        double initialAmount = 0;
        double interestRate = 0.05;
        
        System.out.println("\n**************NEW ACCOUNT**************");
        name = inputDetail("Name");
        address = inputDetail("Address");
        birthday = inputDetail("Birthday");
        contactNumber = inputDetail("Contact Number");
        do {
            initialAmount = inputMoney();
            if(initialAmount < 5000) {
                System.out.println("Initial deposit is Php 5000.00\n");
            }
        } while(initialAmount < 5000);
        
        accountNumber = "" + ( (int)(Math.random()*9000) + 1000);

        System.out.println("New account with name " + name
                + " and account number " + accountNumber
                + " created.\n"
        );

        return new SavingsAccountCamano(name, address, birthday, contactNumber, accountNumber, initialAmount, interestRate);
    }
    
    /**
     * Asks an input based on what detail is needed.
     * @param detail Description of the detail.
     * @return 
     */
    public static String inputDetail(String detail) {
        String output;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print(detail + " --> ");
        output = input.next();
        
        if(output.equals("")) {
            output = inputDetail(detail);
        }
        
        return output;
    }
    
    /**
     * Asks a money input from the user and returns a double value of the input.
     * @return 
     */
    public static double inputMoney() {
        double output;
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Amount --> ");
            output = input.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            output = inputMoney();
        }
        
        return output;
    }
    
    /**
     * Shows the list of accounts.
     */
    public static void showAccounts() {
        System.out.println("\n***************ACCOUNTS LIST***************");
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null) {
                System.out.println("Name: " + accounts[i].getAccountName()
                        + " | Account Number: " + accounts[i].getAccountNo()
                );
            }
        }
        System.out.println();
    }
    
    /**
     * Asks the user for an account number to inquire balance with.
     * Returns true if an the account number exists.
     * @return 
     */
    public static boolean balanceInquiry() {
        Scanner input = new Scanner(System.in);
        short accountNumber = 0000;
        boolean success = false;
        try {
            showAccounts();
            System.out.print("Account Number --> ");
            accountNumber = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            success = balanceInquiry();
        }
        
        for(int i = 0; i < count; i++) {
            if( accounts[i].getAccountNo().equals( String.valueOf(accountNumber) ) ) {
                success = accounts[i].balanceInquiry(String.valueOf(accountNumber));
                break;
            }
        }
        
        return success;
    }
    
    /**
     * Asks the user for an account number and deposits the specified amount.
     * Returns true if the deposit succeeds. Else, returns false.
     * @return 
     */
    public static boolean deposit() {
        Scanner input = new Scanner(System.in);
        short accountNumber = 0000;
        boolean success = false;
        double amount;
        try {
            showAccounts();
            System.out.print("Account Number --> ");
            accountNumber = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            success = deposit();
        }
        
        for(int i = 0; i < count; i++) {
            if( accounts[i].getAccountNo().equals( String.valueOf(accountNumber) ) ) {
                amount = inputMoney();
                if(amount >= 100) {
                    accounts[i].deposit(String.valueOf(accountNumber), amount);
                    success = true;
                } else {
                    System.out.println("Enter an amount of Php 100 and above.\n");
                    amount = inputMoney();
                }
                break;
            }
        }
        
        return success;        
    }
    
    /**
     * Asks the user for an account number and withdraws the specified amount.
     * Returns true if the withdraw succeeds. Else, returns false.
     * @return 
     */
    public static boolean withdraw() {
        Scanner input = new Scanner(System.in);
        short accountNumber = 0000;
        boolean success = false;
        double amount;
        try {
            showAccounts();
            System.out.print("Account Number --> ");
            accountNumber = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            success = withdraw();
        }
        
        for(int i = 0; i < count; i++) {
            if( accounts[i].getAccountNo().equals( String.valueOf(accountNumber) ) ) {
                amount = inputMoney();
                if( (amount >= 100) && (amount <= accounts[i].getBalance()) && (accounts[i].getBalance() - amount >= 5000)) {
                    accounts[i].withdraw(String.valueOf(accountNumber), amount);
                    success = true;
                } else if(accounts[i].getBalance() - amount < 5000) {
                    System.out.println("Maintaining balance is Php 5000.00.");
                    System.out.println("This account's balance is Php" + accounts[i].getBalance());
                } else {
                    System.out.println("Enter an amount of Php 100.00 and above.\n");
                    amount = inputMoney();
                }
                break;
            }
        }
        
        return success;        
    }
    
    /**
     * Asks the user for an account number. If the account exists,
     * shows the client profile and returns true. Else, returns false.
     * @return 
     */
    public static boolean clientProfile() {
        Scanner input = new Scanner(System.in);
        short accountNumber = 0000;
        boolean success = false;
        try {
            showAccounts();
            System.out.print("Account Number --> ");
            accountNumber = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            success = clientProfile();
        }
        
        for(int i = 0; i < count; i++) {
            if( accounts[i].getAccountNo().equals( String.valueOf(accountNumber) ) ) {
                accounts[i].getClientDetails();
                success = true;
                break;
            }
        }
        
        return success;
    }
    
    /**
     * Prompts a confirmation to the user. Returns true if y, false if n.
     * @return 
     */
    public static boolean confirm() {
        boolean yesNo = false;
        Scanner input = new Scanner(System.in);
        String choice = "n";
        
        do {
            System.out.print("\nAre you sure that you want to close this account? [y/n] --> ");
            choice = input.next();
            
            if(choice.equalsIgnoreCase("y")) {
                yesNo = true;
                break;
            } else if(choice.equalsIgnoreCase("n")) {
                yesNo = false;
                break;
            }
        } while(!(choice.equalsIgnoreCase("y")) || !(choice.equalsIgnoreCase("n")));
        
        return yesNo;
    }
    
    /**
     * Asks the user for an account number and closes it if the account exists.
     * Returns true if the account exists.
     * @return 
     */
    public static boolean closeAccount() {
        Scanner input = new Scanner(System.in);
        short accountNumber = 0000;
        boolean success = false;
        
        try {
            showAccounts();
            System.out.print("Account Number --> ");
            accountNumber = input.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            success = closeAccount();
        }
        
        for(int i = 0; i < count; i++) {
            if( accounts[i].getAccountNo().equals( String.valueOf(accountNumber) ) ) {
                if(accounts[i].getBalance() == 0) {
                    System.out.println("Account is already closed.\n");
                    success = true;
                } else {
                    if(confirm()){
                        accounts[i].setBalance(0);
                        success = true;
                    } else {
                        System.out.println("Operation cancelled.\n");
                        success = true;
                    }
                }
                break;
            }
        }
        
        return success;         
    }
}
