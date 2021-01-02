package sample.Controlleurs;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.BBDConnect.SQLQuery.AuthQuery;
import sample.BBDConnect.TableClass.Personnel;

public class AuthController extends Controller{
    public AuthController(){
        super();
    }
    @FXML
    private TextField CompteField;
    @FXML
    private TextField MdpField;

    @FXML
    private void checkAuth() throws Exception {
        String compte=CompteField.getText();
        String mdp=MdpField.getText();
        Personnel personnel=new Personnel("","",1,mdp,compte);
        AuthQuery query=new AuthQuery();
        boolean bool=query.Auth(personnel);
        if(bool==true){
            changeScene("FXML/Hub.fxml");
        }
    }

}
