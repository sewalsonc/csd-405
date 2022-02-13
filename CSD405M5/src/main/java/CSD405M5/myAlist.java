/* This program will create an array list of 10 items, loop through
 *    and print them, then the program will ask the user for the number
 *    of the item they want to view again.  A try and catch block will 
 *    catch any invalid inputs and display 'Out Of Bounds'
 */
package CSD405M5;

import java.util.ArrayList;
import java.util.Scanner;


public class myAlist {


    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> myStrings = new ArrayList<String>();

        // My array list of 10 car parts
        myStrings.add("engine");
        myStrings.add("transmission");
        myStrings.add("rear end");
        myStrings.add("front seats");
        myStrings.add("brake system");
        myStrings.add("windows");
        myStrings.add("radiator");
        myStrings.add("suspension");
        myStrings.add("head lights");
        myStrings.add("tail lights");
        
        // Creating variable to hold list item number
        int itemNum = 0;
        
        System.out.println("Hello, welcome to my array list!");
        System.out.println();
        
        System.out.println("My array list contains common parts of an automobile.  They are: \n");
        
        // Loop to print each array item in a numbered list format
        for(String p : myStrings){
            System.out.println("Item " + itemNum + " is " + p);
            itemNum++;
        }
        
        // Try and Catch statements to catch invalid characters input by user
        System.out.println();
        try{
            System.out.println("Choose the number of the item you want to view again.");
            System.out.print("Type here:  ");
            
            System.out.println();
                    
            Integer userItem = input.nextInt();
            System.out.println("Item number " + userItem + " is " + myStrings.get(userItem));
        }
        
        // Catch statement
        catch(Exception e){
            System.out.println();
            System.out.println("\'OUT OF BOUNDS\'");
        }
    }
}
