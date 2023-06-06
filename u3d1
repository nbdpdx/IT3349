package u3d1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class U3D1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
    // Create a pane
      Pane pane = new Pane();  
      
    // Create rectangles and place in proper coordinates
      Rectangle r1 = new Rectangle(0, 0, 250, 250);
      r1.setStroke(Color.BLACK); 
      r1.setFill(Color.RED);
      pane.getChildren().add(r1);
      pane.getChildren().add(new Text(125, 125, "Color 1"));
      
      Rectangle r2 = new Rectangle(250, 0, 250, 250);
      r2.setStroke(Color.BLACK); 
      r2.setFill(Color.BLUE);
      pane.getChildren().add(r2);
      pane.getChildren().add(new Text(375, 125, "Color 2"));
      
      Rectangle r3 = new Rectangle(250, 250, 250, 250);
      r3.setStroke(Color.BLACK); 
      r3.setFill(Color.GREEN);
      pane.getChildren().add(r3);
      pane.getChildren().add(new Text(375, 375, "Color 3"));
      
      Rectangle r4 = new Rectangle(0, 250, 250, 250);
      r4.setStroke(Color.BLACK); 
      r4.setFill(Color.YELLOW);
      pane.getChildren().add(r4);
      pane.getChildren().add(new Text(125, 375, "Color 4"));
     
      // Make scene inside stage
      Scene scene = new Scene(pane, 500, 500);
      primaryStage.setTitle("4 Color Quadrants"); 
      primaryStage.setScene(scene); 
      primaryStage.show(); 
                 
    }        
}
