/*
* Chris Sewalson/12-11-2021/CSD320M10Assignment_overloading methods  
* 
 */
package CSD320M10Assign;

import java.util.Scanner;


/**
 *
 * @author wit0011153
 */
public class CSD320M10Assignment {

    public static void main(String args[]) {
        String enterKey;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Press the enter key to display 4 arrays and the average of each.");
        enterKey = input.nextLine();
        
        short[] sArray = new short[3];
        int[] iArray = new int[4];
        long[] lArray = new long[5];
        double[] dArray = new double[6];
        
 
        for(int i = 0; i < sArray.length; i++){
            sArray[i] = (short)(Math.random() * 100 + 1);
        }
        
        for(int i = 0; i < iArray.length; i++){
            iArray[i] = (int)(Math.random() * 100 + 1);
        }
        
        for(int i = 0; i < dArray.length; i++){
            dArray[i] = (double)(Math.random() * 100 + 1);
        }
        
        for(int i = 0; i < lArray.length; i++){
            lArray[i] = (long) (Math.random() * 100 + 1);
        }
        CSD320M10Assignment.shortAverage(sArray);
        System.out.println();
        
        CSD320M10Assignment.intAverage(iArray);
        System.out.println();
        
        CSD320M10Assignment.longAverage(lArray);
        System.out.println();
        
        CSD320M10Assignment.doubleAverage(dArray);        
    }
    public static void shortAverage(short [] arrayParam){
        System.out.println("The array of short numbers is ");
        short sum = 0;
        for(int i = 0; i < arrayParam.length; ++i){
            System.out.println(arrayParam[i]);
            sum += arrayParam[i];
        }
        System.out.println("The average of the array of short numbers is " + sum/arrayParam.length);
    }
    public static void intAverage(int [] arrayParam){
        System.out.println("The array of integers is ");
        int sum = 0;
        for(int i = 0; i < arrayParam.length; ++i){
            System.out.println(arrayParam[i]);
            sum += arrayParam[i];
        }
        System.out.println("The average of the array of integers is " + sum/arrayParam.length);
    }
    public static void longAverage(long [] arrayParam){
        System.out.println("The array of long numbers is ");
        long sum = 0;
        for(int i = 0; i < arrayParam.length; ++i){
            System.out.println(arrayParam[i]);
            sum += arrayParam[i];
        }
        System.out.println("The average of the array of long numbers is " + sum/arrayParam.length);
    }
    public static void doubleAverage(double [] arrayParam){
        System.out.println("The array of double numbers is ");
        double sum = 0;
        for(int i = 0; i < arrayParam.length; ++i){
            System.out.println(arrayParam[i]);
            sum += arrayParam[i];
        }
        System.out.println("The average of the array of double numbers is " + sum/arrayParam.length);
    }
}
