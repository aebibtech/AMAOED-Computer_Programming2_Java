/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Number4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Array of Strings to display
        String[][] entry = {
            {"010", "John", "Male", "21"},
            {"011", "Mary", "Female", "25"},
            {"012", "Joseph", "Male", "24"},
            {"013", "Peter", "Male", "22"}
        };
        // display the contents of the array
        for(int i = 0; i < entry.length; i++) {
            System.out.println("ID: " + entry[i][0]);
            System.out.println("Name: " + entry[i][1]);
            System.out.println("Gender: " + entry[i][2]);
            System.out.println("Age: " + entry[i][3]);
            System.out.println();
        }
    }
    
}
