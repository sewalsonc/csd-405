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
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        final int ARRAY_SIZE = 5;
        
        int iArray[] = null;
        System.out.println();
        
        System.out.println("iArray = " + iArray);
        
        iArray = new int[ARRAY_SIZE];
        System.out.println();
        
        for (int i = 0; i < iArray.length; i++){
            System.out.println("iArray[" + i + "]= " + iArray[i]);
        }
        for(int i = 0; i < iArray.length; i++){
            iArray[i] = i;
        }
        System.out.println();
        
        for(int i = 0; i < iArray.length; i++){
            System.out.println("iArray[" + i + "] = " + iArray[i]);
        }
    }
}
