package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.EmprMedQuery;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class MediaBorrowController extends Controller {
    public MediaBorrowController() {
        super();
    }

    @FXML
    private TextField idUsagerTextField;
    @FXML
    private TextField idMediaTextField;
    @FXML
    private ChoiceBox typeMediaChoiceBox;

    @FXML
    public void BorrowMediaAction(ActionEvent event) throws SQLException {
        /**
         * Méthode liant le formulaire graphique et EmprMedQuery
         * Permet l'emprunt d'un media par un user
         */
        int idUser = Integer.parseInt(idUsagerTextField.getText());
        int idMedia = Integer.parseInt(idMediaTextField.getText());
        String typeMedia = (String) typeMediaChoiceBox.getValue();
        Media media = new Media(idMedia);
        Usager usager = new Usager(idUser);
        EmprMedQuery query = new EmprMedQuery();
        query.EmprMedQuery(usager, media, typeMedia);


    }

}
