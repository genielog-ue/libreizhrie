package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.AddMedQuery;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class AddMedController extends Controller {
    public AddMedController() {
        super();
    }
    @FXML
    private ChoiceBox typeChoice;
    @FXML
    private TextField TitreField;
    @FXML
    private TextField GenreField;
    @FXML
    private TextField NbExemplairesField;
    @FXML
    private TextField EmplacementField;

    @FXML
    private void AddMedAction(ActionEvent event) throws SQLException {
        /**
         * Méthode permettant de faire le lien entre le formulaire et l'ajout d'un Media par la classe AddMedQuery
         */
        String type= (String) typeChoice.getValue();
        String titre=TitreField.getText();
        String genre=GenreField.getText();
        int nbExemplaire=Integer.parseInt(NbExemplairesField.getText());
        int emplacement=Integer.parseInt(EmplacementField.getText());
        Media media=new Media(type,titre,genre,nbExemplaire,emplacement);
        AddMedQuery query=new AddMedQuery();
        query.AddMed(media);
    }

}
