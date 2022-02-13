/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M7;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.scene.text.*;  
import javafx.scene.layout.StackPane;  
import javafx.stage.Stage;


public class Ex1 extends Application {
    
    
    @Override
    public void start(Stage primaryStage){
        
        Pane pane = new StackPane();
        
        Circle circle = new Circle();
        circle.setRadius(100);
        circle.setStroke(Color.RED);
        circle.setFill((Color.BLACK));
        
        pane.getChildren().add(circle);
        
        Label label = new Label("JavaFX");
        label.setTextFill(Color.RED);
        
        label.setFont(Font.font("Times New Roman",
                FontWeight.BOLD, FontPosture.ITALIC, 20));
        
        pane.getChildren().add(label);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
