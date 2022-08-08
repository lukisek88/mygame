package com.mygame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;


public class AiController implements Initializable {

    @FXML
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @FXML
    private Text winnerText;
    @FXML
    Stage stage;
    @FXML
    Scene scene;
    ArrayList<Button> buttons;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button1,button2,button3,button4,button5,button6,button7,button8,button9));
        buttons.forEach(button ->{
            setupButton(button);
            button.setFocusTraversable(false);
        });
    }

    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(this::resetButton);
        winnerText.setText("");

    }
    @FXML
    void keyPress(KeyEvent event){
        KeyCode keyCode = event.getCode();
        System.out.println(keyCode);
        switch (keyCode){
            case NUMPAD7:
                if (button1.getText().isEmpty() && button1.isDisabled() == false) {
                    button1.setText("X");
                    button1.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD8:
                if (button2.getText().isEmpty() && button2.isDisabled() == false) {
                    button2.setText("X");
                    button2.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD9:
                if (button3.getText().isEmpty() && button3.isDisabled() == false) {
                    button3.setText("X");
                    button3.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD4:
                if (button4.getText().isEmpty() && button4.isDisabled() == false) {
                    button4.setText("X");
                    button4.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD5:
                if (button5.getText().isEmpty() && button5.isDisabled() == false) {
                    button5.setText("X");
                    button5.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD6:
                if (button6.getText().isEmpty() && button6.isDisabled() == false) {
                    button6.setText("X");
                    button6.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD1:
                if (button7.getText().isEmpty() && button7.isDisabled() == false) {
                    button7.setText("X");
                    button7.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD2:
                if (button8.getText().isEmpty() && button8.isDisabled() == false) {
                    button8.setText("X");
                    button8.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}
            case NUMPAD3:
                if (button9.getText().isEmpty() && button9.isDisabled() == false) {
                    button9.setText("X");
                    button9.setDisable(true);
                    checkIfGameIsOver();
                    aiMove();
                    checkIfGameIsOver();
                    break;}

            default:
                System.out.println("Error");
        }
    }
   private  void resetButton(Button button){
        button.setDisable(false);
        button.setText("");

    }
   private void disableButton(Button button){
        button.setDisable(true);

    }

    private void setupButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(button);
            button.setDisable(true);

            checkIfGameIsOver();
            aiMove();
            checkIfGameIsOver();

        });
    }
    private void setPlayerSymbol(Button button){
        button.setText("X");
    }
    private void aiMove() {
        Random rng = new Random();


        int aiType = rng.nextInt(1, 9);
        System.out.println("Ai: " + aiType);

        switch (aiType) {
            case 1:
                if (button1.getText().isEmpty() && button1.isDisabled() == false) {
                    button1.setText("O");
                    button1.setDisable(true);

                    break;
                } else {

                }
            case 2:
                if (button2.getText().isEmpty() && button2.isDisabled() == false) {
                    button2.setText("O");
                    button2.setDisable(true);

                    break;
                } else {

                }

            case 3:
                if (button3.getText().isEmpty() && button3.isDisabled() == false) {
                    button3.setText("O");
                    button3.setDisable(true);

                    break;
                } else {

                }
            case 4:
                if (button4.getText().isEmpty() && button4.isDisabled() == false) {
                    button4.setText("O");
                    button4.setDisable(true);

                    break;
                } else {

                }
            case 5:
                if (button5.getText().isEmpty() && button5.isDisabled() == false) {
                    button5.setText("O");
                    button5.setDisable(true);

                    break;
                } else {

                }

            case 6:
                if (button6.getText().isEmpty() && button6.isDisabled() == false) {
                    button6.setText("O");
                    button6.setDisable(true);

                    break;
                } else {

                }

            case 7:
                if (button7.getText().isEmpty() && button7.isDisabled() == false) {
                    button7.setText("O");
                    button7.setDisable(true);

                    break;
                } else {

                }

            case 8:
                if (button8.getText().isEmpty() && button8.isDisabled() == false) {
                    button8.setText("O");
                    button8.setDisable(true);

                    break;
                } else {

                }

            case 9:
                if (button9.getText().isEmpty() && button9.isDisabled() == false) {
                    button9.setText("O");
                    button9.setDisable(true);

                    break;
                } else {

                }
            default:
                if (button1.getText().isEmpty() && button1.isDisabled() == false) {
                    button1.setText("O");
                    button1.setDisable(true);
                    break;

                } else if (button2.getText().isEmpty() && button2.isDisabled() == false) {
                    button2.setText("O");
                    button2.setDisable(true);
                    break;
                } else if (button3.getText().isEmpty() && button3.isDisabled() == false) {
                    button3.setText("O");
                    button3.setDisable(true);
                    break;

                } else if (button4.getText().isEmpty() && button4.isDisabled() == false) {
                    button4.setText("O");
                    button4.setDisable(true);
                    break;
                } else if (button5.getText().isEmpty() && button5.isDisabled() == false) {
                    button5.setText("O");
                    button5.setDisable(true);
                    break;
                }
        }
    }
    private void checkIfGameIsOver(){
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> button1.getText() + button2.getText() + button3.getText();
                case 1 -> button4.getText() + button5.getText() + button6.getText();
                case 2 -> button7.getText() + button8.getText() + button9.getText();
                case 3 -> button1.getText() + button5.getText() + button9.getText();
                case 4 -> button3.getText() + button5.getText() + button7.getText();
                case 5 -> button1.getText() + button4.getText() + button7.getText();
                case 6 -> button2.getText() + button5.getText() + button8.getText();
                case 7 -> button3.getText() + button6.getText() + button9.getText();
                default -> null;
            };


            if (line.equals("XXX")) {
                winnerText.setText("You won!");
                buttons.forEach(this::disableButton);


            }


            else if (line.equals("OOO")) {
                winnerText.setText("AI Won!");
                buttons.forEach(this::disableButton);


            }
        }
    }
@FXML
void backMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}


