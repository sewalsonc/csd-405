/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M8;


import java.lang.Math;

public class ImgTest {
    public static void main(String[] args) {
        int cardNumber = (int)(Math.random() * 54 + 1);
        int cardNumberTwo = (int)(Math.random() * 54 + 1);
        int cardNumberThree = (int)(Math.random() * 54 + 1);
        int cardNumberFour = (int)(Math.random() * 54 + 1);
        System.out.println(cardNumber);
        System.out.println(cardNumberTwo);
        System.out.println(cardNumberThree);
        System.out.println(cardNumberFour);

    }
}