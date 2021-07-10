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
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = 3.141592654 * this.radius * this.radius;
        System.out.println("Area of the Circle is " + area);
    }

    @Override
    public void getName() {
        System.out.println("Circle");
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
