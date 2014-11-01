/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.pirate;

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
    @FXML
    private Label battleInfo1;
    @FXML
    private Label battleInfo2;
    @FXML
    private Label winnerInfo1;
    @FXML
    private Label winnerInfo2;
    @FXML
    private Button winnerOKB;
    
    private Player player = GameData.getPlayer();
    private int playerMaxHP=2000;
    private int playerHP=2000;
    private int pirateMaxHP=2000;
    private int pirateHP=2000;
    private boolean hit;
    private boolean winnerIsPlayer=false;
    private Random rand = new Random();
    private Stage theStage;
    private Stage fightStage;
    private Stage winnerStage;

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
        playerMaxHP=1000 + 200*player.getEngineer();
        playerHP=playerMaxHP;
        winnerIsPlayer=false;
        enemyHP.setText(Integer.toString(pirateHP)+"/"+Integer.toString(pirateMaxHP));
        myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setWinnerStage(Stage theWinnerStage,boolean playerWin) {
        this.winnerStage = theWinnerStage;
        winnerIsPlayer=playerWin;
        if (playerWin) winnerInfo1.setText("You Win");
        else {
            winnerInfo1.setText("Your ship has been destroyed.");
            winnerInfo2.setText("Game Over");
        }
        winnerStage.initStyle(StageStyle.UNDECORATED);
        winnerStage.initModality(Modality.APPLICATION_MODAL);
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
                if (rand.nextInt(10)<player.getFighter()/3) hit=true; 
                else hit=false;
                if (hit) {
                    if (pirateHP>=500) pirateHP-=500;
                    else pirateHP=0;
                    enemyHP.setText(Integer.toString(pirateHP)+"/"+Integer.toString(pirateMaxHP));
                    battleInfo1.setText("Player hits Police and deals 500 damage.");
                } else {battleInfo1.setText("Player attacks Police but does not hit.");}
                hit=rand.nextBoolean();
                if (hit) {
                    if (playerHP>=500) playerHP-=500;
                    else playerHP=0;
                    myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
                    battleInfo2.setText("Police hits Player and deals 500 damage.");
                } else {battleInfo2.setText("Police attacks Plyaer but does not hit.");}
            } else if (playerHP>0) {
                winnerIsPlayer=true;
                fightStage.close();
                showWinner();
            } else {
                fightStage.close();
                showWinner();
            }
    }
    
    @FXML
    private void winnerOKBAction(ActionEvent event) {
        if(winnerIsPlayer) {
            winnerStage.close();
            spacefx.randomEvent.TravellingController.running=true;
        }
        else System.exit(0);
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
    
    private void showWinner() {
        try {
            FXMLLoader localWinnerLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/pirate/FightWinner.fxml"));
            AnchorPane localWinnerPage = (AnchorPane) localWinnerLoader.load();
            Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Pirate Fight");
            Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            PirateEncController pirateController = localWinnerLoader.getController();
            pirateController.setWinnerStage(localWinnerStage,winnerIsPlayer);
            localWinnerStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
