/*
 * This code creates an int with my first name and a constructor to set value
 *      then creates getter and setter. Creates non-static and static methods to access int variable.
 *      Contains int and Integer equals methods.
 */
package CSD405M3;

// Create int class ChrisInteger
public class ChrisInteger {
    
    private int chris;
    
    // Constructor to set value
    public ChrisInteger(int value){
        chris = value;
    }
    
    // Getter
    public int getChris(){
        return chris;
    }
    
    // Default isEven, isOdd and isPrime methods
    public boolean isEven(){
        if(chris % 2 ==0){
            return true;
        }
        return false;
    }
    
    public boolean isOdd(){
        if(chris % 2 != 0){
            return true;
        }
        return false;
    }
    
    public boolean isPrime(){
        for(int i = 2; i <= this.chris / 2; i++){
            if(this.chris % i == 0) {
                return false;
            }
        }
        return true;
    } 
    
    // Static int isEven, isOdd and isPrime methods
    public static boolean isEven(int nameValue){
        if(nameValue % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static boolean isOdd(int nameValue){
        if(nameValue % 2 != 0){
            return true;
        }
        return false;
    }
    
    public static boolean isPrime(int nameValue){
        for(int i = 2; i <= nameValue / 2; i++){
            if(nameValue % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Static Integer isEven, isOdd and isPrime methods
    public static boolean isEven(Integer nameValue){
        if(nameValue % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static boolean isOdd(Integer nameValue){
        if(nameValue % 2 != 0){
            return true;
        }
        return false;
    }
    
    public static boolean isPrime(Integer nameValue){
        for(int i = 2; i <= nameValue / 2; i++){
            if(nameValue % i == 0){
                return false;
            }
        }
        return true;
    }
    
    // Integer and int equals methods
    public boolean equals(int nameValue){
        return(nameValue == this.chris);
    }
    public boolean equals(Integer nameValue){
        return(nameValue == this.chris);
    }

    
    
    public static void main(String args[]) {
        
        // Creating instances of ChrisInteger class
        Integer x = 23;
        ChrisInteger inst_1 = new ChrisInteger(50);
        ChrisInteger inst_2 = new ChrisInteger(50);
        ChrisInteger inst_3 = new ChrisInteger(x);
        
        // Greeting        
        System.out.println("---------------Welcome---------------");
        System.out.println();
        
        // Testing methods
        System.out.println("The value of the first instance of \'ChrisInteger\' is: " + inst_1.getChris());
        System.out.println("Even number?: " + inst_1.isEven());
        System.out.println("Odd number?: " + inst_1.isOdd());
        System.out.println("Prime number?: " + inst_1.isPrime());
        
        System.out.println();
        
        System.out.println("Testing the second instance of \'ChrisInteger\' is: " + inst_2.getChris());
        System.out.println("Even number?: " + inst_2.isEven());
        System.out.println("Odd number?: " + inst_2.isOdd());
        System.out.println("Prime number?: " + inst_2.isPrime());
        
        System.out.println();

        System.out.println("Testing the third instance of \'ChrisInteger\' is: " + inst_3.getChris());
        System.out.println("Even number?: " + inst_3.isEven());
        System.out.println("Odd number?: " + inst_3.isOdd());
        System.out.println("Prime number?: " + inst_3.isPrime());
        
        System.out.println();
        
        System.out.println("Testing the static method of \'ChrisInteger\', with value of 14");
        System.out.println("Even number?: " + ChrisInteger.isEven(14));
        System.out.println("Odd number?: " + ChrisInteger.isOdd(14));
        System.out.println("Prime number?: " + ChrisInteger.isPrime(14));

        System.out.println();
        
        // Testing Integer method with object x or inst_3 instance
        System.out.println("Testing the static Integer method of \'ChrisInteger\' using x (23).");
        
        System.out.println("Even number?: " + ChrisInteger.isEven(x));
        System.out.println("Odd number?: " + ChrisInteger.isOdd(x));
        System.out.println("Prime number?: " + ChrisInteger.isPrime(x));
        
        System.out.println();
        
        // Testing int and Integer equals methods
        System.out.println("Testing of int and Integer equals methods\n");

        System.out.println("\tThe value of inst_1 is 50");        
        System.out.println("Testing the \'int\' equals method using \'inst_1\' compared to 4");
        System.out.print("Does inst_1 equal 4? --> ");
        System.out.println(inst_1.equals(4));
        System.out.println();
        System.out.println("Testing the \'int\' equals method using \'inst_1\' compared to 50");
        System.out.print("Does inst_1 equal 50? --> ");
        System.out.println(inst_1.equals(50));
        
        System.out.println("\n");
        
        System.out.println("\tThe Integer value of inst_3 is 23");
        System.out.println("Testing the \'Integer\' equals method using \'inst_3\'compared to 27");
        System.out.print("Does inst-3 equal 27? --> ");
        System.out.println(inst_1.equals(27));
        System.out.println();
        System.out.println("Testing the \'Integer\' equals method using \'inst_3\' with a value of 23");
        System.out.print("Does inst_3 equal 23? --> ");
        System.out.println(inst_1.equals(50));
        
        System.out.println();
                
    }
}
