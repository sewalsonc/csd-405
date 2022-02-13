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
public class pract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        char letter1 = 'C';
        char letter2 = 'a';
        char letter3 = 't';
        
        System.out.println("-------------------------------");
        System.out.println(letter1);
        System.out.println("isDigit " + Character.isDigit(letter1));
        System.out.println("isLetter " + Character.isLetter(letter1));
        System.out.println("isLowerCase " + Character.isLowerCase(letter1));
        System.out.println("isUpperCase " + Character.isUpperCase(letter1));
        System.out.println("toUpperCase " + Character.toUpperCase(letter1));
        System.out.println("toLowerCase " + Character.toLowerCase(letter1));
        
    }
}
