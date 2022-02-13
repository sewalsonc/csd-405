/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M2;


public class Example2{
    
    
    public static void main(String[] args) {
        Example2 e2 = new Example2();
        
        DataClass_1 data_1 = new DataClass_1();
        DataClass_1 data_2 = new DataClass_1();
        
        e2.printDataClass(data_1);
        e2.printDataClass(data_2);
    }

    public void printDataClass(DataClass_1 data){
        System.out.println("Data Class Output");
        System.out.println("Value_1 = " + data.value_1);
        System.out.println("Value_2 = " + data.value_2);
        System.out.println("DataClass Output");
    }
    
}

class DataClass_1{
    
    int value_1;
    int value_2;
    
    DataClass_1(){}
    
    DataClass_1(int param_1, int param_2){
        
        value_1 = param_1;
        value_2 = param_2;
    }
}