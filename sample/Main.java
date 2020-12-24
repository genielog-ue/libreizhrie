package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.BBDConnect.LibBDD;
import sample.Controlleurs.Controller;

import java.awt.*;

public class Main extends Application {
    protected Stage primaryStage; // Protected Stage to allow link to another class

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader();
        this.primaryStage=primaryStage; // Set the primaryStage loaded by JavaFX to the Stage var of the class
        loader.setLocation(Main.class.getResource("FXML/Hub.fxml"));
        Parent root = loader.load();
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize(); // Get The size of the User Screen
        this.primaryStage.setTitle("LibBreizhRie");
        this.primaryStage.setScene(new Scene(root, screenSize.getWidth()-100, screenSize.getHeight()-100));
        this.primaryStage.show();
        Controller control=(Controller) loader.getController(); // Initialize the Controller of start page
        control.setMainApp(this); // Link the controller to the Main
        LibBDD test=new LibBDD();
        test.getBDD();
    }
    public Stage getprimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
