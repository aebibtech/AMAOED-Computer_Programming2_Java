package labexercise9;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
import java.util.Scanner;
public class PrintHalfPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get user input
        int height = getInput();
        // Print the pyramid
        for(int o = 1; o <= height; o++) {
            for(int i = 1; i <= o; i++) { // print asterisks based on the value of i
                System.out.print("* ");
            }
            System.out.println(); // move to new line for the next set of asterisks
        }
    }
    
    public static int getInput() {
        // Variables
        Scanner input = new Scanner(System.in);
        int number;
        // User input, repeat until user enters number > 2
        try {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if(number < 2) {
                System.out.println("\nEnter a number greater than 2.\n");
                number = getInput();
            }
        } catch(java.util.InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            number = getInput();
        }
        
        return number;
    }
    
}
