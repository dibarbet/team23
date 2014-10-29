/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.trader;

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

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class TraderEncController implements Initializable {
    // <editor-fold defaultstate="collapsed" desc="Variables Declariation">
    @FXML
    private Button traderAttB;
    @FXML
    private Label traderEncInfo;
    @FXML
    private Button traderLeaveB;
    @FXML
    private Button traderTraB;
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
    private Label narcoticPlayer;
    @FXML
    private Button sNarcoticsB;
    @FXML
    private Label narcoticPrice;
    @FXML
    private Label narcoticTrader;
    @FXML
    private Button bNarcoticsB;
    @FXML
    private Button bRobotsB;
    @FXML
    private Label robotTrader;
    @FXML
    private Label robotPrice;
    @FXML
    private Button sRobotsB;
    @FXML
    private Label robotPlayer;
    @FXML
    private Label gamePlayer;
    @FXML
    private Button sGamesB;
    @FXML
    private Label gamePrice;
    @FXML
    private Label gameTrader;
    @FXML
    private Button bGamesB;
    @FXML
    private Button bFirearmsB;
    @FXML
    private Label firearmTrader;
    @FXML
    private Label firePrice;
    @FXML
    private Button sFirearmsB;
    @FXML
    private Label firearmPlayer;
    @FXML
    private Label machinePlayer;
    @FXML
    private Button sMachinesB;
    @FXML
    private Label machinePrice;
    @FXML
    private Label machineTrader;
    @FXML
    private Button bMachinesB;
    @FXML
    private Button bMedicineB;
    @FXML
    private Label medicineTrader;
    @FXML
    private Label medicinePrice;
    @FXML
    private Button sMedicineB;
    @FXML
    private Label medicinePlayer;
    @FXML
    private Label foodPlayer;
    @FXML
    private Button sFoodB;
    @FXML
    private Label foodPrice;
    @FXML
    private Label foodTrader;
    @FXML
    private Button bFoodB;
    @FXML
    private Button bOreB;
    @FXML
    private Label oreTrader;
    @FXML
    private Label orePrice;
    @FXML
    private Button sOreB;
    @FXML
    private Label orePlayer;
    @FXML
    private Label furPlayer;
    @FXML
    private Button sFursB;
    @FXML
    private Label furprice;
    @FXML
    private Label furTrader;
    @FXML
    private Button bFursB;
    @FXML
    private Label playerMoney;
    @FXML
    private Button bWaterB;
    @FXML
    private Label waterTrader;
    @FXML
    private Label waterPice;
    @FXML
    private Button sWaterB;
    @FXML
    private Label waterPlayer;
    @FXML
    private Button stopTradingB;
    
    // </editor-fold>
    
    private int playerMaxHP=2000;
    private int playerHP=2000;
    private int traderMaxHP=2000;
    private int traderHP=2000;
    private Stage theStage;
    private Stage tradingStage;
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
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setFightStage(Stage theStage) {
        this.fightStage = theStage;
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setTradingStage(Stage theStage) {
        this.tradingStage = theStage;
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    @FXML
    private void traderAttBAction(ActionEvent event) {
        this.theStage.close();
        showFight();
    }

    @FXML
    private void traderLeaveBAction(ActionEvent event) {
        this.theStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }
    
    @FXML
    private void leaveTrading(ActionEvent event) {
        tradingStage.close();
    }

    @FXML
    private void traderTraBAction(ActionEvent event) {
        showTrading();
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
        if (traderHP>0 && playerHP>0) {
                if (traderHP>=500) traderHP-=500;
                else traderHP=0;
                enemyHP.setText(Integer.toString(traderHP)+"/"+Integer.toString(traderMaxHP));
                myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
            } else if (traderHP>0) {
                System.out.println("Pirate Wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            } else {
                System.out.println("Player wins");
                this.fightStage.close();
                spacefx.randomEvent.TravellingController.running=true;
            }
    }
    
    // <editor-fold defaultstate="collapsed" desc="trading Part">
    @FXML
    private void sNarcoticsBAction(ActionEvent event) {
    }

    @FXML
    private void bNarcoticsBAction(ActionEvent event) {
    }

    @FXML
    private void bRobotsBAction(ActionEvent event) {
    }

    @FXML
    private void sRobotsBAction(ActionEvent event) {
    }

    @FXML
    private void sGamesBAction(ActionEvent event) {
    }

    @FXML
    private void bGamesBAction(ActionEvent event) {
    }

    @FXML
    private void bFirearmsBAction(ActionEvent event) {
    }

    @FXML
    private void sFirearmsBAction(ActionEvent event) {
    }

    @FXML
    private void sMachinesBAction(ActionEvent event) {
    }

    @FXML
    private void bMachinesBAction(ActionEvent event) {
    }

    @FXML
    private void bMedicineBAction(ActionEvent event) {
    }

    @FXML
    private void sMedicineBAction(ActionEvent event) {
    }

    @FXML
    private void sFoodBAction(ActionEvent event) {
    }

    @FXML
    private void bFoodBAction(ActionEvent event) {
    }

    @FXML
    private void bOreBAction(ActionEvent event) {
    }

    @FXML
    private void sOreBAction(ActionEvent event) {
    }

    @FXML
    private void sFursBAction(ActionEvent event) {
    }

    @FXML
    private void bFursBAction(ActionEvent event) {
    }

    @FXML
    private void bWaterBAction(ActionEvent event) {
    }

    @FXML
    private void sWaterBAction(ActionEvent event) {
    }
    
    @FXML
    private void stopTradingBAction(ActionEvent event) {
        this.tradingStage.close();
        spacefx.randomEvent.TravellingController.running=true;
    }
    
    // </editor-fold>
    
    private void showFight() {
        try {
            FXMLLoader localFightLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/trader/traderFight.fxml"));
            AnchorPane localFightPage = (AnchorPane) localFightLoader.load();
            Stage localFightStage = new Stage();
            localFightStage.setTitle("Trader Fight");
            Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            TraderEncController traderController = localFightLoader.getController();
            traderController.setFightStage(localFightStage);
            localFightStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void showTrading() {
        try {
            FXMLLoader localTradingLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/trader/TradingWithTrader.fxml"));
            AnchorPane localTradingPage = (AnchorPane) localTradingLoader.load();
            Stage localTradingStage = new Stage();
            localTradingStage.setTitle("Trader Fight");
            Scene scene = new Scene(localTradingPage);
            localTradingStage.setScene(scene);
            TraderEncController traderController = localTradingLoader.getController();
            traderController.setTradingStage(localTradingStage);
            localTradingStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
