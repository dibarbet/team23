/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.shipyarderr;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class SellErrController implements Initializable {
    @FXML
    private Button sellErrOKB;
    private Stage theStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setTheStage(Stage theStage) {
        this.theStage = theStage;
    }
    
    @FXML
    private void sellErrOKBAction(ActionEvent event) {
        this.theStage.close();
    }
    
}
