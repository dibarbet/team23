/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import spacefx.marketerr.BuyErrController;
import spacefx.marketerr.SellErrController;
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
    private Circle currentPlanet;
    private Circle nextPlanet;
    private File loadFile;
    private Shipyard shipyard;
    @FXML
    private MenuItem newGame;
    @FXML
    private MenuItem saveGame;
    @FXML
    private MenuItem loadGame;
    @FXML
    private Tab marketPlace;
    @FXML
    private Tab shipyardTab;
    @FXML
    private Tab map;
    @FXML
    private Tab curSolar;
    @FXML
    private Tab upgradesTab;
    @FXML
    private Label currentShipMoney;
    @FXML
    private Label shipOneName;
    @FXML
    private Label shipTwoName;
    @FXML
    private Label shipThreeName;
    @FXML
    private Label shipFourName;
    @FXML
    private Label shipFiveName;
    @FXML
    private Label shipOnePrice;
    @FXML
    private Label shipTwoPrice;
    @FXML
    private Label shipThreePrice;
    @FXML
    private Label shipFourPrice;
    @FXML
    private Label shipFivePrice;
    @FXML
    private Label currentShipName;
    @FXML
    private Button buyShipOne;
    @FXML
    private Button buyShipTwo;
    @FXML
    private Button buyShipThree;
    @FXML
    private Button buyShipFour;
    @FXML
    private Button buyShipFive;
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
// <editor-fold defaultstate="collapsed" desc=" DESCRIPTION ">
    private Circle planet1;
    @FXML
    private Circle planet2;
    @FXML
    private Circle planet3;
    @FXML
    private Circle planet4;
    @FXML
    private Circle planet5;
    @FXML
    private Circle planet6;
    @FXML
    private Circle planet7;
    @FXML
    private Circle planet8;
    @FXML
    private Circle planet9;
    @FXML
    private Circle planet10;
    @FXML
    private Circle planet11;
    @FXML
    private Circle planet12;
    @FXML
    private Circle planet13;
    @FXML
    private Circle planet14;
    @FXML
    private Circle planet15;
    @FXML
    private Circle planet16;
    @FXML
    private Circle planet17;
    @FXML
    private Circle planet18;
    @FXML
    private Circle planet19;
    @FXML
    private Circle planet20;
    @FXML
    private Circle planet21;
    @FXML
    private Circle planet22;
    @FXML
    private Circle planet23;
    @FXML
    private Circle planet24;
    @FXML
    private Circle planet25;
    @FXML
    private Circle planet26;
    @FXML
    private Circle planet27;
    @FXML
    private Circle planet28;
    @FXML
    private Circle planet29;
    @FXML
    private Circle planet30;
    @FXML
    private Circle planet31;
    @FXML
    private Circle planet32;
    @FXML
    private Circle planet33;
    @FXML
    private Circle planet34;
    @FXML
    private Circle planet35;
    @FXML
    private Circle planet36;
    @FXML
    private Circle planet37;
    @FXML
    private Circle planet38;
    @FXML
    private Circle planet39;
    @FXML
    private Circle planet40;
    @FXML
    private Circle planet41;
    @FXML
    private Circle planet42;
    @FXML
    private Circle planet43;
    @FXML
    private Circle planet44;
    @FXML
    private Circle planet45;
    @FXML
    private Circle planet46;
    @FXML
    private Circle planet47;
    @FXML
    private Circle planet48;
    @FXML
    private Circle planet49;
    @FXML
    private Circle planet50;
    @FXML
    private Circle planet51;
    @FXML
    private Circle planet52;
    @FXML
    private Circle planet53;
    @FXML
    private Circle planet54;
    @FXML
    private Circle planet55;
    @FXML
    private Circle planet56;
    @FXML
    private Circle planet57;
    @FXML
    private Circle planet58;
    @FXML
    private Circle planet59;
    @FXML
    private Circle planet60;
    @FXML
    private Circle planet61;
    @FXML
    private Circle planet62;
    @FXML
    private Circle planet63;
    @FXML
    private Circle planet64;
    @FXML
    private Circle planet65;
    @FXML
    private Circle planet66;
    @FXML
    private Circle planet67;
    @FXML
    private Circle planet68;
    @FXML
    private Circle planet69;
    @FXML
    private Circle planet70;
    @FXML
    private Circle planet71;
    @FXML
    private Circle planet72;
    @FXML
    private Circle planet73;
    @FXML
    private Circle planet74;
    @FXML
    private Circle planet75;
    @FXML
    private Circle planet76;
    @FXML
    private Circle planet77;
    @FXML
    private Circle planet78;
    @FXML
    private Circle planet79;
    @FXML
    private Circle planet80;
    @FXML
    private Circle planet81;
    @FXML
    private Circle planet82;
    @FXML
    private Circle planet83;
    @FXML
    private Circle planet84;
    @FXML
    private Circle planet85;
    @FXML
    private Circle planet86;
    @FXML
    private Circle planet87;
    @FXML
    private Circle planet88;
    @FXML
    private Circle planet89;
    @FXML
    private Circle planet90;
    @FXML
    private Circle planet91;
    @FXML
    private Circle planet92;
    @FXML
    private Circle planet93;
    @FXML
    private Circle planet94;
    @FXML
    private Circle planet95;
    @FXML
    private Circle planet96;
    @FXML
    private Circle planet97;
    @FXML
    private Circle planet98;
    @FXML
    private Circle planet99;
    @FXML
    private Circle planet100;
    @FXML
    private Circle planet101;
    @FXML
    private Circle planet102;
    @FXML
    private Circle planet103;
    @FXML
    private Circle planet104;
    @FXML
    private Circle planet105;
    @FXML
    private Circle planet106;
    @FXML
    private Circle planet107;
    @FXML
    private Circle planet108;
    @FXML
    private Circle planet109;
    @FXML
    private Circle planet110;
    @FXML
    private Circle planet111;
    @FXML
    private Circle planet112;
    @FXML
    private Circle planet113;
    @FXML
    private Circle planet114;

// </editor-fold>
    @FXML
    private Label weaponSlots;
    @FXML
    private Label shieldSlots;
    @FXML
    private Label gadgetSlots;
    @FXML
    private Label shipyardShipName;
    @FXML
    private Label shipyardMoney;
    @FXML
    private Label pulsePrice;
    @FXML
    private Label beamPrice;
    @FXML
    private Label militaryPrice;
    @FXML
    private Label energyPrice;
    @FXML
    private Label reflectivePrice;
    @FXML
    private Label fiveCargoPrice;
    @FXML
    private Label targetingPrice;
    @FXML
    private Label navigationPrice;
    @FXML
    private Label autorepairPrice;
    @FXML
    private Label cloakingPrice;
    @FXML
    private Button buyPulse;
    @FXML
    private Button buyBeam;
    @FXML
    private Button buyMilitary;
    @FXML
    private Button buyEnergy;
    @FXML
    private Button buyReflective;
    @FXML
    private Button buyFiveCargo;
    @FXML
    private Button buyNavigation;
    @FXML
    private Button buyTargeting;
    @FXML
    private Button buyAutorepair;
    @FXML
    private Button buyCloaking;
    // </editor-fold>
// <editor-fold defaultstate="collapsed" desc=" DESCRIPTION ">
    /**
     * Creates planetchanged boolean to false.
     */
    protected static boolean planetChanged = false;

    /**
     * Method to handle new game menu option being pressed Creates new window to
     * allow user to create a new game
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
            if (controller.isGameCreated()) {
                player = GameData.getPlayer();
                universe = GameData.getUniverse();
                currentSolarSystem = universe.getCurrentSolarSystem();
                GameData.setCurrSolarSys(currentSolarSystem);
                gameCreated = true;
                marketPlace.setDisable(false);
                map.setDisable(false);
                curSolar.setDisable(false);
                saveGame.setDisable(false);
                upgradesTab.setDisable(false);
                currentPlanet = planet1;
                shipyard = new Shipyard();
                if (shipyard.checkTechLevel()) {
                    shipyardTab.setDisable(false);
                    upgradesTab.setDisable(false);
                } else {
                    shipyardTab.setDisable(true);
                    upgradesTab.setDisable(true);
                }
                initializeMap();
                refreshMarket();
                refreshSolar();
            }
        } catch (IOException e) {
            System.out.println("Handle new game failed");
        }
    }
    /**
     * Refreshes market when the market tab is selected
     */
    @FXML
    private void refreshMarket() {
        bWaterB.setDisable(false);
        bFursB.setDisable(false);
        bFoodB.setDisable(false);
        bOreB.setDisable(false);
        bGamesB.setDisable(false);
        bFirearmsB.setDisable(false);
        bMedicineB.setDisable(false);
        bMachinesB.setDisable(false);
        bNarcoticsB.setDisable(false);
        bRobotsB.setDisable(false);
        sWaterB.setDisable(false);
        sFursB.setDisable(false);
        sFoodB.setDisable(false);
        sOreB.setDisable(false);
        sGamesB.setDisable(false);
        sFirearmsB.setDisable(false);
        sMedicineB.setDisable(false);
        sMachinesB.setDisable(false);
        sNarcotics.setDisable(false);
        sRobotsB.setDisable(false);
        market = GameData.getCurrSolarSys().getMarket();
        player = GameData.getPlayer();
        GameData.setMarket(market);
        Ship ship = GameData.getShip();
        market.setMarketShip(ship);
        marketMoney.setText(Integer.toString(player.getCredit()));
        waterCargo.setText(Integer.toString(ship.nwater));
        furCargo.setText(Integer.toString(ship.nfur));
        foodCargo.setText(Integer.toString(ship.nfood));
        oreCargo.setText(Integer.toString(ship.nore));
        gameCargo.setText(Integer.toString(ship.ngame));
        fireCargo.setText(Integer.toString(ship.nfire));
        medCargo.setText(Integer.toString(ship.nmed));
        machCargo.setText(Integer.toString(ship.nmach));
        narcCargo.setText(Integer.toString(ship.nnarc));
        robCargo.setText(Integer.toString(ship.nrob));
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
        if (currentSolarSystem.getTechLevel() < Good.Water.mtlp) {
            bWaterB.setDisable(true);
            planetWater.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Furs.mtlp) {
            bFursB.setDisable(true);
            planetFur.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Food.mtlp) {
            bFoodB.setDisable(true);
            planetFood.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Ore.mtlp) {
            bOreB.setDisable(true);
            planetOre.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Games.mtlp) {
            bGamesB.setDisable(true);
            planetGame.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Firearms.mtlp) {
            bFirearmsB.setDisable(true);
            planetFire.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Medicine.mtlp) {
            bMedicineB.setDisable(true);
            planetMed.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Machines.mtlp) {
            bMachinesB.setDisable(true);
            planetMach.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Narcotics.mtlp) {
            bNarcoticsB.setDisable(true);
            planetNarc.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Robots.mtlp) {
            bRobotsB.setDisable(true);
            planetRob.setText("0");
        }
        if (currentSolarSystem.getTechLevel() < Good.Water.mtlu) {
            sWaterB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Furs.mtlu) {
            sFursB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Food.mtlu) {
            sFoodB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Ore.mtlu) {
            sOreB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Games.mtlu) {
            sGamesB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Firearms.mtlu) {
            sFirearmsB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Medicine.mtlu) {
            sMedicineB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Machines.mtlu) {
            sMachinesB.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Narcotics.mtlu) {
            sNarcotics.setDisable(true);
        }
        if (currentSolarSystem.getTechLevel() < Good.Robots.mtlu) {
            sRobotsB.setDisable(true);
        }
    }

    /**
     * Refreshes solar system tab when selected.
     */
    @FXML
    private void refreshSolar() {
        currentSolarSystem = GameData.getCurrSolarSys();
        curSolarName.setText(currentSolarSystem.getSolarName());
        curSolarTech.setText(currentSolarSystem.getTechString());
        curSolarResource.setText(currentSolarSystem.getResourceString());
        curSolarGov.setText(currentSolarSystem.getGovString());
        curSolarLoc.setText(Integer.toString(currentSolarSystem.getX()) + ", "
                + Integer.toString(currentSolarSystem.getY()));
    }
    /**
     * Initializes the fxml window with tabs disabled.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (!gameCreated) {
            marketPlace.setDisable(true);
            map.setDisable(true);
            curSolar.setDisable(true);
            saveGame.setDisable(true);
            shipyardTab.setDisable(true);
            upgradesTab.setDisable(true);
        }
    }
    /**
     * Saves the current game into a file using serialization
     * of the gamedata list from the gamedata class.
     */
    @FXML
    private void saveGame() {
        //showSaveWin();
        String saveString = "save.ser";
        FileChooser saveFile = new FileChooser();
        saveFile.setInitialFileName(saveString);
        saveFile.setTitle("Save Game");
        Stage stage = new Stage();
        File savedFile = saveFile.showSaveDialog(stage);
        if (savedFile != null) {
            try {
                OutputStream file = new FileOutputStream(savedFile);
                OutputStream buffer = new BufferedOutputStream(file);
                ObjectOutput output = new ObjectOutputStream(buffer);
                output.writeObject(GameData.getClassList());
                output.close();
            } catch (IOException e) {
                System.out.println("Failed writing");
            }
        }
    }
    /**
     * Begins load game process by showing the window.
     */
    @FXML
    private void loadGame() {
        showLoadWin();
    }
    /**
     * Shows file chooser to load a game save, then loads it.
     */
    private void showLoadWin() {
        FileChooser fileChoose = new FileChooser();
        fileChoose.setTitle("Load Game Save");
        Stage stage = new Stage();
        loadFile = fileChoose.showOpenDialog(stage);
        if (loadFile != null) {
            try {
                InputStream file = new FileInputStream(loadFile);
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);
                ArrayList<Object> aList;
                aList = (ArrayList<Object>) input.readObject();
                GameData.setPlayer((Player) aList.get(0));
                GameData.setShip((Ship) aList.get(1));
                GameData.setUniverse((Universe) aList.get(2));
                GameData.setSolarSystem((SolarSystem) aList.get(4));
                GameData.setMarket((Market) aList.get(3));
                universe = GameData.getUniverse();
                System.out.println(player);
                currentSolarSystem = universe.getCurrentSolarSystem();
                gameCreated = true;
                marketPlace.setDisable(false);
                map.setDisable(false);
                curSolar.setDisable(false);
                saveGame.setDisable(false);
                upgradesTab.setDisable(false);
                currentPlanet = planet1;
                shipyard = new Shipyard();
                if (shipyard.checkTechLevel()) {
                    shipyardTab.setDisable(false);
                    upgradesTab.setDisable(false);
                } else {
                    shipyardTab.setDisable(true);
                    upgradesTab.setDisable(true);
                }
                initializeMap();
                refreshSolar();
                refreshMarket();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
                System.out.println("Load failed");
            }
        }
    }
    /**
     * The following planetXClicked methods determine which planet
     * the user wants to travel towards.
     */
    @FXML
    private void planet1Clicked() {
        nextPlanet = planet1;
        showTravel(universe.gameUniverse[0]);
    }

    @FXML
    private void planet2Clicked() {
        nextPlanet = planet2;
        showTravel(universe.gameUniverse[1]);
    }

    @FXML
    private void planet3Clicked() {
        nextPlanet = planet3;
        showTravel(universe.gameUniverse[2]);
    }

    @FXML
    private void planet4Clicked() {
        nextPlanet = planet4;
        showTravel(universe.gameUniverse[3]);
    }

    @FXML
    private void planet5Clicked() {
        nextPlanet = planet5;
        showTravel(universe.gameUniverse[4]);
    }

    @FXML
    private void planet6Clicked() {
        nextPlanet = planet6;
        showTravel(universe.gameUniverse[5]);
    }

    @FXML
    private void planet7Clicked() {
        nextPlanet = planet7;
        showTravel(universe.gameUniverse[6]);
    }

    @FXML
// <editor-fold defaultstate="collapsed" desc=" DESCRIPTION ">
    private void planet8Clicked() {
        nextPlanet = planet8;
        showTravel(universe.gameUniverse[7]);
    }
    @FXML
    private void planet9Clicked() {
        nextPlanet = planet9;
        showTravel(universe.gameUniverse[8]);
    }
    @FXML
    private void planet10Clicked() {
        nextPlanet = planet10;
        showTravel(universe.gameUniverse[9]);
    }
    @FXML
    private void planet11Clicked() {
        nextPlanet = planet11;
        showTravel(universe.gameUniverse[10]);
    }
    @FXML
    private void planet12Clicked() {
        nextPlanet = planet12;
        showTravel(universe.gameUniverse[11]);
    }
    @FXML
    private void planet13Clicked() {
        nextPlanet = planet13;
        showTravel(universe.gameUniverse[12]);
    }
    @FXML
    private void planet14Clicked() {
        nextPlanet = planet14;
        showTravel(universe.gameUniverse[13]);
    }
    @FXML
    private void planet15Clicked() {
        nextPlanet = planet15;
        showTravel(universe.gameUniverse[14]);
    }
    @FXML
    private void planet16Clicked() {
        nextPlanet = planet16;
        showTravel(universe.gameUniverse[15]);
    }
    @FXML
    private void planet17Clicked() {
        nextPlanet = planet17;
        showTravel(universe.gameUniverse[16]);
    }
    @FXML
    private void planet18Clicked() {
        nextPlanet = planet18;
        showTravel(universe.gameUniverse[17]);
    }
    @FXML
    private void planet19Clicked() {
        nextPlanet = planet19;
        showTravel(universe.gameUniverse[18]);
    }
    @FXML
    private void planet20Clicked() {
        nextPlanet = planet20;
        showTravel(universe.gameUniverse[19]);
    }
    @FXML
    private void planet21Clicked() {
        nextPlanet = planet21;
        showTravel(universe.gameUniverse[20]);
    }
    @FXML
    private void planet22Clicked() {
        nextPlanet = planet22;
        showTravel(universe.gameUniverse[21]);
    }
    @FXML
    private void planet23Clicked() {
        nextPlanet = planet23;
        showTravel(universe.gameUniverse[22]);
    }
    @FXML
    private void planet24Clicked() {
        nextPlanet = planet24;
        showTravel(universe.gameUniverse[23]);
    }
    @FXML
    private void planet25Clicked() {
        nextPlanet = planet25;
        showTravel(universe.gameUniverse[24]);
    }
    @FXML
    private void planet26Clicked() {
        nextPlanet = planet26;
        showTravel(universe.gameUniverse[25]);
    }
    @FXML
    private void planet27Clicked() {
        nextPlanet = planet27;
        showTravel(universe.gameUniverse[26]);
    }
    @FXML
    private void planet28Clicked() {
        nextPlanet = planet28;
        showTravel(universe.gameUniverse[27]);
    }
    @FXML
    private void planet29Clicked() {
        nextPlanet = planet29;
        showTravel(universe.gameUniverse[28]);
    }
    @FXML
    private void planet30Clicked() {
        nextPlanet = planet30;
        showTravel(universe.gameUniverse[29]);
    }
    @FXML
    private void planet31Clicked() {
        nextPlanet = planet31;
        showTravel(universe.gameUniverse[30]);
    }
    @FXML
    private void planet32Clicked() {
        nextPlanet = planet32;
        showTravel(universe.gameUniverse[31]);
    }
    @FXML
    private void planet33Clicked() {
        nextPlanet = planet33;
        showTravel(universe.gameUniverse[32]);
    }
    @FXML
    private void planet34Clicked() {
        nextPlanet = planet34;
        showTravel(universe.gameUniverse[33]);
    }
    @FXML
    private void planet35Clicked() {
        nextPlanet = planet35;
        showTravel(universe.gameUniverse[34]);
    }
    @FXML
    private void planet36Clicked() {
        nextPlanet = planet36;
        showTravel(universe.gameUniverse[35]);
    }
    @FXML
    private void planet37Clicked() {
        nextPlanet = planet37;
        showTravel(universe.gameUniverse[36]);
    }
    @FXML
    private void planet38Clicked() {
        nextPlanet = planet38;
        showTravel(universe.gameUniverse[37]);
    }
    @FXML
    private void planet39Clicked() {
        nextPlanet = planet39;
        showTravel(universe.gameUniverse[38]);
    }
    @FXML
    private void planet40Clicked() {
        nextPlanet = planet40;
        showTravel(universe.gameUniverse[39]);
    }
    @FXML
    private void planet41Clicked() {
        nextPlanet = planet41;
        showTravel(universe.gameUniverse[40]);
    }
    @FXML
    private void planet42Clicked() {
        nextPlanet = planet42;
        showTravel(universe.gameUniverse[41]);
    }
    @FXML
    private void planet43Clicked() {
        nextPlanet = planet43;
        showTravel(universe.gameUniverse[42]);
    }
    @FXML
    private void planet44Clicked() {
        nextPlanet = planet44;
        showTravel(universe.gameUniverse[43]);
    }
    @FXML
    private void planet45Clicked() {
        nextPlanet = planet45;
        showTravel(universe.gameUniverse[44]);
    }
    @FXML
    private void planet46Clicked() {
        nextPlanet = planet46;
        showTravel(universe.gameUniverse[45]);
    }
    @FXML
    private void planet47Clicked() {
        nextPlanet = planet47;
        showTravel(universe.gameUniverse[46]);
    }
    @FXML
    private void planet48Clicked() {
        nextPlanet = planet48;
        showTravel(universe.gameUniverse[47]);
    }
    @FXML
    private void planet49Clicked() {
        nextPlanet = planet49;
        showTravel(universe.gameUniverse[48]);
    }
    @FXML
    private void planet50Clicked() {
        nextPlanet = planet50;
        showTravel(universe.gameUniverse[49]);
    }
    @FXML
    private void planet51Clicked() {
        nextPlanet = planet51;
        showTravel(universe.gameUniverse[50]);
    }
    @FXML
    private void planet52Clicked() {
        nextPlanet = planet52;
        showTravel(universe.gameUniverse[51]);
    }
    @FXML
    private void planet53Clicked() {
        nextPlanet = planet53;
        showTravel(universe.gameUniverse[52]);
    }
    @FXML
    private void planet54Clicked() {
        nextPlanet = planet54;
        showTravel(universe.gameUniverse[53]);
    }
    @FXML
    private void planet55Clicked() {
        nextPlanet = planet55;
        showTravel(universe.gameUniverse[54]);
    }
    @FXML
    private void planet56Clicked() {
        nextPlanet = planet56;
        showTravel(universe.gameUniverse[55]);
    }
    @FXML
    private void planet57Clicked() {
        nextPlanet = planet57;
        showTravel(universe.gameUniverse[56]);
    }
    @FXML
    private void planet58Clicked() {
        nextPlanet = planet58;
        showTravel(universe.gameUniverse[57]);
    }
    @FXML
    private void planet59Clicked() {
        nextPlanet = planet59;
        showTravel(universe.gameUniverse[58]);
    }
    @FXML
    private void planet60Clicked() {
        nextPlanet = planet60;
        showTravel(universe.gameUniverse[59]);
    }
    @FXML
    private void planet61Clicked() {
        nextPlanet = planet61;
        showTravel(universe.gameUniverse[60]);
    }
    @FXML
    private void planet62Clicked() {
        nextPlanet = planet62;
        showTravel(universe.gameUniverse[61]);
    }
    @FXML
    private void planet63Clicked() {
        nextPlanet = planet63;
        showTravel(universe.gameUniverse[62]);
    }
    @FXML
    private void planet64Clicked() {
        nextPlanet = planet64;
        showTravel(universe.gameUniverse[63]);
    }
    @FXML
    private void planet65Clicked() {
        nextPlanet = planet65;
        showTravel(universe.gameUniverse[64]);
    }
    @FXML
    private void planet66Clicked() {
        nextPlanet = planet66;
        showTravel(universe.gameUniverse[65]);
    }
    @FXML
    private void planet67Clicked() {
        nextPlanet = planet67;
        showTravel(universe.gameUniverse[66]);
    }
    @FXML
    private void planet68Clicked() {
        nextPlanet = planet68;
        showTravel(universe.gameUniverse[67]);
    }
    @FXML
    private void planet69Clicked() {
        nextPlanet = planet69;
        showTravel(universe.gameUniverse[68]);
    }
    @FXML
    private void planet70Clicked() {
        nextPlanet = planet70;
        showTravel(universe.gameUniverse[69]);
    }
    @FXML
    private void planet71Clicked() {
        nextPlanet = planet71;
        showTravel(universe.gameUniverse[70]);
    }
    @FXML
    private void planet72Clicked() {
        nextPlanet = planet72;
        showTravel(universe.gameUniverse[71]);
    }
    @FXML
    private void planet73Clicked() {
        nextPlanet = planet73;
        showTravel(universe.gameUniverse[72]);
    }
    @FXML
    private void planet74Clicked() {
        nextPlanet = planet74;
        showTravel(universe.gameUniverse[73]);
    }
    @FXML
    private void planet75Clicked() {
        nextPlanet = planet75;
        showTravel(universe.gameUniverse[74]);
    }
    @FXML
    private void planet76Clicked() {
        nextPlanet = planet76;
        showTravel(universe.gameUniverse[75]);
    }
    @FXML
    private void planet77Clicked() {
        nextPlanet = planet77;
        showTravel(universe.gameUniverse[76]);
    }
    @FXML
    private void planet78Clicked() {
        nextPlanet = planet78;
        showTravel(universe.gameUniverse[77]);
    }
    @FXML
    private void planet79Clicked() {
        nextPlanet = planet79;
        showTravel(universe.gameUniverse[78]);
    }
    @FXML
    private void planet80Clicked() {
        nextPlanet = planet80;
        showTravel(universe.gameUniverse[79]);
    }
    @FXML
    private void planet81Clicked() {
        nextPlanet = planet81;
        showTravel(universe.gameUniverse[80]);
    }
    @FXML
    private void planet82Clicked() {
        nextPlanet = planet82;
        showTravel(universe.gameUniverse[81]);
    }
    @FXML
    private void planet83Clicked() {
        nextPlanet = planet83;
        showTravel(universe.gameUniverse[82]);
    }
    @FXML
    private void planet84Clicked() {
        nextPlanet = planet84;
        showTravel(universe.gameUniverse[83]);
    }
    @FXML
    private void planet85Clicked() {
        nextPlanet = planet85;
        showTravel(universe.gameUniverse[84]);
    }
    @FXML
    private void planet86Clicked() {
        nextPlanet = planet86;
        showTravel(universe.gameUniverse[85]);
    }
    @FXML
    private void planet87Clicked() {
        nextPlanet = planet87;
        showTravel(universe.gameUniverse[86]);
    }
    @FXML
    private void planet88Clicked() {
        nextPlanet = planet88;
        showTravel(universe.gameUniverse[87]);
    }
    @FXML
    private void planet89Clicked() {
        nextPlanet = planet89;
        showTravel(universe.gameUniverse[88]);
    }
    @FXML
    private void planet90Clicked() {
        nextPlanet = planet90;
        showTravel(universe.gameUniverse[89]);
    }
    @FXML
    private void planet91Clicked() {
        nextPlanet = planet91;
        showTravel(universe.gameUniverse[90]);
    }
    @FXML
    private void planet92Clicked() {
        nextPlanet = planet92;
        showTravel(universe.gameUniverse[91]);
    }
    @FXML
    private void planet93Clicked() {
        nextPlanet = planet93;
        showTravel(universe.gameUniverse[92]);
    }
    @FXML
    private void planet94Clicked() {
        nextPlanet = planet94;
        showTravel(universe.gameUniverse[93]);
    }
    @FXML
    private void planet95Clicked() {
        nextPlanet = planet95;
        showTravel(universe.gameUniverse[94]);
    }
    @FXML
    private void planet96Clicked() {
        nextPlanet = planet96;
        showTravel(universe.gameUniverse[95]);
    }
    @FXML
    private void planet97Clicked() {
        nextPlanet = planet97;
        showTravel(universe.gameUniverse[96]);
    }
    @FXML
    private void planet98Clicked() {
        nextPlanet = planet98;
        showTravel(universe.gameUniverse[97]);
    }
    @FXML
    private void planet99Clicked() {
        nextPlanet = planet99;
        showTravel(universe.gameUniverse[98]);
    }
    @FXML
    private void planet100Clicked() {
        nextPlanet = planet100;
        showTravel(universe.gameUniverse[99]);
    }
    @FXML
    private void planet101Clicked() {
        nextPlanet = planet101;
        showTravel(universe.gameUniverse[100]);
    }
    @FXML
    private void planet102Clicked() {
        nextPlanet = planet102;
        showTravel(universe.gameUniverse[101]);
    }
    @FXML
    private void planet103Clicked() {
        nextPlanet = planet103;
        showTravel(universe.gameUniverse[102]);
    }
    @FXML
    private void planet104Clicked() {
        nextPlanet = planet104;
        showTravel(universe.gameUniverse[103]);
    }
    @FXML
    private void planet105Clicked() {
        nextPlanet = planet105;
        showTravel(universe.gameUniverse[104]);
    }
    @FXML
    private void planet106Clicked() {
        nextPlanet = planet106;
        showTravel(universe.gameUniverse[105]);
    }
    @FXML
    private void planet107Clicked() {
        nextPlanet = planet107;
        showTravel(universe.gameUniverse[106]);
    }
    @FXML
    private void planet108Clicked() {
        nextPlanet = planet108;
        showTravel(universe.gameUniverse[107]);
    }
    @FXML
    private void planet109Clicked() {
        nextPlanet = planet109;
        showTravel(universe.gameUniverse[108]);
    }
    @FXML
    private void planet110Clicked() {
        nextPlanet = planet110;
        showTravel(universe.gameUniverse[109]);
    }
    @FXML
    private void planet111Clicked() {
        nextPlanet = planet111;
        showTravel(universe.gameUniverse[110]);
    }
    @FXML
    private void planet112Clicked() {
        nextPlanet = planet112;
        showTravel(universe.gameUniverse[111]);
    }
    @FXML
    private void planet113Clicked() {
        nextPlanet = planet113;
        showTravel(universe.gameUniverse[112]);
    }
    @FXML
    private void planet114Clicked() {
        nextPlanet = planet114;
        showTravel(universe.gameUniverse[113]);
    }
// </editor-fold>
    /**
     * Refreshes map tab on click by resetting attributes
     */
    @FXML
    public void refreshMap() {
        currentPlanet.setFill(Color.DODGERBLUE);
        nextPlanet.setFill(Color.DARKORANGE);
        currentPlanet = nextPlanet;
    }
    /**
     * Initializes the map by filling the tab with circles.
     */
    private void initializeMap() {
        planet1.setLayoutX(universe.gameUniverse[0].getX() * 6 + 3);
        planet1.setLayoutY(universe.gameUniverse[0].getY() * 6 + 3);
        planet1.setVisible(true);
        planet1.setFill(Color.DARKORANGE);
        planet2.setLayoutX(universe.gameUniverse[1].getX() * 6 + 3);
        planet2.setLayoutY(universe.gameUniverse[1].getY() * 6 + 3);
        planet2.setVisible(true);
        planet3.setLayoutX(universe.gameUniverse[2].getX() * 6 + 3);
        planet3.setLayoutY(universe.gameUniverse[2].getY() * 6 + 3);
        planet3.setVisible(true);
        planet4.setLayoutX(universe.gameUniverse[3].getX() * 6 + 3);
        planet4.setLayoutY(universe.gameUniverse[3].getY() * 6 + 3);
        planet4.setVisible(true);
        planet5.setLayoutX(universe.gameUniverse[4].getX() * 6 + 3);
        planet5.setLayoutY(universe.gameUniverse[4].getY() * 6 + 3);
        planet5.setVisible(true);
        planet6.setLayoutX(universe.gameUniverse[5].getX() * 6 + 3);
        planet6.setLayoutY(universe.gameUniverse[5].getY() * 6 + 3);
        planet6.setVisible(true);
        planet7.setLayoutX(universe.gameUniverse[6].getX() * 6 + 3);
        planet7.setLayoutY(universe.gameUniverse[6].getY() * 6 + 3);
        planet7.setVisible(true);
        planet8.setLayoutX(universe.gameUniverse[7].getX() * 6 + 3);
        planet8.setLayoutY(universe.gameUniverse[7].getY() * 6 + 3);
        planet8.setVisible(true);
        planet9.setLayoutX(universe.gameUniverse[8].getX() * 6 + 3);
        planet9.setLayoutY(universe.gameUniverse[8].getY() * 6 + 3);
        planet9.setVisible(true);
        planet10.setLayoutX(universe.gameUniverse[9].getX() * 6 + 3);
        planet10.setLayoutY(universe.gameUniverse[9].getY() * 6 + 3);
        planet10.setVisible(true);
        planet11.setLayoutX(universe.gameUniverse[10].getX() * 6 + 3);
        planet11.setLayoutY(universe.gameUniverse[10].getY() * 6 + 3);
        planet11.setVisible(true);
        planet12.setLayoutX(universe.gameUniverse[11].getX() * 6 + 3);
        planet12.setLayoutY(universe.gameUniverse[11].getY() * 6 + 3);
        planet12.setVisible(true);
        planet13.setLayoutX(universe.gameUniverse[12].getX() * 6 + 3);
        planet13.setLayoutY(universe.gameUniverse[12].getY() * 6 + 3);
        planet13.setVisible(true);
        planet14.setLayoutX(universe.gameUniverse[13].getX() * 6 + 3);
        planet14.setLayoutY(universe.gameUniverse[13].getY() * 6 + 3);
        planet14.setVisible(true);
        planet15.setLayoutX(universe.gameUniverse[14].getX() * 6 + 3);
        planet15.setLayoutY(universe.gameUniverse[14].getY() * 6 + 3);
        planet15.setVisible(true);
        planet16.setLayoutX(universe.gameUniverse[15].getX() * 6 + 3);
        planet16.setLayoutY(universe.gameUniverse[15].getY() * 6 + 3);
        planet16.setVisible(true);
        planet17.setLayoutX(universe.gameUniverse[16].getX() * 6 + 3);
        planet17.setLayoutY(universe.gameUniverse[16].getY() * 6 + 3);
        planet17.setVisible(true);
        planet18.setLayoutX(universe.gameUniverse[17].getX() * 6 + 3);
        planet18.setLayoutY(universe.gameUniverse[17].getY() * 6 + 3);
        planet18.setVisible(true);
        planet19.setLayoutX(universe.gameUniverse[18].getX() * 6 + 3);
        planet19.setLayoutY(universe.gameUniverse[18].getY() * 6 + 3);
        planet19.setVisible(true);
        planet20.setLayoutX(universe.gameUniverse[19].getX() * 6 + 3);
        planet20.setLayoutY(universe.gameUniverse[19].getY() * 6 + 3);
        planet20.setVisible(true);
        planet21.setLayoutX(universe.gameUniverse[20].getX() * 6 + 3);
        planet21.setLayoutY(universe.gameUniverse[20].getY() * 6 + 3);
        planet21.setVisible(true);
        planet22.setLayoutX(universe.gameUniverse[21].getX() * 6 + 3);
        planet22.setLayoutY(universe.gameUniverse[21].getY() * 6 + 3);
        planet22.setVisible(true);
        planet23.setLayoutX(universe.gameUniverse[22].getX() * 6 + 3);
        planet23.setLayoutY(universe.gameUniverse[22].getY() * 6 + 3);
        planet23.setVisible(true);
        planet24.setLayoutX(universe.gameUniverse[23].getX() * 6 + 3);
        planet24.setLayoutY(universe.gameUniverse[23].getY() * 6 + 3);
        planet24.setVisible(true);
        planet25.setLayoutX(universe.gameUniverse[24].getX() * 6 + 3);
        planet25.setLayoutY(universe.gameUniverse[24].getY() * 6 + 3);
        planet25.setVisible(true);
        planet26.setLayoutX(universe.gameUniverse[25].getX() * 6 + 3);
        planet26.setLayoutY(universe.gameUniverse[25].getY() * 6 + 3);
        planet26.setVisible(true);
        planet27.setLayoutX(universe.gameUniverse[26].getX() * 6 + 3);
        planet27.setLayoutY(universe.gameUniverse[26].getY() * 6 + 3);
        planet27.setVisible(true);
        planet28.setLayoutX(universe.gameUniverse[27].getX() * 6 + 3);
        planet28.setLayoutY(universe.gameUniverse[27].getY() * 6 + 3);
        planet28.setVisible(true);
        planet29.setLayoutX(universe.gameUniverse[28].getX() * 6 + 3);
        planet29.setLayoutY(universe.gameUniverse[28].getY() * 6 + 3);
        planet29.setVisible(true);
        planet30.setLayoutX(universe.gameUniverse[29].getX() * 6 + 3);
        planet30.setLayoutY(universe.gameUniverse[29].getY() * 6 + 3);
        planet30.setVisible(true);
        planet31.setLayoutX(universe.gameUniverse[30].getX() * 6 + 3);
        planet31.setLayoutY(universe.gameUniverse[30].getY() * 6 + 3);
        planet31.setVisible(true);
        planet32.setLayoutX(universe.gameUniverse[31].getX() * 6 + 3);
        planet32.setLayoutY(universe.gameUniverse[31].getY() * 6 + 3);
        planet32.setVisible(true);
        planet33.setLayoutX(universe.gameUniverse[32].getX() * 6 + 3);
        planet33.setLayoutY(universe.gameUniverse[32].getY() * 6 + 3);
        planet33.setVisible(true);
        planet34.setLayoutX(universe.gameUniverse[33].getX() * 6 + 3);
        planet34.setLayoutY(universe.gameUniverse[33].getY() * 6 + 3);
        planet34.setVisible(true);
        planet35.setLayoutX(universe.gameUniverse[34].getX() * 6 + 3);
        planet35.setLayoutY(universe.gameUniverse[34].getY() * 6 + 3);
        planet35.setVisible(true);
        planet36.setLayoutX(universe.gameUniverse[35].getX() * 6 + 3);
        planet36.setLayoutY(universe.gameUniverse[35].getY() * 6 + 3);
        planet36.setVisible(true);
        planet37.setLayoutX(universe.gameUniverse[36].getX() * 6 + 3);
        planet37.setLayoutY(universe.gameUniverse[36].getY() * 6 + 3);
        planet37.setVisible(true);
        planet38.setLayoutX(universe.gameUniverse[37].getX() * 6 + 3);
        planet38.setLayoutY(universe.gameUniverse[37].getY() * 6 + 3);
        planet38.setVisible(true);
        planet39.setLayoutX(universe.gameUniverse[38].getX() * 6 + 3);
        planet39.setLayoutY(universe.gameUniverse[38].getY() * 6 + 3);
        planet39.setVisible(true);
        planet40.setLayoutX(universe.gameUniverse[39].getX() * 6 + 3);
        planet40.setLayoutY(universe.gameUniverse[39].getY() * 6 + 3);
        planet40.setVisible(true);
        planet41.setLayoutX(universe.gameUniverse[40].getX() * 6 + 3);
        planet41.setLayoutY(universe.gameUniverse[40].getY() * 6 + 3);
        planet41.setVisible(true);
        planet42.setLayoutX(universe.gameUniverse[41].getX() * 6 + 3);
        planet42.setLayoutY(universe.gameUniverse[41].getY() * 6 + 3);
        planet42.setVisible(true);
        planet43.setLayoutX(universe.gameUniverse[42].getX() * 6 + 3);
        planet43.setLayoutY(universe.gameUniverse[42].getY() * 6 + 3);
        planet43.setVisible(true);
        planet44.setLayoutX(universe.gameUniverse[43].getX() * 6 + 3);
        planet44.setLayoutY(universe.gameUniverse[43].getY() * 6 + 3);
        planet44.setVisible(true);
        planet45.setLayoutX(universe.gameUniverse[44].getX() * 6 + 3);
        planet45.setLayoutY(universe.gameUniverse[44].getY() * 6 + 3);
        planet45.setVisible(true);
        planet46.setLayoutX(universe.gameUniverse[45].getX() * 6 + 3);
        planet46.setLayoutY(universe.gameUniverse[45].getY() * 6 + 3);
        planet46.setVisible(true);
        planet47.setLayoutX(universe.gameUniverse[46].getX() * 6 + 3);
        planet47.setLayoutY(universe.gameUniverse[46].getY() * 6 + 3);
        planet47.setVisible(true);
        planet48.setLayoutX(universe.gameUniverse[47].getX() * 6 + 3);
        planet48.setLayoutY(universe.gameUniverse[47].getY() * 6 + 3);
        planet48.setVisible(true);
        planet49.setLayoutX(universe.gameUniverse[48].getX() * 6 + 3);
        planet49.setLayoutY(universe.gameUniverse[48].getY() * 6 + 3);
        planet49.setVisible(true);
        planet50.setLayoutX(universe.gameUniverse[49].getX() * 6 + 3);
        planet50.setLayoutY(universe.gameUniverse[49].getY() * 6 + 3);
        planet50.setVisible(true);
        planet51.setLayoutX(universe.gameUniverse[50].getX() * 6 + 3);
        planet51.setLayoutY(universe.gameUniverse[50].getY() * 6 + 3);
        planet51.setVisible(true);
        planet52.setLayoutX(universe.gameUniverse[51].getX() * 6 + 3);
        planet52.setLayoutY(universe.gameUniverse[51].getY() * 6 + 3);
        planet52.setVisible(true);
        planet53.setLayoutX(universe.gameUniverse[52].getX() * 6 + 3);
        planet53.setLayoutY(universe.gameUniverse[52].getY() * 6 + 3);
        planet53.setVisible(true);
        planet54.setLayoutX(universe.gameUniverse[53].getX() * 6 + 3);
        planet54.setLayoutY(universe.gameUniverse[53].getY() * 6 + 3);
        planet54.setVisible(true);
        planet55.setLayoutX(universe.gameUniverse[54].getX() * 6 + 3);
        planet55.setLayoutY(universe.gameUniverse[54].getY() * 6 + 3);
        planet55.setVisible(true);
        planet56.setLayoutX(universe.gameUniverse[55].getX() * 6 + 3);
        planet56.setLayoutY(universe.gameUniverse[55].getY() * 6 + 3);
        planet56.setVisible(true);
        planet57.setLayoutX(universe.gameUniverse[56].getX() * 6 + 3);
        planet57.setLayoutY(universe.gameUniverse[56].getY() * 6 + 3);
        planet57.setVisible(true);
        planet58.setLayoutX(universe.gameUniverse[57].getX() * 6 + 3);
        planet58.setLayoutY(universe.gameUniverse[57].getY() * 6 + 3);
        planet58.setVisible(true);
        planet59.setLayoutX(universe.gameUniverse[58].getX() * 6 + 3);
        planet59.setLayoutY(universe.gameUniverse[58].getY() * 6 + 3);
        planet59.setVisible(true);
        planet60.setLayoutX(universe.gameUniverse[59].getX() * 6 + 3);
        planet60.setLayoutY(universe.gameUniverse[59].getY() * 6 + 3);
        planet60.setVisible(true);
        planet61.setLayoutX(universe.gameUniverse[60].getX() * 6 + 3);
        planet61.setLayoutY(universe.gameUniverse[60].getY() * 6 + 3);
        planet61.setVisible(true);
        planet62.setLayoutX(universe.gameUniverse[61].getX() * 6 + 3);
        planet62.setLayoutY(universe.gameUniverse[61].getY() * 6 + 3);
        planet62.setVisible(true);
        planet63.setLayoutX(universe.gameUniverse[62].getX() * 6 + 3);
        planet63.setLayoutY(universe.gameUniverse[62].getY() * 6 + 3);
        planet63.setVisible(true);
        planet64.setLayoutX(universe.gameUniverse[63].getX() * 6 + 3);
        planet64.setLayoutY(universe.gameUniverse[63].getY() * 6 + 3);
        planet64.setVisible(true);
        planet65.setLayoutX(universe.gameUniverse[64].getX() * 6 + 3);
        planet65.setLayoutY(universe.gameUniverse[64].getY() * 6 + 3);
        planet65.setVisible(true);
        planet66.setLayoutX(universe.gameUniverse[65].getX() * 6 + 3);
        planet66.setLayoutY(universe.gameUniverse[65].getY() * 6 + 3);
        planet66.setVisible(true);
        planet67.setLayoutX(universe.gameUniverse[66].getX() * 6 + 3);
        planet67.setLayoutY(universe.gameUniverse[66].getY() * 6 + 3);
        planet67.setVisible(true);
        planet68.setLayoutX(universe.gameUniverse[67].getX() * 6 + 3);
        planet68.setLayoutY(universe.gameUniverse[67].getY() * 6 + 3);
        planet68.setVisible(true);
        planet69.setLayoutX(universe.gameUniverse[68].getX() * 6 + 3);
        planet69.setLayoutY(universe.gameUniverse[68].getY() * 6 + 3);
        planet69.setVisible(true);
        planet70.setLayoutX(universe.gameUniverse[69].getX() * 6 + 3);
        planet70.setLayoutY(universe.gameUniverse[69].getY() * 6 + 3);
        planet70.setVisible(true);
        planet71.setLayoutX(universe.gameUniverse[70].getX() * 6 + 3);
        planet71.setLayoutY(universe.gameUniverse[70].getY() * 6 + 3);
        planet71.setVisible(true);
        planet72.setLayoutX(universe.gameUniverse[71].getX() * 6 + 3);
        planet72.setLayoutY(universe.gameUniverse[71].getY() * 6 + 3);
        planet72.setVisible(true);
        planet73.setLayoutX(universe.gameUniverse[72].getX() * 6 + 3);
        planet73.setLayoutY(universe.gameUniverse[72].getY() * 6 + 3);
        planet73.setVisible(true);
        planet74.setLayoutX(universe.gameUniverse[73].getX() * 6 + 3);
        planet74.setLayoutY(universe.gameUniverse[73].getY() * 6 + 3);
        planet74.setVisible(true);
        planet75.setLayoutX(universe.gameUniverse[74].getX() * 6 + 3);
        planet75.setLayoutY(universe.gameUniverse[74].getY() * 6 + 3);
        planet75.setVisible(true);
        planet76.setLayoutX(universe.gameUniverse[75].getX() * 6 + 3);
        planet76.setLayoutY(universe.gameUniverse[75].getY() * 6 + 3);
        planet76.setVisible(true);
        planet77.setLayoutX(universe.gameUniverse[76].getX() * 6 + 3);
        planet77.setLayoutY(universe.gameUniverse[76].getY() * 6 + 3);
        planet77.setVisible(true);
        planet78.setLayoutX(universe.gameUniverse[77].getX() * 6 + 3);
        planet78.setLayoutY(universe.gameUniverse[77].getY() * 6 + 3);
        planet78.setVisible(true);
        planet79.setLayoutX(universe.gameUniverse[78].getX() * 6 + 3);
        planet79.setLayoutY(universe.gameUniverse[78].getY() * 6 + 3);
        planet79.setVisible(true);
        planet80.setLayoutX(universe.gameUniverse[79].getX() * 6 + 3);
        planet80.setLayoutY(universe.gameUniverse[79].getY() * 6 + 3);
        planet80.setVisible(true);
        planet81.setLayoutX(universe.gameUniverse[80].getX() * 6 + 3);
        planet81.setLayoutY(universe.gameUniverse[80].getY() * 6 + 3);
        planet81.setVisible(true);
        planet82.setLayoutX(universe.gameUniverse[81].getX() * 6 + 3);
        planet82.setLayoutY(universe.gameUniverse[81].getY() * 6 + 3);
        planet82.setVisible(true);
        planet83.setLayoutX(universe.gameUniverse[82].getX() * 6 + 3);
        planet83.setLayoutY(universe.gameUniverse[82].getY() * 6 + 3);
        planet83.setVisible(true);
        planet84.setLayoutX(universe.gameUniverse[83].getX() * 6 + 3);
        planet84.setLayoutY(universe.gameUniverse[83].getY() * 6 + 3);
        planet84.setVisible(true);
        planet85.setLayoutX(universe.gameUniverse[84].getX() * 6 + 3);
        planet85.setLayoutY(universe.gameUniverse[84].getY() * 6 + 3);
        planet85.setVisible(true);
        planet86.setLayoutX(universe.gameUniverse[85].getX() * 6 + 3);
        planet86.setLayoutY(universe.gameUniverse[85].getY() * 6 + 3);
        planet86.setVisible(true);
        planet87.setLayoutX(universe.gameUniverse[86].getX() * 6 + 3);
        planet87.setLayoutY(universe.gameUniverse[86].getY() * 6 + 3);
        planet87.setVisible(true);
        planet88.setLayoutX(universe.gameUniverse[87].getX() * 6 + 3);
        planet88.setLayoutY(universe.gameUniverse[87].getY() * 6 + 3);
        planet88.setVisible(true);
        planet89.setLayoutX(universe.gameUniverse[88].getX() * 6 + 3);
        planet89.setLayoutY(universe.gameUniverse[88].getY() * 6 + 3);
        planet89.setVisible(true);
        planet90.setLayoutX(universe.gameUniverse[89].getX() * 6 + 3);
        planet90.setLayoutY(universe.gameUniverse[89].getY() * 6 + 3);
        planet90.setVisible(true);
        planet91.setLayoutX(universe.gameUniverse[90].getX() * 6 + 3);
        planet91.setLayoutY(universe.gameUniverse[90].getY() * 6 + 3);
        planet91.setVisible(true);
        planet92.setLayoutX(universe.gameUniverse[91].getX() * 6 + 3);
        planet92.setLayoutY(universe.gameUniverse[91].getY() * 6 + 3);
        planet92.setVisible(true);
        planet93.setLayoutX(universe.gameUniverse[92].getX() * 6 + 3);
        planet93.setLayoutY(universe.gameUniverse[92].getY() * 6 + 3);
        planet93.setVisible(true);
        planet94.setLayoutX(universe.gameUniverse[93].getX() * 6 + 3);
        planet94.setLayoutY(universe.gameUniverse[93].getY() * 6 + 3);
        planet94.setVisible(true);
        planet95.setLayoutX(universe.gameUniverse[94].getX() * 6 + 3);
        planet95.setLayoutY(universe.gameUniverse[94].getY() * 6 + 3);
        planet95.setVisible(true);
        planet96.setLayoutX(universe.gameUniverse[95].getX() * 6 + 3);
        planet96.setLayoutY(universe.gameUniverse[95].getY() * 6 + 3);
        planet96.setVisible(true);
        planet97.setLayoutX(universe.gameUniverse[96].getX() * 6 + 3);
        planet97.setLayoutY(universe.gameUniverse[96].getY() * 6 + 3);
        planet97.setVisible(true);
        planet98.setLayoutX(universe.gameUniverse[97].getX() * 6 + 3);
        planet98.setLayoutY(universe.gameUniverse[97].getY() * 6 + 3);
        planet98.setVisible(true);
        planet99.setLayoutX(universe.gameUniverse[98].getX() * 6 + 3);
        planet99.setLayoutY(universe.gameUniverse[98].getY() * 6 + 3);
        planet99.setVisible(true);
        planet100.setLayoutX(universe.gameUniverse[99].getX() * 6 + 3);
        planet100.setLayoutY(universe.gameUniverse[99].getY() * 6 + 3);
        planet100.setVisible(true);
        planet101.setLayoutX(universe.gameUniverse[100].getX() * 6 + 3);
        planet101.setLayoutY(universe.gameUniverse[100].getY() * 6 + 3);
        planet101.setVisible(true);
        planet102.setLayoutX(universe.gameUniverse[101].getX() * 6 + 3);
        planet102.setLayoutY(universe.gameUniverse[101].getY() * 6 + 3);
        planet102.setVisible(true);
        planet103.setLayoutX(universe.gameUniverse[102].getX() * 6 + 3);
        planet103.setLayoutY(universe.gameUniverse[102].getY() * 6 + 3);
        planet103.setVisible(true);
        planet104.setLayoutX(universe.gameUniverse[103].getX() * 6 + 3);
        planet104.setLayoutY(universe.gameUniverse[103].getY() * 6 + 3);
        planet104.setVisible(true);
        planet105.setLayoutX(universe.gameUniverse[104].getX() * 6 + 3);
        planet105.setLayoutY(universe.gameUniverse[104].getY() * 6 + 3);
        planet105.setVisible(true);
        planet106.setLayoutX(universe.gameUniverse[105].getX() * 6 + 3);
        planet106.setLayoutY(universe.gameUniverse[105].getY() * 6 + 3);
        planet106.setVisible(true);
        planet107.setLayoutX(universe.gameUniverse[106].getX() * 6 + 3);
        planet107.setLayoutY(universe.gameUniverse[106].getY() * 6 + 3);
        planet107.setVisible(true);
        planet108.setLayoutX(universe.gameUniverse[107].getX() * 6 + 3);
        planet108.setLayoutY(universe.gameUniverse[107].getY() * 6 + 3);
        planet108.setVisible(true);
        planet109.setLayoutX(universe.gameUniverse[108].getX() * 6 + 3);
        planet109.setLayoutY(universe.gameUniverse[108].getY() * 6 + 3);
        planet109.setVisible(true);
        planet110.setLayoutX(universe.gameUniverse[109].getX() * 6 + 3);
        planet110.setLayoutY(universe.gameUniverse[109].getY() * 6 + 3);
        planet110.setVisible(true);
        planet111.setLayoutX(universe.gameUniverse[110].getX() * 6 + 3);
        planet111.setLayoutY(universe.gameUniverse[110].getY() * 6 + 3);
        planet111.setVisible(true);
        planet112.setLayoutX(universe.gameUniverse[111].getX() * 6 + 3);
        planet112.setLayoutY(universe.gameUniverse[111].getY() * 6 + 3);
        planet112.setVisible(true);
        planet113.setLayoutX(universe.gameUniverse[112].getX() * 6 + 3);
        planet113.setLayoutY(universe.gameUniverse[112].getY() * 6 + 3);
        planet113.setVisible(true);
        planet114.setLayoutX(universe.gameUniverse[113].getX() * 6 + 3);
        planet114.setLayoutY(universe.gameUniverse[113].getY() * 6 + 3);
        planet114.setVisible(true);
    }
    /**
     * Sells water on button press
     * @param event
     */
    @FXML
    private void sWaterBAction(ActionEvent event) {
        int money = market.sell("water");
        if (money >= 0) {
            waterCargo.setText(Integer.toString(market.nwater));
            planetWater.setText(Integer.toString(market.mwater));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys water on button press
     * @param event
     */
    @FXML
    private void bWaterBAction(ActionEvent event) {
        int money = market.buy("water");
        if (money >= 0) {
            waterCargo.setText(Integer.toString(market.nwater));
            planetWater.setText(Integer.toString(market.mwater));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells furs on button press.
     * @param event
     */
    @FXML
    private void sFursBAction(ActionEvent event) {
        int money = market.sell("fur");
        if (money >= 0) {
            furCargo.setText(Integer.toString(market.nfurs));
            planetFur.setText(Integer.toString(market.mfurs));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys furs on button press.
     * @param event
     */
    @FXML
    private void bFursBAction(ActionEvent event) {
        int money = market.buy("fur");
        if (money >= 0) {
            furCargo.setText(Integer.toString(market.nfurs));
            planetFur.setText(Integer.toString(market.mfurs));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells food on button press
     * @param event
     */
    @FXML
    private void sFoodBAction(ActionEvent event) {
        int money = market.sell("food");
        if (money >= 0) {
            foodCargo.setText(Integer.toString(market.nfood));
            planetFood.setText(Integer.toString(market.mfood));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys food on button press
     * @param event
     */
    @FXML
    private void bFoodBAction(ActionEvent event) {
        int money = market.buy("food");
        if (money >= 0) {
            foodCargo.setText(Integer.toString(market.nfood));
            planetFood.setText(Integer.toString(market.mfood));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells ore on button press
     * @param event
     */
    @FXML
    private void sOreBAction(ActionEvent event) {
        int money = market.sell("ore");
        if (money >= 0) {
            oreCargo.setText(Integer.toString(market.nore));
            planetOre.setText(Integer.toString(market.more));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys ore on button press
     * @param event
     */
    @FXML
    private void bOreBAction(ActionEvent event) {
        int money = market.buy("ore");
        if (money >= 0) {
            oreCargo.setText(Integer.toString(market.nore));
            planetOre.setText(Integer.toString(market.more));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells game on button press
     * @param event
     */
    @FXML
    private void sGamesBAction(ActionEvent event) {
        int money = market.sell("games");
        if (money >= 0) {
            gameCargo.setText(Integer.toString(market.ngames));
            planetGame.setText(Integer.toString(market.mgames));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys game on button press
     * @param event
     */
    @FXML
    private void bGamesBAction(ActionEvent event) {
        int money = market.buy("games");
        if (money >= 0) {
            gameCargo.setText(Integer.toString(market.ngames));
            planetGame.setText(Integer.toString(market.mgames));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells firearm on button press
     * @param event
     */
    @FXML
    private void sFirearmsBAction(ActionEvent event) {
        int money = market.sell("firearm");
        if (money >= 0) {
            fireCargo.setText(Integer.toString(market.nfirearms));
            planetFire.setText(Integer.toString(market.mfirearms));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys firearm on button press
     * @param event
     */
    @FXML
    private void bFirearmsBAction(ActionEvent event) {
        int money = market.buy("firearm");
        if (money >= 0) {
            fireCargo.setText(Integer.toString(market.nfirearms));
            planetFire.setText(Integer.toString(market.mfirearms));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells medicine on button press
     * @param event
     */
    @FXML
    private void sMedicineBAction(ActionEvent event) {
        int money = market.sell("medicine");
        if (money >= 0) {
            medCargo.setText(Integer.toString(market.nmedicine));
            planetMed.setText(Integer.toString(market.mmedicine));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys medicine on button press
     * @param event
     */
    @FXML
    private void bMedicineBAction(ActionEvent event) {
        int money = market.buy("medicine");
        if (money >= 0) {
            medCargo.setText(Integer.toString(market.nmedicine));
            planetMed.setText(Integer.toString(market.mmedicine));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells machine on button press
     * @param event
     */
    @FXML
    private void sMachinesBAction(ActionEvent event) {
        int money = market.sell("machines");
        if (money >= 0) {
            machCargo.setText(Integer.toString(market.nmachines));
            planetMach.setText(Integer.toString(market.mmachines));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys machine on button press
     * @param event
     */
    @FXML
    private void bMachinesBAction(ActionEvent event) {
        int money = market.buy("machines");
        if (money >= 0) {
            machCargo.setText(Integer.toString(market.nmachines));
            planetMach.setText(Integer.toString(market.mmachines));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells narcotic on button press
     * @param event
     */
    @FXML
    private void sNarcoticsBAction(ActionEvent event) {
        int money = market.sell("narcotics");
        if (money >= 0) {
            narcCargo.setText(Integer.toString(market.nnarcotics));
            planetNarc.setText(Integer.toString(market.mnarcotics));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys game on button press
     * @param event
     */
    @FXML
    private void bNarcoticsBAction(ActionEvent event) {
        int money = market.buy("narcotics");
        if (money >= 0) {
            narcCargo.setText(Integer.toString(market.nnarcotics));
            planetNarc.setText(Integer.toString(market.mnarcotics));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Sells robot on button press
     * @param event
     */
    @FXML
    private void sRobotsBAction(ActionEvent event) {
        int money = market.sell("robot");
        if (money >= 0) {
            robCargo.setText(Integer.toString(market.nrobots));
            planetRob.setText(Integer.toString(market.mrobots));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showSErr();
        }
    }
    /**
     * Buys robot on button press
     * @param event
     */
    @FXML
    private void bRobotsBAction(ActionEvent event) {
        int money = market.buy("robot");
        if (money >= 0) {
            robCargo.setText(Integer.toString(market.nrobots));
            planetRob.setText(Integer.toString(market.mrobots));
            player.credit = money;
            updatePlayer();
            market.updateShip();
            marketMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showBErr();
        }
    }
    /**
     * Refreshes shipyard on tab click to make data is current
     */
    @FXML
    private void refreshShipyard() {
        shipOneName.setText("Flea");
        shipTwoName.setText("Gnat");
        shipThreeName.setText("Firefly");
        shipFourName.setText("Mosquito");
        shipFiveName.setText("BumbleBee");
        shipOnePrice.setText(Integer.toString(shipyard.getShipPrice("Flea")));
        shipTwoPrice.setText(Integer.toString(shipyard.getShipPrice("Gnat")));
        shipThreePrice.setText(Integer.toString(shipyard.getShipPrice("Firefly")));
        shipFourPrice.setText(Integer.toString(shipyard.getShipPrice("Mosquito")));
        shipFivePrice.setText(Integer.toString(shipyard.getShipPrice("Bumblebee")));
        currentShipMoney.setText(Integer.toString(player.getCredit()));
        String currShipType = player.getShip().getShipType();
        currentShipName.setText(currShipType);
        checkShipType();
    }
    /**
     * Determine which buttons on the shipyard to enable/disable
     */
    private void checkShipType() {
        String currShipType = player.getShip().getShipType();
        currentShipName.setText(currShipType);
        currentShipMoney.setText(Integer.toString(player.getCredit()));
        if (currShipType.equals("Flea")) {
            buyShipOne.setDisable(true);
        } else {
            buyShipOne.setDisable(false);
        }
        if (currShipType.equals("Gnat")) {
            buyShipTwo.setDisable(true);
        } else {
            buyShipTwo.setDisable(false);
        }
        if (currShipType.equals("Firefly")) {
            buyShipThree.setDisable(true);
        } else {
            buyShipThree.setDisable(false);
        }
        if (currShipType.equals("Mosquito")) {
            buyShipFour.setDisable(true);
        } else {
            buyShipFour.setDisable(false);
        }
        if (currShipType.equals("Bumblebee")) {
            buyShipFive.setDisable(true);
        } else {
            buyShipFive.setDisable(false);
        }
    }
    /**
     * Buy a flea ship
     */
    @FXML
    private void buyShipOne() {
        if (shipyard.buy("Flea")!= -1) {
            player = GameData.getPlayer();
            checkShipType();
        } else {
            showBErr();
        }
    }
    /**
     * Buy a gnat ship.
     */
    @FXML
    private void buyShipTwo() {
        if (shipyard.buy("Gnat") != -1) {
            player = GameData.getPlayer();
            checkShipType();
        } else {
            showBErr();
        }
    }
    /**
     * Buy a firefly ship.
     */
    @FXML
    private void buyShipThree() {
        if (shipyard.buy("Firefly") != -1) {
            player = GameData.getPlayer();
            checkShipType();
        } else {
            showBErr();
        }
    }
    /**
     * Buy a mosquito ship
     */
    @FXML
    private void buyShipFour() {
        if (shipyard.buy("Mosquito") != -1) {
            player = GameData.getPlayer();
            checkShipType();
        } else {
            showBErr();
        }
    }
    /**
     * Buy a bumblebee ship.
     */
    @FXML
    private void buyShipFive() {
        if (shipyard.buy("Bumblebee") != -1) {
            player = GameData.getPlayer();
            checkShipType();
        } else {
            showBErr();
        }
    }
    /**
     * Method to show the travel dialog system and update data if
     * travel occurs
     * @param solar the solar system to travel to
     */
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
            if (planetChanged) {
                refreshMap();
                refreshMarket();
                refreshSolar();
                shipyard = new Shipyard();
                if (shipyard.checkTechLevel()) {
                    shipyardTab.setDisable(false);
                    upgradesTab.setDisable(false);
                } else {
                    shipyardTab.setDisable(true);
                    upgradesTab.setDisable(true);
                }
                planetChanged = false;
            }
        } catch (IOException e) {
            System.out.println("Show travel failed");
        }
    }
    /**
     * Show a buy error window.
     */
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
            System.out.println("Show buy error failed");
        }
    }
    /**
     * Show a sell error window
     */
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
            System.out.println("Show sell error failed");
        }
    }
    /**
     * Update player in game data
     */
    private void updatePlayer() {
        GameData.setPlayer(player);
    }

// </editor-fold>
    /**
     * Refresh upgrade tab attributes.
     */
    @FXML
    private void refreshUpgrades() {
        Ship curShip = GameData.getShip();
        player = GameData.getPlayer();
        Shipyard curShipyard = new Shipyard();
        ShipUpgrade pulse = new ShipUpgrade("weapon", "pulseLaser");
        if (pulse.checkTechLevel()) {
            buyPulse.setDisable(false);
        } else {
            buyPulse.setDisable(true);
        }
        ShipUpgrade beam = new ShipUpgrade("weapon", "beamLaser");
        if (beam.checkTechLevel()) {
            buyBeam.setDisable(false);
        } else {
            buyBeam.setDisable(true);
        }
        ShipUpgrade military = new ShipUpgrade("weapon", "militaryLaser");
        ShipUpgrade energy = new ShipUpgrade("shield", "smallShield");
        ShipUpgrade reflective = new ShipUpgrade("shield", "bigShield");
        if (reflective.checkTechLevel()) {
            buyReflective.setDisable(false);
        } else {
            buyReflective.setDisable(true);
        }
        ShipUpgrade navigation = new ShipUpgrade("gadget", "navigation");
        ShipUpgrade addCargo = new ShipUpgrade("gadget", "5cargo");
        ShipUpgrade targeting = new ShipUpgrade("gadget", "targeting");
        ShipUpgrade cloaking = new ShipUpgrade("gadget", "cloaking");
        ShipUpgrade autoRep = new ShipUpgrade("gadget", "autoRepair");
        shipyardMoney.setText(Integer.toString(player.getCredit()));
        shipyardShipName.setText(curShip.getShipName());
        weaponSlots.setText(Integer.toString(curShip.getWeaponSlots()));
        shieldSlots.setText(Integer.toString(curShip.getShieldSlots()));
        gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
        pulsePrice.setText(Integer.toString(pulse.getPrice()));
        beamPrice.setText(Integer.toString(beam.getPrice()));
        militaryPrice.setText(Integer.toString(military.getPrice()));
        energyPrice.setText(Integer.toString(energy.getPrice()));
        reflectivePrice.setText(Integer.toString(reflective.getPrice()));
        navigationPrice.setText(Integer.toString(navigation.getPrice()));
        fiveCargoPrice.setText(Integer.toString(addCargo.getPrice()));
        targetingPrice.setText(Integer.toString(targeting.getPrice()));
        cloakingPrice.setText(Integer.toString(cloaking.getPrice()));
        autorepairPrice.setText(Integer.toString(autoRep.getPrice()));
    }
    /**
     * Show an error window when buying in shipyard.
     */
    @FXML
    private void showShipYardErr() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("shipyarderr/buyErr.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            BuyErrController errController = loader.getController();
            errController.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            System.out.println("Show shipyard error failed");
        }
    }
    /**
     * The following buyX methods buy that item on the shipyard, or display
     * an error if it cannot be bought.
     */
    @FXML
    private void buyPulse() {

        ShipUpgrade pulse = new ShipUpgrade("weapon", "pulseLaser");
        if (pulse.buyUpgrade("weapon", "pulseLaser")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            weaponSlots.setText(Integer.toString(curShip.getWeaponSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyBeam() {
        ShipUpgrade beam = new ShipUpgrade("weapon", "beamLaser");
        if (beam.buyUpgrade("weapon", "beamLaser")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            weaponSlots.setText(Integer.toString(curShip.getWeaponSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyMilitary() {
        ShipUpgrade military = new ShipUpgrade("weapon", "militaryLaser");
        if (military.buyUpgrade("weapon", "militaryLaser")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            weaponSlots.setText(Integer.toString(curShip.getWeaponSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyEnergy() {
        ShipUpgrade energy = new ShipUpgrade("shield", "smallShield");
        if (energy.buyUpgrade("shield", "smallShield")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            shieldSlots.setText(Integer.toString(curShip.getShieldSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyReflective() {
        ShipUpgrade reflective = new ShipUpgrade("shield", "bigShield");
        if (reflective.buyUpgrade("shield", "bigShield")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            shieldSlots.setText(Integer.toString(curShip.getShieldSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyFiveCargo() {
        ShipUpgrade addCargo = new ShipUpgrade("gadget", "5cargo");
        if (addCargo.buyUpgrade("gadget", "5cargo")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyNavigation() {
        ShipUpgrade navigation = new ShipUpgrade("gadget", "navigation");
        if (navigation.buyUpgrade("gadget", "navigation")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyTargeting() {
        ShipUpgrade targeting = new ShipUpgrade("gadget", "targeting");
        if (targeting.buyUpgrade("gadget", "targeting")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyAutorepair() {
        ShipUpgrade autoRep = new ShipUpgrade("gadget", "autoRepair");
        if (autoRep.buyUpgrade("gadget", "autoRepair")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private void buyCloaking() {
        ShipUpgrade cloaking = new ShipUpgrade("gadget", "cloaking");
        if (cloaking.buyUpgrade("gadget", "cloaking")) {
            Ship curShip = GameData.getShip();
            player = GameData.getPlayer();
            gadgetSlots.setText(Integer.toString(curShip.getGadgetSlots()));
            shipyardMoney.setText(Integer.toString(player.getCredit()));
        } else {
            showShipYardErr();
        }
    }
    @FXML
    private MenuItem debugTravelling;
    /**
     * Debug window for travel testing.
     */
    @FXML
    private void debugTravellingAction(){
        GameData.setPlayer(new Player("Tester",15,15,15,15,3));
        Ship newship = new Bumblebee();
        newship.setFirearm(10);
        newship.setNarcotic(10);
        GameData.setShip(newship);
        try {
                FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/Travelling.fxml"));
                AnchorPane newPage = (AnchorPane) loader.load();
                Stage newGameStage = new Stage();
                newGameStage.setTitle("Travelling");
                Scene scene = new Scene(newPage);
                newGameStage.setScene(scene);
                TravellingController controller = loader.getController();
                controller.setTheStage(newGameStage,30);
                newGameStage.showAndWait();
            } catch (IOException ex) {
                Logger.getLogger(TravelController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
