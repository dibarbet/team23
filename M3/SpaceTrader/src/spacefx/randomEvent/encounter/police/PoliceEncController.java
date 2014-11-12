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
 * Police encounter controller.
 * @author YaxiongLiu
 */
public class PoliceEncController implements Initializable {
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button policeFightB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button policeEscapeB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label policeEncInfo;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button policeBribeB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button policeOKB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label myHP;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label enemyHP;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button surB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button attB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button bribeOKB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Button bribeCancelB;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label bribeAmount;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label battleInfo1;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label battleInfo2;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label winnerInfo1;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label winnerInfo2;
    /**
     * Variable Declaration.
     */
    @FXML
    private transient Label errMsg;
    /**
     * Variable Declaration.
     */
    private final transient Player player = GameData.getPlayer();
    /**
     * Variable Declaration.
     */
    private final transient Ship ship = GameData.getShip();
    /**
     * Variable Declaration.
     */
    private transient int playerMaxHP;
    /**
     * Variable Declaration.
     */
    private transient int playerHP;
    /**
     * Variable Declaration.
     */
    private transient int policeMaxHP;
    /**
     * Variable Declaration.
     */
    private transient int policeHP;
    /**
     * Variable Declaration.
     */
    private transient int bribeMoney;
    /**
     * Variable Declaration.
     */
    private transient boolean hit;
    /**
     * Variable Declaration.
     */
    private transient boolean winnerIsPlayer = false;
    /**
     * Variable Declaration.
     */
    private final transient Random rand = new Random();
    /**
     * Variable Declaration.
     */
    private transient Stage mainStage;
    /**
     * Variable Declaration.
     */
    private transient Stage bribeStage;
    /**
     * Variable Declaration.
     */
    private transient Stage fightStage;
    /**
     * Variable Declaration.
     */
    private transient Stage winnerStage;
    /**
     * Variable Declaration.
     */
    private transient Stage errStage;
    /**
     * Variable Declaration.
     */
    private static final transient int NARP = 200;
    /**
     * Variable Declaration.
     */
    private static final transient int FIRP = 300;
    /**
     * Initializes the controller class.
     * @param url URL
     * @param longrb RB
     */
    @Override
    public void initialize(final URL url, final ResourceBundle longrb) {
        // TODO
    }
    /**
     * Set main Stage.
     * @param theStage main stage
     */
    public final void setTheStage(final Stage theStage) {
        mainStage = theStage;
        policeEncInfo.setText("Police is checking your cargo.");
        PoliceGlobalData.setSitu("checking cargo");
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set bribe stage.
     * @param theStage bribe stage
     */
    public final void setBribeStage(final Stage theStage) {
        bribeStage = theStage;
        bribeStage.initStyle(StageStyle.UNDECORATED);
        bribeStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set fight stage.
     * @param theStage fight stage
     */
    public final void setFightStage(final Stage theStage) {
        fightStage = theStage;
        playerMaxHP = 3500 + 800 * player.getEngineer();
        playerHP = playerMaxHP;
        policeMaxHP = 2500;
        policeHP = policeMaxHP;
        winnerIsPlayer = false;
        enemyHP.setText(Integer.toString(policeHP)
                + "/" + Integer.toString(policeMaxHP));
        myHP.setText(Integer.toString(playerHP)
                + "/" + Integer.toString(playerMaxHP));
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set winner stage.
     * @param theWinnerStage winner stage
     * @param playerWin winner information
     */
    public final void setWinnerStage(final Stage theWinnerStage,
            final boolean playerWin) {
        winnerStage = theWinnerStage;
        winnerIsPlayer = playerWin;
        if (playerWin) {
            winnerInfo1.setText("You Win");
        } else {
            winnerInfo1.setText("Your ship has been destroyed.");
            winnerInfo2.setText("Game Over");
        }
        winnerStage.initStyle(StageStyle.UNDECORATED);
        winnerStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set error stage.
     * @param theErrStage error stage
     * @param str string
     */
    public final void setErrStage(final Stage theErrStage,
            final String str) {
        errStage = theErrStage;
        errMsg.setText(str);
        errStage.initStyle(StageStyle.UNDECORATED);
        errStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * enter fight action.
     * @throws IOException IOException
     */
    @FXML
    private void policeFightBAction() throws IOException {
        mainStage.close();
        PoliceGlobalData.setSitu("initial");
        showFight();
    }
    /**
     * escape police action.
     */
    @FXML
    private void policeEscapeBAction() {
        mainStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * bribe police action.
     * @throws IOException IOException
     */
    @FXML
    private void policeBribeBAction() throws IOException {
        PoliceGlobalData.setSitu("bribing");
        policeOKB.setText("Next");
        policeOKB.setDisable(false);
        policeBribeB.setDisable(true);
        policeFightB.setDisable(true);
        policeEscapeB.setDisable(true);
        showBribe();
    }
    /**
     * Police OK Action.
     */
    @FXML
    private void policeOKBAction() {
            if (PoliceGlobalData.getSitu().equals("bribed")) {
                policeEncInfo.setText("Police: I didn't see anything");
                policeEscapeB.setText("Leave");
                policeEscapeB.setDisable(false);
            } else if (PoliceGlobalData.getSitu().equals("bribe cancelled")) {
                policeFightB.setDisable(false);
                policeEscapeB.setDisable(false);
            } else if (PoliceGlobalData.getSitu().equals("checking cargo")) {
                policeEncInfo.setText(fineInfo(GameData.getShip()));
                policeOKB.setDisable(true);
                policeEscapeB.setText("Leave");
            }
            policeOKB.setDisable(true);
    }
    /**
     * Escape fight action.
     */
    @FXML
    private void escBAction() {
        fightStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * Surrender fight action.
     * @param event
     */
    @FXML
    private void surBAction(ActionEvent event) throws IOException {
        ship.emptyCargo();
        GameData.setShip(ship);
        if (player.getCredit() > 10000) {
            player.setCredit(10000);
            GameData.setPlayer(player);
        }
        attB.setDisable(true);
        surB.setDisable(true);
        showErr("Police got everything you owned. "
                + "\nBut left some money for you.");
    }
    /**
     * Attack.
     * @throws IOException IOException
     */
    @FXML
    private void attBAction() throws IOException {
            if (policeHP > 0 && playerHP > 0) {
                if (rand.nextInt(10) < player.getFighter() + 4) {
                    hit = true;
                } else {
                    hit = false;
                }
                if (hit) {
                    if (policeHP >= 500) {
                        policeHP -= 500;
                    } else {
                        policeHP = 0;
                    }
                    enemyHP.setText(Integer.toString(policeHP)
                            + "/" + Integer.toString(policeMaxHP));
                    battleInfo1.setText("Player hits Police "
                            + "and deals 500 damage.");
                } else {
                    battleInfo1.setText("Player attacks Police "
                            + "but does not hit.");
                }
                if (rand.nextInt(10) > player.getPilot() / 3) {
                    hit = true;
                } else {
                    hit = false;
                }
                if (hit) {
                    if (playerHP >= 500) {
                        playerHP -= 500;
                    } else {
                        playerHP = 0;
                    }
                    myHP.setText(Integer.toString(playerHP)
                            + "/" + Integer.toString(playerMaxHP));
                    battleInfo2.setText("Police hits Player "
                            + "and deals 500 damage.");
                } else {
                    battleInfo2.setText("Police attacks Plyaer "
                            + "but does not hit.");
                }
            } else if (playerHP > 0) {
                winnerIsPlayer = true;
                fightStage.close();
                showWinner();
            } else {
                fightStage.close();
                showWinner();
            }
    }
    /**
     * Bribe OK action.
     */
    @FXML
    private void bribeOKBAction() {
        if (PoliceGlobalData.getSitu().equals("bribing")) {
            bribeMoney = 500 + rand.nextInt(500);
            bribeAmount.setText("You are going to bribe police $"
                    + Integer.toString(bribeMoney));
            bribeOKB.setText("OK");
            bribeCancelB.setText("Cancel");
            PoliceGlobalData.setSitu("bribe amount shown");
        } else if (PoliceGlobalData.getSitu().equals("bribe amount shown")) {
            PoliceGlobalData.setSitu("bribed");
            player.loseCredit(bribeMoney);
            GameData.setPlayer(player);
            bribeStage.close();
        }
    }
    /**
     * Winner OK Action.
     */
    @FXML
    private void winnerOKBAction() {
        if (winnerIsPlayer) {
            winnerStage.close();
            spacefx.randomEvent.TravellingController.running = true;
        } else {
            System.exit(0);
        }
    }
    /**
     * Cancel bribe.
     */
    @FXML
    private void bribeCancelBAction() {
        PoliceGlobalData.setSitu("bribe cancelled");
        this.bribeStage.close();
    }
    /**
     * Error OK action.
     */
    @FXML
    private void errOKBAction() {
        errStage.close();
    }
    /**
     * Show bribe stage.
     * @throws IOException IOEception
     */
    private void showBribe() throws IOException {
            final FXMLLoader localBribeLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent/"
                            + "encounter/police/BribePolice.fxml"));
            final AnchorPane localBribePage
                    = (AnchorPane) localBribeLoader.load();
            final Stage localBribeStage = new Stage();
            localBribeStage.setTitle("Bribe Police");
            final Scene scene = new Scene(localBribePage);
            localBribeStage.setScene(scene);
            final PoliceEncController policeController
                    = localBribeLoader.getController();
            policeController.setBribeStage(localBribeStage);
            localBribeStage.show();
    }
    /**
     * Show fight stage.
     * @throws IOException IOException
     */
    private void showFight() throws IOException {
            final FXMLLoader localFightLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/police/policeFight.fxml"));
            final AnchorPane localFightPage
                    = (AnchorPane) localFightLoader.load();
            final Stage localFightStage = new Stage();
            localFightStage.setTitle("Police Fight");
            final Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            final PoliceEncController policeController
                    = localFightLoader.getController();
            policeController.setFightStage(localFightStage);
            localFightStage.show();
    }
    /**
     * Show winner stage.
     * @throws IOException IOException
     */
    private void showWinner() throws IOException {
            final FXMLLoader localWinnerLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/pirate/FightWinner.fxml"));
            final AnchorPane localWinnerPage
                    = (AnchorPane) localWinnerLoader.load();
            final Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Police Fight");
            final Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            final PirateEncController pirateController
                    = localWinnerLoader.getController();
            pirateController.setWinnerStage(localWinnerStage, winnerIsPlayer);
            localWinnerStage.show();
    }
    /**
     * Show error stage.
     * @param str string
     * @throws IOException IOException
     */
    private void showErr(final String str) throws IOException {
            final FXMLLoader localErrLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/police/PoliceEncErr.fxml"));
            final AnchorPane localErrPage = (AnchorPane) localErrLoader.load();
            final Stage localErrStage = new Stage();
            localErrStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localErrPage);
            localErrStage.setScene(scene);
            final PoliceEncController policeController
                    = localErrLoader.getController();
            policeController.setErrStage(localErrStage, str);
            localErrStage.show();
    }
    /**
     * refresh fine info.
     * @param localShip localShip
     * @return string
     */
    public String fineInfo(final Ship localShip) {
        String result;
        if (localShip.getFirearm() > 0 && localShip.getNarcotic() > 0) {
            result = "Plice found illegal good "
                    + localShip.getFirearm() + " firearms \nand "
                    + localShip.getNarcotic()
                    + " narcotics in your ship "
                    + "\nand took them away. You got a ticket \nand paid "
                    + Integer.toString(localShip.getNarcotic() * NARP
                            + localShip.getFirearm() * FIRP)
                    + " for it";
            localShip.setFirearm(0);
            localShip.setNarcotic(0);
            GameData.setShip(localShip);
        } else if (localShip.getFirearm() > 0) {
            result = "Plice found illegal good "
                    + localShip.getFirearm() + " firearms "
                    + "\nin your ship and took them "
                    + "away. \nYou got a ticket and paid "
                    + Integer.toString(localShip.getFirearm() * FIRP)
                    + " for it";
            localShip.setFirearm(0);
            GameData.setShip(localShip);
        } else if (localShip.getNarcotic() > 0) {
            result = "Plice found illegal good " + localShip.getNarcotic()
                    + " narcotics \nin your ship and took them away. "
                    + "\nYou got a ticket and paid "
                    + Integer.toString(localShip.getNarcotic() * NARP)
                    + " for it";
            localShip.setNarcotic(0);
            GameData.setShip(localShip);
        } else {
            result = "Police did not find any illegal good "
                    + "\nin your ship, your are good to go.";
        }
        return result;
    }
}