/*
 * This code will create multiple fan instances, methods to display fan instances and single instance of 
 *      a fan both without using toSting().
 *
 */
package CSD405M2;

import java.util.ArrayList;


public class Fan {
    
    private static final int STOPPED = 0;
    private static final int SLOW = 1;
    private static final int Medium = 2;
    private static final int FAST = 3;
    
    private int speed;
    private boolean on;
    private int radius;
    private String color;
    
    // Setting default fan condition

    public Fan(){
        speed = STOPPED;
        on = false;
        radius = radius;
        color = "no color";
    }
    
    // Creating the fan constructor with variables
    
    public Fan(int speed, boolean on, int radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    // Getters and setters for Fan class
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public boolean isOn(){
        return on;
    }
    
    public void setOn(boolean on){
        this.on = on;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String toString() {
        
        // Create string of on / off fan status
        
        String isOn = "";
        if(this.on == true){
            isOn = "On";
        }
        else{
            isOn = "Off";
        }
        
        String status = "";
        status += ("The fan status is: ");
        status += ("\nFan is ON: " + isOn);
        status += ("\nFan Speed: " + this.speed);
        status += ("\nFan blade radius: " + this.radius + " inches");
        status += ("\nFan Color: " + this.color);
        return status;
    }    
    
    // Creating instances of the fan and printing default fan settings and current state of fan array
    public static void main(String args[]){
        Fan fan1 = new Fan(1, true, 3, "white");
        Fan fan2 = new Fan(1, false, 4, "black");
        Fan fan3 = new Fan(2, true, 5, "grey");
        Fan fan4 = new Fan(3, true, 6, "red");
        Fan fan5 = new Fan(4, false, 7, "green");
        
        System.out.println("\n\n");
        
        Fan fan = new Fan();
        System.out.println("The default fan settings are: \n");
        System.out.println(fan);
        
        
        ArrayList<Fan> fans = new ArrayList<Fan>();
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);
        fans.add(fan5);
        
        System.out.println("\nThe current status of the fans in the fans collection is:");
        useFans.displayFans(fans);
    }
}

class useFans {
        
    //method for displaying a collection of fans
    public static void displayFans(ArrayList<Fan> fans) {
        for(int i = 0; i < fans.size(); i++){
            String isOn = "";
            if(fans.get(i).isOn() == true){
                isOn = "On";
            }else{
                isOn = "Off";
            }

            System.out.println("\n\nFan Status: ");
            System.out.println("Fan On/Off: " + isOn);
            System.out.println("Fan Speed Setting: " + fans.get(i).getSpeed());
            System.out.println("Fan Radius Size: " + fans.get(i).getRadius() + " inches");
            System.out.println("Fan Color: " + fans.get(i).getColor());
        }
    }

    //method for displaying a single fan
    public static void displayFan(Fan fan) {
        String isOn = "";
        if(fan.isOn() == true){
            isOn = "On";
        }else{
            isOn = "Off";
        }

        System.out.println("\n\nFan Status: ");
        System.out.println("Fan On/Off: " + isOn);
        System.out.println("Fan Speed Setting: " + fan.getSpeed());
        System.out.println("Fan Radius Size: " + fan.getRadius() + "in.");
        System.out.println("Fan Color: " + fan.getColor());
    }

}

