package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.ReturnMedQuery;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class MediaReturnController extends Controller {
    public MediaReturnController() {
        super();
    }

    @FXML
    private TextField idUsagerTextField;
    @FXML
    private TextField idMediaTextField;

    @FXML
    private void ReturnMediaAction(ActionEvent event) throws SQLException {
        /**
         * Méthode liant le formulaire à la classe ReturnMedia
         * Permet de retourner un media
         */
        int idUsager = Integer.parseInt(idUsagerTextField.getText());
        int idMedia = Integer.parseInt(idMediaTextField.getText());
        Usager user = new Usager(idUsager);
        Media media = new Media(idMedia);
        ReturnMedQuery query = new ReturnMedQuery(); // Appel de la requete pour retourner un media
        query.ReturnMedia(user, media);

    }
}
