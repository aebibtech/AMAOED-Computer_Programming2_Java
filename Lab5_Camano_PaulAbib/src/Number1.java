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
public class Number1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array
        int[] numbers = new int[10];
        // scanner
        Scanner input = new Scanner(System.in);
        // user input
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Element Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        // Variables
        int min = numbers[0], max = numbers[0];
        // find the minimum number
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
        // find the maximum number
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
    }
    
}
