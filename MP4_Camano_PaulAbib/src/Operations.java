/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
// Operations.java - Model
public class Operations {
    private double firstNumber;
    private double secondNumber;
    
    public Operations() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }
    
    public Operations(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    public double add() {
        return this.firstNumber + this.secondNumber;
    }
    
    public double subtract() {
        return this.firstNumber - this.secondNumber;
    }
    
    public double multiply() {
        return this.firstNumber * this.secondNumber;
    }
    
    public double divide() {
        return this.firstNumber / this.secondNumber;
    }

    /**
     * @return the firstNumber
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    
}
