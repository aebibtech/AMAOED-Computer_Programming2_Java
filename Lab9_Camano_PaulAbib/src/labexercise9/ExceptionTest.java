package labexercise9;

/**
 *
 * @author Paul Abib S. Camano
 */
public class ExceptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        try{
            String[] nums = {"one", "two", "three"};
            for(i = 0; i <= 3; i++){
                System.out.println(nums[i]);
            }
        } catch(Exception e) {
            System.out.println("Exception caught: Array Index " + i + " is out of bounds");
        }
    }

}
