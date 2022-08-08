package com.mygame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameMain extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent loader = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage.setTitle("Kółko i Krzyżyk");
        stage.setScene(new Scene(loader));
        stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}