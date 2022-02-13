/*
* Chris Sewalson/11-20-2021/CSD320M6AssignmentPyramid
* This routine displays a greeting then asks for an input
*    then outputs a number pyramid
* 
 */
package CSD320M6Assign;

/**
 *
 * @author Chris Sewalson
 */

import java.util.Scanner;

public class CSD320M6AssignNumberPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        var x = 1;
        System.out.println(" Welcome to this really cool number pyramid!");
        System.out.println();
        
        String enterkey;
        Scanner input = new Scanner(System.in);
              
        System.out.println("Press the enter key.");
        enterkey = input.nextLine();
        
        System.out.println("Thanks!");
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("   ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.printf("%3d", x);
                x *= 2;
            }
            x /= 2;
            for (int l = 2; l <= i; l++) {
                x /= 2;
                System.out.printf("%3d", x);
            }
            for (int m = 1; m <= 7 - i; m++) {
                System.out.print("   ");
            }
            
            System.out.println(" @");
        }
    }
}
