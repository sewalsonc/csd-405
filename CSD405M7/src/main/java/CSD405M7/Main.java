/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
        StackPane pane = new StackPane();
        
        pane.getChildren().add(new Button("OK"));
        
        
        // Stage newStage = new Stage();
        
        // Scene scene1 = new Scene(new Button("Button 1"),300, 300);
        // Scene scene2 = new Scene(new Button("Button 2"),300, 300);
        
        
        // Button button = new Button("Button Label");
        
        Scene scene = new Scene(pane, 300, 300);
        
        primaryStage.setTitle("Button in pane");
        // newStage.setTitle("Second Stage");
        
        primaryStage.setScene(scene);
        
        // newStage.setScene(scene2);
        
        primaryStage.show();
        // newStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
