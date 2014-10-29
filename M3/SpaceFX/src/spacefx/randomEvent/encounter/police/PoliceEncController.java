/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.police;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
import spacefx.GameData;
import spacefx.Player;
import spacefx.SpaceFX;
import spacefx.randomEvent.encounter.pirate.PirateEncController;

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class PoliceEncController implements Initializable {
    @FXML
    private Button policeFightB;
    @FXML
    private Button policeEscapeB;
    @FXML
    private Label policeEncInfo;
    @FXML
    private Button policeBribeB;
    @FXML
    private Button policeOKB;
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
    @FXML
    private Button bribeOKB;
    @FXML
    private Button bribeCancelB;
    @FXML
    private Label bribeAmount;
    
    private Player player = GameData.getPlayer();
    private int playerMaxHP=2000;
    private int playerHP=2000;
    private int policeMaxHP=2000;
    private int policeHP=2000;
    private int bribeMoney;
    private Random rand = new Random();
    private Stage theStage;
    private Stage bribeStage;
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
        policeOKB.setDisable(true);
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setBribeStage(Stage theStage) {
        this.bribeStage = theStage;
        bribeStage.initStyle(StageStyle.UNDECORATED);
        bribeStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setFightStage(Stage theStage) {
        this.fightStage = theStage;
        surB.setDisable(true);
        escB.setDisable(true);
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    @FXML
    private void policeFightBAction(ActionEvent event) {
        this.theStage.close();
        policeGlobalData.setSitu("fight start");
        showFight();
    }

    @FXML
    private void policeEscapeBAction(ActionEvent event) {
        this.theStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }

    @FXML
    private void policeBribeBAction(ActionEvent event) {
        policeGlobalData.setSitu("bribing");
        policeOKB.setText("Next");
        policeOKB.setDisable(false);
        policeBribeB.setDisable(true);
        policeFightB.setDisable(true);
        policeEscapeB.setDisable(true);
        showBribe();
    }

    @FXML
    private void policeOKBAction(ActionEvent event) {
            if (policeGlobalData.getSitu().equals("bribed")) {
                policeFightB.setDisable(false);
                policeEscapeB.setDisable(false);
            } else if (policeGlobalData.getSitu().equals("bribe cancelled")) {
                policeBribeB.setDisable(false);
                policeFightB.setDisable(false);
                policeEscapeB.setDisable(false);
            }
            policeOKB.setDisable(true);
    }
    
    @FXML
    private void escBAction(ActionEvent event) {
        this.fightStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }

    @FXML
    private void surBAction(ActionEvent event) {
    }

    @FXML
    private void attBAction(ActionEvent event) {
        if (policeGlobalData.getSitu().equals("fight start")) {
            surB.setDisable(false);
            escB.setDisable(false);
            policeGlobalData.setSitu("fighting");
        } else {
            if (policeHP>0 && playerHP>0) {
                if (policeHP>=500) policeHP-=500;
                else policeHP=0;
                enemyHP.setText(Integer.toString(policeHP)+"/"+Integer.toString(policeMaxHP));
                myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
            } else if (policeHP>0) {
                System.out.println("Police Wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            } else {
                System.out.println("Player wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            }
        }
    }
    
    @FXML
    private void bribeOKBAction(ActionEvent event) {
        System.out.println(policeGlobalData.getSitu());
        if (policeGlobalData.getSitu().equals("bribing")) {
            bribeMoney = 500+rand.nextInt(500);
            bribeAmount.setText("You are going to bribe police $" + Integer.toString(bribeMoney));
            bribeOKB.setText("OK");
            bribeCancelB.setText("Cancel");
            policeGlobalData.setSitu("bribe amount shown");
        } else if (policeGlobalData.getSitu().equals("bribe amount shown")){
            policeGlobalData.setSitu("bribed");
            player.loseCredit(bribeMoney);
            GameData.setPlayer(player);
            bribeStage.close();
        }
    }

    @FXML
    private void bribeCancelBAction(ActionEvent event) {
        policeGlobalData.setSitu("bribe cancelled");
        this.bribeStage.close();
    }
    
    
    private void showBribe() {
        try {
            FXMLLoader localBribeLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/police/BribePolice.fxml"));
            AnchorPane localBribePage = (AnchorPane) localBribeLoader.load();
            Stage localBribeStage = new Stage();
            localBribeStage.setTitle("Bribe Police");
            Scene scene = new Scene(localBribePage);
            localBribeStage.setScene(scene);
            PoliceEncController policeController = localBribeLoader.getController();
            policeController.setBribeStage(localBribeStage);
            localBribeStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        
    }
    
    private void showFight() {
        try {
            FXMLLoader localFightLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/police/policeFight.fxml"));
            AnchorPane localFightPage = (AnchorPane) localFightLoader.load();
            Stage localFightStage = new Stage();
            localFightStage.setTitle("Police Fight");
            Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            PoliceEncController policeController = localFightLoader.getController();
            policeController.setFightStage(localFightStage);
            localFightStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
