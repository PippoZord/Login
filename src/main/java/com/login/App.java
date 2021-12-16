package com.login;

import java.io.IOException;
import java.sql.SQLException;
import com.login.User.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    private static Scene scene;
    private User u;
    
    public static void main( String[] args ) throws SQLException{
        launch(args);
//        User u = new Elettore("Lorenzo", "Filipponi", new CodFisc("FLPLNZ00M11F205W"), "123456", false);

    }

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadView("HomeView", null), 600, 400);
        navigate("HomeView");
        stage.setScene(scene);
        stage.setTitle("VOTO ELETTRONICO");
        stage.setMinWidth(600);
        stage.setMinHeight(400);
        stage.setResizable(true);
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
