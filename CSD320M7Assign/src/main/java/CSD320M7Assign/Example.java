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
public class Example {
     
    /*
     *  The original value of a will remain unchanged in
     *  case of call-by-value
     */
     
    int a = 10;
    void call(int a) {
         
        // this local variable a is subject to change in its value
        a = a+10;
    }
     
    public static void main(String[] args) {
 
        Example eg = new Example();
        System.out.println("Before call-by-value: " + eg.a);
         
        /*
         * Passing an integer 50510 to the call() method. The value of 
         * 'a' will still be unchanged since the passing parameter is a 
         * primitive type. 
         */
        eg.call(50510);
        System.out.println("After call-by-value: " + eg.a);
         
         
    }

    void call(Example eg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

