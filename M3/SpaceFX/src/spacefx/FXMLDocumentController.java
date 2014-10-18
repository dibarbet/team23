/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import spacefx.newgame.NewGameWinController;

/**
 *
 * @author David
 */
public class FXMLDocumentController implements Initializable {
    private SolarSystem currentSolarSystem;
    private Universe universe;
    private Player player;
    private Market market;
    private Ship ship;
    private boolean gameCreated;

    @FXML
    private MenuItem newGame;
    @FXML
    private Tab marketPlace;
    @FXML
    private Tab map;
    @FXML
    private Tab curSolar;
    @FXML
    private Label marketMoney;
    @FXML
    private Label waterCargo;
    @FXML
    private Label furCargo;
    @FXML
    private Label foodCargo;
    @FXML
    private Label oreCargo;
    @FXML
    private Label gameCargo;
    @FXML
    private Label fireCargo;
    @FXML
    private Label medCargo;
    @FXML
    private Label machCargo;
    @FXML
    private Label narcCargo;
    @FXML
    private Label robCargo;
    @FXML
    private Label pWater;
    @FXML
    private Label pFur;
    @FXML
    private Label pFood;
    @FXML
    private Label pOre;
    @FXML
    private Label pGame;
    @FXML
    private Label pFire;
    @FXML
    private Label pMed;
    @FXML
    private Label pMach;
    @FXML
    private Label pNarc;
    @FXML
    private Label pRob;
    @FXML
    private Label planetWater;
    @FXML
    private Label planetFur;
    @FXML
    private Label planetFood;
    @FXML
    private Label planetOre;
    @FXML
    private Label planetGame;
    @FXML
    private Label planetFire;
    @FXML
    private Label planetMed;
    @FXML
    private Label planetMach;
    @FXML
    private Label planetNarc;
    @FXML
    private Label planetRob;
    @FXML
    private void handleNewGame() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("newgame/newGameWin.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Create new game");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            NewGameWinController controller = loader.getController();
            controller.setTheStage(newGameStage);
            newGameStage.showAndWait();
            player = GameData.getPlayer();
            universe = GameData.getUniverse();
            currentSolarSystem = universe.getCurrentSolarSystem();
            gameCreated = true;
            marketPlace.setDisable(false);
            map.setDisable(false);
            curSolar.setDisable(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    @FXML
    private void refreshMarket() {
        market = currentSolarSystem.getMarket();
        marketMoney.setText(Integer.toString(player.getCredit()));
        waterCargo.setText(Integer.toString(market.nwater));
        furCargo.setText(Integer.toString(market.nfurs));
        foodCargo.setText(Integer.toString(market.nfood));
        oreCargo.setText(Integer.toString(market.nore));
        gameCargo.setText(Integer.toString(market.ngames));
        fireCargo.setText(Integer.toString(market.nfirearms));
        medCargo.setText(Integer.toString(market.nmedicine));
        machCargo.setText(Integer.toString(market.nmachines));
        narcCargo.setText(Integer.toString(market.nnarcotics));
        robCargo.setText(Integer.toString(market.nrobots));
        pWater.setText(Integer.toString(market.pwater));
        pFur.setText(Integer.toString(market.pfurs));
        pFood.setText(Integer.toString(market.pfood));
        pOre.setText(Integer.toString(market.pore));
        pGame.setText(Integer.toString(market.pgames));
        pFire.setText(Integer.toString(market.pfirearms));
        pMed.setText(Integer.toString(market.pmedicine));
        pMach.setText(Integer.toString(market.pmachines));
        pNarc.setText(Integer.toString(market.pnarcotics));
        pRob.setText(Integer.toString(market.probots));
        planetWater.setText(Integer.toString(market.mwater));
        planetFur.setText(Integer.toString(market.mfurs));
        planetFood.setText(Integer.toString(market.mfood));
        planetOre.setText(Integer.toString(market.more));
        planetGame.setText(Integer.toString(market.mgames));
        planetFire.setText(Integer.toString(market.mfirearms));
        planetMed.setText(Integer.toString(market.mmedicine));
        planetMach.setText(Integer.toString(market.mmachines));
        planetNarc.setText(Integer.toString(market.mnarcotics));
        planetRob.setText(Integer.toString(market.mrobots));
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (!gameCreated) {
            marketPlace.setDisable(true);
            map.setDisable(true);
            curSolar.setDisable(true); 
        }
        
    }    
    
}
