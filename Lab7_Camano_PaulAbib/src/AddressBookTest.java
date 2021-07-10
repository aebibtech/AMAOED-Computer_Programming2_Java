/**
 *
 * @author Paul Abib S. Camano
 */

import java.util.Scanner;
import java.util.ArrayList;
public class AddressBookTest {
    // AddressBook[] with length 100
    private AddressBook[] contacts;
    /* for storing how many entries are there
      unless we can use an ArrayList ;) */
    private int count;

    public static void main(String[] args) {
        // Variables
        String name, address, mobileNumber, emailAddress;
        // AddressBook object for initializing the array and count
        AddressBookTest abt = new AddressBookTest();
        // Scanner
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        // store choice to a variable
        byte choice;
        do {
            // User input
            System.out.println("MAIN MENU");
            System.out.println("1. Add Entry");
            System.out.println("2. Delete Entry");
            System.out.println("3. View All Entries");
            System.out.println("4. Update An Entry");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = input.nextByte();
            // Menu implementation
            switch(choice) {
                case 1:
                    // prompt for name
                    System.out.print("Name: ");
                    name = input.next();
                    //name += input.next();
                    // prompt for address
                    System.out.print("Address: ");
                    address = input.next();
                    //address += input.next();
                    // prompt for mobile number
                    System.out.print("Mobile Number: ");
                    mobileNumber = input.next();
                    // prompt for email address
                    System.out.print("E-mail Address: ");
                    emailAddress = input.next();
                    // add the entry
                    abt.addEntry(name, address, mobileNumber, emailAddress);
                    break;
                case 2:
                    if(abt.getCount() == 0) {
                        System.out.println("No entries yet. Nothing to delete.");
                    } else {
                        abt.viewEntries();
                        System.out.print("ID to delete (0 to cancel): ");
                        int num = input.nextInt();
                        if(num == 0) {
                            System.out.println("Cancelled");
                        } else {
                            abt.deleteEntry(num);
                        }
                    }
                    break;
                case 3:
                    if(abt.getCount() == 0) {
                        System.out.println("No entries yet. Nothing to show.");
                    } else {
                        abt.viewEntries();
                    }
                    break;
                case 4:
                    if(abt.getCount() == 0) {
                        System.out.println("No entries yet. Nothing to update.");
                    } else {
                        // Variables for updating
                        int toUpdate;
                        // View entries
                        abt.viewEntries();
                        // number to update
                        System.out.print("ID to update (0 to cancel): ");
                        toUpdate = input.nextInt();
                        if(toUpdate == 0) {
                            System.out.println("Cancelled");
                        } else {
                            if(toUpdate < 0 || toUpdate > abt.getCount()) {
                                System.out.println("Invalid input.");
                            } else {
                                String which;
                                System.out.println("What to update?");
                                System.out.print("Name (n), Address (a), Mobile Number (m), Email Address (e), Any to cancel?");
                                which = input.next();
                                switch(which) {
                                    case "n": case "N":
                                        // prompt for name
                                        System.out.print("Name: ");
                                        name = input.next();
                                        abt.getContacts()[toUpdate - 1].setName(name);
                                        System.out.println("Name updated.");
                                        break;
                                    case "a": case "A":
                                        System.out.print("Address: ");
                                        address = input.next();
                                        abt.getContacts()[toUpdate - 1].setAddress(address);
                                        System.out.println("Address updated.");
                                        break;
                                    case "m": case "M":
                                        System.out.print("Mobile Number: ");
                                        mobileNumber = input.next();
                                        abt.getContacts()[toUpdate - 1].setMobileNumber(mobileNumber);
                                        System.out.println("Mobile Number updated.");
                                        break;
                                    case "e": case "E":
                                        System.out.print("E-mail Address: ");
                                        emailAddress = input.next();
                                        abt.getContacts()[toUpdate - 1].setEmailAddress(emailAddress);
                                        System.out.println("E-mail Address updated.");
                                        break;
                                    default:
                                        System.out.println("Cancelled");
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        } while((choice > 0) || (choice < 6));
    }
    
    // Constructor
    public AddressBookTest() {
        this.contacts = new AddressBook[100];
        this.count = 0;
    }

    // Accessors and Mutators
    public AddressBook[] getContacts() {
        return contacts;
    }

    public void setContacts(AddressBook[] contacts) {
        this.contacts = contacts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    // Add Entry
    public void addEntry (String name, String address, String mobileNumber, String emailAddress) {
        /* If there are no entries yet,
           put the entry at the start of the array. Else,
           put it at the end. The end element of the array
           with contents is at getCount() - 1. Therefore,
           getting the count will be the position for the element to be added.
           If the address book is full, do not add the new contact.
        */
        AddressBook contact = new AddressBook();
        contact.setName(name); contact.setAddress(address);
        contact.setMobileNumber(mobileNumber); contact.setEmailAddress(emailAddress);
        switch(this.count) {
            case 0:
                this.contacts[0] = contact;
                System.out.println("Entry added.");
                this.count += 1;
                break;
            case 100:
                System.out.println("The address book is full.\nDelete some contacts to be able to add again.");
                break;
            default:
                this.contacts[this.count] = contact;
                this.count += 1;
                System.out.println("Entry added.");
                break;
        }
    }
    
    // Delete Entry
    public void deleteEntry(int entryNumber) {
        ArrayList<AddressBook> newContacts = new ArrayList<>();
        if( ((entryNumber - 1) < 0) || ((entryNumber - 1) >= this.count) ){
            System.out.println("Invalid input.");
        } else {
            this.contacts[entryNumber - 1] = null;
            for (AddressBook contact : this.contacts) {
                if (contact != null) {
                    newContacts.add(contact);
                }    
            }
            this.setContacts(newContacts.toArray(new AddressBook[100]));
            this.count -= 1;
            System.out.println("Contact deleted.");
        }
    }
    
    // View All Entries
    public void viewEntries() {
        for(int i = 0; i < this.getCount(); i++){
            System.out.println("ID: " + (i + 1));
            System.out.println("Name: " + this.contacts[i].getName());
            System.out.println("Address: " + this.contacts[i].getAddress());
            System.out.println("Mobile Number: " + this.contacts[i].getMobileNumber());
            System.out.println("E-mail address: " + this.contacts[i].getEmailAddress());
            System.out.println();
        }
    }
}
