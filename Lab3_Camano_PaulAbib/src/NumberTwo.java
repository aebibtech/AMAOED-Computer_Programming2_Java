/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class NumberTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String name, address, contactNumber, info;
        int age;
        // Ask input
        name = JOptionPane.showInputDialog("Name:");
        age = Integer.parseInt( JOptionPane.showInputDialog("Age:") );
        address = JOptionPane.showInputDialog("Address:");
        contactNumber = JOptionPane.showInputDialog("Contact Number:");
        // Output
        info = "User's Personal Information:\n\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nContact Number: " + contactNumber;
        JOptionPane.showMessageDialog(null, info);
    }
    
}
