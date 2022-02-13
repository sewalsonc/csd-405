/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M2;

/**
 *
 * @author wit0011153
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        for(int i = 0; i < 5; ++i){
            System.out.println(i);
        }
        
        System.out.println();
        
        // Syntax error
        // System.out.println(i);
        // i = 0;
        
        // new var titled i
        for(int i = 0; i < 5; ++i){
            System.out.println(i);
        }
        System.out.println();
        int i = 0;
        
        // -----------------------
        // option 2 
        for(i = 0; i <= 5; ++i){
            System.out.println(i);
        }
        
        System.out.println();
        
        System.out.println(i);
        i = 100;
        System.out.println(i);
        
        System.out.println();
        
        for(i = 0; i < 5; ++i){
            System.out.println(i);
        }
            
    }
}
