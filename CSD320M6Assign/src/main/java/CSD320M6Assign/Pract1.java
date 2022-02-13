/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M6Assign;

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
        int row;
        int column;
        int space;
        
        for(row = 1; row <= 7; ++row){
            for(space = 7; space > row; --space){
                System.out.print(" ");
            }
            for(space = 7; space > row; --space){
                System.out.print(" ");
            }
            for(column = 1; column <= row; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}


