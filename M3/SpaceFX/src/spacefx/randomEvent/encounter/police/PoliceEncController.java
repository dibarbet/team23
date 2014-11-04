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
import spacefx.Ship;
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
    private int policeMaxHP=3000;
    private int policeHP=3000;
    private int bribeMoney;
    private boolean hit;
    private boolean winnerIsPlayer=false;
    private Random rand = new Random();
    private Stage theStage;
    private Stage bribeStage;
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
        policeEncInfo.setText("Police is checking your cargo.");
        policeGlobalData.setSitu("checking cargo");
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
        playerMaxHP=1000 + 200*player.getEngineer();
        playerHP=playerMaxHP;
        winnerIsPlayer=false;
        enemyHP.setText(Integer.toString(policeHP)+"/"+Integer.toString(policeMaxHP));
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
    private void policeFightBAction(ActionEvent event) {
        this.theStage.close();
        policeGlobalData.setSitu("initial");
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
                policeEncInfo.setText("Police: I didn't see anything");
                policeEscapeB.setText("Leave");
                policeEscapeB.setDisable(false);
            } else if (policeGlobalData.getSitu().equals("bribe cancelled")) {
                policeFightB.setDisable(false);
                policeEscapeB.setDisable(false);
            } else if ((policeGlobalData.getSitu().equals("checking cargo"))) {
                policeEncInfo.setText(fineInfo(GameData.getShip()));
                policeOKB.setDisable(true);
                policeEscapeB.setText("Leave");
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
            if (policeHP>0 && playerHP>0) {
                if (rand.nextInt(10)<player.getFighter()/3) hit=true; 
                else hit=false;
                if (hit) {
                    if (policeHP>=500) policeHP-=500;
                    else policeHP=0;
                    enemyHP.setText(Integer.toString(policeHP)+"/"+Integer.toString(policeMaxHP));
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
    private void winnerOKBAction(ActionEvent event) {
        if(winnerIsPlayer) {
            winnerStage.close();
            spacefx.randomEvent.TravellingController.running=true;
        }
        else System.exit(0);
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
    
    private void showWinner() {
        try {
            FXMLLoader localWinnerLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/pirate/FightWinner.fxml"));
            AnchorPane localWinnerPage = (AnchorPane) localWinnerLoader.load();
            Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Police Fight");
            Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            PirateEncController pirateController = localWinnerLoader.getController();
            pirateController.setWinnerStage(localWinnerStage,winnerIsPlayer);
            localWinnerStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private String fineInfo(Ship ship) {
        String result = "";
        if(ship.getFirearm()>0 && ship.getNarcotic()>0) {
            result = "Plice found illegal good " + ship.getFirearm() + " firearms \nand " + ship.getNarcotic()  
                    + " narcotics in your ship \nand took them away. You got a ticket \nand paid " 
                    + Integer.toString(ship.getFirearm()*300+ship.getNarcotic()*200)
                    + " for it";
            ship.setFirearm(0);
            ship.setNarcotic(0);
            GameData.setShip(ship);
        } else if (ship.getFirearm()>0) {
            result = "Plice found illegal good " + ship.getFirearm() + " firearms " 
                    + "\nin your ship and took them away. \nYou got a ticket and paid " 
                    + Integer.toString(ship.getFirearm()*300) + " for it";
            ship.setFirearm(0);
            GameData.setShip(ship);
        } else if (ship.getNarcotic()>0) {
            result = "Plice found illegal good " + ship.getNarcotic()  
                    + " narcotics \nin your ship and took them away. \nYou got a ticket and paid " 
                    + Integer.toString(ship.getNarcotic()*200)
                    + " for it";
            ship.setNarcotic(0);
            GameData.setShip(ship);
        } else {
            result = "Police did not find any illegal good \nin your ship, your are good to go.";
        }
        return result;
    }
}
