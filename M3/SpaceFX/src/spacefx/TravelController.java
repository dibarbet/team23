/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import spacefx.newgame.NewGameWinController;
import spacefx.randomEvent.TravellingController;

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
    SolarSystem currSolar=GameData.getCurrSolarSys();
    Ship ship = GameData.getShip();
    double dist;
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
        ship = GameData.getShip();
        if (ship.travel(solar)) {
            try {
                dist = Universe.distance(currSolar, solar);
                GameData.setCurrSolarSys(solar);
                FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/Travelling.fxml"));
                AnchorPane newPage = (AnchorPane) loader.load();
                Stage newGameStage = new Stage();
                newGameStage.setTitle("Travelling");
                Scene scene = new Scene(newPage);
                newGameStage.setScene(scene);
                TravellingController controller = loader.getController();
                controller.setTheStage(newGameStage,dist); 
                newGameStage.showAndWait();
                FXMLDocumentController.planetChanged = true;
                this.theStage.close();
            } catch (IOException ex) {
                Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("travelError.fxml"));
                AnchorPane newPage = (AnchorPane) loader.load();
                Stage newGameStage = new Stage();
                newGameStage.setTitle("Travel Error");
                Scene scene = new Scene(newPage);
                newGameStage.setScene(scene);
                TravelErrorController controller = loader.getController();
                controller.setTheStage(newGameStage); 
                newGameStage.showAndWait();
                FXMLDocumentController.planetChanged = false;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        
    }
    
}