/*
 * This code creates a subclass of Division called International Division and contains objects and methods
 */
package CSD405M6;

// Creating subclass
public class InternationalDivision extends Division {
    
    // Declaring two objects within subclass
    String country;
    String language;
    
    // Contructor 
    public InternationalDivision(String divName, int accntNum, String country, String language){
        
        super(divName, accntNum);
        this.country = country;
        this.language = language;
    }
    
    // Output Division and contents
    public void display(){
        System.out.println("--Internation Division--");
        System.out.println("Division Name: " + divName);
        System.out.println("Account Number: " + accntNum);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }

}
