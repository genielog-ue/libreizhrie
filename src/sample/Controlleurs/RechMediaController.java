package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.RechMedQuery;
import sample.BBDConnect.TableClass.Media;

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
    private void RechMedAction(ActionEvent event) throws SQLException {
        String Type=TypeTextField.getText();
        String Titre=TitreTextField.getText();
        String Genre=GenreTextField.getText();
        Media media=new Media(Type,Titre,Genre);
        RechMedQuery query=new RechMedQuery();
        ArrayList<Media> liste=query.RechMedQuery(media);

    }
}
