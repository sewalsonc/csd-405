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
public class Pract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String [] sArray = null;
        
        sArray = new String [7];
        
        sArray[0] = "One";
        sArray[1] = "Two";
        sArray[2] = "Three";
        sArray[3] = "Four";
        sArray[4] = "Five";
        sArray[5] = "Six";
        sArray[6] = "Seven";
        
        for(int i = 0; i < sArray.length; i++){
            
            System.out.println("sArray[" + i + "] = " + sArray[i]);
        }
        
        double [] prices = {20.23, 30.43, 40.31, 5.99};
        int [] itemNumbers = { 123, 234, 345, 456, 567};
        
        for(int i = 0; i < prices.length; ++i){
            
            System.out.println("The cost for item " + itemNumbers[i] + " is " + prices[i]);
        }
    }
}
