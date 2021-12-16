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

public class LoginElettoreController extends Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private TextField codFisc;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    void handleBackButton(ActionEvent event) throws IOException {
        App.navigate("HomeView");
    }

    @FXML
    void handleLoginButton(ActionEvent event) throws SQLException {
        UserDao u = new UserDaoImpl();
        User f = u.getUser(new CodFisc(codFisc.getText()));
        System.out.println(f);
        u.updateUser(f);
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert codFisc != null : "fx:id=\"codFisc\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginElettore.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'LoginElettore.fxml'.";

    }

}
