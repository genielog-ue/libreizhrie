package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.ChangeExplMedQuery;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class ChangeExplMed extends Controller {
    public ChangeExplMed(){
        super();
    }

    @FXML
    private TextField idMediaTextField;
    @FXML
    private TextField nbExemplairesTextField;

    @FXML
    private void ChangeExplMedAction(ActionEvent event) throws SQLException {
        int idMedia=Integer.parseInt(idMediaTextField.getText());
        int nbExemplaires=Integer.parseInt(nbExemplairesTextField.getText());
        Media media=new Media(nbExemplaires,idMedia);
        ChangeExplMedQuery query=new ChangeExplMedQuery();
        query.ChangeExpl(media);
    }
}
