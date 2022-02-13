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
public class Try {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Try example = new Try();
        
        example.printNumbers();
    }
    public void printNumbers(){
        System.out.println(1);
        
        //try{
            System.out.println(2);
            
            if(true){
            //    throw new MyExcept();
            }
            
            System.out.println(3);
        }
        //catch(MyExcept mte){
          //  System.out.println(4);
        }
        
        //finally{
          //  System.out.println(5);
        //}
        
    //}
//}