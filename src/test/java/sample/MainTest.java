package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxToolkit;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit.ApplicationTest;

public class MainTest extends ApplicationTest {

    private Button button;

    @Override
    public void start(Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    public <T extends Node> T find(final String query) {
        return (T) lookup(query).queryAll().iterator().next();
    }

    @Test
    public void verificationTexteBoutons() {
        Assertions.assertThat(button).hasText("Ajouter un Usager");
        Assertions.assertThat(button).hasText("Retirer un Usager");
        Assertions.assertThat(button).hasText("Ajouter un média");
        Assertions.assertThat(button).hasText("Ajouter un exemplaire");
        Assertions.assertThat(button).hasText("Supprimer un média");
        Assertions.assertThat(button).hasText("Emprunter un exemplaire");
        Assertions.assertThat(button).hasText("Retourner un exemplaire");
        Assertions.assertThat(button).hasText("Recherche media");
        Assertions.assertThat(button).hasText("Reserver media");
    }

    @Test
    public void changeSceneClickBouton() {
        //when
        clickOn(".button");

        //then
        targetWindow("sample.FXML.AddMed");

    }
}