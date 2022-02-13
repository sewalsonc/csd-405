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
public class Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }
}
class DataClass1{
    int classScopeVar = 9;
    
    // not valid
    // methodScope1 = 8;
    // methodScop2 = 2;
    
    public void classMethod1(){
        int methodScope1 = 9;
        
        // valid
        classScopeVar = 3;
        methodScope1 = 5;
        
        // not valid
        // methodScope2 = 3;
        
    }
    public void classMethod2(){
        int methodScope2 = 9;
        
        // valid
        classScopeVar = 34;
        
        // not valid
        // methodScope1 = 99;
    }
}
