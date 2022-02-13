/*
* Chris Sewalson/11-26-2021/CSD320M8AssignmentServiceCenterCharges
* This routine displays a greeting, prompts user for the enter key to display
*   the costs of services.  
* 
 */
package CSD320M8Assign;

/**
 *
 * @author Chris Sewalson
 */

import java.util.Scanner;


public class CSD320M8AssignAutoServiceCharge {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Greeting and invoking scanner
        System.out.println(" Welcome to American Auto Service!");
        System.out.println();
        String enterkey;
        Scanner input = new Scanner(System.in);
              
        // Enter key returns results - cost of standard service - calls method stServChar
        System.out.println("Press the enter key to return the results of the"+
                "standard service fee twice.");
        enterkey = input.nextLine();
        double a = stServChar();
        System.out.println("The service charge is $" + a + ".");
        
        a = stServChar();
        System.out.println("The service charge is still $" + a + ".");
        
        System.out.println();
        
        // Enter key returns results - cost of standard service and oil - calls method servWithOil
        System.out.println("Press the enter key to return the total cost of the"+
                "standard service fee and an added oil change fee twice.");
        
        enterkey = input.nextLine();
        double b = servWithOil(5.00);
        System.out.println("For automobiles:");
        System.out.println("The service charge with oil change is $" + b + ".");
        
        System.out.println();
        
        b = servWithOil(7.50);
        System.out.println("For trucks:");
        System.out.println("The service charge with oil change is $" + b + ".");
        
        System.out.println();
        
        // Enter key returns results - cost of service, oil and tires - calls method servWithOilandTire
        System.out.println("Press the enter key to return the total cost of the "+
                "standard service fee, an added oil change fee " +
                "and a tire rotation charge, twice.");
        
        enterkey = input.nextLine();
        double c = servWithOilandTire(5.00, 15);
        System.out.println("For automobiles:");
        System.out.println("The service charge with oil change and tires is $" + c + ".");
        
        System.out.println();
        
        c = servWithOilandTire(7.50, 20);
        System.out.println("For trucks:");
        System.out.println("The service charge with oil change and tires is $" + c + ".");

        System.out.println();
        
        // Enter key returns results - cost of service, oil and tires with a discount coupon - 
        //      calls method servWithOilandTireAndCoup
        System.out.println("Press the enter key to return the total cost of the "+
                "standard service fee, an added oil change fee " +
                "a tire rotation charge and a coupon, twice.");
        
        enterkey = input.nextLine();
        double d = servWithOilandTireAndCoup(5.00, 15, 2);
        System.out.println("For automobiles:");
        System.out.println("The service charge with oil change and tires, with a coupon, is $" + d + ".");
        
        System.out.println();
        
        d = servWithOilandTireAndCoup(7.50, 20, 3);
        System.out.println("For trucks:");
        System.out.println("The service charge with oil change and tires, with a coupon, is $" + d + ".");

        System.out.println();
        
        System.out.println("Thank you for browsing our prices!");
    }
    
    // standard service charge method
    public static double stServChar(){
        double serviceCharge = 50.00;
        return serviceCharge;
    }
    
    // service charge with oil change method
    public static double servWithOil(double wO){
        double serviceCharge = 50.00;
        double total = serviceCharge + wO;
        return total;
    }
    
    // service charge with oil and tires method
    public static double servWithOilandTire(double wO, int t){
        double serviceCharge = 50.00;
        double total = serviceCharge + wO + t;
        return total;
    }
    
    // service charge with oil change and tires minus coupon method
    public static double servWithOilandTireAndCoup(double wO, int t, int c){
        double serviceCharge = 50.00;
        double total = serviceCharge + wO + t - c;
        return total;
    }
}

