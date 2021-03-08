package it.polito.tdp.provagit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'Scene.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
