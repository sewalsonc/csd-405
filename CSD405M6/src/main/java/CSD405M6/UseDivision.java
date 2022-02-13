/*
 * This code will create to instances of both the International Division code and the Domestic Division code
 */
package CSD405M6;



class UseDivision {
    
    public static void main(String[] args){
        // Creating instances of each
        InternationalDivision IntDiv1 = new InternationalDivision("Europe", 48842,"Germany", "German/English");
        InternationalDivision IntDiv2 = new InternationalDivision("Europe", 48782,"France", "French/English");
        
        DomesticDivision DomDiv1 = new DomesticDivision("Region 4", 22940, "Georgia");
        DomesticDivision DomDiv2 = new DomesticDivision("Region 3", 21918, "South Carolina");
        
        // Document header
        System.out.println();
        System.out.println("------------------Staker Prestige - Prestige Plastics----------------------\n");
        
        System.out.println("----------------------------Top Divisions----------------------------------");
        System.out.println();
        
        // Calling the abstract classes
        IntDiv1.display();
        
        System.out.println("\n");
        
        IntDiv2.display();
        
        System.out.println("\n");
        
        DomDiv1.display();
        
        System.out.println("\n");
        
        DomDiv2.display();
        
    }

}
