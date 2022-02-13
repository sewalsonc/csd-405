/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M7;

import java.awt.*;  
import javax.swing.JFrame;  
  
public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) {  
        // g.drawString("Hello",40,40);  
        setBackground(Color.WHITE);  
        g.fillRect(130, 30,100, 80);  
        // g.drawOval(30,130,50, 90);  
        setForeground(Color.RED);  
        // g.fillOval(200,100,90, 190);  
        // g.drawArc(30, 200, 40,50,90,60);  
        // g.fillArc(30, 130, 40,50,180,40);  
          
    }  
        public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}