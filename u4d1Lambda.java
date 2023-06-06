package u4d1.lambda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author douglassfamily
 */
public class U4D1Lambda extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        Button btn = new Button("Say 'Hello' to the world, Mr. Computer!");
        // Replace anonymous inner with Lambda
        // Event is handled using btn
        // Lambda has only one expression
        // Do not use Public Void
        btn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
        
        root.getChildren().add(btn);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
