package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.RemMedQuery;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class RemMedController extends Controller {
    public RemMedController() {
        super();
    }

    @FXML
    private TextField idMed;
    @FXML
    private TextField TitreMed;

    @FXML
    private void RemMedAction(ActionEvent event) throws SQLException {
        /**
         * Méthode appelée sur un bouton de validation permettant d'envoyer une requête
         * pour retirer un media de la BDD
         */
        String titre = TitreMed.getText();
        int id = Integer.parseInt(idMed.getText());
        Media media = new Media(titre, id);
        RemMedQuery query = new RemMedQuery();
        query.RemMed(media);
    }
}
