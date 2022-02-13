/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wit0011153
 */
public class Pract0 {
    
    private String carName;
    private int driveType;
    private boolean license;
    private String color;
    
    public Pract0(){
        carName = "none";
        driveType = 0;
        license = false;
        color = "none";        
    }
    
    public Pract0(String carName, int driveType, boolean license, String color){
        this.carName = carName;
        this.driveType = driveType;
        this.license = license;
        this.color = color;
    }
    
    public String getName(){
        return carName;
    }
    
    public void setName(String carName){
        this.carName = carName;
    }
    
    public int getdriveType(){
        return driveType;
    }
    
    public void setdriveType(int driveType){
        this.driveType = driveType;
    }
    
    public boolean haveLicense(){
        return license;
    }
    
    public void setHaveLicense(boolean license){
        this.license = license;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Pract0 myCar = new Pract0();
        
        myCar.setName("Chevelle");
        myCar.setdriveType(2);
        myCar.setHaveLicense(true);
        myCar.setColor("Black");
        
        System.out.println("My favorite car is a " + myCar.getName());
        System.out.println("with " + myCar.getdriveType());
        System.out.println("My favorite color is " + myCar.getColor());
    }
    
}
