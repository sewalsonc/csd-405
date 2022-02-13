/*
 * Create a class with my name that contains a method to recieve an array list of integers.
 *  If the user enters a 0 it will finish the array, if 00 is entered an empty array will be created.
 *  The output will display the array and the largest number in the array.
*/
package CSD405M4;

// java imports

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// My array class
public class ChrisArrayListTest {
    
    // my array getter
    public static ArrayList getArray(ArrayList userArray){
        return userArray;
    }
    
    // Output for an empty array and maximum number in array
    public static Integer max(ArrayList aList){
        if(aList.isEmpty()){
            System.out.println("There is nothing in the user array");
            return 0;
        }
        
        System.out.println("The biggest number in your array is: ");
        int max = (int)Collections.max(aList);
        return max;
    }
    
    // Main method
    public static void main(String args[]) {
        
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        
        // Creating a new instance of scanner
        Scanner scan = new Scanner(System.in);
        
        
        int input;
        
        // Run bit
        boolean start = true;
        
        // Greeting
        System.out.println("Welcome to personal array creator!");
        
        System.out.println();
        
        // Instructions for entering array integers
        System.out.println("Press enter after entering each number. Enter 00 to create an empty array. Press 0 to finish the array.");
        
        System.out.println();
        
        // Prompt to enter integers for array
        System.out.println("***Enter your array numbers here***  ");
        
        // While loop to populate array integers
        while(start){
            
            try{
                
                
                input = scan.nextInt();
                
                // If to zero out array                
                if(input == 00){
                    break;
                }
                
                // If to finish array
                if(input == 0){
                    intArray.add(input);
                    break;
                    
                // Adding numbers to the array    
                } else{
                    intArray.add(input);
                }
            }
            
            // Catch incorrect user inputs
            catch(Exception n){
                System.out.println("Enter only integers please.");
                scan.nextLine();
                start = true;
            }
        }
        
        // Calling getter
        System.out.println("Here is the array that you created: " + getArray(intArray));
        
        System.out.println();
        
        // Printing max array integer
        System.out.println(max(intArray));
    }
}
