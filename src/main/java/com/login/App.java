package com.login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;

import com.login.User.CodFisc;
import com.login.User.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    private static Scene scene;
    
    public static void main( String[] args ) throws SQLException{
        //CodFisc c = CodFisc.createCodFisc("Lorenzo", "Filipponi", "ITA", "MI", new Calendar.Builder().build(), "M");
        launch(args);
//        User u = new Elettore("Lorenzo", "Filipponi", new CodFisc("FLPLNZ00M11F205W"), "123456", false);

    }

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadView("HomeView", null), 1036, 682);
        navigate("HomeView");
        stage.setScene(scene);
        stage.setTitle("VOTO ELETTRONICO");
        stage.setResizable(false);
        stage.show();      
    }
    
    
    public static void navigate(String view) throws IOException {
        Parent parent = loadView(view, null);    
        scene.setRoot(parent);
    }

    private static Parent loadView(String view, Object param) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("view/" + view + ".fxml"));
        Parent root = loader.load();
        return root;
    }

    public static void userInstance(User u){
        
    }
}
