/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.newgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class.
 *
 * @author YaxiongLiu
 */
public class UnallocPointsErrController implements Initializable {
    @FXML
    private Button unallocPButton;
    private Stage theStage;

    /**
     * Initializes the controller class.
     * @param url a URL
     * @param resourceb a ResourceBundle
     */
    @Override
    public void initialize(final URL url, final ResourceBundle resourceb) {
        // TODO
    }
    /**
     * Setter for the stage.
     * @param stage stage to be set.
     */
    public final void setTheStage(final Stage stage) {
        theStage = stage;
    }

    @FXML
    private void handleUnallocPointErrButtonAction(final ActionEvent event) {
        this.theStage.close();
    }
}
