/**
 * Write a circle calculator program that computes the area, 
 * circumference and diameter of a circle. The program will accept input number (radius) 
 * and that number will be used to get the area, circumference and diameter of a circle. 
 * This time you are going to use separate methods for each computation. 
 * For example, to get the value of area you need to write 
 * method area that has radius parameter and returns double value. 
 * Use this formula to find the area, circumference and diameter of a circle:
 * 1. Π = 3.14
 * 2. Area = πr2
 * 3. Diameter = 2r
 * 4. Circumference = 2πr
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
        // Variable
        double radius;
        // Scanner
        Scanner input = new Scanner(System.in);
        // User input
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        // Output
        System.out.println("Area = " + area(radius));
        System.out.println("Diameter = " + diameter(radius));
        System.out.println("Circumference = " + circumference(radius));
    }
    
    static double area(double radius) {
        return 3.14 * radius * radius;
    }
    
    static double diameter(double radius) {
        return 2 * radius;
    }
    
    static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }

}
