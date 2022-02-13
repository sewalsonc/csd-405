/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M6;

/**
 *
 * @author wit0011153
 */
public class Main {
    
    private String dname;
    
    public Main(String dname){
        this.dname = dname;
    }
    
    public String getName(){
        return dname;
    }
    
    public Object clone()throws CloneNotSupportedException{
        return (Main)super.clone();
    }
    
    public static void main(String[] args) {
        Main obj1 = new Main ("Tommy");
        try{
            Main obj2 = (Main) obj1.clone();
            System.out.println(obj2.getName());
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
}
