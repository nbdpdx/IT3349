package u4a1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.RowConstraints;
import javafx.scene.control.ComboBox;

public class U4A1 extends Application {
    
    GridPane grid = new GridPane();
    Label selectPromptLabel = new Label("Please select a course for which you want to register");
    ComboBox<Course> coursesComboBox = new ComboBox<>();   
    Label confirmPromptLabel = new Label("");
    Label registeredCoursesPromptLabel = new Label("You are currently registered for");
    Label creditHourPromptLabel = new Label("Current total Credit Hours");            
    Label registeredCoursesLabel = new Label("");
    Label creditHoursLabel = new Label("0");

    Course choice;
    int totalCredit = 0;

    @Override
    public void start(Stage primaryStage) {

        RowConstraints row0 = new RowConstraints();
        RowConstraints row1 = new RowConstraints();
        RowConstraints row2 = new RowConstraints();
        RowConstraints row3 = new RowConstraints();
        RowConstraints row4 = new RowConstraints();
        
        row0.setPercentHeight(5);
        row1.setPercentHeight(50);
        row2.setPercentHeight(10);
        row3.setPercentHeight(5);
        row4.setPercentHeight(15);
         
        grid.getRowConstraints().addAll(row0, row1,row2, row3, row4);

        grid.setAlignment(Pos.CENTER);

        grid.setHgap(5);
        grid.setVgap(5);
        
        grid.add(selectPromptLabel, 0, 0);
        grid.setHalignment(selectPromptLabel, HPos.LEFT);

        coursesComboBox.getItems().addAll(
                new Course("IT4782"), 
                new Course("IT4784"),
                new Course("IT4786"),
                new Course("IT4789"),
                new Course("IT2230"),
                new Course("IT3345"),
                new Course("IT3349") );
        coursesComboBox.setMaxWidth(Double.MAX_VALUE);

        // Set the Limit of visible months to 5
        // Not necesscary to run
        coursesComboBox.setVisibleRowCount(5);
        
        grid.add(coursesComboBox, 0, 1);
        grid.setValignment(coursesComboBox, VPos.TOP);

        confirmPromptLabel.setTextFill(Color.RED);
        grid.add(confirmPromptLabel, 0, 2);  
        grid.setHalignment(confirmPromptLabel, HPos.LEFT);
        grid.setValignment(confirmPromptLabel, VPos.TOP);

        grid.add(registeredCoursesPromptLabel, 0, 3);  
        grid.setHalignment(registeredCoursesPromptLabel, HPos.LEFT);
        grid.setValignment(registeredCoursesPromptLabel, VPos.TOP);
       
        grid.add(creditHourPromptLabel, 1, 3);  
        grid.setHalignment(creditHourPromptLabel, HPos.LEFT);   
        grid.setValignment(creditHourPromptLabel, VPos.TOP);
       
        grid.add(registeredCoursesLabel, 0, 4);
        grid.setHalignment(registeredCoursesLabel, HPos.LEFT);   
        grid.setValignment(registeredCoursesLabel, VPos.TOP);
        registeredCoursesLabel.setStyle("-fx-background-color: #fff600;");
        
        grid.add(creditHoursLabel, 1, 4); 
        grid.setHalignment(creditHoursLabel, HPos.LEFT);   
        grid.setValignment(creditHoursLabel, VPos.TOP);
        creditHoursLabel.setStyle("-fx-background-color: #fff600;");
         
        Scene scene = new Scene(grid, 500, 500, Color.RED);
        
        primaryStage.setTitle("JavaFX Register for Course");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        coursesComboBox.setOnAction(e -> {
            choice = coursesComboBox.getValue();
           
            // String to retrieve choice value
            String setCode = choice.toString();
            
            // Use getIsRegisteredFor to create error for classes already registered for
            if (choice.getIsRegisteredFor()) {
                confirmPromptLabel.setText("**Invalid** \n" + "Already registered for course: " + setCode);
                return; 
            }
            
            // Create error if more than 3 classes are registered for
            if (totalCredit == 9) {
                confirmPromptLabel.setText("**Invalid** \n" + "Cannot register more than 9 credit hours.");
                return;
            }
             
            // Update display with each registered course
            confirmPromptLabel.setText("Registration confirmed for course: " + setCode);
            registeredCoursesLabel.setText(registeredCoursesLabel.getText() + setCode + '\n');
            
            // Each course is worth 3 credits - Update Credits
            totalCredit += 3; 
            creditHoursLabel.setText(totalCredit + "");
            
            // Choice is true if registered for
            choice.setIsRegisteredFor(true); 
        });
}
    public static void main(String[] args) { 
        launch(args);
    }
}
