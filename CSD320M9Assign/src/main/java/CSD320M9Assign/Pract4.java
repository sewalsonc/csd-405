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
public class Pract4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] iArray = new int[20];
        
        for(int i = 0; i < iArray.length; i++){
            
            iArray[i] = i + 1;
        }
        
        for(int i = 0; i < iArray.length; i++){
            
            System.out.print("iArray[" + i + "] = " + iArray[i]);
        }
        
        System.out.println(new int[2]);
        
        System.out.println();
        
        iArray = new int[8];
        
        for(int i = 0; i < iArray.length; i++){
            
            System.out.print(iArray[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0; i < iArray.length; i++){
            
            iArray[i] =  i + 1;
        }
    }
}
