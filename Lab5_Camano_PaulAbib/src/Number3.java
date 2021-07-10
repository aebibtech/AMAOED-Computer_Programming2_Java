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
public class Number3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for storing the length of the array
        int arrayLength;
        // scanner
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter Array Length: ");
            arrayLength = input.nextInt();
            if(arrayLength <= 1) {
                System.out.println("Enter a number greater than 1.");
            }
        } while(arrayLength <= 1);
        // create the array based on the length entered by the user
        int[] toSort = new int[arrayLength];
        
        for(int i = 0; i < toSort.length; i++) {
            System.out.print("Enter Element Number " + (i + 1) + ": ");
            toSort[i] = input.nextInt();
        }
        // for storing ascending or descending
        int ascending;
        // user input for ascending or descending order
        do {
            System.out.print("Sort Array in Ascending Order? [1 = yes, 0 = no]: ");
            ascending = input.nextInt();
            if((ascending < 0) || (ascending > 1)){
                System.out.println("Invalid input.");
            }
        } while((ascending < 0) || (ascending > 1));
        // Sort Logic
        if(ascending == 1) { // Ascending Order
            for (int i = 0; i < toSort.length; i++) { // loop for accessing current element
                for (int j = i + 1; j < toSort.length; j++) { // loop for accessing the next element
                    if (toSort[i] > toSort[j]) {
                        int temp = toSort[i]; // for swapping
                        toSort[i] = toSort[j]; // assign lesser number to the current element (i)
                        toSort[j] = temp; // assign greater number (temp) to the next element (i + 1)
                    }
                }
            }
        } else { // Descending order
            for (int i = 0; i < toSort.length; i++) { // loop for accessing current element
                for (int j = i + 1; j < toSort.length; j++) { // loop for accessing the next element
                    if (toSort[i] < toSort[j]) {
                        int temp = toSort[i]; // for swapping
                        toSort[i] = toSort[j]; // assign greater number to the current element (i)
                        toSort[j] = temp; // assign lesser number (temp) to the next element (i + 1)
                    }
                }
            }
        }
        // Print the sorted array
        System.out.println("Sorted elements in " + (ascending == 1 ? "Ascending" : "Descending") + " Order:");
        for(int i = 0; i < toSort.length; i++) {
            System.out.println(toSort[i]);
        }
    }
    
}
