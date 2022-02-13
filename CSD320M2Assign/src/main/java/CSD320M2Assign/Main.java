/*
* Chris Sewalson/10-30-2021/CSD320M2Assign
* This routine will calculate the amount of energy required to heat water from 
*   one temperature to another
 */
package CSD320M2Assign;

import java.util.*;
/**
 *
 */
public class Main {
       public static void main(String[] args) {

        // Declaring variables
        
        double waterMass;
        double initialTemp;
        double finalTemp;
        double Q;
        double diff;
        
        Scanner input = new Scanner(System.in);
        
        /* Prompting for user inputs of mass of water, initial temperature 
        *   of the water and the final temperature of the water
        */
        
        System.out.println("Welcome!  This program will calculate the energy required, in joules, to heat water from\n one temperature to another. ");
        System.out.println("\n");
        System.out.println("Enter the total mass of the water in kilograms ");
        waterMass = input.nextDouble();
        System.out.println("Next, enter the intial temperature of the water in degrees Celsius ");
        initialTemp = input.nextDouble();
        System.out.println("Lastly, now enter the final temperature of the water ");
        finalTemp = input.nextDouble();
        
        // Calculates the difference of the initial and final temperatures
        
        diff = finalTemp - initialTemp;
        
       /* Calculates the energy required in joules and displays
       * a string indicating the amount of energy and the temperature difference
       */
        
        Q = waterMass * (finalTemp - initialTemp) * 4184;
        System.out.println("It will take " + Q + " joules to heat the water " + diff + " degrees.");
        System.out.println("");
        System.out.println("Thank you and have a nice day!");
    
    }
    
}
