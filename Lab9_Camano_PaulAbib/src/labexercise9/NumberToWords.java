package labexercise9;
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
public class NumberToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int number, ones, tens, hundreds, thousands, tenThousands, specialThousands, specialTens;
        
        // User input, repeat until user enters a number from 1 to 100,000
        number = getInput();
        
        specialThousands = number / 1000; // Special case - 1000 to 19000
        tenThousands = (number / 10000) % 10;
        thousands = (number / 1000) % 10;
        hundreds = ( (number / 100) % 100 ) % 10;
        specialTens = number % 100; // Special case - 11 to 19
        tens =( number / 10 ) % 10;
        ones = number % 10;
        
        // If it's 100000 already ;)
        if(number == 100000) {
            System.out.print("One Hundred Thousand");
        }
        
        // Logic for special case
        if(specialThousands > 0 && specialThousands < 20) {
            switch(specialThousands){
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 10:
                    System.out.print("Ten ");
                    break;
                case 11:
                    System.out.print("Eleven ");
                    break;
                case 12:
                    System.out.print("Twelve ");
                    break;
                case 13:
                    System.out.print("Thirteen ");
                    break;
                case 14:
                    System.out.print("Fourteen ");
                    break;
                case 15:
                    System.out.print("Fifteen ");
                    break;
                case 16:
                    System.out.print("Sixteen ");
                    break;
                case 17:
                    System.out.print("Seventeen ");
                    break;
                case 18:
                    System.out.print("Eighteen ");
                    break;
                case 19:
                    System.out.print("Nineteen ");
                    break;
            }
            
            System.out.print("Thousand ");
        }
        
        // tenThousands > 1 and thousands > 0 (20000 - 99000)
        if(tenThousands > 1) {
            switch(tenThousands) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            // Thousands place value
            if(thousands > 0) {
                switch(thousands) {
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
            
            System.out.print("Thousand ");
        }
        
        if(hundreds > 0) {
            switch(hundreds) {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            
            System.out.print("Hundred ");
        }
        
        // Special case - less than 100, 11 - 19
        if(specialTens > 10 || specialTens < 20) {
            switch(specialTens) {
                case 11:
                    System.out.print("Eleven ");
                    break;
                case 12:
                    System.out.print("Twelve ");
                    break;
                case 13:
                    System.out.print("Thirteen ");
                    break;
                case 14:
                    System.out.print("Fourteen ");
                    break;
                case 15:
                    System.out.print("Fifteen ");
                    break;
                case 16:
                    System.out.print("Sixteen ");
                    break;
                case 17:
                    System.out.print("Seventeen ");
                    break;
                case 18:
                    System.out.print("Eighteen ");
                    break;
                case 19:
                    System.out.print("Nineteen ");
                    break;
            }
        }
        // less than 100, 1 to 10 and 20 - 99
            if(specialTens < 11 || specialTens > 19){
                // tens place value
                if(tens > 0) {
                    switch(tens) {
                    case 1:
                        System.out.print("Ten ");
                        break;
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
            }
            // Ones place value
            if(ones > 0) {
                switch(ones) {
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
            }
        }
        
        System.out.println();
    }
    
    public static int getInput() {
        int number;
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number < 1 || number > 100000){
                System.out.println("Number is out of range!\n");
                number = getInput();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            number = getInput();
        }
        
        return number;
    }
}
