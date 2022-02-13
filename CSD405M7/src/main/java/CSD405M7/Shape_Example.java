/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M7;

 
import javafx.application.Application;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.paint.Color;  
import javafx.scene.shape.Rectangle;  
import javafx.stage.Stage;  
public class Shape_Example extends Application{  
  
        @Override  
        public void start(Stage primaryStage) throws Exception {  
            // TODO Auto-generated method stub  
        primaryStage.setTitle("Rectangle Example");  
        Group group = new Group();  
        Rectangle rect=new Rectangle(); 
        rect.setX(20);  
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(100); 
        group.getChildren().addAll(rect);   
        Scene scene = new Scene(group,200,300,Color.GRAY);  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }  
    public static void main(String[] args) {  
    launch(args);  
    }  
  
}