package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Controlleurs.Controller;

public class Main extends Application {
    protected Stage primaryStage; // Protected Stage to allow link to another class

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader();
        this.primaryStage=primaryStage; // Set the primaryStage loaded by JavaFX to the Stage var of the class
        loader.setLocation(Main.class.getResource("FXML/Hub.fxml"));
        Parent root = loader.load();
        this.primaryStage.setTitle("LibBreizhRie");
        this.primaryStage.setScene(new Scene(root, 800, 400));
        this.primaryStage.show();
        Controller controle=(Controller) loader.getController(); // Initialize the Controller of start page
        controle.setMainApp(this); // Link the controller to the Main
    }
    public Stage getprimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
