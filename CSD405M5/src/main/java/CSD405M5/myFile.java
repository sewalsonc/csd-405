/*
 * This program creates a new file if it doesn't exist.  They the code
 *    will write 10 random numbers to the file and append 10 numbers
 *    to a previous file.  Numbers are seperated by spaces.  
 * Code will open the file and display the contents.
 */
package CSD405M5;

import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class myFile {
    
    public static void main(String args[]) {
        
        // Create the new file --> data.txt
        File dataFile = new File("data.txt");
        System.out.println("\nHello, welcome to my file code. ");
        System.out.println();
        
        // Uncomment the delete statement to delete any existing file.  
        //      The code will demonstrate output of creating a new file each time code a ran.
        dataFile.delete();

        
        try{
            // Check if file exists and if not create a file and write 10 random numbers to it.
            if(dataFile.createNewFile()){
                FileWriter myWriter = new FileWriter("data.txt");
                for(int i = 0; i < 10; i++){
                    int rdmNum = (int)(Math.random()* 100 + 1);
                    myWriter.write(rdmNum + " ");
                    
                }
                
                // Output statement that shows that no file existed and that one has been created with random numbers in it             
                System.out.println("We created a new file named data.txt and wrote 10 random numbers to it. \n");
                myWriter.close();
            }
            else{
                
                // If file preexisted, this section of code deletes it then creates a new one and writes numbers to it
                if(dataFile.delete()){
                    System.out.println("File already existed.  It has been deleted! \n");
                }
                
                dataFile.createNewFile();
                FileWriter myWriter = new FileWriter("data.txt", true);
                myWriter.write("");
                for(int i = 0; i < 10; i++){
                    int rdmInt = (int)(Math.random()* 100 + 1);
                    myWriter.write(rdmInt + " ");
                }
                
                // Output statement that indicates that a new file has been created and 10 random numbers have been written to it.
                System.out.println("Created new file and wrote 10 random numbers to it. \n");
                myWriter.close();
            }
        }
        
        // Catches exceptions thrown in Try statement above
        catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
        
        // Try statement to read contents of new file and print them.
        try{
            Scanner readFile = new Scanner(dataFile);
            System.out.println("Reopening new file: data.txt.\nFile contents are: \n");
            System.out.print("--> ");
            
            while (readFile.hasNextLine()){
                String line = readFile.nextLine();
                System.out.print(line);
            }
            
            System.out.print("<--");
            readFile.close();
        }
        catch(Exception e){
            System.out.println("Error: File does not exist");
        }

    }
}
