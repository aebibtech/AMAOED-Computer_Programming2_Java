/**
 *
 * @author Paul Abib S. Camano
 */
import java.util.Scanner;
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int numerator, denominator;
        String inputAgain = "y";
        
        // Fraction object
        Fraction userInput = new Fraction();
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Main loop, loop as long as inputAgain == y
        while (inputAgain.equalsIgnoreCase("y")) {
            // input numerator
            do {
                System.out.print("\nEnter the numerator --> ");
                numerator = input.nextInt();
                System.out.print((numerator < 0) ? "\nNumerator cannot be less than zero." : "");
            } while(numerator < 0);
            
            // input denominator
            do {
                System.out.print("Enter the denominator --> ");
                denominator = input.nextInt();
                System.out.print((denominator <= 0) ? "\nDenominator cannot be zero or less." : "");
            } while(denominator <= 0);
            
            // Set the numerator and denominator
            userInput.setNumerator(numerator);
            userInput.setDenominator(denominator);
            
            // Program output
            System.out.println("***************OUTPUT***************");
            System.out.println("\tNUMERATOR\t\t: " + userInput.getNumerator());
            System.out.println("\tDENOMINATOR\t\t: " + userInput.getDenominator());
            System.out.println("\tFRACTION\t\t: " + userInput.showFractionForm());
            System.out.println("\tLOWEST TERM\t\t: " + userInput.determineLowestTerm());
            System.out.println("\tDECIMAL EQUIVALENT\t: " + userInput.decimalEquivalent());
            System.out.println("\tFRACTION TYPE\t\t: " + userInput.determineFractionType());
            
            // Ask to input again, loop if the answer is not valid
            while( !(inputAgain.equalsIgnoreCase("y")) || !(inputAgain.equalsIgnoreCase("n")) ){
                System.out.print("\nInput again? [y/n] --> ");
                inputAgain = input.next();
                
                if(inputAgain.equalsIgnoreCase("y") || inputAgain.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("Invalid input.");
                }
            }
            
            // if inputAgain == n, terminate
            if(inputAgain.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

}
