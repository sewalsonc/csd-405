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
public class Example3{
    public static void main (String []args){
        
        String s1 = new String("String 1");
        System.out.println(s1);
        
        // is a string an immutable object
        // yes
        // so does this change the string - NO
        // it creates a new string
        s1 = "String 2";
        System.out.println(s1);
    }

}
