package labexercise9;

/**
 *
 * @author Paul Abib S. Camano
 */
import java.util.Scanner;

public class CircleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Variables
       int radius = 0;
       float pi = 3.14F, area, diameter, circumference;
       System.out.println("*******CIRCLE CALCULATOR*******");
       // ask user for radius
       do {
           try {
               Scanner input = new Scanner(System.in);
               System.out.print("Enter the radius --> ");
               radius = input.nextInt();
               System.out.println((radius <= 0) ? "INVALID INPUT!" : "");
           } catch(Exception e) {
               System.out.println("INVALID INPUT!");
           }
       } while(radius <= 0);
       // Computations
       area = pi * radius * radius;
       diameter = 2 * radius;
       circumference = 2 * pi * radius;
       // Output
       System.out.println("Result:");
       System.out.println("\tArea: " + area);
       System.out.println("\tDiameter: " + diameter);
       System.out.println("\tCircumference: " + circumference);
    }
    
}
