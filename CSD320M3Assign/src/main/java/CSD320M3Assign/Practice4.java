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

import java.util.*;
        
public class Practice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        
/*       System.out.println("The area for the circle of radius " + 
  *              radius + " is " + area);
*/
        
        if (radius <= 0){
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }
    }
}