/*
 * This code creates a subclass of Division called Domestic Division and contains objects and methods
 */
package CSD405M6;


// Creating subclass
public class DomesticDivision extends Division {
    
    // Declaring object inside subclass
    String state;
    
    // Constructor 
    DomesticDivision(String divName, int accntNum, String state){
        super(divName, accntNum);
        this.state = state;
    }
    
    // Output contents of division
    public void display(){
        System.out.println("--Domestic Division--");
        System.out.println("Division Name: " + divName);
        System.out.println("Account Number: " + accntNum);
        System.out.println("State: " + state);
    }
    
}
