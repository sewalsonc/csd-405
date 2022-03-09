/*
 * This code will generate an array called deck with 54 elements.  Then will collect card from sub directory
 *    and display it along with labels for each card and stage title. 
 */
package CSD405M10;

// Imports
import java.io.FileInputStream;  
import java.lang.Math;
import javafx.application.Application;  
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;  
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.event.Event;
  
public class CardsWrefresh extends Application {  
  
    
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
          
        // Create an array of 54 named deck
        int[] deck = new int[54];
        for(int i=0; i<54; i++) {
            deck[i] = i+1;
        }
        
        
        ImageView img1View = new ImageView();
        img1View.setImage(new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M10\\cards\\" + deck[(int)(Math.random()* 54)] + ".png")));
        ImageView img2View = new ImageView();
        img2View.setImage(new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M10\\cards\\" + deck[(int)(Math.random()* 54)] + ".png")));
        ImageView img3View = new ImageView();
        img3View.setImage(new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M10\\cards\\" + deck[(int)(Math.random()* 54)] + ".png")));
        ImageView img4View = new ImageView();
        img4View.setImage(new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M10\\cards\\" + deck[(int)(Math.random()* 54)] + ".png")));
                
        // Creating GridPane labels 
        Label Lb1 =new Label("Card#1"); 
        Label Lb2 =new Label("Card#2"); 
        Label Lb3 =new Label("Card#3"); 
        Label Lb4 =new Label("Card#4");
        
        // Creating GridPane, centering it and setting V,H and padding dimensions
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(10,10,10,10));
        
        // Creating scene
        Scene scene=new Scene(root);
        
        // Creating button
        Button b1 = new Button("Refresh");
        
        b1.setOnAction(e -> {
            try {
                // calling our start method 
                start(primaryStage);

            }
            // catching a printStackTrace exception
            catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        
        // Filling up the grid and giving the stage a title
        root.addRow(0,Lb1, Lb2);
        root.addRow(1, img1View, img2View);
        root.addRow(2,Lb3, Lb4);
        root.addRow(3, img3View, img4View);
        root.addRow(4, b1);
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Four Random Cards");  
        primaryStage.show();
        
             
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
} 