/*
* Chris Sewalson/11-6-2021/CSD320M4AssignmentStrings
* This routine will analyze for substring
* It uses the scanner utility for user input
* 
 */
package CSD320M4Assign;

/**
 *
 * @author Chris Sewalson 
 */

import java.util.*;

public class CSD320M4AssignStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // The salutation
        System.out.println("Hello, enter a string here: ");
        
        // User inputs string 1 and string 2
        
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        System.out.println("You have entered " + s1 + ".");
        System.out.println("");
        System.out.println("Now enter another string here: ");
        String s2 = input.next();
        System.out.println("This time you have entered " + s2 + ".");
        System.out.println("");
        
        // Checking whether string 1 contains string 2
        
        if (s1.contains(s2)){
            System.out.println("Your string " + s2 + " is a substring of " + s1 + ".");
        }
        
        // Checking whether string 2 contains string 1
        
        else if (s2.contains(s1)){
            System.out.println("Your string " + s1 + " is a substring of " + s2 + ".");
        }
        
        // Advising user that neither string is withing the other
        else {
            System.out.println("Neither " + s1 + " or " + s2 + " are substrings of each other.");
        }
        System.out.println("");
        System.out.println("Thanks for your input(S).");
        }
}
