/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405Assign;

import java.util.Scanner;

/**
 *
 * @author wit0011153
 */

// Creating a Fan class
public class Fan {
    
    // Create fan speed variables
    private final int STOPPED = 0;
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    static int fanNum = 0;
    
    // Create fan attributes
    private int fanSpeed;
    private boolean fanStatus;
    private double fanRad;
    String fanColor;
    String fanStatusStr;
    String fanSpeedStr;
    
    // constructor for default fan
    public Fan(){
        fanSpeed = STOPPED;
        fanStatus = false;
        fanRad = 10;
        fanColor = "White";
        setFanStatus();
        setFanSpeedStr();
        fanNum++;
    }
    
    // constructor for fan with arguments
    public Fan(int speed, double radius, String Color){
        fanSpeed = speed;
        fanRad = radius;
        fanColor = Color;
        setFanStatus();
        setFanSpeedStr();        
        fanNum++;
    }
    
    // Setters to set fan speed, fan color, fan radius, fan status and fan speed string
    public void setFanSpeed(int fanSpeed){
        this.fanSpeed = fanSpeed;
    }
    
    public void setFanColor(String fanColor){
        this.fanColor = fanColor;
    }
    
    public void setFanRadius(double fanRad){
        this.fanRad = fanRad;
    }
    
    private void setFanStatus(){
        if (this.fanSpeed == STOPPED){
            this.fanStatus = false;
            this.fanStatusStr = "OFF";
        }else{
            this.fanStatus = true;
            this.fanStatusStr = "ON";
        }
    }
    
    private void setFanSpeedStr(){
        switch(this.fanSpeed){
            case 0:
                fanSpeedStr = "Stopped";
                break;
            case 1:
                fanSpeedStr = "Slow";
                break;
            case 2:
                fanSpeedStr = "Medium";
                break;
            case 3:
                fanSpeedStr = "Fast";
                break;
        }
    }
    
    // Getters to get fan speed, fan color, fan radius, fan status string and fan speed string
    public int getFanSpeed(){
        return fanSpeed;
    }
    
    public String getFanColor(){
        return fanColor;
    }
    
    public double getFanRadius(){
        return fanRad;
    }
    
    public String getFanStatusStr(){
        return fanStatusStr;
    }
    
    public String getFanSpeedStr(){
        return fanSpeedStr;
    }
    
    // ToSting method
    public String toString(){
        String numFan = "\n\nFan: " + fanNum;
        numFan += "\nFan Status: " + getFanStatusStr();
        numFan += "\nFan Color: " + getFanColor();
        numFan += "\nFan Radius: " + getFanRadius();
        numFan += "\nFan Speed: " + getFanSpeedStr();
        return numFan;
    }
    
    // Fan instance calls
    public static void main(String[] args){
        
        Fan defaultFan = new Fan();
        System.out.println("\nThe default fan status is " + defaultFan + "\n\n");
        
        Fan firstFan = new Fan(2, 24, "Black");
        System.out.println("The status of the first fan is " + firstFan);
        
        
    }


}
