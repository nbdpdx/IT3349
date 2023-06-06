package about.me.by.javafx;

import java.io.FileInputStream;
import java.io.InputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author douglassfamily
 */
public class AboutMeByJavaFX extends Application {
      @Override
    public void start(Stage primaryStage) throws Exception {
      //creating the image object from InputStream
      InputStream stream = new FileInputStream("/Users/douglassfamily/NetBeansProjects/About Me by JavaFX/src/1.jpg");  
      Image image1 = new Image(stream);
      //Setting the image view 
      ImageView imageView = new ImageView(image1); 
      //Setting the position of the image 
      imageView.setX(250); 
      imageView.setY(0); 
      //setting the fit height and width of the image view 
      imageView.setFitHeight(250); 
      imageView.setFitWidth(250); 
     
      //creating the image object for image 2
      InputStream stream2 = new FileInputStream("/Users/douglassfamily/NetBeansProjects/About Me by JavaFX/src/2.jpeg");  
      Image image2 = new Image(stream2);
      ImageView imageView1 = new ImageView(image2);  
      imageView1.setX(0); 
      imageView1.setY(250); 
      imageView1.setFitHeight(250); 
      imageView1.setFitWidth(250); 
       
      Group pane = new Group(imageView, imageView1); 
      
      //CREATE RECTANGLE TO HOLD NAME AND FOOD
      Rectangle r1 = new Rectangle(0, 0, 250, 250); 
      r1.setFill(Color.TRANSPARENT);
      pane.getChildren().add(r1);
      pane.getChildren().add(new Text(50, 125, "NATHANIEL DOUGLASS"));
      
      Rectangle r2 = new Rectangle(250, 250, 250, 250); 
      r2.setFill(Color.TRANSPARENT);
      pane.getChildren().add(r2);
      pane.getChildren().add(new Text(350, 375, "SUSHI"));
     
      // Make scene inside stage
      Scene scene = new Scene(pane, 500, 500);
      primaryStage.setTitle("About Me"); 
      primaryStage.setScene(scene); 
      primaryStage.show();          
    }
    public static void main(String[] args) {
        launch(args);
    }
}
