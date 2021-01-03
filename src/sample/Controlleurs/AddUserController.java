package sample.Controlleurs;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.AddUserQuery;
import sample.BBDConnect.TableClass.Usager;

public class AddUserController extends Controller {

    public AddUserController() {
        super();
    }

    @FXML
    private TextField nomTextField;
    @FXML
    private TextField prenomTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField adresseTextField;
    @FXML
    private TextField telephoneTextField;

    @FXML
    private void ValidUserAction(ActionEvent event) throws Exception {
        /**
         * Méthode faisant le lien entre le formulaire et la classe AddUserQuery
         * Rajoute un usager dans la BDD
         */
        String nom = nomTextField.getText();
        String prenom = prenomTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());
        String adresse = adresseTextField.getText();
        String telephone = telephoneTextField.getText();
        Usager user = new Usager(nom, prenom, age, adresse, telephone);
        AddUserQuery query = new AddUserQuery();
        query.AddUser(user);
    }


}
