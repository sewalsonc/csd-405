/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M4Assign;

/**
 *
 * @author wit0011153
 */
public class pract1 {
    static void myMethod(){
        System.out.println("I just want to learn this stuff.");
    }

    public static void main(String args[]) {
        myMethod();
        int i = 0;
        do {
            System.out.println(i);
            i++;            
        }
        while (i < 5);
        // TODO code application logic here
        int i1 = 5;
        int i2 = 3;
        
        double d1 = Math.pow(i1, 2);
        double d2 = Math.pow(i2, 2);
        
        System.out.println(Math.pow(i1, 2));
        System.out.println(Math.pow(i2, 2));
        
    }
}
