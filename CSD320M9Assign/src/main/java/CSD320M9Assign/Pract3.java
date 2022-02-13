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

import javax.swing.*;

public class Pract3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String input = null;
        int itemToLookFor = 0;
        boolean found = false;
        
        int [] itemNumbers = {2, 4, 6, 8, 10};
        
        input = JOptionPane.showInputDialog(null, "Enter the item number you want the price for;");
        
        itemToLookFor = Integer.parseInt(input);
        
        for(int i = 0; i < itemNumbers.length; ++i){
            if(itemToLookFor == itemNumbers[i]){
                
                found = true;
            }
        }
        
        if(found){
            System.out.println("**** Your item has been found. ****");
        }
        else{
            
            System.out.println("--Your item has not been found.--");           
        }
    }
}
