package labexercise9;

/**
 *
 * @author Paul Abib S. Camano
 */
import javax.swing.JOptionPane;
public class JOptionPaneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I wonder where do I catch exceptions here? ;)
        
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
