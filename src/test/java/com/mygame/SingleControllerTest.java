package com.mygame;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SingleControllerTest {

    @Test
    void testcheckIfGameIsOver() {
      /*  FXMLLoader loader = new FXMLLoader(this.getClass().getResource("3x3B.fxml"));
        Pane pane= null;
        try {
            pane=loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SingleController singleController = loader.getController();
        ArrayList<Button> mybutton = singleController.getList();
        mybutton.forEach(name->changeToX(name));

        String result = mybutton.get(1).getText()+mybutton.get(2).getText()+mybutton.get(3).getText();

        String expectX = "XXX";


        assertEquals(expectX,result);

*/
    }



    public void changeToX(Button b){
        b.setText("X");
}
public void changeToO(Button b){
        b.setText("O");
    }

}