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
/**
 * FXML Controller class.
 *
 * @author YaxiongLiu
 */
public class PirateEncController implements Initializable {
    /**
     * Variable declaration.
     */
    @FXML
    private transient Button pirateOKB;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label myHP;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label enemyHP;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Button surB;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Button attB;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label battleInfo1;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label battleInfo2;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label winnerInfo1;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label winnerInfo2;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label errMsg;
    /**
     * Variable declaration.
     */
    private final transient Player player = GameData.getPlayer();
    /**
     * Variable declaration.
     */
    private final transient Ship ship = GameData.getShip();
    /**
     * Variable declaration.
     */
    private transient int playerMaxHP;
    /**
     * Variable declaration.
     */
    private transient int playerHP;
    /**
     * Variable declaration.
     */
    private transient int pirateMaxHP;
    /**
     * Variable declaration.
     */
    private transient int pirateHP;
    /**
     * Variable declaration.
     */
    private transient boolean hit;
    /**
     * Variable declaration.
     */
    private transient boolean winnerIsPlayer = false;
    /**
     * Variable declaration.
     */
    private final transient Random rand = new Random();
    /**
     * Variable declaration.
     */
    private transient Stage mainStage;
    /**
     * Variable declaration.
     */
    private transient Stage fightStage;
    /**
     * Variable declaration.
     */
    private transient Stage winnerStage;
    /**
     * Variable declaration.
     */
    private transient Stage errStage;
    /**
     * number 3500.
     */
    private static final transient int NUM3K5 = 3500;
    /**
     * number 800.
     */
    private static final transient int NUM800 = 800;
    /**
     * number 2500.
     */
    private static final transient int NUM2K5 = 2500;
    /**
     * number 10000.
     */
    private static final transient int NUM10K = 10000;
    /**
     * number 10.
     */
    private static final transient int NUM10 = 10;
    /**
     * number 4.
     */
    private static final transient int NUM4 = 4;
    /**
     * number 500.
     */
    private static final transient int NUM500 = 500;
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
     * Set main stage.
     * @param theStage the stage
     */
    public final void setTheStage(final Stage theStage) {
        this.mainStage = theStage;
        pirateOKB.setDisable(true);
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set fight stage.
     * @param theFightStage the fight stage
     */
    public final void setFightStage(final Stage theFightStage) {
        this.fightStage = theFightStage;
        playerMaxHP = NUM3K5 + NUM800 * player.getEngineer();
        playerHP = playerMaxHP;
        pirateMaxHP = NUM2K5;
        pirateHP = pirateMaxHP;
        winnerIsPlayer = false;
        enemyHP.setText(Integer.toString(pirateHP)
                + "/" + Integer.toString(pirateMaxHP));
        myHP.setText(Integer.toString(playerHP)
                + "/" + Integer.toString(playerMaxHP));
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Set winner stage.
     * @param theWinnerStage THEWINNERSRTAGE
     * @param playerWin PLAYERWIN
     */
    public final void setWinnerStage(final Stage theWinnerStage,
            final boolean playerWin) {
        this.winnerStage = theWinnerStage;
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
     * @param theErrStage ERR
     * @param str STR
     */
    public final void setErrStage(final Stage theErrStage,
            final String str) {
        this.errStage = theErrStage;
        errMsg.setText(str);
        errStage.initStyle(StageStyle.UNDECORATED);
        errStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Pirate OK Action.
     */
    @FXML
    private void pirateOKBAction() {
        mainStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * pirate escape action.
     */
    @FXML
    private void pirateEscapeBAction() {
        mainStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * pirate fight action.
     * @throws IOException E
     */
    @FXML
    private void pirateFightBAction() throws IOException {
        mainStage.close();
        showFight();
    }
    /**
     * Escape action.
     */
    @FXML
    private void escBAction() {
        fightStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * Surrender action.
     * @throws IOException E
     */
    @FXML
    private void surBAction() throws IOException {
        ship.emptyCargo();
        GameData.setShip(ship);
        if (player.getCredit() > NUM10K) {
            player.setCredit(NUM10K);
            GameData.setPlayer(player);
        }
        attB.setDisable(true);
        surB.setDisable(true);
        showErr("Police got everything you owned. "
                + "\nBut left some money for you.");
    }
    /**
     * Attack action.
     * @throws IOException E
     */
    @FXML
    private void attBAction() throws IOException {
            if (pirateHP > 0 && playerHP > 0) {
                if (rand.nextInt(NUM10) < player.getFighter() + NUM4) {
                    hit = true;
                } else {
                    hit = false;
                }
                if (hit) {
                    if (pirateHP >= NUM500) {
                        pirateHP -= NUM500;
                    } else {
                        pirateHP = 0;
                    }
                    enemyHP.setText(Integer.toString(pirateHP)
                            + "/" + Integer.toString(pirateMaxHP));
                    battleInfo1.setText("Player hits Police "
                            + "and deals 500 damage.");
                } else {
                    battleInfo1.setText("Player attacks Police "
                            + "but does not hit.");
                }
                if (rand.nextInt(NUM10) > player.getPilot() / (NUM4 - 1)) {
                    hit = true;
                } else {
                    hit = false;
                }
                if (hit) {
                    if (playerHP >= NUM500) {
                        playerHP -= NUM500;
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
     * Winner OK Action.
     * @param event
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
     * Error OK Action.
     * @param event
     */
    @FXML
    private void errOKBAction() {
        errStage.close();
    }
    /**
     * Show fight.
     * @throws IOException E
     */
    private void showFight() throws IOException {
            final FXMLLoader localFightLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/pirate/pirateFight.fxml"));
            final AnchorPane localFightPage
                    = (AnchorPane) localFightLoader.load();
            final Stage localFightStage = new Stage();
            localFightStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            final PirateEncController pirateController
                    = localFightLoader.getController();
            pirateController.setFightStage(localFightStage);
            localFightStage.show();
    }
    /**
     * Show winner.
     * @throws IOException E
     */
    private void showWinner() throws IOException {
            final FXMLLoader localWinnerLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/pirate/FightWinner.fxml"));
            final AnchorPane localWinnerPage
                    = (AnchorPane) localWinnerLoader.load();
            final Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            final PirateEncController pirateController
                    = localWinnerLoader.getController();
            pirateController.setWinnerStage(localWinnerStage, winnerIsPlayer);
            localWinnerStage.show();
    }
    /**
     * Show error.
     * @param str STR
     * @throws IOException E
     */
    private void showErr(final String str) throws IOException {
            final FXMLLoader localErrLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/pirate/PirateEncErr.fxml"));
            final AnchorPane localErrPage = (AnchorPane) localErrLoader.load();
            final Stage localErrStage = new Stage();
            localErrStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localErrPage);
            localErrStage.setScene(scene);
            final PirateEncController pirateController
                    = localErrLoader.getController();
            pirateController.setErrStage(localErrStage, str);
            localErrStage.show();
    }
}
