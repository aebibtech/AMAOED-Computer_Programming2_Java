/**
 *
 * @author Paul Abib S. Camano
 */
public class NumberTwo {
    public static void main(String[] args) {
        // Declare grossSales with the float data type since it has a decimal point.
        float grossSales = 0.0F;
        /* Declare age with the byte data type 
           because we humans don't really live past 110 years.
           I will change the data type if we become immortal.
        */
        byte age = 1;
        /* Declare Final as _final because 'final' is a keyword in Java
           to follow coding standards.
           We declare _final with the boolean data type
           because it contains the value 'false'.
        */
        boolean _final = false;
        // Declare location with the data type byte because it is still less than 127. 
        byte location = 0x11;
        // Declare oldFile with the data type byte because it is still less than 127. 
        byte oldFile = 067;
        /*  Declare Default as _default because 'default' is a keyword in Java
            The data type is 'char' because it contains the character 'a'.
        */
        char _default = 'a';
        /*  Declare name with the data type String
            because it contains a sequence of characters.
        */
        String name = "noname";
        // Prints "Gross Sales = 0.0" along with a new line
        System.out.println("Gross sales = " + grossSales);
        // Prints "Age = 1" along with a new line
        System.out.println("Age = " + age);
        // Prints "Final = false" along with a new line
        System.out.println("Final = " + _final);
        // Prints "Location = 17" along with a new line
        System.out.println("Location = " + location);
        // Prints "Old File = 55" along with a new line
        System.out.println("Old File = " + oldFile);
        // Prints "Default = a" along with a new line
        System.out.println("Default = " + _default);
        // Prints "Name = noname" along with a new line
        System.out.println("Name = " + name);
    }
}
