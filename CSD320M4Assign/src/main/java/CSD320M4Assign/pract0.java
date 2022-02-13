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
public class pract0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String me = "how 'will' I ever learn this";
        System.out.println("Who knows " + me);
        System.out.println("The length of the me string is " + me.length());
        System.out.println(me.toUpperCase());
        System.out.println(me.toLowerCase());
        System.out.println(me.indexOf("will"));
        String firstName = "Jim";
        String lastName = "Wonka";
        System.out.println(firstName + " " + lastName);
        System.out.println();
        System.out.println(firstName.concat(" " + lastName));
        String ss = "I\'ve been around";
        System.out.println(ss);
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-4));
        System.out.println(Math.random() * 6 + .5);
        System.out.println((int)(Math.random() * 10 + 1));
        
        
    }
    
}
