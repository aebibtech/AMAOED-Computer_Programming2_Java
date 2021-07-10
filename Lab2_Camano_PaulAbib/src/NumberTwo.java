/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NumberTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int n1 = 25, n2 = 3;
        float n1f = n1, n2f = n2;
        // Computation for Quotient and Average
        float quotient = n1f / n2f, average = (n1f + n2f) / 2;
        //Print all output
        System.out.println("First Integer: " + n1);
        System.out.println("Second Integer: " + n2);
        System.out.println("Sum: " + (n1 + n2) );
        System.out.println("Difference: " + (n1 - n2) );
        System.out.println("Product: " + (n1 * n2) );
        System.out.println("Quotient: " + quotient );
        System.out.println("Average: " + average );
        System.out.println("Max integer: " + ( (n1 > n2 ) ? n1 : n2) );
        System.out.println("Min integer: " + ( (n1 < n2 ) ? n1 : n2) );
    }
    
}
