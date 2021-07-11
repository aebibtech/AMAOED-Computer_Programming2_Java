/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aebibtech
 */
import java.util.Scanner;

public class LanguageFundamentals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to average? ");
        int num = input.nextInt();
        double[] n = new double[num];
        for(int i = 0; i < n.length ; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            n[i] = input.nextDouble();
        }
        System.out.print("average = (");
        
        for(int i = 0; i < n.length; i++) {
            /*if(i != (n.length - 1)) {
                System.out.print(n[i] + " + ");
            } else {
                System.out.print(n[i]);
            }*/
            System.out.print(n[i] + " + ");
        }
        
        System.out.print("\b\b\b" + ")");
        
        System.out.print(" / " + n.length + "\n");
        
        System.out.println("Average: " + average(n));
    }
    
    public static double average(double[] n){
        double result = 0;
        for(double i : n){
            result += i;
        }        
        return (result / (n.length));
    }
    
}
