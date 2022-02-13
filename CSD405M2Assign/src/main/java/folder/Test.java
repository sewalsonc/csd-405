/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author wit0011153
 */
class Test {

    public static void main(String args[]) {
        A a = new A();
        a.print();
    }
}
        
class A {
    String s;
    
    A(String newS){
        s = newS;
    }
    
    public void print(){
        System.out.print(s);
    }
}
