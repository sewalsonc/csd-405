/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M8Assign;

/**
 *
 * @author wit0011153
 */
public class Pract0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Pract0.printAverage(31, 62);
        Pract0.printAverage(21.0, 82.0);
        
        Pract0.printAverage(31.54, 62);
        Pract0.printAverage(21, 82.32);
    }
    
    public static void printAverage(int param1, int param2){
        
        System.out.println((param1 + param2) / 2);
    }
    
    public static void printAverage(double param1, double param2){
        
        System.out.println((param1 + param2) / 2.0);
    }
}
