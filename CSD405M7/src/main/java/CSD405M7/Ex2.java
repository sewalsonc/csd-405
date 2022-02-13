/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSD405M7;

import javafx.application.Application;  
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;  
import javafx.scene.layout.FlowPane;  
import javafx.stage.Stage;


public class Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage){
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
        
        pane.getChildren().addAll(new Label("first name:"),
                new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        
        pane.getChildren().addAll(tfMi, new Label("last name:"),
            new TextField());
        
        Scene scene = new Scene(pane, 350, 100);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
