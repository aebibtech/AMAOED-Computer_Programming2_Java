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
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for storing menu choice
        int choice;
        // Scanner
        Scanner input = new Scanner(System.in);
        // main program loop
        do {
           System.out.println("[1] Prime or Composite");
           System.out.println("[2] All Prime Numbers");
           System.out.println("[3] Exit");
           System.out.print("Choose an option -> ");
           choice = input.nextInt();
           // Validate input
           if((choice < 0) || (choice > 3)) {
               System.out.println("Invalid choice.");
           }
           // [1] Prime or Composite
           if(choice == 1){
               // User input for a number
               System.out.print("Enter a Number: ");
               int number = input.nextInt();
               // for counting the number of factors
               int factors = 0;
               // count the number of factors
               for(int i=1; i<=number; i++){
                   if( (number % i) == 0) { // if the number is divisible by a factor (when remainder is zero)
                       factors++; // add 1 to the number of factors
                   }
               }
               // logic for determining if a number is prime, composite, neither prime nor composite
               if( (number == 0) || (number == 1)) {
                   System.out.println("Neither Prime nor Composite\n");
               } else if (factors > 2) {
                   System.out.println("Composite Number\n");
               } else if (number == -1) {
                   System.out.println("Prime Number\n");
               } else if (number < -1) {
                   System.out.println("Composite Number\n");
               } else {
                   System.out.println("Prime Number\n");
               }
           }
           // [2] All Prime Numbers
           if(choice == 2){
                // for storing the range of prime numbers
                int start, end, flag = 0;
                // ask for the range
                System.out.print("Enter Start Number: ");
                start = input.nextInt();
                System.out.print("Enter End Number: ");
                end = input.nextInt();
                // find and print all prime numbers between the given range
                for(int i = start ; i <= end ; i++) {
                    // 0 and 1 are neither prime nor composite
                    if((i == 0) || (i == 1)) {
                        continue;
                    }
                    // logic for determining prime numbers
                    for(int j = 2 ; j < i ; j++) {
                        if(i % j == 0) { // if composite, having no remainder means a factor
                            flag = 0; // set flag to 0
                            break;
                        } else { // if no factors, having a remainder
                            flag = 1; // set flag to 1
                        }
                    }
                    // flag == 1, print the number
                    if(flag == 1) {
                        System.out.print(i + " ");
                    }
		}
                System.out.println("\n");
           }
           // [3] Exit
           if(choice == 3) {
               break;
           }
        } while((choice > 0) || (choice < 3));
    }
    
}
