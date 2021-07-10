/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul Abib S. Camano
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    /**
     * Returns the fraction form of this fraction as a String.
     * @return 
     **/
    public String showFractionForm() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
    
    /**
     * Computes and returns the lowest term of this fraction as a String.
     * @return 
     **/
    public String determineLowestTerm() {
        int gcf = 1;
        
        for(int i = 1; i <= this.getNumerator() && i <= this.getDenominator(); i++) {
            if(this.getNumerator() % i == 0 && this.getDenominator() % i == 0) {
                gcf = i;
            }
        }
        
        return (this.getNumerator() / gcf) + "/" + (this.getDenominator() / gcf);
    }
    
    /**
     * Returns the decimal equivalent of this fraction as a double.
     * @return 
     **/
    public double decimalEquivalent() {
        double dNumerator = this.getNumerator();
        double dDenominator = this.getDenominator();
        
        return dNumerator / dDenominator;
    }
    
    /**
     * Returns the fraction type of this fraction as a String.
     * @return 
     **/
    public String determineFractionType() {
        String fractionType;
        double dNumerator = this.getNumerator();
        double dDenominator = this.getDenominator();
        
        if(this.getNumerator() < this.getDenominator()) {
            fractionType = "Proper Fraction";
        } else if((this.getNumerator() % this.getDenominator() == 0) && (dNumerator / dDenominator >= 1)) {
            fractionType = "Whole Number";
        } else {
            fractionType = "Improper Fraction";
        }
        
        return fractionType;
    }
}
