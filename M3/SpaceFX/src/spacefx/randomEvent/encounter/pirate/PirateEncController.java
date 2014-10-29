/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.pirate;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import spacefx.SpaceFX;
import spacefx.randomEvent.encounter.police.PoliceEncController;
import spacefx.randomEvent.encounter.police.policeGlobalData;

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class PirateEncController implements Initializable {
    @FXML
    private Button pirateOKB;
    @FXML
    private Label pirateEncInfo;
    @FXML
    private Button pirateEscapeB;
    @FXML
    private Button pirateFightB;
    @FXML
    private Label myHP;
    @FXML
    private Label enemyHP;
    @FXML
    private Button escB;
    @FXML
    private Button surB;
    @FXML
    private Button attB;
    
    private int playerMaxHP=2000;
    private int playerHP=2000;
    private int pirateMaxHP=2000;
    private int pirateHP=2000;
    private Stage theStage;
    private Stage fightStage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setTheStage(Stage theStage) {
        this.theStage = theStage;
        pirateOKB.setDisable(true);
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setFightStage(Stage theFightStage) {
        this.fightStage = theFightStage;
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }

    @FXML
    private void pirateOKBAction(ActionEvent event) {
        this.theStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }

    @FXML
    private void pirateEscapeBAction(ActionEvent event) {
        this.theStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }

    @FXML
    private void pirateFightBAction(ActionEvent event) {
        theStage.close();
        showFight();
    }
    
    @FXML
    private void escBAction(ActionEvent event) {
        fightStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }

    @FXML
    private void surBAction(ActionEvent event) {
    }

    @FXML
    private void attBAction(ActionEvent event) {
            if (pirateHP>0 && playerHP>0) {
                if (pirateHP>=500) pirateHP-=500;
                else pirateHP=0;
                enemyHP.setText(Integer.toString(pirateHP)+"/"+Integer.toString(pirateMaxHP));
                myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
            } else if (pirateHP>0) {
                System.out.println("Pirate Wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            } else {
                System.out.println("Player wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            }
    }
    
    private void showFight(){
        try {
            FXMLLoader localFightLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/pirate/pirateFight.fxml"));
            AnchorPane localFightPage = (AnchorPane) localFightLoader.load();
            Stage localFightStage = new Stage();
            localFightStage.setTitle("Pirate Fight");
            Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            PirateEncController pirateController = localFightLoader.getController();
            pirateController.setFightStage(localFightStage);
            localFightStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
