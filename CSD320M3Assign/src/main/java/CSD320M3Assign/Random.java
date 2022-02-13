/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M3Assign;

/**
 *
 * @author wit0011153
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int localInt1 = (int)(Math.random() * 3 + 1);
        int localInt2 = (int)(Math.random() * 3 + 1);
        int localInt3 = (int)(Math.random() * 3 + 1);
        
        if(localInt1 == localInt2)
            
            System.out.println("The values are equal");
        else
            
            System.out.println("The values are not equal");
        
        if(localInt2 == localInt3)
            
            System.out.println("The values are equal");
        else
            
            System.out.println("The values are not equal");
        
        if(localInt3 == localInt1)
            
            System.out.println("The values are equal");
        else
            
            System.out.println("The values are not equal");
    }
}
