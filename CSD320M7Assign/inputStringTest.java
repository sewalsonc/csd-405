/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wit0011153
 */
package CSD320M7Assign;


import java.util.Scanner;

public class inputStringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(" Welcome, this code prompt you to enter a password!");
        System.out.println();
        System.out.println("Your password must be at least 8 characters, must contain both letters and numbers,\n\t contain at least one upper case character and one lower case character.");
        System.out.println();
        
        String enterkey;
        Scanner input = new Scanner(System.in);
        
        enterkey = input.nextLine();
    }
}
