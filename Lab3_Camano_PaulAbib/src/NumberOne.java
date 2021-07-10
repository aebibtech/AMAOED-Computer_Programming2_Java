/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class NumberOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Variables
       int radius;
       float pi = 3.14F, area, diameter, circumference;
       // ask user for radius
       Scanner input = new Scanner(System.in);
       System.out.print("Radius: ");
       radius = input.nextInt();
       // Computations
       area = pi * radius * radius;
       diameter = 2 * radius;
       circumference = 2 * pi * radius;
       // Output
       System.out.println("Result:");
       System.out.println("Area: " + area);
       System.out.println("Diameter: " + diameter);
       System.out.println("Circumference: " + circumference);
    }
    
}
