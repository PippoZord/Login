package com.login.Controller;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

import com.google.common.hash.Hashing;
import com.login.App;
import com.login.Dao.UserDao;
import com.login.Dao.UserDaoImpl;
import com.login.User.CodFisc;
import com.login.User.Elettore;
import com.login.User.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginElettoreController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private TextField codFisc;

    @FXML
    private Label labelError;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    void handleBackButton(ActionEvent event) throws IOException {
        App.navigate("HomeView");
    }

    @FXML
    void handleLoginButton(ActionEvent event) {
        String HashPassword  = Hashing.sha256().hashString(password.getText(), StandardCharsets.UTF_8).toString();
        try {
            UserDao u = new UserDaoImpl();
            Elettore e = u.getElettore(new CodFisc(codFisc.getText()));
            if (!e.getPassword().equals(HashPassword))
                throw new IllegalArgumentException();
            else
                labelError.setText("");
        } catch (Exception e) {
            labelError.setText("ERRORE");
        }
    }


    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert codFisc != null : "fx:id=\"codFisc\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert labelError != null : "fx:id=\"labelError\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'LoginElettore.fxml'.";

    }

}
