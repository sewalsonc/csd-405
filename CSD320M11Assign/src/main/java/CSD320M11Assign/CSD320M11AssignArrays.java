/*
 * Chris Sewalson/12-18-2021/CSD320M11Assignment_overloading methods with multi-dimension arrays  
 */
package CSD320M11Assign;

import java.util.*;


public class CSD320M11AssignArrays {

    // method for locating position of largest integers in the array
    public static int [] locateLargest (int [][] arrayParam) {
        //starting the array with minimum values.
        int[] largestIntLoc = new int[] { 0, 0};
        int largestInt = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestInt) {
                    largestInt = arrayParam[i][j];
                    //Stores the values one at a time to build the array thats passed back out. 
                    largestIntLoc[0] = i;
                    largestIntLoc[1] = j;
                }
            }
        }
        return largestIntLoc;
    }
    
    // method for locating position of largest doubles in the array
    public static double [] locateLargest (double [][] arrayParam) {
        double [] largestDoubLoc = new double [] { 0, 0};
        double largestDouble = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestDouble) {
                    largestDouble = arrayParam[i][j];
                    //Stores the values one at a time to build the array thats passed back out. 
                    largestDoubLoc[0] = i;
                    largestDoubLoc[1] = j;
                }
            }
        }
        return largestDoubLoc;
    }
    
    // method for locating position of smallest integers in the array
    public static int [] locateSmallest (int [][] arrayParam) {
        int[] smallestIntLoc = new int[] { 2147483647, 2147483647};
        int smallestInt = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestInt) {
                    smallestInt = arrayParam[i][j];
                    smallestIntLoc[0] = i;
                    smallestIntLoc[1] = j;
                }
            }
        }
        return smallestIntLoc;
    }
    
    
    // method for locating position of smallest doubles in the array
    public static double [] locateSmallest (double [][] arrayParam) {
        //the max value for doubles is really huge, so i had to find the right way to represent it.
        double[] smallestDoubLoc = new double[] { Double.MAX_VALUE, Double.MAX_VALUE};
        double smallestDouble = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestDouble) {
                    smallestDouble = arrayParam[i][j];
                    smallestDoubLoc[0] = i;
                    smallestDoubLoc[1] = j;
                }
            }
        }
        return smallestDoubLoc;
    }
    public static void main(String[] args) {
        String enterKey;
        
        Scanner input = new Scanner(System.in);
        
        // User greeting and explanation of program results
        System.out.println("****************Hello, and Welcome!!****************\n\nPress enter to display the following\n\t1. A randomly generated 2 dimension integer array of 4 rows and 4 columns."
        + " \n\t2. The largest and smallest numbers in the integer array.\n\t3. A randomly generated 2 dimension double array of 6 rows and 6 columns."
        + " \n\t4. The largest and smallest numbers in the double array.");
        
        // User enterkey input to continue
        enterKey = input.nextLine();
        
        // Declaring and initializing size of int and double arrays
        int[][] iArray = new int[4][4];
        double[][] dArray = new double[6][6];
        
        // Filling up integer array with random numbers
        for(int i = 0; i < iArray.length; i++){
            for (int j = 0; j < iArray.length; j++){
                iArray[i][j] = (int)(Math.random() * 100);
            }
        }
        
        // Calling int methods
        int[] largestInt = locateLargest(iArray);
        int[] smallestInt = locateSmallest(iArray);
        
        // Filling up double array with random numbers
        for(int i = 0; i < dArray.length; i++){
            for (int j = 0; j < dArray.length; j++){
                dArray[i][j] = (double)(Math.random() * 100);
            }            
        }
        
        // Calling double methods
        double [] largestDouble = locateLargest(dArray);
        double [] smallestDouble = locateSmallest(dArray); 
        
        // Print out integer array
        System.out.println("------2 Dimension Integer Array------");
        System.out.println();
        for(int i = 0; i < iArray.length; i++)
            for (int j = 0; j < iArray.length; j++)
                System.out.println("[" + i + "][" + j + "] = " + iArray[i][j] + " ");
        
        System.out.println();

        System.out.println("The location of the largest element in the integer array is (" + largestInt[0] + ", " + largestInt[1] + ").");
        System.out.println("The location of the smallest element in the integer array is (" + smallestInt[0] + ", " + smallestInt[1] + ").");
        
        System.out.println();
        
        // Print out double array 
        System.out.println("------2 Dimension Double Array------");
        System.out.println();
        
        for(int i = 0; i < dArray.length; i++)
            for (int j = 0; j < dArray.length; j++)
                System.out.println("[" + i + "][" + j + "] = " + dArray[i][j] + " ");
        
        System.out.println();
        
        System.out.println("The location of the largest element in the double array is (" + largestDouble[0] + ", " + largestDouble[1] + ").");
        System.out.println("The location of the smallest element in the double array is (" + smallestDouble[0] + ", " + smallestDouble[1] + ").");


    }
    
}
