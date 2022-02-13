/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M3Assign;

/**
 *
 * @author wit0011153
 */
import java.util.Scanner;

public class Practice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        boolean bool_1 = false;
        boolean bool_2 = true;
        
        boolean bool_3 = 8==9;
        boolean bool_4 = 9==9;
        
        System.out.println("The variable bool_1 is " + bool_1 + ".");
        System.out.println("The variable bool_2 is " + bool_2 + ".");
        System.out.println("The variable bool_3 is " + bool_3 + ".");
        
        boolean boolResult;
        int firstIntInput;
        int secondIntInput;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first integer to be compared:\n");
        firstIntInput = input.nextInt();
        
        System.out.println("Enter the second integer to be compared:\n");
        secondIntInput = input.nextInt();
        
        boolResult = firstIntInput == secondIntInput;
        
        System.out.printf("The equality of input values %d and %d is %b.%n%n", firstIntInput, secondIntInput, boolResult);
    }
}
