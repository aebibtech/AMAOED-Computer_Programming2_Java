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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get User input
        int number = getInput();
        // Output example: "The factorial of 4 is 24"
        System.out.print("The factorial of ");
        System.out.print(number);
        System.out.print(" is ");
        // Output the factorial
        System.out.print(factorial(number));
        System.out.println();
    }
    
    public static long factorial(int number) {
        int i = number;
        long product = 1L;
        if(number == 0 || number == 1) { // 0 or 1
            product = 1;
        } else {
            while(i > 0) {
                product *= i;
                i--;
            }
        }
        return product;
    }
    
    public static int getInput(){
        // Variables
        int number = 0;
        // Scanner
        Scanner input = new Scanner(System.in);
        // User Input, repeat until user enters a number greater than -1
        try {
            System.out.print("Enter number: ");
            number = input.nextInt();
            // print an error message if number is negative
            if(number < 0) {
                System.out.println("Invalid input.");
                number = getInput();
            }
        } catch(java.util.InputMismatchException e) {
            System.out.println("Invalid input.");
            number = getInput();
        }
        
        return number;
    }
    
}
