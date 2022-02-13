/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD320M10Assign;


import java.util.*;

/**
 *
 * @author wit0011153
 */
public class Pract1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        List<Integer> list = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        
        Integer intObject;
        
        for(int i = 0; i < 100; ++i){
            intObject = (int)(Math.random() * 10+ 1);
            list.add(intObject);
            set.add(intObject);
        }
        
        System.out.println("List size = " + list.size());
        System.out.println("Set size = " + set.size());
        // TODO code application logic here
    }
}
