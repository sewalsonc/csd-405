/*
 * Java Swing code with scroll panes.
 */
package CSD405M7;

import java.awt.*;  
import java.awt.FlowLayout;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTextArea;  
  
public class ScrollPane_EX {  
    private static final long serialVersionUID = 1L;  
  
    private static void createAndShowGUI() {  
  
        // Creates the page 
        final JFrame frm1 = new JFrame("JScrollPane Example Page");  
  
        // Display the page  
        frm1.setSize(400, 500);  
        frm1.setVisible(true);  
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
        // set flow layout for the frame  
        frm1.getContentPane().setLayout(new FlowLayout());  
  
        JTextArea txt1 = new JTextArea(25, 25);  
        JScrollPane pageView = new JScrollPane(txt1);  
  
        pageView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        pageView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frm1.getContentPane().add(pageView);  
    }


    public static void main(String[] args) {  
  
  
        javax.swing.SwingUtilities.invokeLater(new Runnable() {  
  
            public void run() {  
                createAndShowGUI();  
            }  
        });  
    }  
}
