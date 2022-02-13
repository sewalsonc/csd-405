/*
* Chris Sewalson/11-26-2021/CSD320M7AssignmentPasswordTest
* This routine displays a greeting, describes
*    the password expectations then prompts user for password.  
* 
 */
package CSD320M7Assign;

import java.util.Scanner;

/**
 *
 * @author Chris Sewalson
 */
public class inputStringTest {

 
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(" Welcome, create a password below!");
        System.out.println();
        System.out.println("Your password must:\n" +
                "1. Be at least 8 characters long.\n" + 
                "2. Contain both letters and numbers.\n" +
                "3. Contain at least one upper case character.\n" +
                "4. Contain at least one lower case character.");
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        // Prompt for user input
        
        System.out.print("Enter your password here: ");
        
        String in = input.nextLine();
        
        //boolean = true - password is valid, false - password is not valid
        if (is_valid_password(in)){
            System.out.println();
            System.out.println("The password " + in + " is valid.");
        }
        else {
            System.out.println();
            System.out.println("The password " + in + " is not valid.");
        }
    }
    
    //test method for password input - calls three other methods to test input
    
    public static boolean is_valid_password(String password) {
        if (password.length() < 8)return false;
        
        int charCount = 0;
        int numCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i =0; i < 8; i++){
            
            char ch = password.charAt(i);
            
            if (is_Numeric(ch)) numCount++;
            else if (is_UpperCase(ch)) upperCount++;
            else if (is_LowerCase(ch)) lowerCount++;
            else return false;            
        }
        
        return true;
    }
    
    //does the password have numbers
    public static boolean is_Numeric(char ch){
        return (ch >= '0' && ch <= '9');
    }
    //does the password contain upper case letters
    public static boolean is_UpperCase(char ch){
        return (ch >= 'A' && ch <= 'Z');
    }
    //does the password contain lower case letters
    public static boolean is_LowerCase(char ch){
        return (ch >= 'a' && ch <= 'z');
    }
}
