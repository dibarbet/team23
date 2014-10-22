/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import spacefx.marketerr.BuyErrController;
import spacefx.marketerr.SellErrController;
import spacefx.newgame.EmptyNameErrController;
import spacefx.newgame.NewGameWinController;
import spacefx.randomEvent.TravellingController;

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
    private boolean gameCreated;
    private Circle current;
    private Circle previous;
    private String fileSave;
    private File loadFile;
    @FXML
    private MenuItem newGame;
    @FXML
    private MenuItem saveGame;
    @FXML
    private MenuItem loadGame;
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
    private Circle Planet1;
    @FXML
    private Circle Planet2;
    @FXML
    private Circle Planet3;
    @FXML
    private Circle Planet4;
    @FXML
    private Circle Planet5;
    @FXML
    private Circle Planet6;
    @FXML
    private Circle Planet7;
    @FXML
    private Circle Planet8;
    @FXML
    private Circle Planet9;
    @FXML
    private Circle Planet10;
    @FXML
    private Circle Planet11;
    @FXML
    private Circle Planet12;
    @FXML
    private Circle Planet13;
    @FXML
    private Circle Planet14;
    @FXML
    private Circle Planet15;
    @FXML
    private Circle Planet16;
    @FXML
    private Circle Planet17;
    @FXML
    private Circle Planet18;
    @FXML
    private Circle Planet19;
    @FXML
    private Circle Planet20;
    @FXML
    private Circle Planet21;
    @FXML
    private Circle Planet22;
    @FXML
    private Circle Planet23;
    @FXML
    private Circle Planet24;
    @FXML
    private Circle Planet25;
    @FXML
    private Circle Planet26;
    @FXML
    private Circle Planet27;
    @FXML
    private Circle Planet28;
    @FXML
    private Circle Planet29;
    @FXML
    private Circle Planet30;
    @FXML
    private Circle Planet31;
    @FXML
    private Circle Planet32;
    @FXML
    private Circle Planet33;
    @FXML
    private Circle Planet34;
    @FXML
    private Circle Planet35;
    @FXML
    private Circle Planet36;
    @FXML
    private Circle Planet37;
    @FXML
    private Circle Planet38;
    @FXML
    private Circle Planet39;
    @FXML
    private Circle Planet40;
    @FXML
    private Circle Planet41;
    @FXML
    private Circle Planet42;
    @FXML
    private Circle Planet43;
    @FXML
    private Circle Planet44;
    @FXML
    private Circle Planet45;
    @FXML
    private Circle Planet46;
    @FXML
    private Circle Planet47;
    @FXML
    private Circle Planet48;
    @FXML
    private Circle Planet49;
    @FXML
    private Circle Planet50;
    @FXML
    private Circle Planet51;
    @FXML
    private Circle Planet52;
    @FXML
    private Circle Planet53;
    @FXML
    private Circle Planet54;
    @FXML
    private Circle Planet55;
    @FXML
    private Circle Planet56;
    @FXML
    private Circle Planet57;
    @FXML
    private Circle Planet58;
    @FXML
    private Circle Planet59;
    @FXML
    private Circle Planet60;
    @FXML
    private Circle Planet61;
    @FXML
    private Circle Planet62;
    @FXML
    private Circle Planet63;
    @FXML
    private Circle Planet64;
    @FXML
    private Circle Planet65;
    @FXML
    private Circle Planet66;
    @FXML
    private Circle Planet67;
    @FXML
    private Circle Planet68;
    @FXML
    private Circle Planet69;
    @FXML
    private Circle Planet70;
    @FXML
    private Circle Planet71;
    @FXML
    private Circle Planet72;
    @FXML
    private Circle Planet73;
    @FXML
    private Circle Planet74;
    @FXML
    private Circle Planet75;
    @FXML
    private Circle Planet76;
    @FXML
    private Circle Planet77;
    @FXML
    private Circle Planet78;
    @FXML
    private Circle Planet79;
    @FXML
    private Circle Planet80;
    @FXML
    private Circle Planet81;
    @FXML
    private Circle Planet82;
    @FXML
    private Circle Planet83;
    @FXML
    private Circle Planet84;
    @FXML
    private Circle Planet85;
    @FXML
    private Circle Planet86;
    @FXML
    private Circle Planet87;
    @FXML
    private Circle Planet88;
    @FXML
    private Circle Planet89;
    @FXML
    private Circle Planet90;
    @FXML
    private Circle Planet91;
    @FXML
    private Circle Planet92;
    @FXML
    private Circle Planet93;
    @FXML
    private Circle Planet94;
    @FXML
    private Circle Planet95;
    @FXML
    private Circle Planet96;
    @FXML
    private Circle Planet97;
    @FXML
    private Circle Planet98;
    @FXML
    private Circle Planet99;
    @FXML
    private Circle Planet100;
    @FXML
    private Circle Planet101;
    @FXML
    private Circle Planet102;
    @FXML
    private Circle Planet103;
    @FXML
    private Circle Planet104;
    @FXML
    private Circle Planet105;
    @FXML
    private Circle Planet106;
    @FXML
    private Circle Planet107;
    @FXML
    private Circle Planet108;
    @FXML
    private Circle Planet109;
    @FXML
    private Circle Planet110;
    @FXML
    private Circle Planet111;
    @FXML
    private Circle Planet112;
    @FXML
    private Circle Planet113;
    @FXML
    private Circle Planet114;
    
    
    // </editor-fold>
    /**
     * Method to handle new game menu option being pressed
     * Creates new window to allow user to create a new game
     */
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
            saveGame.setDisable(false);
            current = Planet1;
            initializeMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    /**
     * Refreshes market when the market tab is selected
     */
    @FXML
    private void refreshMarket() {
        market = currentSolarSystem.getMarket();
        GameData.setMarket(market);
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
    /**
     * Refreshes solar system tab when selected.
     */
    @FXML
    private void refreshSolar() {
        curSolarName.setText(currentSolarSystem.getSolarName());
        curSolarTech.setText(currentSolarSystem.getTechString());
        curSolarResource.setText(currentSolarSystem.getResourceString());
        curSolarGov.setText(currentSolarSystem.getGovString());
        curSolarLoc.setText(Integer.toString(currentSolarSystem.getX()) + ", "
                + Integer.toString(currentSolarSystem.getY()));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (!gameCreated) {
            marketPlace.setDisable(true);
            map.setDisable(true);
            curSolar.setDisable(true);
            saveGame.setDisable(true);
        }
        
    }
    
    @FXML
    private void saveGame() {
        //showSaveWin();
        String saveString = "save.ser";
        FileChooser saveFile = new FileChooser();
        saveFile.setInitialFileName(saveString);
        saveFile.setTitle("Save Game");
        Stage stage = new Stage();
        File savedFile = saveFile.showSaveDialog(stage);
        try {
            OutputStream file = new FileOutputStream(savedFile);
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            output.writeObject(GameData.getClassList());
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
                
    }
    @FXML
    private void loadGame() {
        showLoadWin();
    }
    private void showLoadWin() {
        FileChooser fileChoose = new FileChooser();
        fileChoose.setTitle("Load Game Save");
        Stage stage = new Stage();
        loadFile = fileChoose.showOpenDialog(stage);
        try {
            InputStream file = new FileInputStream(loadFile);
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream(buffer);
            ArrayList<Object> aList = (ArrayList<Object>) input.readObject();
            input.close();
            GameData.setPlayer((Player) aList.get(0));
            GameData.setShip((Ship) aList.get(1));
            GameData.setSolarSystem((SolarSystem) aList.get(4));
            GameData.setUniverse((Universe) aList.get(2));
            GameData.setMarket((Market) aList.get(3));
            player = GameData.getPlayer();
            universe = GameData.getUniverse();
            currentSolarSystem = universe.getCurrentSolarSystem();
            gameCreated = true;
            marketPlace.setDisable(false);
            map.setDisable(false);
            curSolar.setDisable(false);
            saveGame.setDisable(false);
            current = Planet1;
            initializeMap();
            refreshSolar();
            refreshMarket();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
//    private void showSaveWin() {
//        try {
//            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("saveWin.fxml"));
//            AnchorPane newPage = (AnchorPane) loader.load();
//            Stage newGameStage = new Stage();
//            newGameStage.setTitle("Save Game");
//            Scene scene = new Scene(newPage);
//            newGameStage.setScene(scene);
//            SaveWinController saveCont = loader.getController();
//            saveCont.setTheStage(newGameStage);
//            newGameStage.showAndWait();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (GameData.getFileSaveString() != null) {
//            fileSave = GameData.getFileSaveString();
//        }
//    }
    @FXML
    private void planet1Clicked() {
        showTravel(universe.gameUniverse[0]);
    }    
    @FXML
    private void planet2Clicked() {
        showTravel(universe.gameUniverse[1]);
    }    
    @FXML
    private void planet3Clicked() {
        showTravel(universe.gameUniverse[2]);
    }   
    @FXML
    private void planet4Clicked() {
        showTravel(universe.gameUniverse[3]);
    }  
    @FXML
    private void planet5Clicked() {
        showTravel(universe.gameUniverse[4]);
    }
    @FXML
    private void planet6Clicked() {
        showTravel(universe.gameUniverse[5]);
    }
    @FXML
    private void planet7Clicked() {
        showTravel(universe.gameUniverse[6]);
    }
    @FXML
    private void planet8Clicked() {
        showTravel(universe.gameUniverse[7]);
    }
    @FXML
    private void planet9Clicked() {
        showTravel(universe.gameUniverse[8]);
    }   
    @FXML
    private void planet10Clicked() {
        showTravel(universe.gameUniverse[9]);
    }
    @FXML
    private void planet11Clicked() {
        showTravel(universe.gameUniverse[10]);
    }    
    @FXML
    private void planet12Clicked() {
        showTravel(universe.gameUniverse[11]);
    }    
    @FXML
    private void planet13Clicked() {
        showTravel(universe.gameUniverse[12]);
    }   
    @FXML
    private void planet14Clicked() {
        showTravel(universe.gameUniverse[13]);
    }  
    @FXML
    private void planet15Clicked() {
        showTravel(universe.gameUniverse[14]);
    }
    @FXML
    private void planet16Clicked() {
        showTravel(universe.gameUniverse[15]);
    }
    @FXML
    private void planet17Clicked() {
        showTravel(universe.gameUniverse[16]);
    }
    @FXML
    private void planet18Clicked() {
        showTravel(universe.gameUniverse[17]);
    }
    @FXML
    private void planet19Clicked() {
        showTravel(universe.gameUniverse[18]);
    }   
    @FXML
    private void planet20Clicked() {
        showTravel(universe.gameUniverse[19]);
    }
    @FXML
    private void planet21Clicked() {
        showTravel(universe.gameUniverse[20]);
    }    
    @FXML
    private void planet22Clicked() {
        showTravel(universe.gameUniverse[21]);
    }    
    @FXML
    private void planet23Clicked() {
        showTravel(universe.gameUniverse[22]);
    }   
    @FXML
    private void planet24Clicked() {
        showTravel(universe.gameUniverse[23]);
    }  
    @FXML
    private void planet25Clicked() {
        showTravel(universe.gameUniverse[24]);
    }
    @FXML
    private void planet26Clicked() {
        showTravel(universe.gameUniverse[25]);
    }
    @FXML
    private void planet27Clicked() {
        showTravel(universe.gameUniverse[26]);
    }
    @FXML
    private void planet28Clicked() {
        showTravel(universe.gameUniverse[27]);
    }
    @FXML
    private void planet29Clicked() {
        showTravel(universe.gameUniverse[28]);
    }   
    @FXML
    private void planet30Clicked() {
        showTravel(universe.gameUniverse[29]);
    }
    @FXML
    private void planet31Clicked() {
        showTravel(universe.gameUniverse[30]);
    }    
    @FXML
    private void planet32Clicked() {
        showTravel(universe.gameUniverse[31]);
    }    
    @FXML
    private void planet33Clicked() {
        showTravel(universe.gameUniverse[32]);
    }   
    @FXML
    private void planet34Clicked() {
        showTravel(universe.gameUniverse[33]);
    }  
    @FXML
    private void planet35Clicked() {
        showTravel(universe.gameUniverse[34]);
    }
    @FXML
    private void planet36Clicked() {
        showTravel(universe.gameUniverse[35]);
    }
    @FXML
    private void planet37Clicked() {
        showTravel(universe.gameUniverse[36]);
    }
    @FXML
    private void planet38Clicked() {
        showTravel(universe.gameUniverse[37]);
    }
    @FXML
    private void planet39Clicked() {
        showTravel(universe.gameUniverse[38]);
    }   
    @FXML
    private void planet40Clicked() {
        showTravel(universe.gameUniverse[39]);
    }
    @FXML
    private void planet41Clicked() {
        showTravel(universe.gameUniverse[40]);
    }    
    @FXML
    private void planet42Clicked() {
        showTravel(universe.gameUniverse[41]);
    }    
    @FXML
    private void planet43Clicked() {
        showTravel(universe.gameUniverse[42]);
    }   
    @FXML
    private void planet44Clicked() {
        showTravel(universe.gameUniverse[43]);
    }  
    @FXML
    private void planet45Clicked() {
        showTravel(universe.gameUniverse[44]);
    }
    @FXML
    private void planet46Clicked() {
        showTravel(universe.gameUniverse[45]);
    }
    @FXML
    private void planet47Clicked() {
        showTravel(universe.gameUniverse[46]);
    }
    @FXML
    private void planet48Clicked() {
        showTravel(universe.gameUniverse[47]);
    }
    @FXML
    private void planet49Clicked() {
        showTravel(universe.gameUniverse[48]);
    }   
    @FXML
    private void planet50Clicked() {
        showTravel(universe.gameUniverse[49]);
    }
    @FXML
    private void planet51Clicked() {
        showTravel(universe.gameUniverse[50]);
    }    
    @FXML
    private void planet52Clicked() {
        showTravel(universe.gameUniverse[51]);
    }    
    @FXML
    private void planet53Clicked() {
        showTravel(universe.gameUniverse[52]);
    }   
    @FXML
    private void planet54Clicked() {
        showTravel(universe.gameUniverse[53]);
    }  
    @FXML
    private void planet55Clicked() {
        showTravel(universe.gameUniverse[54]);
    }
    @FXML
    private void planet56Clicked() {
        showTravel(universe.gameUniverse[55]);
    }
    @FXML
    private void planet57Clicked() {
        showTravel(universe.gameUniverse[56]);
    }
    @FXML
    private void planet58Clicked() {
        showTravel(universe.gameUniverse[57]);
    }
    @FXML
    private void planet59Clicked() {
        showTravel(universe.gameUniverse[58]);
    }   
    @FXML
    private void planet60Clicked() {
        showTravel(universe.gameUniverse[59]);
    }
    @FXML
    private void planet61Clicked() {
        showTravel(universe.gameUniverse[60]);
    }    
    @FXML
    private void planet62Clicked() {
        showTravel(universe.gameUniverse[61]);
    }    
    @FXML
    private void planet63Clicked() {
        showTravel(universe.gameUniverse[62]);
    }   
    @FXML
    private void planet64Clicked() {
        showTravel(universe.gameUniverse[63]);
    }  
    @FXML
    private void planet65Clicked() {
        showTravel(universe.gameUniverse[64]);
    }
    @FXML
    private void planet66Clicked() {
        showTravel(universe.gameUniverse[65]);
    }
    @FXML
    private void planet67Clicked() {
        showTravel(universe.gameUniverse[66]);
    }
    @FXML
    private void planet68Clicked() {
        showTravel(universe.gameUniverse[67]);
    }
    @FXML
    private void planet69Clicked() {
        showTravel(universe.gameUniverse[68]);
    }   
    @FXML
    private void planet70Clicked() {
        showTravel(universe.gameUniverse[69]);
    }
    @FXML
    private void planet71Clicked() {
        showTravel(universe.gameUniverse[70]);
    }    
    @FXML
    private void planet72Clicked() {
        showTravel(universe.gameUniverse[71]);
    }    
    @FXML
    private void planet73Clicked() {
        showTravel(universe.gameUniverse[72]);
    }   
    @FXML
    private void planet74Clicked() {
        showTravel(universe.gameUniverse[73]);
    }  
    @FXML
    private void planet75Clicked() {
        showTravel(universe.gameUniverse[74]);
    }
    @FXML
    private void planet76Clicked() {
        showTravel(universe.gameUniverse[75]);
    }
    @FXML
    private void planet77Clicked() {
        showTravel(universe.gameUniverse[76]);
    }
    @FXML
    private void planet78Clicked() {
        showTravel(universe.gameUniverse[77]);
    }
    @FXML
    private void planet79Clicked() {
        showTravel(universe.gameUniverse[78]);
    }   
    @FXML
    private void planet80Clicked() {
        showTravel(universe.gameUniverse[79]);
    }
    @FXML
    private void planet81Clicked() {
        showTravel(universe.gameUniverse[80]);
    }    
    @FXML
    private void planet82Clicked() {
        showTravel(universe.gameUniverse[81]);
    }    
    @FXML
    private void planet83Clicked() {
        showTravel(universe.gameUniverse[82]);
    }   
    @FXML
    private void planet84Clicked() {
        showTravel(universe.gameUniverse[83]);
    }  
    @FXML
    private void planet85Clicked() {
        showTravel(universe.gameUniverse[84]);
    }
    @FXML
    private void planet86Clicked() {
        showTravel(universe.gameUniverse[85]);
    }
    @FXML
    private void planet87Clicked() {
        showTravel(universe.gameUniverse[86]);
    }
    @FXML
    private void planet88Clicked() {
        showTravel(universe.gameUniverse[87]);
    }
    @FXML
    private void planet89Clicked() {
        showTravel(universe.gameUniverse[88]);
    }   
    @FXML
    private void planet90Clicked() {
        showTravel(universe.gameUniverse[89]);
    }
    @FXML
    private void planet91Clicked() {
        showTravel(universe.gameUniverse[90]);
    }    
    @FXML
    private void planet92Clicked() {
        showTravel(universe.gameUniverse[91]);
    }    
    @FXML
    private void planet93Clicked() {
        showTravel(universe.gameUniverse[92]);
    }   
    @FXML
    private void planet94Clicked() {
        showTravel(universe.gameUniverse[93]);
    }  
    @FXML
    private void planet95Clicked() {
        showTravel(universe.gameUniverse[94]);
    }
    @FXML
    private void planet96Clicked() {
        showTravel(universe.gameUniverse[95]);
    }
    @FXML
    private void planet97Clicked() {
        showTravel(universe.gameUniverse[96]);
    }
    @FXML
    private void planet98Clicked() {
        showTravel(universe.gameUniverse[97]);
    }
    @FXML
    private void planet99Clicked() {
        showTravel(universe.gameUniverse[98]);
    }   
    @FXML
    private void planet100Clicked() {
        showTravel(universe.gameUniverse[99]);
    }
    @FXML
    private void planet101Clicked() {
        showTravel(universe.gameUniverse[100]);
    }    
    @FXML
    private void planet102Clicked() {
        showTravel(universe.gameUniverse[101]);
    }    
    @FXML
    private void planet103Clicked() {
        showTravel(universe.gameUniverse[102]);
    }   
    @FXML
    private void planet104Clicked() {
        showTravel(universe.gameUniverse[103]);
    }  
    @FXML
    private void planet105Clicked() {
        showTravel(universe.gameUniverse[104]);
    }
    @FXML
    private void planet106Clicked() {
        showTravel(universe.gameUniverse[105]);
    }
    @FXML
    private void planet107Clicked() {
        showTravel(universe.gameUniverse[106]);
    }
    @FXML
    private void planet108Clicked() {
        showTravel(universe.gameUniverse[107]);
    }
    @FXML
    private void planet109Clicked() {
        showTravel(universe.gameUniverse[108]);
    }   
    @FXML
    private void planet110Clicked() {
        showTravel(universe.gameUniverse[109]);
    }
    @FXML
    private void planet111Clicked() {
        showTravel(universe.gameUniverse[110]);
    }    
    @FXML
    private void planet112Clicked() {
        showTravel(universe.gameUniverse[111]);
    }    
    @FXML
    private void planet113Clicked() {
        showTravel(universe.gameUniverse[112]);
    }   
    @FXML
    private void planet114Clicked() {
        showTravel(universe.gameUniverse[113]);
    }  
    
    @FXML
    private void refreshMap() {
        previous.setFill(Color.DODGERBLUE);
        current.setFill(Color.DARKORANGE);
    }
    
    private void initializeMap() {
        Planet1.setLayoutX(universe.gameUniverse[0].getX() * 6 + 3);
        Planet1.setLayoutY(universe.gameUniverse[0].getY() * 6 + 3);
        Planet1.setVisible(true);
        Planet1.setFill(Color.DARKORANGE);
        Planet2.setLayoutX(universe.gameUniverse[1].getX() * 6 + 3);
        Planet2.setLayoutY(universe.gameUniverse[1].getY() * 6 + 3);
        Planet2.setVisible(true);
        Planet3.setLayoutX(universe.gameUniverse[2].getX() * 6 + 3);
        Planet3.setLayoutY(universe.gameUniverse[2].getY() * 6 + 3);
        Planet3.setVisible(true);
        Planet4.setLayoutX(universe.gameUniverse[3].getX() * 6 + 3);
        Planet4.setLayoutY(universe.gameUniverse[3].getY() * 6 + 3);
        Planet4.setVisible(true);
        Planet5.setLayoutX(universe.gameUniverse[4].getX() * 6 + 3);
        Planet5.setLayoutY(universe.gameUniverse[4].getY() * 6 + 3);
        Planet5.setVisible(true);
        Planet6.setLayoutX(universe.gameUniverse[5].getX() * 6 + 3);
        Planet6.setLayoutY(universe.gameUniverse[5].getY() * 6 + 3);
        Planet6.setVisible(true);
        Planet7.setLayoutX(universe.gameUniverse[6].getX() * 6 + 3);
        Planet7.setLayoutY(universe.gameUniverse[6].getY() * 6 + 3);
        Planet7.setVisible(true);
        Planet8.setLayoutX(universe.gameUniverse[7].getX() * 6 + 3);
        Planet8.setLayoutY(universe.gameUniverse[7].getY() * 6 + 3);
        Planet8.setVisible(true);
        Planet9.setLayoutX(universe.gameUniverse[8].getX() * 6 + 3);
        Planet9.setLayoutY(universe.gameUniverse[8].getY() * 6 + 3);
        Planet9.setVisible(true);
        Planet10.setLayoutX(universe.gameUniverse[9].getX() * 6 + 3);
        Planet10.setLayoutY(universe.gameUniverse[9].getY() * 6 + 3);
        Planet10.setVisible(true);
        Planet11.setLayoutX(universe.gameUniverse[10].getX() * 6 + 3);
        Planet11.setLayoutY(universe.gameUniverse[10].getY() * 6 + 3);
        Planet11.setVisible(true);
        Planet12.setLayoutX(universe.gameUniverse[11].getX() * 6 + 3);
        Planet12.setLayoutY(universe.gameUniverse[11].getY() * 6 + 3);
        Planet12.setVisible(true);
        Planet13.setLayoutX(universe.gameUniverse[12].getX() * 6 + 3);
        Planet13.setLayoutY(universe.gameUniverse[12].getY() * 6 + 3);
        Planet13.setVisible(true);
        Planet14.setLayoutX(universe.gameUniverse[13].getX() * 6 + 3);
        Planet14.setLayoutY(universe.gameUniverse[13].getY() * 6 + 3);
        Planet14.setVisible(true);
        Planet15.setLayoutX(universe.gameUniverse[14].getX() * 6 + 3);
        Planet15.setLayoutY(universe.gameUniverse[14].getY() * 6 + 3);
        Planet15.setVisible(true);
        Planet16.setLayoutX(universe.gameUniverse[15].getX() * 6 + 3);
        Planet16.setLayoutY(universe.gameUniverse[15].getY() * 6 + 3);
        Planet16.setVisible(true);
        Planet17.setLayoutX(universe.gameUniverse[16].getX() * 6 + 3);
        Planet17.setLayoutY(universe.gameUniverse[16].getY() * 6 + 3);
        Planet17.setVisible(true);
        Planet18.setLayoutX(universe.gameUniverse[17].getX() * 6 + 3);
        Planet18.setLayoutY(universe.gameUniverse[17].getY() * 6 + 3);
        Planet18.setVisible(true);
        Planet19.setLayoutX(universe.gameUniverse[18].getX() * 6 + 3);
        Planet19.setLayoutY(universe.gameUniverse[18].getY() * 6 + 3);
        Planet19.setVisible(true);
        Planet20.setLayoutX(universe.gameUniverse[19].getX() * 6 + 3);
        Planet20.setLayoutY(universe.gameUniverse[19].getY() * 6 + 3);
        Planet20.setVisible(true);
        Planet21.setLayoutX(universe.gameUniverse[20].getX() * 6 + 3);
        Planet21.setLayoutY(universe.gameUniverse[20].getY() * 6 + 3);
        Planet21.setVisible(true);
        Planet22.setLayoutX(universe.gameUniverse[21].getX() * 6 + 3);
        Planet22.setLayoutY(universe.gameUniverse[21].getY() * 6 + 3);
        Planet22.setVisible(true);
        Planet23.setLayoutX(universe.gameUniverse[22].getX() * 6 + 3);
        Planet23.setLayoutY(universe.gameUniverse[22].getY() * 6 + 3);
        Planet23.setVisible(true);
        Planet24.setLayoutX(universe.gameUniverse[23].getX() * 6 + 3);
        Planet24.setLayoutY(universe.gameUniverse[23].getY() * 6 + 3);
        Planet24.setVisible(true);
        Planet25.setLayoutX(universe.gameUniverse[24].getX() * 6 + 3);
        Planet25.setLayoutY(universe.gameUniverse[24].getY() * 6 + 3);
        Planet25.setVisible(true);
        Planet26.setLayoutX(universe.gameUniverse[25].getX() * 6 + 3);
        Planet26.setLayoutY(universe.gameUniverse[25].getY() * 6 + 3);
        Planet26.setVisible(true);
        Planet27.setLayoutX(universe.gameUniverse[26].getX() * 6 + 3);
        Planet27.setLayoutY(universe.gameUniverse[26].getY() * 6 + 3);
        Planet27.setVisible(true);
        Planet28.setLayoutX(universe.gameUniverse[27].getX() * 6 + 3);
        Planet28.setLayoutY(universe.gameUniverse[27].getY() * 6 + 3);
        Planet28.setVisible(true);
        Planet29.setLayoutX(universe.gameUniverse[28].getX() * 6 + 3);
        Planet29.setLayoutY(universe.gameUniverse[28].getY() * 6 + 3);
        Planet29.setVisible(true);
        Planet30.setLayoutX(universe.gameUniverse[29].getX() * 6 + 3);
        Planet30.setLayoutY(universe.gameUniverse[29].getY() * 6 + 3);
        Planet30.setVisible(true);
        Planet31.setLayoutX(universe.gameUniverse[30].getX() * 6 + 3);
        Planet31.setLayoutY(universe.gameUniverse[30].getY() * 6 + 3);
        Planet31.setVisible(true);
        Planet32.setLayoutX(universe.gameUniverse[31].getX() * 6 + 3);
        Planet32.setLayoutY(universe.gameUniverse[31].getY() * 6 + 3);
        Planet32.setVisible(true);
        Planet33.setLayoutX(universe.gameUniverse[32].getX() * 6 + 3);
        Planet33.setLayoutY(universe.gameUniverse[32].getY() * 6 + 3);
        Planet33.setVisible(true);
        Planet34.setLayoutX(universe.gameUniverse[33].getX() * 6 + 3);
        Planet34.setLayoutY(universe.gameUniverse[33].getY() * 6 + 3);
        Planet34.setVisible(true);
        Planet35.setLayoutX(universe.gameUniverse[34].getX() * 6 + 3);
        Planet35.setLayoutY(universe.gameUniverse[34].getY() * 6 + 3);
        Planet35.setVisible(true);
        Planet36.setLayoutX(universe.gameUniverse[35].getX() * 6 + 3);
        Planet36.setLayoutY(universe.gameUniverse[35].getY() * 6 + 3);
        Planet36.setVisible(true);
        Planet37.setLayoutX(universe.gameUniverse[36].getX() * 6 + 3);
        Planet37.setLayoutY(universe.gameUniverse[36].getY() * 6 + 3);
        Planet37.setVisible(true);
        Planet38.setLayoutX(universe.gameUniverse[37].getX() * 6 + 3);
        Planet38.setLayoutY(universe.gameUniverse[37].getY() * 6 + 3);
        Planet38.setVisible(true);
        Planet39.setLayoutX(universe.gameUniverse[38].getX() * 6 + 3);
        Planet39.setLayoutY(universe.gameUniverse[38].getY() * 6 + 3);
        Planet39.setVisible(true);
        Planet40.setLayoutX(universe.gameUniverse[39].getX() * 6 + 3);
        Planet40.setLayoutY(universe.gameUniverse[39].getY() * 6 + 3);
        Planet40.setVisible(true);
        Planet41.setLayoutX(universe.gameUniverse[40].getX() * 6 + 3);
        Planet41.setLayoutY(universe.gameUniverse[40].getY() * 6 + 3);
        Planet41.setVisible(true);
        Planet42.setLayoutX(universe.gameUniverse[41].getX() * 6 + 3);
        Planet42.setLayoutY(universe.gameUniverse[41].getY() * 6 + 3);
        Planet42.setVisible(true);
        Planet43.setLayoutX(universe.gameUniverse[42].getX() * 6 + 3);
        Planet43.setLayoutY(universe.gameUniverse[42].getY() * 6 + 3);
        Planet43.setVisible(true);
        Planet44.setLayoutX(universe.gameUniverse[43].getX() * 6 + 3);
        Planet44.setLayoutY(universe.gameUniverse[43].getY() * 6 + 3);
        Planet44.setVisible(true);
        Planet45.setLayoutX(universe.gameUniverse[44].getX() * 6 + 3);
        Planet45.setLayoutY(universe.gameUniverse[44].getY() * 6 + 3);
        Planet45.setVisible(true);
        Planet46.setLayoutX(universe.gameUniverse[45].getX() * 6 + 3);
        Planet46.setLayoutY(universe.gameUniverse[45].getY() * 6 + 3);
        Planet46.setVisible(true);
        Planet47.setLayoutX(universe.gameUniverse[46].getX() * 6 + 3);
        Planet47.setLayoutY(universe.gameUniverse[46].getY() * 6 + 3);
        Planet47.setVisible(true);
        Planet48.setLayoutX(universe.gameUniverse[47].getX() * 6 + 3);
        Planet48.setLayoutY(universe.gameUniverse[47].getY() * 6 + 3);
        Planet48.setVisible(true);
        Planet49.setLayoutX(universe.gameUniverse[48].getX() * 6 + 3);
        Planet49.setLayoutY(universe.gameUniverse[48].getY() * 6 + 3);
        Planet49.setVisible(true);
        Planet50.setLayoutX(universe.gameUniverse[49].getX() * 6 + 3);
        Planet50.setLayoutY(universe.gameUniverse[49].getY() * 6 + 3);
        Planet50.setVisible(true);
        Planet51.setLayoutX(universe.gameUniverse[50].getX() * 6 + 3);
        Planet51.setLayoutY(universe.gameUniverse[50].getY() * 6 + 3);
        Planet51.setVisible(true);
        Planet52.setLayoutX(universe.gameUniverse[51].getX() * 6 + 3);
        Planet52.setLayoutY(universe.gameUniverse[51].getY() * 6 + 3);
        Planet52.setVisible(true);
        Planet53.setLayoutX(universe.gameUniverse[52].getX() * 6 + 3);
        Planet53.setLayoutY(universe.gameUniverse[52].getY() * 6 + 3);
        Planet53.setVisible(true);
        Planet54.setLayoutX(universe.gameUniverse[53].getX() * 6 + 3);
        Planet54.setLayoutY(universe.gameUniverse[53].getY() * 6 + 3);
        Planet54.setVisible(true);
        Planet55.setLayoutX(universe.gameUniverse[54].getX() * 6 + 3);
        Planet55.setLayoutY(universe.gameUniverse[54].getY() * 6 + 3);
        Planet55.setVisible(true);
        Planet56.setLayoutX(universe.gameUniverse[55].getX() * 6 + 3);
        Planet56.setLayoutY(universe.gameUniverse[55].getY() * 6 + 3);
        Planet56.setVisible(true);
        Planet57.setLayoutX(universe.gameUniverse[56].getX() * 6 + 3);
        Planet57.setLayoutY(universe.gameUniverse[56].getY() * 6 + 3);
        Planet57.setVisible(true);
        Planet58.setLayoutX(universe.gameUniverse[57].getX() * 6 + 3);
        Planet58.setLayoutY(universe.gameUniverse[57].getY() * 6 + 3);
        Planet58.setVisible(true);
        Planet59.setLayoutX(universe.gameUniverse[58].getX() * 6 + 3);
        Planet59.setLayoutY(universe.gameUniverse[58].getY() * 6 + 3);
        Planet59.setVisible(true);
        Planet60.setLayoutX(universe.gameUniverse[59].getX() * 6 + 3);
        Planet60.setLayoutY(universe.gameUniverse[59].getY() * 6 + 3);
        Planet60.setVisible(true);
        Planet61.setLayoutX(universe.gameUniverse[60].getX() * 6 + 3);
        Planet61.setLayoutY(universe.gameUniverse[60].getY() * 6 + 3);
        Planet61.setVisible(true);
        Planet62.setLayoutX(universe.gameUniverse[61].getX() * 6 + 3);
        Planet62.setLayoutY(universe.gameUniverse[61].getY() * 6 + 3);
        Planet62.setVisible(true);
        Planet63.setLayoutX(universe.gameUniverse[62].getX() * 6 + 3);
        Planet63.setLayoutY(universe.gameUniverse[62].getY() * 6 + 3);
        Planet63.setVisible(true);
        Planet64.setLayoutX(universe.gameUniverse[63].getX() * 6 + 3);
        Planet64.setLayoutY(universe.gameUniverse[63].getY() * 6 + 3);
        Planet64.setVisible(true);
        Planet65.setLayoutX(universe.gameUniverse[64].getX() * 6 + 3);
        Planet65.setLayoutY(universe.gameUniverse[64].getY() * 6 + 3);
        Planet65.setVisible(true);
        Planet66.setLayoutX(universe.gameUniverse[65].getX() * 6 + 3);
        Planet66.setLayoutY(universe.gameUniverse[65].getY() * 6 + 3);
        Planet66.setVisible(true);
        Planet67.setLayoutX(universe.gameUniverse[66].getX() * 6 + 3);
        Planet67.setLayoutY(universe.gameUniverse[66].getY() * 6 + 3);
        Planet67.setVisible(true);
        Planet68.setLayoutX(universe.gameUniverse[67].getX() * 6 + 3);
        Planet68.setLayoutY(universe.gameUniverse[67].getY() * 6 + 3);
        Planet68.setVisible(true);
        Planet69.setLayoutX(universe.gameUniverse[68].getX() * 6 + 3);
        Planet69.setLayoutY(universe.gameUniverse[68].getY() * 6 + 3);
        Planet69.setVisible(true);
        Planet70.setLayoutX(universe.gameUniverse[69].getX() * 6 + 3);
        Planet70.setLayoutY(universe.gameUniverse[69].getY() * 6 + 3);
        Planet70.setVisible(true);
        Planet71.setLayoutX(universe.gameUniverse[70].getX() * 6 + 3);
        Planet71.setLayoutY(universe.gameUniverse[70].getY() * 6 + 3);
        Planet71.setVisible(true);
        Planet72.setLayoutX(universe.gameUniverse[71].getX() * 6 + 3);
        Planet72.setLayoutY(universe.gameUniverse[71].getY() * 6 + 3);
        Planet72.setVisible(true);
        Planet73.setLayoutX(universe.gameUniverse[72].getX() * 6 + 3);
        Planet73.setLayoutY(universe.gameUniverse[72].getY() * 6 + 3);
        Planet73.setVisible(true);
        Planet74.setLayoutX(universe.gameUniverse[73].getX() * 6 + 3);
        Planet74.setLayoutY(universe.gameUniverse[73].getY() * 6 + 3);
        Planet74.setVisible(true);
        Planet75.setLayoutX(universe.gameUniverse[74].getX() * 6 + 3);
        Planet75.setLayoutY(universe.gameUniverse[74].getY() * 6 + 3);
        Planet75.setVisible(true);
        Planet76.setLayoutX(universe.gameUniverse[75].getX() * 6 + 3);
        Planet76.setLayoutY(universe.gameUniverse[75].getY() * 6 + 3);
        Planet76.setVisible(true);
        Planet77.setLayoutX(universe.gameUniverse[76].getX() * 6 + 3);
        Planet77.setLayoutY(universe.gameUniverse[76].getY() * 6 + 3);
        Planet77.setVisible(true);
        Planet78.setLayoutX(universe.gameUniverse[77].getX() * 6 + 3);
        Planet78.setLayoutY(universe.gameUniverse[77].getY() * 6 + 3);
        Planet78.setVisible(true);
        Planet79.setLayoutX(universe.gameUniverse[78].getX() * 6 + 3);
        Planet79.setLayoutY(universe.gameUniverse[78].getY() * 6 + 3);
        Planet79.setVisible(true);
        Planet80.setLayoutX(universe.gameUniverse[79].getX() * 6 + 3);
        Planet80.setLayoutY(universe.gameUniverse[79].getY() * 6 + 3);
        Planet80.setVisible(true);
        Planet81.setLayoutX(universe.gameUniverse[80].getX() * 6 + 3);
        Planet81.setLayoutY(universe.gameUniverse[80].getY() * 6 + 3);
        Planet81.setVisible(true);
        Planet82.setLayoutX(universe.gameUniverse[81].getX() * 6 + 3);
        Planet82.setLayoutY(universe.gameUniverse[81].getY() * 6 + 3);
        Planet82.setVisible(true);
        Planet83.setLayoutX(universe.gameUniverse[82].getX() * 6 + 3);
        Planet83.setLayoutY(universe.gameUniverse[82].getY() * 6 + 3);
        Planet83.setVisible(true);
        Planet84.setLayoutX(universe.gameUniverse[83].getX() * 6 + 3);
        Planet84.setLayoutY(universe.gameUniverse[83].getY() * 6 + 3);
        Planet84.setVisible(true);
        Planet85.setLayoutX(universe.gameUniverse[84].getX() * 6 + 3);
        Planet85.setLayoutY(universe.gameUniverse[84].getY() * 6 + 3);
        Planet85.setVisible(true);
        Planet86.setLayoutX(universe.gameUniverse[85].getX() * 6 + 3);
        Planet86.setLayoutY(universe.gameUniverse[85].getY() * 6 + 3);
        Planet86.setVisible(true);
        Planet87.setLayoutX(universe.gameUniverse[86].getX() * 6 + 3);
        Planet87.setLayoutY(universe.gameUniverse[86].getY() * 6 + 3);
        Planet87.setVisible(true);
        Planet88.setLayoutX(universe.gameUniverse[87].getX() * 6 + 3);
        Planet88.setLayoutY(universe.gameUniverse[87].getY() * 6 + 3);
        Planet88.setVisible(true);
        Planet89.setLayoutX(universe.gameUniverse[88].getX() * 6 + 3);
        Planet89.setLayoutY(universe.gameUniverse[88].getY() * 6 + 3);
        Planet89.setVisible(true);
        Planet90.setLayoutX(universe.gameUniverse[89].getX() * 6 + 3);
        Planet90.setLayoutY(universe.gameUniverse[89].getY() * 6 + 3);
        Planet90.setVisible(true);
        Planet91.setLayoutX(universe.gameUniverse[90].getX() * 6 + 3);
        Planet91.setLayoutY(universe.gameUniverse[90].getY() * 6 + 3);
        Planet91.setVisible(true);
        Planet92.setLayoutX(universe.gameUniverse[91].getX() * 6 + 3);
        Planet92.setLayoutY(universe.gameUniverse[91].getY() * 6 + 3);
        Planet92.setVisible(true);
        Planet93.setLayoutX(universe.gameUniverse[92].getX() * 6 + 3);
        Planet93.setLayoutY(universe.gameUniverse[92].getY() * 6 + 3);
        Planet93.setVisible(true);
        Planet94.setLayoutX(universe.gameUniverse[93].getX() * 6 + 3);
        Planet94.setLayoutY(universe.gameUniverse[93].getY() * 6 + 3);
        Planet94.setVisible(true);
        Planet95.setLayoutX(universe.gameUniverse[94].getX() * 6 + 3);
        Planet95.setLayoutY(universe.gameUniverse[94].getY() * 6 + 3);
        Planet95.setVisible(true);
        Planet96.setLayoutX(universe.gameUniverse[95].getX() * 6 + 3);
        Planet96.setLayoutY(universe.gameUniverse[95].getY() * 6 + 3);
        Planet96.setVisible(true);
        Planet97.setLayoutX(universe.gameUniverse[96].getX() * 6 + 3);
        Planet97.setLayoutY(universe.gameUniverse[96].getY() * 6 + 3);
        Planet97.setVisible(true);
        Planet98.setLayoutX(universe.gameUniverse[97].getX() * 6 + 3);
        Planet98.setLayoutY(universe.gameUniverse[97].getY() * 6 + 3);
        Planet98.setVisible(true);
        Planet99.setLayoutX(universe.gameUniverse[98].getX() * 6 + 3);
        Planet99.setLayoutY(universe.gameUniverse[98].getY() * 6 + 3);
        Planet99.setVisible(true);
        Planet100.setLayoutX(universe.gameUniverse[99].getX() * 6 + 3);
        Planet100.setLayoutY(universe.gameUniverse[99].getY() * 6 + 3);
        Planet100.setVisible(true);
        Planet101.setLayoutX(universe.gameUniverse[100].getX() * 6 + 3);
        Planet101.setLayoutY(universe.gameUniverse[100].getY() * 6 + 3);
        Planet101.setVisible(true);
        Planet102.setLayoutX(universe.gameUniverse[101].getX() * 6 + 3);
        Planet102.setLayoutY(universe.gameUniverse[101].getY() * 6 + 3);
        Planet102.setVisible(true);
        Planet103.setLayoutX(universe.gameUniverse[102].getX() * 6 + 3);
        Planet103.setLayoutY(universe.gameUniverse[102].getY() * 6 + 3);
        Planet103.setVisible(true);
        Planet104.setLayoutX(universe.gameUniverse[103].getX() * 6 + 3);
        Planet104.setLayoutY(universe.gameUniverse[103].getY() * 6 + 3);
        Planet104.setVisible(true);
        Planet105.setLayoutX(universe.gameUniverse[104].getX() * 6 + 3);
        Planet105.setLayoutY(universe.gameUniverse[104].getY() * 6 + 3);
        Planet105.setVisible(true);
        Planet106.setLayoutX(universe.gameUniverse[105].getX() * 6 + 3);
        Planet106.setLayoutY(universe.gameUniverse[105].getY() * 6 + 3);
        Planet106.setVisible(true);
        Planet107.setLayoutX(universe.gameUniverse[106].getX() * 6 + 3);
        Planet107.setLayoutY(universe.gameUniverse[106].getY() * 6 + 3);
        Planet107.setVisible(true);
        Planet108.setLayoutX(universe.gameUniverse[107].getX() * 6 + 3);
        Planet108.setLayoutY(universe.gameUniverse[107].getY() * 6 + 3);
        Planet108.setVisible(true);
        Planet109.setLayoutX(universe.gameUniverse[108].getX() * 6 + 3);
        Planet109.setLayoutY(universe.gameUniverse[108].getY() * 6 + 3);
        Planet109.setVisible(true);
        Planet110.setLayoutX(universe.gameUniverse[109].getX() * 6 + 3);
        Planet110.setLayoutY(universe.gameUniverse[109].getY() * 6 + 3);
        Planet110.setVisible(true);
        Planet111.setLayoutX(universe.gameUniverse[110].getX() * 6 + 3);
        Planet111.setLayoutY(universe.gameUniverse[110].getY() * 6 + 3);
        Planet111.setVisible(true);
        Planet112.setLayoutX(universe.gameUniverse[111].getX() * 6 + 3);
        Planet112.setLayoutY(universe.gameUniverse[111].getY() * 6 + 3);
        Planet112.setVisible(true);
        Planet113.setLayoutX(universe.gameUniverse[112].getX() * 6 + 3);
        Planet113.setLayoutY(universe.gameUniverse[112].getY() * 6 + 3);
        Planet113.setVisible(true);
        Planet114.setLayoutX(universe.gameUniverse[113].getX() * 6 + 3);
        Planet114.setLayoutY(universe.gameUniverse[113].getY() * 6 + 3);
        Planet114.setVisible(true);
        
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
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
            showSErr();
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
            showBErr();
        }
    }
    
    private void showTravel(SolarSystem solar) {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("Travel.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Travel");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            TravelController travelController = loader.getController();
            travelController.setTheStage(newGameStage, solar);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Stage dialogBox = new Stage();
        dialogBox.initStyle(StageStyle.UTILITY);
        Scene aScene = new Scene(new Group(new Text(25, 25, "Not enough good tobuy")));
        dialogBox.setHeight(80);
        dialogBox.setWidth(200);
        dialogBox.setScene(aScene);
        dialogBox.show();
        */
    }
    
    private void showBErr() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("marketerr/buyErr.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            BuyErrController errController = loader.getController();
            errController.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Stage dialogBox = new Stage();
        dialogBox.initStyle(StageStyle.UTILITY);
        Scene aScene = new Scene(new Group(new Text(25, 25, "Not enough good tobuy")));
        dialogBox.setHeight(80);
        dialogBox.setWidth(200);
        dialogBox.setScene(aScene);
        dialogBox.show();
        */
    }
    
    private void showSErr() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("marketerr/sellErr.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            SellErrController errController = loader.getController();
            errController.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Stage dialogBox = new Stage();
        dialogBox.initStyle(StageStyle.UTILITY);
        Scene aScene = new Scene(new Group(new Text(25, 25, "Not enough good for sell")));
        dialogBox.setHeight(80);
        dialogBox.setWidth(200);
        dialogBox.setScene(aScene);
        dialogBox.show();
        */
    }
    
    @FXML
    private void updatePlayer() {
        GameData.setPlayer(player);
    }
    
}
