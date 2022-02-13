/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M5;

/**
 *
 * @author wit0011153
 */
import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class myFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        File dataFile = new File("data.txt");
        System.out.println("\nHello, welcome to my file code. ");
        System.out.println();
        dataFile.delete();

        
        try{
            if(dataFile.createNewFile()){
                FileWriter myWriter = new FileWriter("data.txt", true);
                myWriter.write("");
                for(int i = 0; i < 10; i++){
                    int rdmInt = (int)(Math.random()* 100 + 1);
                    myWriter.write(rdmInt + " ");
                }
                System.out.println("Created new file and wrote 10 random numbers to it. \n");
                myWriter.close();
            }
        }    
        catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
        try{
            Scanner readFile = new Scanner(dataFile);
            System.out.println("Reopening new file: data.txt.\nFile contents are: ");
            System.out.println("\n");
            while (readFile.hasNextLine()){
                String line = readFile.nextLine();
                System.out.println(line);
            }
            readFile.close();
        }
        catch(Exception e){
            System.out.println("Error: File does not exist");
        }        
    }
}
