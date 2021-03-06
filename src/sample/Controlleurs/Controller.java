package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import sample.Main;

public class Controller {
    /**
     * Controlleur Principal contenant les méthodes communes
     */
    private Main Mainapp;

    public Controller() {
    }

    @FXML
    private void initialize() {
    }

    @FXML
    public void changeScene(String fxml) throws Exception {
        /**
         * Change la scene principale en récupérant un fichier .fxml
         * Args : String fxml : PATH relatif ou absolu vers le fichier .fxml
         */
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource(fxml)); // Set the loader to FXML path
        Parent pane = loader.load();
        Mainapp.getPrimaryStage().getScene().setRoot(pane); // Set the content of Main Stage to the fxml loaded
        Controller controle = (Controller) loader.getController(); // Get the controller of the .fxml file
        controle.setMainApp(Mainapp); // Call by MainApp to give a reference to himself
    }

    @FXML
    private void ButtonChangeScene(ActionEvent event) throws Exception {
        /**
         * Méthodes appelée sur les boutons de changement de scene
         * Args: ActionEvent event : Permet de récupérer la source de l'évènement
         */
        Node node = (Node) event.getSource(); // Get the Button clicked
        String data = (String) node.getUserData(); // Get the userdata var where userdata is the path to the .fxml next scene
        changeScene(data); // call the changeScene methode
    }

    public void setMainApp(Main mainApp) {
        this.Mainapp = mainApp; // Set the Mainapp var to the Main class calling the method
    }
}
