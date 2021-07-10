package lab8_camano_paulabib;

/**
 *
 * @author Paul Abib S. Camano
 */
public class Lab8Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerScienceStudentRecord record = new ComputerScienceStudentRecord("Paul Camano", 90, 85, 86, 95);
        System.out.println("Name:\t " + record.getName());
        System.out.println("Math:\t " + record.getMathGrade());
        System.out.println("English: " + record.getEnglishGrade());
        System.out.println("Science: " + record.getScienceGrade());
        System.out.println("Computer Programming: " + record.getComprogGrade());
        System.out.println("AVERAGE GRADE: " + record.computeAverageGrade());
        
        Circle c1 = new Circle(4);
        Square s1 = new Square(5);
        
        System.out.println();
        
        c1.getArea();
        s1.getArea();
    }

}
