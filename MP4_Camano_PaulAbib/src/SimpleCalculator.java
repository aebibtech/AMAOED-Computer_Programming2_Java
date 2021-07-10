/**
 *
 * @author Paul Abib S. Camano
 */
// SimpleCalculator.java - Controller
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public final class SimpleCalculator extends KeyAdapter implements ActionListener  {
    private final MainWindow mainWindow = new MainWindow();
    
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        // Instance of this class, shows the main window.
        SimpleCalculator calc = new SimpleCalculator();
    }
    
    /**
     * Constructor, calls addKeyListeners() and addButtonActions(), shows the Main Window.
     */
    public SimpleCalculator() {
        addKeyListeners();
        addButtonActions();
        mainWindow.setVisible(true);
    }
    
    /**
     * Adds the Key Listeners to the text fields.
     * This forces the text fields to only accept numbers, dot(.) and hyphen (-).
     */
    public void addKeyListeners() {
        // for firstNumberText
        mainWindow.getFirstNumberText().addKeyListener(this);
        // for secondNumberText
        mainWindow.getSecondNumberText().addKeyListener(this);
    }
    
    /**
     * Adds actions to the buttons.
     */
    public void addButtonActions() {
        // addButton
        mainWindow.getAddButton().addActionListener(this);
        // subtractButton
        mainWindow.getSubtractButton().addActionListener(this);
        // multiplyButton
        mainWindow.getMultiplyButton().addActionListener(this);
        // divideButton
        mainWindow.getDivideButton().addActionListener(this);
        // resetButton
        mainWindow.getResetButton().addActionListener((ActionEvent e) -> {
            mainWindow.getFirstNumberText().setText("");
            mainWindow.getSecondNumberText().setText("");
            mainWindow.getResultDisplay().setText("");
        });
        // quitButton
        mainWindow.getQuitButton().addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(mainWindow, "This will terminate the program.", "EXIT", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        });
    }
    
    /**
     * Must be implemented as required by the ActionListener interface.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Operations operation;
            // Get the first number
            double n1 = Double.parseDouble(mainWindow.getFirstNumberText().getText());
            // Get the second number
            double n2 = Double.parseDouble(mainWindow.getSecondNumberText().getText());
            // Operations instance
            operation = new Operations(n1, n2);
            // Store the result
            double result = 0;
            
            if(e.getSource() == mainWindow.getAddButton()) { // if ADD is clicked
                result = operation.add();
            } else if(e.getSource() == mainWindow.getSubtractButton()) { // if SUBTRACT is clicked
                result = operation.subtract();
            } else if(e.getSource() == mainWindow.getMultiplyButton()) { // if MULTIPLY is clicked
                result = operation.multiply();
            } else if(e.getSource() == mainWindow.getDivideButton()) { // if DIVIDE is clicked
               result = operation.divide();
            }
            
            // Display the result to the resultDisplay label
            if(result % 1 != 0) { // if result has a decimal, display the float value
                mainWindow.getResultDisplay().setText( String.valueOf(result) );
            } else { // if result has .0 ending, cast result to int and display the int value
                mainWindow.getResultDisplay().setText( String.valueOf( (int) result ) );
            }
        } catch (NumberFormatException nfe) { // if input is invalid
            mainWindow.getResultDisplay().setText("Invalid input");
        }
    }
    
    /**
     * Override keyTyped() method as required by the abstract KeyAdapter class
     * @param ke 
     */
    @Override
    public void keyTyped(KeyEvent ke) {
        char c = ke.getKeyChar();
        if (!( (c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE) ||
            (c == '.') ||
            (c == '-') ) ) {
            ke.consume();
        }
    }

}
