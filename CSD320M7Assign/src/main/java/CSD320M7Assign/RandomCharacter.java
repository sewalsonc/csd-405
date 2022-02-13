/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M7Assign;

/**
 *
 * @author wit0011153
 */
public class RandomCharacter {
    public static char getRandomCharacter (char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }



    
}