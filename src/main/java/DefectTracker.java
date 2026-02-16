import model.Defect;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DefectTracker extends Application {

    private Defect defect1;

    @Override
    public void start(Stage primaryStage) {
        // Create a new defect
        defect1 = new Defect("D001", "NullPointerException in UserService", "Critical", "John Doe");

        // Create JavaFX UI components
        Label defectDetailsLabel = new Label(getDefectDetails());
        Button updateStatusButton = new Button("Mark as In Progress");
        Button resolveButton = new Button("Mark as Resolved");
        Button assignDeveloperButton = new Button("Assign Developer");

        // Set up event handlers for buttons
        updateStatusButton.setOnAction(e -> {
            defect1.setStatus("In Progress");
            defectDetailsLabel.setText(getDefectDetails());
        });

        resolveButton.setOnAction(e -> {
            defect1.setStatus("Resolved");
            defectDetailsLabel.setText(getDefectDetails());
        });

        assignDeveloperButton.setOnAction(e -> {
            defect1.setAssignedTo("Jane Smith");
            defectDetailsLabel.setText(getDefectDetails());
        });

        // Create a VBox layout to stack the UI elements
        VBox vbox = new VBox(10, defectDetailsLabel, updateStatusButton, resolveButton, assignDeveloperButton);
        vbox.setStyle("-fx-padding: 20px; -fx-margin: 20px");

        // Set up the scene and stage
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setTitle("Defect Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);  // Launch the JavaFX application
    }
    private String getDefectDetails() {
        // Return a string representation of the defect object
        return "Defect ID: " + defect1.getDefectID() + "\n" +
                "Description: " + defect1.getDescription() + "\n" +
                "Status: " + defect1.getStatus() + "\n" +
                "Priority: " + defect1.getPriority() + "\n" +
                "Assigned To: " + defect1.getAssignedTo() + "\n" +
                "Created Date: " + defect1.getCreatedDate() + "\n" +
                (defect1.getResolvedDate() != null ? "Resolved Date: " + defect1.getResolvedDate() : "");
    }


}
