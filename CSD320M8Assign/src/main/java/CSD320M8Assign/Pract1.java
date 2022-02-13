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
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(Pract1.largest(2, 3.423));
        System.out.println(Pract1.largest(2.454, 3));
        System.out.println(Pract1.largest(2.34353, 3.423));
        
        System.out.println(Pract1.largest(4, 3));
    }
    
    public static double largest(int param1, int param2){
        
        return (param1 > param2 ? param1 : param2);
    }
    
    public static double largest (int param1, double param2){
        
        return (param1 > param2 ? param1 : param2);
    }
    
    public static double largest(double param1, double param2){
        
        return (param1 > param2 ? param1 : param2);
    }
}
