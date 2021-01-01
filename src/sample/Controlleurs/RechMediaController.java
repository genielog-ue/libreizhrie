package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.BBDConnect.SQLQuery.RechMedQuery;
import sample.BBDConnect.TableClass.Media;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class RechMediaController extends Controller {
    public RechMediaController() {
        super();
    }
    @FXML
    private TextField TypeTextField;
    @FXML
    private TextField TitreTextField;
    @FXML
    private TextField GenreTextField;

    @FXML
    private void RechMedAction(ActionEvent event) throws SQLException, IOException {
        System.out.println("Yolo");
        String Type=TypeTextField.getText();
        String Titre=TitreTextField.getText();
        String Genre=GenreTextField.getText();
        Media media=new Media(Type,Titre,Genre);
        RechMedQuery query=new RechMedQuery();
        ArrayList<Media> liste=query.RechMedQuery(media);

        FXMLLoader loader=new FXMLLoader();
        System.out.println(RechMediaController.class.getResource("../FXML/RechMedSecondaryStage.fxml"));
        loader.setLocation(RechMediaController.class.getResource("../FXML/RechMedSecondaryStage.fxml"));
        Parent root=loader.load();
        Stage stage=new Stage();
        stage.setTitle("Recherche :");
        stage.setScene(new Scene(root,700,400));
        stage.show();



    }
}
