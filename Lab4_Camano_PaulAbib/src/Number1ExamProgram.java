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
public class Number1ExamProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Questions
        String question1 = "Who is the national hero of the Philippines?\n"
                + "1. Andres Bonifacio\t"
                + "2. Jose Rizal\n"
                + "3. Apolinario Mabini\t"
                + "4. Tandang Sora";
        byte answer1 = 2;
        String question2 = "What is the bank in the Philippines with the tagline \"We find ways.\" ?\n"
                + "1. Banco De Oro\t"
                + "2. Bank of the Philippine Islands\n"
                + "3. UnionBank\t"
                + "4. GCash";
        byte answer2 = 1;
        String question3 = "Who is the artist of the song \"Castle On The Hill\"?\n"
                + "1. Elton John\t"
                + "2. Beyonce\n"
                + "3. Eminem\t"
                + "4. Ed Sheeran";
        byte answer3 = 4;
        String question4 = "Who is the creator of the Linux operating system?\n"
                + "1. Steve Jobs\t\t"
                + "2. Mark Zuckerberg\n"
                + "3. Linus Torvalds\t"
                + "4. Bill Gates";
        byte answer4 = 3;
        String question5 = "Who created the Java programming language?\n"
                + "1. Richard Stallman\t"
                + "2. Bill Gates\n"
                + "3. Guido van Rossum\t"
                + "4. James Gosling";
        byte answer5 = 4;
        
        // Variables
        String choices = "Enter [1-4]: ";
        String correct = "Correct!\n";
        String incorrect = "Incorrect! The correct answer is: ";
        int choice = 0, score = 0;
        float percentCorrect;
        
        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Question 1
        do {
            try{
                System.out.println(question1);
                System.out.print(choices);
                choice = input.nextByte();
            } catch(Exception e) {
                System.out.println("INVALID INPUT!");
            }
        } while(choice < 1 || choice > 4);
        
        if(choice == answer1) {
            score += 1;
            System.out.println(correct);
        } else {
            System.out.println(incorrect + "2. Jose Rizal");
            System.out.println();
        }
        
        // Question 2
        do {
            try{
                System.out.println(question2);
                System.out.print(choices);
                choice = input.nextByte();
            } catch(Exception e) {
                System.out.println("INVALID INPUT!");
            }
        } while(choice < 1 || choice > 4);
        
        if(choice == answer2) {
            score += 1;
            System.out.println(correct);
        } else {
            System.out.println(incorrect + "1. Banco De Oro");
            System.out.println();
        }
        
        // Question 3
        do {
            try{
                System.out.println(question3);
                System.out.print(choices);
                choice = input.nextByte();
            } catch(Exception e) {
                System.out.println("INVALID INPUT!");
            }
        } while(choice < 1 || choice > 4);
        
        if(choice == answer3) {
            score += 1;
            System.out.println(correct);
        } else {
            System.out.println(incorrect + "4. Ed Sheeran");
            System.out.println();
        }
        
        // Question 4
        do {
            try{
                System.out.println(question4);
                System.out.print(choices);
                choice = input.nextByte();
            } catch(Exception e) {
                System.out.println("INVALID INPUT!");
            }
        } while(choice < 1 || choice > 4);
        
        if(choice == answer4) {
            score += 1;
            System.out.println(correct);
        } else {
            System.out.println(incorrect + "3. Linus Torvalds");
            System.out.println();
        }
        
        // Question 5
        do {
            try{
                System.out.println(question5);
                System.out.print(choices);
                choice = input.nextByte();
            } catch(Exception e) {
                System.out.println("INVALID INPUT!");
            }
        } while(choice < 1 || choice > 4);
        
        if(choice == answer5) {
            score += 1;
            System.out.println(correct);
        } else {
            System.out.println(incorrect + "4. James Gosling");
            System.out.println();
        }
        
        // Calculate percentage of correct answers
        float floatScore = score;
        percentCorrect = (floatScore / 5) * 100;
        
        // Print number of correct answers and percentage
        System.out.println("Congratulations, you got " + score + ( (score > 1) ? " answers" : " answer") + " right!");
        System.out.println("That is a score of " + percentCorrect + " percent.");
    }
    
}
