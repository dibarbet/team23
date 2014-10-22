/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Guybo
 */
public class TravelController implements Initializable {
    @FXML
    private Label curSolarName;
    @FXML
    private Label curSolarTech;
    @FXML
    private Label curSolarResource;
    @FXML
    private Label curSolarGov;
    @FXML
    private Label curSolarLoc;
    @FXML
    private Button button;
    
    private Stage theStage;
    
    SolarSystem solar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setTheStage(Stage theStage, SolarSystem solar) {
        this.solar = solar;
        curSolarName.setText(solar.getSolarName());
        curSolarTech.setText(solar.getTechString());
        curSolarResource.setText(solar.getResourceString());
        curSolarGov.setText(solar.getGovString());
        curSolarLoc.setText(Integer.toString(solar.getX()) + ", "
                + Integer.toString(solar.getY()));
        this.theStage = theStage;
    }

    @FXML
    private void buyErrOKBAction(ActionEvent event) {
        this.theStage.close();
    }
    
    @FXML
    private void buttonPressed(){
        
    }
    
}