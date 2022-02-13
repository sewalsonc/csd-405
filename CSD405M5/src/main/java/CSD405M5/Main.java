/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M5;

/**
 *
 * @author wit0011153
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main example = new Main();
        
        try{
            example.aMethod();
        }
        catch(MyFourthExcept mfe){
            System.out.println("MyFourthException");
        }
        
    }
    public void aMethod() throws MyFourthExcept{
        throw new MyFourthExcept();
    }
}

class MyFourthExcept extends Exception{
    public MyFourthExcept(){
        super();
    }
    public MyFourthExcept(String s){
        super(s);
    }
}
