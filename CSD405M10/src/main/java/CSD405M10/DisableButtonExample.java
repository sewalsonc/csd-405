
package CSD405M10;

import java.awt.event.*;
import java.awt.*;    
public class DisableButtonExample{    
    public static void main (String[] args) {   
  
        // Creating new frame with the label   
        Frame f = new Frame("Button & Textfield Example");    
  
    // Creating new button  
        Button b = new Button("SELECT");   
  
    // Setting size and position of button
        b.setBounds(50,100,80,30);    
  
    // Adding button 
        f.add(b);    
    // Setting size, layout and visibility of frame  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);
    
    // Disabling button b
        //b.setEnabled(false);
    
    
    
    // Creating textfields t1 and t2  
        TextField t1,t2;  
    
    // Creating new textfield
        t1=new TextField("Textfield 1 - Enabled");  
        t1.setBounds(50,200, 200,30);
    
    // Creating new textfield
        t2=new TextField("TextField 2 - Disabled");  
        t2.setBounds(50,250, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
    
    // Disabling textfield t2
        t2.setEnabled(false);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                b.setEnabled(false);
            }
        });
    }
} 
