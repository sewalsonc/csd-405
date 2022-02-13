/*
 * This code creates a superclass called Division and contains objects and a method
 */
package CSD405M6;

// Creating superclass
public abstract class Division {
    
    // Declaring objects
    String divName;
    int accntNum;
    
    // Creating abstract display method
    abstract void display();
    
    // Constructor
    public Division(String divName, int accntNum){
        this.divName = divName;
        this.accntNum = accntNum;
    }
}
