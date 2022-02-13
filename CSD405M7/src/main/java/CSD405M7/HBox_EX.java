/*
 * JavaFX HBox code
 */
package CSD405M7;

 
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.layout.HBox;  
import javafx.stage.Stage;  
public class HBox_EX extends Application {  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
            Button b1 = new Button("Left Button is on the left");  
            Button b2 = new Button("Right Button");  
            HBox bx1 = new HBox();  
            Scene scene = new Scene(bx1,400,400);  	
            bx1.getChildren().addAll(b1,b2);  
            bx1.setSpacing(170);
            primaryStage.setScene(scene);  
            primaryStage.show();  
    }  
    public static void main(String[] args) {  
                    launch(args);  
    }  
}
