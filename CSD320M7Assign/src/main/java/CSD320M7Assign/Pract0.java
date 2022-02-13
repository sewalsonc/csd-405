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
public class Pract0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Sum from 1 to 10 is " + sum);
        
        sum = 0;
        for (int i = 20; i <= 37; i++)
            sum += i;
        System.out.println("Sum from 20 to 37 is " + sum);
        
        int i = 1;
        int j = 2;
        int k = max (i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    public static int max(int num1, int num2) {
        int result;
        
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        
        return result;
    }
}
