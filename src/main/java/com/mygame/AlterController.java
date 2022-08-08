package com.mygame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class AlterController implements Initializable {
    Stage stage;
    Scene scene;
    @FXML
    private Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
    @FXML
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @FXML
    private Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    @FXML
    private Button d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
    @FXML
    private Button e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    @FXML
    private Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
    @FXML
    private Button g1,g2,g3,g4,g5,g6,g7,g8,g9,g10;
    @FXML
    private Button h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;
    @FXML
    private Button i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    @FXML
    private Button j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
    ArrayList<Button> buttons;
    private int playerTurn = 0;
    @FXML
    private Text wintext;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            buttons = new ArrayList<>(Arrays.asList(
                    a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,
                    b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,
                    c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,
                    d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,
                    e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,
                    f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,
                    g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,
                    h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,
                    i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,
                    j1,j2,j3,j4,j5,j6,j7,j8,j9,j10));

        buttons.forEach(button ->{
            setupButton(button);
            button.setFocusTraversable(false);
        });
    }

    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(this::resetButton);
    }
    public void disableButton(Button button){
        button.setDisable(true);

    }

    public void resetButton(Button button){
        button.setDisable(false);
        button.setText(" ");
    }

    private void setupButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(button);
            button.setDisable(true);
            checkIfGameIsOver();
        });
    }

    public void setPlayerSymbol(Button button){
        if(playerTurn % 2 == 0){
            button.setText("X");
            playerTurn = 1;
        } else{
            button.setText("O");
            playerTurn = 0;
        }
    }

    public void checkIfGameIsOver()  {
        for (int a = 0; a < 1; a++) {
            String line = switch (a) {
                case 0 -> a1.getText() + a2.getText() + a3.getText() + a4.getText() + a5.getText();
                case 1 -> a6.getText() + a7.getText() + a8.getText() + a9.getText() + a10.getText();

                default -> null;
            };


            if (line.equals("XXXXX")) {
                wintext.setText("X won!");
                restartGame(new ActionEvent());
                buttons.forEach(this::disableButton);

            }


            else if (line.equals("OOOOO")) {
                wintext.setText("O won!");
                restartGame(new ActionEvent());
                buttons.forEach(this::disableButton);

            }
        }
    }
    public void backMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
