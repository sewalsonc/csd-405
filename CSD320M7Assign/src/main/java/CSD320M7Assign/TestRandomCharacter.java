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
public class TestRandomCharacter {
    /**
    * @param args the command line arguments
    */
    public static void main (String[] args) {
        final int NUMBER_OF_CHARS =175;
        final int CHARS_PER_LINE = 25;
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE ==0)
                    System.out.println(ch);
            }
        }
    }
