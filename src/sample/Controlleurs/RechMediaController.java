package sample.Controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
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
        String Type=TypeTextField.getText();
        String Titre=TitreTextField.getText();
        String Genre=GenreTextField.getText();
        Media media=new Media(Type,Titre,Genre);
        RechMedQuery query=new RechMedQuery();
        ArrayList<Media> liste=query.RechMedQuery(media);
        TableView tableau=new TableView();

        TableColumn type= new TableColumn("type");
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        TableColumn titre=new TableColumn("titre");
        titre.setCellValueFactory(new PropertyValueFactory<>("titre"));
        TableColumn genre= new TableColumn("genre");
        genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        TableColumn nbExemplaires=new TableColumn("nbExemplaires");
        nbExemplaires.setCellValueFactory(new PropertyValueFactory<>("nbExemplaires"));
        TableColumn emplacement= new TableColumn("emplacement");
        emplacement.setCellValueFactory(new PropertyValueFactory<>("emplacement"));
        TableColumn idMedia=new TableColumn("idMedia");
        idMedia.setCellValueFactory(new PropertyValueFactory<>("idMedia"));
        TableColumn disponible=new TableColumn("disponible");
        disponible.setCellValueFactory(new PropertyValueFactory<>("disponible"));
        tableau.getColumns().addAll(type,titre,genre,nbExemplaires,emplacement,idMedia,disponible);

        for(int i=0;i<liste.size();i++){
            tableau.getItems().add(liste.get(i));
        }

        StackPane root=new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(tableau);
        Stage stage=new Stage();
        stage.setTitle("Recherche :");
        Scene scene= new Scene(root, 800,600);
        stage.setScene(scene);
        stage.show();


    }
}
