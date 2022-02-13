/*
* Chris Sewalson/11-5-2021/CSD320M3AssignmentRockPaperScissors
* This routine will demonstrate the random number method
* It uses the scanner utility for user input
* 
 */
package CSD320M3Assign;

/**
 *
 * author - Chris Sewalson
 */
import java.util.Scanner;


public class CSD320M3AssignRockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Random number generator and String declaration for conversion
        int compNumber = (int)(Math.random() *3 + 1);
        String compString = "";
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Rock Paper Scissors.");
        
//        // Prompt for user input        
//        System.out.println("Please type R for rock, P for paper or S for scissors.");
//        String user = input.nextLine();
//        
//        // If statements to convert random number to string        
//        if(compNumber == 1){
//            compString = "Rock";
//        }
//        else if (compNumber == 2){
//            compString = "Paper";
//        }
//        else if (compNumber == 3){
//            compString = "Scissors";
//        }
//        
//        // User input confirmation and conversion        
//        if(user.equals("R") || user.equals("r")){
//            System.out.println("You choose: Rock");
//            user = "Rock";
//        }
//        else if (user.equals("P") || user.equals("p")){
//            System.out.println("You choose: Paper");
//            user = "Paper";
//        }
//        else if (user.equals("S") || user.equals("s")){
//            System.out.println("You choose: Scissors");
//            user = "Scissors";
//        }
//        
//        // Response for inputs not addressed by if statements above
//        else {
//            System.out.println("invalid entry");
//        }
//        System.out.println("The computer chooses: " + compString);
//        
//        // Comparison and scoring
//        if (user.equals(compString)){
//            System.out.println("A tie!");
//        }
//        else if (user.equals("Rock")){
//            if (compString.equals("Scissors"))
//                System.out.println("Rock beats scissors - you win!");
//            else if (compString.equals("Paper"))
//                System.out.println("Paper beats rock - you lose!");
//        }
//        else if (user.equals("Paper")){
//            if (compString.equals("Rock"))
//                System.out.println("Paper beats rock - you win!");
//            else if (compString.equals("Scissors"))
//                System.out.println("Scissors beat paper - you lose!");
//        }
//        else if (user.equals("Scissors")){
//            if (compString.equals("Paper"))
//                System.out.println("Scissors beat paper - you win!");
//            else if (compString.equals("Rock"))
//                System.out.println("Rock beats scissors - yuo lose!");
//        }
        // Prompt for user input        
        System.out.println("Please type 1 for rock, 2 for paper or 3 for scissors.");
        String user = input.nextLine();
        
        // If statements to convert random number to string        
        if(compNumber == 1){
            compString = "Rock";
        }
        else if (compNumber == 2){
            compString = "Paper";
        }
        else if (compNumber == 3){
            compString = "Scissors";
        }
        
        // User input confirmation and conversion        
        if(user.equals("1")){
            System.out.println("You choose: Rock");
            user = "Rock";
        }
        else if (user.equals("2")){
            System.out.println("You choose: Paper");
            user = "Paper";
        }
        else if (user.equals("3")){
            System.out.println("You choose: Scissors");
            user = "Scissors";
        }
        
        // Response for inputs not addressed by if statements above
        else {
            System.out.println("invalid entry");
        }
        System.out.println("The computer chooses: " + compString);
        
        // Comparison and scoring
        if (user.equals(compString)){
            System.out.println("A tie!");
        }
        else if (user.equals("Rock")){
            if (compString.equals("Scissors"))
                System.out.println("Rock beats scissors - you win!");
            else if (compString.equals("Paper"))
                System.out.println("Paper beats rock - you lose!");
        }
        else if (user.equals("Paper")){
            if (compString.equals("Rock"))
                System.out.println("Paper beats rock - you win!");
            else if (compString.equals("Scissors"))
                System.out.println("Scissors beat paper - you lose!");
        }
        else if (user.equals("Scissors")){
            if (compString.equals("Paper"))
                System.out.println("Scissors beat paper - you win!");
            else if (compString.equals("Rock"))
                System.out.println("Rock beats scissors - yuo lose!");
        }
    }
}
