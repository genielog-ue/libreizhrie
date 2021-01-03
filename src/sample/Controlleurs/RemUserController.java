package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.RemUserQuery;
import sample.BBDConnect.TableClass.Usager;

public class RemUserController extends Controller {
    /**
     * Controller pour retirer un utilisateur
     */
    public RemUserController() {
        super();
    }

    @FXML
    private TextField nomTextField;
    @FXML
    private TextField prenomTextField;
    @FXML
    private TextField idUsagerTextField;

    @FXML
    private void RemoveUserAction(ActionEvent event) throws Exception {
        String nom = nomTextField.getText();
        String prenom = prenomTextField.getText();
        int id;
        if (idUsagerTextField.getText().isEmpty()) {
            id = -1; // Garde Fou pour éviter que la requête supprime le mauvais utilisateur
        } else {
            id = Integer.parseInt(idUsagerTextField.getText());
        }
        Usager user = new Usager(nom, prenom, id);
        RemUserQuery query = new RemUserQuery();
        query.RemUser(user);

    }
}
