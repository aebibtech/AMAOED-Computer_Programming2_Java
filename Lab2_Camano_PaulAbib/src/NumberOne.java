/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NumberOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte number = 5;
        // number is even if remainder is 0 (number % 2 == 0), else odd
        // Prints "5 is an odd number" 
        System.out.println(number + " is an " + ( (number % 2 == 0) ? "even" : "odd" ) + " number");
        // set number to 10 to test if it will output even
        number = 10;
        // Prints "10 is an even number"
        System.out.println(number + " is an " + ( (number % 2 == 0) ? "even" : "odd" ) + " number");
    }
    
}
