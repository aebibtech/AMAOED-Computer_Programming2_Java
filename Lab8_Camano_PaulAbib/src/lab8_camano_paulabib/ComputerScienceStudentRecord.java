/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_camano_paulabib;

/**
 *
 * @author User
 */
public class ComputerScienceStudentRecord extends StudentRecord {
    private double comprogGrade;
    
    public ComputerScienceStudentRecord(String name, double mathGrade
            , double englishGrade, double scienceGrade, double comprogGrade) {
        super(name, mathGrade, englishGrade, scienceGrade);
        this.comprogGrade = comprogGrade;
    }

    /**
     * @return the comprogGrade
     */
    public double getComprogGrade() {
        return comprogGrade;
    }

    /**
     * @param comprogGrade the comprogGrade to set
     */
    public void setComprogGrade(double comprogGrade) {
        this.comprogGrade = comprogGrade;
    }
    
    //custom method
    @Override
    public double computeAverageGrade(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade() + getComprogGrade()) / 4;
    } 
}
