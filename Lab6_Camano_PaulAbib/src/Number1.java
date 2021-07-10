/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
public class Number1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 5, n2 = 4, n3 = 3, n4 = 2, n5 = 1, n6 = 6;
        System.out.println("Numbers to average:");
        System.out.print(n1 + ", " + n2 + ", " + n3 + ", ");
        System.out.print(n4 + ", " + n5 + ", " + n6 + "\n");
        int average3 = average(n1, n2, n3);
        int average4 = average(n1, n2, n3, n4);
        int average5 = average(n1, n2, n3, n4, n5);
        int average6 = average(n1, n2, n3, n4, n5, n6);
        System.out.println("Average of three numbers: " + average3);
        System.out.println("Average of four numbers: " + average4);
        System.out.println("Average of five numbers: " + average5);
        System.out.println("Average of six numbers: " + average6);
    }
    
    static int average(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }
    
    static int average(int num1, int num2, int num3, int num4){
        return (num1 + num2 + num3 + num4) / 4;
    }
    
    static int average(int num1, int num2, int num3, int num4, int num5){
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }
    
    static int average(int num1, int num2, int num3, int num4, int num5, int num6){
        return (num1 + num2 + num3 + num4 + num5 + num6) / 6;
    }
    
}
