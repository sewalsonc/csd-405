/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wit0011153
 */
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    
    public TV(){
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
      on = false;
    }
    
    public void setChannel(int newChannel){
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >= 1 && newVolumeLevel <=7)
            volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }
    
    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }
    
    public void volumeUp(){
        if (on && volumeLevel < 7)
            volumeLevel++;
    }
    
    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}