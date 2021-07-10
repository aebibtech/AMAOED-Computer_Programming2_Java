/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
public class BankAccountCamano {
    private String accountName;
    private String address;
    private String birthday;
    private String contactNumber;
    
    public BankAccountCamano() {
        this.accountName = "";
        this.address = "";
        this.birthday = "Jan 1 1901";
        this.contactNumber = "";
    }
    
    public BankAccountCamano(String accountName, String address, String birthday, String contactNumber) {
        this.setAccountName(accountName);
        this.setAddress(address);
        this.setBirthday(birthday);
        this.setContactNumber(contactNumber);
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void getClientDetails() {
        System.out.println("\n***************CLIENT DETAILS***************");
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Address: " + this.address);
        System.out.println("Birthday: " + this.birthday);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println();
    }
}
