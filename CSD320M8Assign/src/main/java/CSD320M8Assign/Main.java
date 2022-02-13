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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main.printParam(52);
        Main.printParam(52.00);
        Main.printParam(98);
        Main.printParam(98.00F);
    }
    
    public static void printParam(int param_1){
        
        System.out.println("int value = " + param_1);
    }
    
    public static void printParam(double param_1){
        
        System.out.println("double value = " + param_1);
    }
    // why is this never invoked?
    
    public static void printParam(float param_1){
        
        System.out.println("float value = " + param_1);
    }
    
}
