package com.login.Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.login.App;
import com.login.Dao.UserDao;
import com.login.Dao.UserDaoImpl;
import com.login.User.CodFisc;
import com.login.User.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScrutinatoreController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void handleBackButton(ActionEvent event) throws IOException {
        App.navigate("HomeView");
    }

    @FXML
    void handleLoginButton(ActionEvent event) throws SQLException {
        UserDao u = new UserDaoImpl();
        User f = u.getScrutinatore(new CodFisc(username.getText()));
        System.out.println(f);
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'LoginScrutinatore.fxml'.";
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginScrutinatore.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'LoginScrutinatore.fxml'.";
        assert username != null : "fx:id=\"username\" was not injected: check your FXML file 'LoginScrutinatore.fxml'.";

    }

}
