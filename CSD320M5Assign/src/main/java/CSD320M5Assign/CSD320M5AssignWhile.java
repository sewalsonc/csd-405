/*
* Chris Sewalson/11-9-2021/CSD320M4AssignmentStrings
* This routine will display the results of the operation of dividing 1 by
*   an accending order of odd numbers and then adding them together.
* Then doing this again but using a decending order of odd numbers
* 
 */
package CSD320M5Assign;

/**
 *
 * @author Chris Sewalson
 */

public class CSD320M5AssignWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Greeting
        System.out.println("Welcome to my crazy calculator!");
        System.out.println("You will see the results of dividing odd numbers \n\tfrom 3 - 99"
                + " and then from 99 - 3!");
        // Math and output below using while loop
        System.out.println("");
        double i = 3;
        double x = 1;
        double y = 99;
        do {
            System.out.println(x / i);
            i +=2;
        }
        while (i < 100);
        
        System.out.println("");
        
        do {
            System.out.println(x / y);
            y -=2;
        }
        while (y > 1);
    }    
}
