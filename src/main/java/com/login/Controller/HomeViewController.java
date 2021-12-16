package com.login.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.login.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeViewController extends Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button elettoreButton;

    @FXML
    private Button scrutatoreButton;

    @FXML
    void handleElettore(ActionEvent event) throws IOException {
        App.navigate("LoginElettore");
    }

    @FXML
    void handleScrutatore(ActionEvent event) throws IOException {
        App.navigate("LoginScrutinatore");
    }

    @FXML
    void initialize() {
        assert elettoreButton != null
                : "fx:id=\"elettoreButton\" was not injected: check your FXML file 'HomeView.fxml'.";
        assert scrutatoreButton != null
                : "fx:id=\"scrutatoreButton\" was not injected: check your FXML file 'HomeView.fxml'.";

    }

}
