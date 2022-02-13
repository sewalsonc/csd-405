/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M9Assign;

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
        final int ARRAY_SIZE = 6;
        int arraySize = 7;
        
        int [] array1 = new int[5];
        int [] array2 = new int[ARRAY_SIZE];
        int [] array3 = new int[arraySize];
        int [] array4 = new int[ARRAY_SIZE + arraySize];
        
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);
        System.out.println(array4.length);
    }
}
