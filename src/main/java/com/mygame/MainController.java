package com.mygame;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController  {
    private Stage stage;
    private Scene scene;
    private Parent root;

   @FXML
   public  CheckBox mycheck;

    @FXML
    private CheckBox checkBox;

    public void switchToScene(ActionEvent event) throws IOException {
    if(checkBox.isSelected()){
        root = FXMLLoader.load(getClass().getResource("10x10B.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } else {
        root = FXMLLoader.load(getClass().getResource("3x3B.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("MainController CheckBox Status : "+mycheck.isSelected());
    }

    }
    public void aiMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ai.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void exitMenu(ActionEvent event) {
        Platform.exit();

       }

    }

