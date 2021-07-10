/**
 *
 * @author Paul Abib S. Camano
 */
// MainWindow.java - View
import javax.swing.*;
import java.awt.Dimension;

public final class MainWindow extends JFrame {
    private JButton addButton;
    private JButton divideButton;
    private JLabel firstNumberLabel;
    private JTextField firstNumberText;
    private JButton multiplyButton;
    private JButton quitButton;
    private JButton resetButton;
    private JLabel resultDisplay;
    private JLabel resultLabel;
    private JLabel secondNumberLabel;
    private JTextField secondNumberText;
    private JButton subtractButton;
    
    public MainWindow() {
        initializeComponents();
        windowConfig();
        addComponents();        
    }
    
    /**
     * Initializes the GUI components.
     */
    public void initializeComponents() {
        firstNumberLabel = new JLabel("First Number:");
        secondNumberLabel = new JLabel("Second Number:");
        resultLabel = new JLabel("Result:");
        firstNumberText = new JTextField();
        secondNumberText = new JTextField();
        resultDisplay = new JLabel();
        addButton = new JButton("ADD");
        subtractButton = new JButton("SUBTRACT");
        multiplyButton = new JButton("MULTIPLY");
        divideButton = new JButton("DIVIDE");
        resetButton = new JButton("RESET");
        quitButton = new JButton("QUIT");
    }
    
    /**
     * Frame configuration goes here.
     */
    public void windowConfig() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setMaximumSize(new Dimension(400, 500));
        setPreferredSize(new Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);
    }
    
    /**
     * Adds GUI components to the frame.
     */
    public void addComponents() {
        // Add "First Number:" Label
        getContentPane().add(firstNumberLabel);
        firstNumberLabel.setBounds(40, 25, 130, 40);
        // Add "Second Number:" Label
        getContentPane().add(secondNumberLabel);
        secondNumberLabel.setBounds(40, 75, 140, 40);
        // Add "Result:" Label
        getContentPane().add(resultLabel);
        resultLabel.setBounds(40, 130, 80, 30);
        // Add "First Number:" Text Field
        getContentPane().add(firstNumberText);
        firstNumberText.setBounds(190, 30, 150, 30);
        // Add "Second Number:" Text Field
        getContentPane().add(secondNumberText);
        secondNumberText.setBounds(190, 80, 150, 30);
        // Add Label for displaying the result
        getContentPane().add(resultDisplay);
        resultDisplay.setBounds(140, 130, 200, 30);
        // Add "ADD" button
        getContentPane().add(addButton);
        addButton.setMnemonic('A');
        addButton.setBounds(40, 170, 130, 50);
        // Add "SUBTRACT" button
        getContentPane().add(subtractButton);
        subtractButton.setMnemonic('S');
        subtractButton.setBounds(210, 170, 130, 50);
        // Add "MULTIPLY" button
        getContentPane().add(multiplyButton);
        multiplyButton.setMnemonic('M');
        multiplyButton.setBounds(40, 240, 130, 50);
        // Add "DIVIDE" button
        getContentPane().add(divideButton);
        divideButton.setMnemonic('D');
        divideButton.setBounds(210, 240, 130, 50);
        // Add "RESET" button
        getContentPane().add(resetButton);
        resetButton.setMnemonic('R');
        resetButton.setBounds(40, 320, 130, 40);
        // Add "QUIT" button
        getContentPane().add(quitButton);
        quitButton.setMnemonic('Q');
        quitButton.setBounds(210, 320, 130, 40);
        
        // Make sure that the components are at their preferred sizes
        pack();
    }
    
    // Accessors and mutators
    /**
     * @return the addButton
     */
    public JButton getAddButton() {
        return addButton;
    }

    /**
     * @param addButton the addButton to set
     */
    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    /**
     * @return the divideButton
     */
    public JButton getDivideButton() {
        return divideButton;
    }

    /**
     * @param divideButton the divideButton to set
     */
    public void setDivideButton(JButton divideButton) {
        this.divideButton = divideButton;
    }

    /**
     * @return the firstNumberLabel
     */
    public JLabel getFirstNumberLabel() {
        return firstNumberLabel;
    }

    /**
     * @param firstNumberLabel the firstNumberLabel to set
     */
    public void setFirstNumberLabel(JLabel firstNumberLabel) {
        this.firstNumberLabel = firstNumberLabel;
    }

    /**
     * @return the firstNumberText
     */
    public JTextField getFirstNumberText() {
        return firstNumberText;
    }

    /**
     * @param firstNumberText the firstNumberText to set
     */
    public void setFirstNumberText(JTextField firstNumberText) {
        this.firstNumberText = firstNumberText;
    }

    /**
     * @return the multiplyButton
     */
    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    /**
     * @param multiplyButton the multiplyButton to set
     */
    public void setMultiplyButton(JButton multiplyButton) {
        this.multiplyButton = multiplyButton;
    }

    /**
     * @return the quitButton
     */
    public JButton getQuitButton() {
        return quitButton;
    }

    /**
     * @param quitButton the quitButton to set
     */
    public void setQuitButton(JButton quitButton) {
        this.quitButton = quitButton;
    }

    /**
     * @return the resetButton
     */
    public JButton getResetButton() {
        return resetButton;
    }

    /**
     * @param resetButton the resetButton to set
     */
    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

    /**
     * @return the resultDisplay
     */
    public JLabel getResultDisplay() {
        return resultDisplay;
    }

    /**
     * @param resultDisplay the resultDisplay to set
     */
    public void setResultDisplay(JLabel resultDisplay) {
        this.resultDisplay = resultDisplay;
    }

    /**
     * @return the resultLabel
     */
    public JLabel getResultLabel() {
        return resultLabel;
    }

    /**
     * @param resultLabel the resultLabel to set
     */
    public void setResultLabel(JLabel resultLabel) {
        this.resultLabel = resultLabel;
    }

    /**
     * @return the secondNumberLabel
     */
    public JLabel getSecondNumberLabel() {
        return secondNumberLabel;
    }

    /**
     * @param secondNumberLabel the secondNumberLabel to set
     */
    public void setSecondNumberLabel(JLabel secondNumberLabel) {
        this.secondNumberLabel = secondNumberLabel;
    }

    /**
     * @return the secondNumberText
     */
    public JTextField getSecondNumberText() {
        return secondNumberText;
    }

    /**
     * @param secondNumberText the secondNumberText to set
     */
    public void setSecondNumberText(JTextField secondNumberText) {
        this.secondNumberText = secondNumberText;
    }

    /**
     * @return the subtractButton
     */
    public JButton getSubtractButton() {
        return subtractButton;
    }

    /**
     * @param subtractButton the subtractButton to set
     */
    public void setSubtractButton(JButton subtractButton) {
        this.subtractButton = subtractButton;
    }
}
