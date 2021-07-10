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
public class Number4PrintHalfPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        int height;
        // User input, repeat until user enters number > 2
        do {
            System.out.print("Enter number: ");
            height = input.nextInt();
            if(height < 2) {
                System.out.println("\nEnter a number greater than 2.\n");
            }
        } while (height < 2);
        // Print the pyramid
        for(int o = 1; o <= height; o++) {
            for(int i = 1; i <= o; i++) { // print asterisks based on the value of i
                System.out.print("* ");
            }
            System.out.println(); // move to new line for the next set of asterisks
        }
    }
    
}
