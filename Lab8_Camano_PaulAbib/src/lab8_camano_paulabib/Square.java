/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_camano_paulabib;

/**
 *
 * @author Paul Abib S. Camano
 */
public class Square extends Shape {
    private double sideLength;
    
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void getArea() {
        double area = this.getSideLength() * this.getSideLength();
        System.out.println("Area of the Square is " + area);
    }

    @Override
    public void getName() {
        System.out.println("Square");
    }

    /**
     * @return the sideLength
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * @param sideLength the sideLength to set
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    
}
