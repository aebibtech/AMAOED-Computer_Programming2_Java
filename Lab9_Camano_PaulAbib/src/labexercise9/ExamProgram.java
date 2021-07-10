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
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExamProgram {

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
        String ans1 = "2. Jose Rizal";
        byte answer1 = 2;
        String question2 = "What is the bank in the Philippines with the tagline \"We find ways.\" ?\n"
                + "1. Banco De Oro\t"
                + "2. Bank of the Philippine Islands\n"
                + "3. UnionBank\t"
                + "4. GCash";
        String ans2 = "1. Banco De Oro";
        byte answer2 = 1;
        String question3 = "Who is the artist of the song \"Castle On The Hill\"?\n"
                + "1. Elton John\t"
                + "2. Beyonce\n"
                + "3. Eminem\t"
                + "4. Ed Sheeran";
        String ans3 = "4. Ed Sheeran";
        byte answer3 = 4;
        String question4 = "Who is the creator of the Linux operating system?\n"
                + "1. Steve Jobs\t\t"
                + "2. Mark Zuckerberg\n"
                + "3. Linus Torvalds\t"
                + "4. Bill Gates";
        String ans4 = "3. Linus Torvalds";
        byte answer4 = 3;
        String question5 = "Who created the Java programming language?\n"
                + "1. Richard Stallman\t"
                + "2. Bill Gates\n"
                + "3. Guido van Rossum\t"
                + "4. James Gosling";
        String ans5 = "4. James Gosling";
        byte answer5 = 4;
        
        // Variables
        int q1, q2, q3, q4, q5, score = 0;
        float percentCorrect;
        
        // Ask the question
        q1 = askQuestion(question1, answer1, ans1);
        q2 = askQuestion(question2, answer2, ans2);
        q3 = askQuestion(question3, answer3, ans3);
        q4 = askQuestion(question4, answer4, ans4);
        q5 = askQuestion(question5, answer5, ans5);
        
        // Calculate percentage of correct answers
        score = q1 + q2 + q3 + q4 + q5;
        float floatScore = score;
        percentCorrect = (floatScore / 5) * 100;
        
        // Print number of correct answers and percentage
        System.out.println("Congratulations, you got " + score + ( (score > 1) ? " answers" : " answer") + " right!");
        System.out.println("That is a score of " + percentCorrect + " percent.");
    }
    
    public static int askQuestion(String question, byte answer, String textAnswer) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int choice, score = 0;
        String choices = "Enter [1-4]: ";
        String correct = "Correct!\n";
        String incorrect = "Incorrect! The correct answer is: ";
        try{
            System.out.println(question);
            System.out.print(choices);
            choice = input.nextByte();

            if(choice < 1 || choice > 4){
                System.out.println("Choices are 1-4 only.\n");
                score = askQuestion(question, answer, textAnswer);
            }
            
            if(choice == answer) {
                score = 1;
                System.out.println(correct);
            } else {
                System.out.println(incorrect + textAnswer);
                System.out.println();
            }
        } catch(InputMismatchException e) {
            System.out.println("INVALID INPUT!\n");
            score = askQuestion(question, answer, textAnswer);
        }
        return score;
    }
    
}
