/*
 * This code will generate an array called deck with 54 elements.  Then will collect card from sub directory
 *    and display it along with labels for each card and stage title. 
 */
package CSD405M8;

// Imports
import java.io.FileInputStream;  
  
import javafx.application.Application;  
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;  
import javafx.scene.control.Label;  
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView;  
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;  
  
public class Cards extends Application {  
  
    
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
          
        // Create an array of 54 named deck
        int[] deck = new int[54];
        for(int i=0; i<54; i++) {
            deck[i] = i+1;
        }
        
        // Create 4 random car index numbers
        int card1 = deck[(int)(Math.random()* 54 + 1)];
        int card2 = deck[(int)(Math.random()* 54 + 1)];
        int card3 = deck[(int)(Math.random()* 54 + 1)];
        int card4 = deck[(int)(Math.random()* 54 + 1)];

        // Accessing cards in sub directory and assigning to array elements of deck
        
        Image img1 = new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M8\\src\\main\\java\\CSD405M8\\cards\\" + card1 + ".png"));
        Image img2 = new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M8\\src\\main\\java\\CSD405M8\\cards\\" + card2 + ".png"));
        Image img3 = new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M8\\src\\main\\java\\CSD405M8\\cards\\" + card3 + ".png"));
        Image img4 = new Image(new FileInputStream("C:\\NetBeansProjects\\csd-405\\CSD405M8\\src\\main\\java\\CSD405M8\\cards\\" + card4 + ".png"));
        ImageView img1View = new ImageView();
        img1View.setImage(img1);
        ImageView img2View = new ImageView();
        img2View.setImage(img2);
        ImageView img3View = new ImageView();
        img3View.setImage(img3);
        ImageView img4View = new ImageView();
        img4View.setImage(img4);
        
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
        
        // Filling up the grid and giving the stage a title
        root.addRow(0,Lb1, Lb2);
        root.addRow(1, img1View, img2View);
        root.addRow(2,Lb3, Lb4);
        root.addRow(3, img3View, img4View);
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Four Random Cards");  
        primaryStage.show();  
          
    }  
    public static void main(String[] args) {  
        launch(args);  
    }  
} 