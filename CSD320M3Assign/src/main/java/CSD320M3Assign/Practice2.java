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
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int var1 = 99;
        int var2 = 99;
        int var3 = 100;
        
        boolean result1 = var1 == var2;
        boolean result2 = var2 == var2;
        
        System.out.println();
        
        if(result1){
            System.out.println("equal \"1\"");
        }
        System.out.println();
        if(var1 == var3)
            System.out.println("equal");
        if(var1 != var3)
        System.out.println("not equal");        
        }
    }
