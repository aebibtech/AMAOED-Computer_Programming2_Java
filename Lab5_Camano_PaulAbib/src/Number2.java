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
public class Number2 {

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
        // print even numbers
        System.out.println("Even numbers:");
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println();
        // print odd numbers
        System.out.println("Odd numbers:");
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println();
    }
    
}
