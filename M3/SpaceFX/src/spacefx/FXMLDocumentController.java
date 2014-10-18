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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import spacefx.newgame.EmptyNameErrController;
import spacefx.newgame.NewGameWinController;

/**
 *
 * @author David
 */
public class FXMLDocumentController implements Initializable {
    // <editor-fold defaultstate="collapsed" desc="Variable Declarition">
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
    private Button sWaterB;
    @FXML
    private Button sFursB;
    @FXML
    private Button sFoodB;
    @FXML
    private Button sOreB;
    @FXML
    private Button sGamesB;
    @FXML
    private Button sFirearmsB;
    @FXML
    private Button sMedicineB;
    @FXML
    private Button sMachinesB;
    @FXML
    private Button sNarcotics;
    @FXML
    private Button sRobotsB;
    @FXML
    private Button bWaterB;
    @FXML
    private Button bFursB;
    @FXML
    private Button bFoodB;
    @FXML
    private Button bOreB;
    @FXML
    private Button bGamesB;
    @FXML
    private Button bFirearmsB; 
    @FXML
    private Button bMedicineB;
    @FXML
    private Button bMachinesB;
    @FXML
    private Button bNarcoticsB;
    @FXML
    private Button bRobotsB;
    
    // </editor-fold>
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
        market.setMoney(player.getCredit());
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

    @FXML
    private void sWaterBAction(ActionEvent event) {
        int money = market.sellWater();
        if (money>=0) {
            waterCargo.setText(Integer.toString(market.nwater));
            planetWater.setText(Integer.toString(market.mwater));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bWaterBAction(ActionEvent event) {
        int money = market.buyWater();
        if (money>=0) {
            waterCargo.setText(Integer.toString(market.nwater));
            planetWater.setText(Integer.toString(market.mwater));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sFursBAction(ActionEvent event) {
        int money = market.sellFur();
        if (money>=0) {
            furCargo.setText(Integer.toString(market.nfurs));
            planetFur.setText(Integer.toString(market.mfurs));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bFursBAction(ActionEvent event) {
        int money = market.buyFur();
        if (money>=0) {
            furCargo.setText(Integer.toString(market.nfurs));
            planetFur.setText(Integer.toString(market.mfurs));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sFoodBAction(ActionEvent event) {
        int money = market.sellFood();
        if (money>=0) {
            foodCargo.setText(Integer.toString(market.nfood));
            planetFood.setText(Integer.toString(market.mfood));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bFoodBAction(ActionEvent event) {
        int money = market.buyFood();
        if (money>=0) {
            foodCargo.setText(Integer.toString(market.nfood));
            planetFood.setText(Integer.toString(market.mfood));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sOreBAction(ActionEvent event) {
        int money = market.sellOre();
        if (money>=0) {
            oreCargo.setText(Integer.toString(market.nore));
            planetOre.setText(Integer.toString(market.more));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bOreBAction(ActionEvent event) {
        int money = market.buyOre();
        if (money>=0) {
            oreCargo.setText(Integer.toString(market.nore));
            planetOre.setText(Integer.toString(market.more));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sGamesBAction(ActionEvent event) {
        int money = market.sellGame();
        if (money>=0) {
            gameCargo.setText(Integer.toString(market.ngames));
            planetGame.setText(Integer.toString(market.mgames));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bGamesBAction(ActionEvent event) {
        int money = market.buyGame();
        if (money>=0) {
            gameCargo.setText(Integer.toString(market.ngames));
            planetGame.setText(Integer.toString(market.mgames));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sFirearmsBAction(ActionEvent event) {
        int money = market.sellFirearm();
        if (money>=0) {
            fireCargo.setText(Integer.toString(market.nfirearms));
            planetFire.setText(Integer.toString(market.mfirearms));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bFirearmsBAction(ActionEvent event) {
        int money = market.buyFirearm();
        if (money>=0) {
            fireCargo.setText(Integer.toString(market.nfirearms));
            planetFire.setText(Integer.toString(market.mfirearms));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sMedicineBAction(ActionEvent event) {
        int money = market.sellMedicine();
        if (money>=0) {
            medCargo.setText(Integer.toString(market.nmedicine));
            planetMed.setText(Integer.toString(market.mmedicine));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bMedicineBAction(ActionEvent event) {
        int money = market.buyMedicine();
        if (money>=0) {
            medCargo.setText(Integer.toString(market.nmedicine));
            planetMed.setText(Integer.toString(market.mmedicine));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sMachinesBAction(ActionEvent event) {
        int money = market.sellMachine();
        if (money>=0) {
            machCargo.setText(Integer.toString(market.nmachines));
            planetMach.setText(Integer.toString(market.mmachines));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bMachinesBAction(ActionEvent event) {
        int money = market.buyMachine();
        if (money>=0) {
            machCargo.setText(Integer.toString(market.nmachines));
            planetMach.setText(Integer.toString(market.mmachines));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sNarcoticsBAction(ActionEvent event) {
        int money = market.sellNarcotic();
        if (money>=0) {
            narcCargo.setText(Integer.toString(market.nnarcotics));
            planetNarc.setText(Integer.toString(market.mnarcotics));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bNarcoticsBAction(ActionEvent event) {
        int money = market.buyNarcotic();
        if (money>=0) {
            narcCargo.setText(Integer.toString(market.nnarcotics));
            planetNarc.setText(Integer.toString(market.mnarcotics));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void sRobotsBAction(ActionEvent event) {
        int money = market.sellRobot();
        if (money>=0) {
            robCargo.setText(Integer.toString(market.nrobots));
            planetRob.setText(Integer.toString(market.mrobots));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    @FXML
    private void bRobotsBAction(ActionEvent event) {
        int money = market.buyRobot();
        if (money>=0) {
            robCargo.setText(Integer.toString(market.nrobots));
            planetRob.setText(Integer.toString(market.mrobots));
            player.credit = money;
            updatePlayer();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            System.out.println("erroe");
            //showBErr();
        }
    }
    
    private void showBErr() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("BuyErr.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            BuyErrController controller = loader.getController();
            controller.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void showSErr() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("SellErr.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            SellErrController controller = loader.getController();
            controller.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void updatePlayer() {
        GameData.setPlayer(player);
    }
}
