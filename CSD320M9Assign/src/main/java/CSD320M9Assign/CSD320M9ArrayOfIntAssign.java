/*
* Chris Sewalson/12-3-2021 This code will create an array of 20 integers
*   then iterate through them and output calculate the sum, biggest number
*       smallest number and the average of all integers in the array
*   
 */
package CSD320M9Assign;

import java.util.Scanner;

/**
 *
 * @author Chris Sewalson
 */
public class CSD320M9ArrayOfIntAssign {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String enterkey;
        Scanner input = new Scanner(System.in);
              
        // Enter key returns results of array calculations
        System.out.println("Press the enter key to display the array as well as the \n 1. sum\n 2. largest number\n 3. smallest number\n 4. average of all numbers.");
        enterkey = input.nextLine();
        
        // Create the array with 20 elements
        int[] iArray = new int[20];
        
        // declare and initialize variables
        int sum = 0;
        int max = 0;
        int min = 100;
        
        // Fill up the array with random numbers        
        
        for(int i = 0; i < iArray.length; i++){
            
            iArray[i] = (int)(Math.random() * 100 + 1);
            System.out.println("iArray = " + iArray[i]);

        
            // Adding the value of each array element to variable sum
            sum += iArray[i];
            
            // updating value of variable max
            if (iArray[i] > max) max = iArray[i];
            
            // updating value of variable min
            if (iArray[i] < min) min = iArray[i];
            }
        // initializing variable average
        int average = sum / iArray.length;
        
        System.out.println();
        System.out.println("The sum of the array elements is " + sum);
        System.out.println("The biggest number in the array is " + max);
        System.out.println("The smallest number in the array is " + min);
        System.out.println("The average of the numbers is " + average);
            
    }

}
