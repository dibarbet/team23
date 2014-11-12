/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.trader;

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
import spacefx.Good;
import spacefx.Player;
import spacefx.Ship;
import spacefx.SpaceFX;
/**
 *
 * @author YaxiongLiu
 */
public class TraderEncController implements Initializable {
    // <editor-fold defaultstate="collapsed" desc="Variables Declariation">
    /**
     * Variable declaration.
     */
    @FXML
    private transient Button traderTraB;
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
    private transient Label narcoticPlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label narcoticPrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label narcoticTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label robotTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label robotPrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label robotPlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label gamePlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label gamePrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label gameTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label firearmTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label firePrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label firearmPlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label machinePlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label machinePrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label machineTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label medicineTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label medicinePrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label medicinePlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label foodPlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label foodPrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label foodTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label oreTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label orePrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label orePlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label furPlayer;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label furPrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label furTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label playerMoney;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label waterTrader;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label waterPrice;
    /**
     * Variable declaration.
     */
    @FXML
    private transient Label waterPlayer;
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
    private transient int money, pWater, pFur, pFood, pOre,
            pGame, pFirearm, pMedicine, pMachine, pNarcotics, pRobot,
            tWater, tFur, tFood, tOre, tGame, tFirearm,
            tMedicine, tMachine, tNarcotics, tRobot,
            waterP, furP, foodP, oreP, gameP, firearmP,
            medicineP, machineP, narcoticsP, robotP;
    // </editor-fold>
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
    private transient int traderMaxHP;
    /**
     * Variable declaration.
     */
    private transient int traderHP;
    /**
     * Variable declaration.
     */
    private transient Stage mainStage;
    /**
     * Variable declaration.
     */
    private transient Stage tradingStage;
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
     * number 3.
     */
    private static final transient int NUM3 = 3;
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
     * Initialization.
     * @param url URL
     * @param longrb RB
     */
    @Override
    public void initialize(final URL url, final ResourceBundle longrb) {
        // TODO
    }
    /**
     * set main stage.
     * @param theStage main stage
     */
    public final void setTheStage(final Stage theStage) {
        mainStage = theStage;
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * set fight stage.
     * @param theFightStage fight stage
     */
    public final void setFightStage(final Stage theFightStage) {
        this.fightStage = theFightStage;
        playerMaxHP = NUM3K5 + NUM800 * player.getEngineer();
        playerHP = playerMaxHP;
        traderMaxHP = NUM2K5;
        traderHP = traderMaxHP;
        winnerIsPlayer = false;
        enemyHP.setText(Integer.toString(traderHP)
                + "/" + Integer.toString(traderMaxHP));
        myHP.setText(Integer.toString(playerHP)
                + "/" + Integer.toString(playerMaxHP));
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * set trading stage.
     * @param theStage trading stage
     */
    public final void setTradingStage(final Stage theStage) {
        tradingStage = theStage;
        initTrading();
        tradingStage.initStyle(StageStyle.UNDECORATED);
        tradingStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * set winner stage.
     * @param theWinnerStage winner stage
     * @param playerWin whether or not player is winner
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
     * set error stage.
     * @param theErrStage error stage
     * @param str error message
     */
    public final void setErrStage(final Stage theErrStage,
            final String str) {
        errStage = theErrStage;
        errMsg.setText(str);
        errStage.initStyle(StageStyle.UNDECORATED);
        errStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * enter trader fight.
     * @throws IOException IOExcaption
     */
    @FXML
    private void traderAttBAction() throws IOException {
        mainStage.close();
        showFight();
    }
    /**
     * leave trader action.
     */
    @FXML
    private void traderLeaveBAction() {
        mainStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * show trading action.
     * @throws IOException IOException
     */
    @FXML
    private void traderTraBAction() throws IOException {
        traderTraB.setDisable(true);
        showTrading();
    }
    /**
     * Fight escape action.
     */
    @FXML
    private void escBAction() {
        this.fightStage.close();
        spacefx.randomEvent.TravellingController.running = true;
    }
    /**
     * Fight stage surrender action.
     * @throws IOException IOException
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
        showErr("Trader got everything you owned. "
                + "\nBut left some money for you.");
    }
    /**
     * Fight stage attack action.
     * @throws IOException IOException
     */
    @FXML
    private void attBAction() throws IOException {
        if (traderHP > 0 && playerHP > 0) {
                if (rand.nextInt(NUM10) < player.getFighter() + NUM4) {
                    hit = true;
                } else {
                    hit = false;
                }
                if (hit) {
                    if (traderHP >= NUM500) {
                        traderHP -= NUM500;
                    } else {
                        traderHP = 0;
                    }
                    enemyHP.setText(Integer.toString(traderHP)
                            + "/" + Integer.toString(traderMaxHP));
                    battleInfo1.setText("Player hits Police "
                            + "and deals 500 damage.");
                } else {
                    battleInfo1.setText("Player attacks Police "
                            + "but does not hit.");
                }
                if (rand.nextInt(NUM10) > player.getPilot() / NUM3) {
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
                    battleInfo2.setText("Trader hits Player"
                            + " and deals 500 damage.");
                } else {
                    battleInfo2.setText("Trader attacks "
                            + "Plyaer but does not hit.");
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
     * winner stage OK action.
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
     * Error stage OK action.
     */
    @FXML
    private void errOKBAction() {
        errStage.close();
    }
    // <editor-fold defaultstate="collapsed" desc="trading Part">
    /**
     * Sell Narcotics.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sNarcoticsBAction(ActionEvent event) throws IOException {
        if (pNarcotics > 0) {
            tNarcotics++;
            pNarcotics--;
            ship.decCount();
            narcoticTrader.setText(Integer.toString(tNarcotics));
            narcoticPlayer.setText(Integer.toString(pNarcotics));
            money += narcoticsP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough narcotic to sell.");
        }
    }
    /**
     * Buy Narcotics.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bNarcoticsBAction(ActionEvent event) throws IOException {
        if (tNarcotics > 0
                && ship.getCount() < ship.getLimit()
                && money > narcoticsP) {
            tNarcotics--;
            pNarcotics++;
            ship.incCount();
            narcoticTrader.setText(Integer.toString(tNarcotics));
            narcoticPlayer.setText(Integer.toString(pNarcotics));
            money -= narcoticsP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tNarcotics <= 0) {
                showErr("Trader does not have enough \nnarcotic.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Buy Robots.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bRobotsBAction(ActionEvent event) throws IOException {
        if (tRobot > 0 && ship.getCount() < ship.getLimit() && money > robotP) {
            tRobot--;
            pRobot++;
            ship.incCount();
            robotTrader.setText(Integer.toString(tRobot));
            robotPlayer.setText(Integer.toString(pRobot));
            money -= robotP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tRobot <= 0) {
                showErr("Trader does not have enough \nrobot.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Sell Robot.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sRobotsBAction(ActionEvent event) throws IOException {
        if (pRobot > 0) {
            tRobot++;
            pRobot--;
            ship.decCount();
            robotTrader.setText(Integer.toString(tRobot));
            robotPlayer.setText(Integer.toString(pRobot));
            money += robotP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough robot to sell.");
        }
    }
    /**
     * Sell Games.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sGamesBAction(ActionEvent event) throws IOException {
        if (pGame > 0) {
            tGame++;
            pGame--;
            ship.decCount();
            gameTrader.setText(Integer.toString(tGame));
            gamePlayer.setText(Integer.toString(pGame));
            money += gameP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough game to sell.");
        }
    }
    /**
     * Buy Games.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bGamesBAction(ActionEvent event) throws IOException {
        if (tGame > 0 && ship.getCount() < ship.getLimit() && money > gameP) {
            tGame--;
            pGame++;
            ship.incCount();
            gameTrader.setText(Integer.toString(tGame));
            gamePlayer.setText(Integer.toString(pGame));
            money -= gameP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tGame <= 0) {
                showErr("Trader does not have enough \ngame.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Buy Firearms.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bFirearmsBAction(ActionEvent event) throws IOException {
        if (tFirearm > 0
                && ship.getCount() < ship.getLimit()
                && money > firearmP) {
            tFirearm--;
            pFirearm++;
            ship.incCount();
            firearmTrader.setText(Integer.toString(tFirearm));
            firearmPlayer.setText(Integer.toString(pFirearm));
            money -= firearmP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFirearm <= 0) {
                showErr("Trader does not have enough \nfirearm.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Sell Firearms.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sFirearmsBAction(ActionEvent event) throws IOException {
        if (pFirearm > 0) {
            tFirearm++;
            pFirearm--;
            ship.decCount();
            firearmTrader.setText(Integer.toString(tFirearm));
            firearmPlayer.setText(Integer.toString(pFirearm));
            money += firearmP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough firearms to sell.");
        }
    }
    /**
     * Sell Machines.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sMachinesBAction(ActionEvent event) throws IOException {
        if (pMachine > 0) {
            tMachine++;
            pMachine--;
            ship.decCount();
            machineTrader.setText(Integer.toString(tMachine));
            machinePlayer.setText(Integer.toString(pMachine));
            money += machineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough machine to sell.");
        }
    }
    /**
     * Buy Machines.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bMachinesBAction(ActionEvent event) throws IOException {
        if (tMachine > 0
                && ship.getCount() < ship.getLimit()
                && money > machineP) {
            tMachine--;
            pMachine++;
            ship.incCount();
            machineTrader.setText(Integer.toString(tMachine));
            machinePlayer.setText(Integer.toString(pMachine));
            money -= machineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tMachine <= 0) {
                showErr("Trader does not have enough \nmachine.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Buy Medicine.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bMedicineBAction(ActionEvent event) throws IOException {
        if (tMedicine > 0
                && ship.getCount() < ship.getLimit()
                && money > medicineP) {
            tMedicine--;
            pMedicine++;
            ship.incCount();
            medicineTrader.setText(Integer.toString(tMedicine));
            medicinePlayer.setText(Integer.toString(pMedicine));
            money -= medicineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tMedicine <= 0) {
                showErr("Trader does not have enough \nmedicine.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Sell Medicine.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sMedicineBAction(ActionEvent event) throws IOException {
        if (pMedicine > 0) {
            tMedicine++;
            pMedicine--;
            ship.decCount();
            medicineTrader.setText(Integer.toString(tMedicine));
            medicinePlayer.setText(Integer.toString(pMedicine));
            money += medicineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough medicine to sell.");
        }
    }
    /**
     * Sell Food.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sFoodBAction(ActionEvent event) throws IOException {
        if (pFood > 0) {
            tFood++;
            pFood--;
            ship.decCount();
            foodTrader.setText(Integer.toString(tFood));
            foodPlayer.setText(Integer.toString(pFood));
            money += foodP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough food to sell.");
        }
    }
    /**
     * Buy Food.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bFoodBAction(ActionEvent event) throws IOException {
        if (tFood > 0
                && ship.getCount() < ship.getLimit()
                && money > foodP) {
            tFood--;
            pFood++;
            ship.incCount();
            foodTrader.setText(Integer.toString(tFood));
            foodPlayer.setText(Integer.toString(pFood));
            money -= foodP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFood <= 0) {
                showErr("Trader does not have enough \nfood.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Bur Ore.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bOreBAction(ActionEvent event) throws IOException {
        if (tOre > 0 && ship.getCount() < ship.getLimit() && money > oreP) {
            tOre--;
            pOre++;
            ship.incCount();
            oreTrader.setText(Integer.toString(tOre));
            orePlayer.setText(Integer.toString(pOre));
            money -= oreP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tOre <= 0) {
                showErr("Trader does not have enough \nore.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Sell Ore.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sOreBAction(ActionEvent event) throws IOException {
        if (pOre > 0) {
            tOre++;
            pOre--;
            ship.decCount();
            oreTrader.setText(Integer.toString(tOre));
            orePlayer.setText(Integer.toString(pOre));
            money += oreP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough ore to sell.");
        }
    }
    /**
     * Sell Furs.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sFursBAction(ActionEvent event) throws IOException {
        if (pFur > 0) {
            tFur++;
            pFur--;
            ship.decCount();
            furTrader.setText(Integer.toString(tFur));
            furPlayer.setText(Integer.toString(pFur));
            money += furP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough fur to sell.");
        }
    }
    /**
     * Buy Furs.
     * @param event
     */
    @FXML
    private void bFursBAction(ActionEvent event) throws IOException {
        if (tFur > 0 && ship.getCount() < ship.getLimit() && money > furP) {
            tFur--;
            pFur++;
            ship.incCount();
            furTrader.setText(Integer.toString(tFur));
            furPlayer.setText(Integer.toString(pFur));
            money -= furP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFur <= 0) {
                showErr("Trader does not have enough \nfur.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Buy Water.
     * @param event
     * @throws IOException
     */
    @FXML
    private void bWaterBAction(ActionEvent event) throws IOException {
        if (tWater > 0 && ship.getCount() < ship.getLimit() && money > waterP) {
            tWater--;
            pWater++;
            ship.incCount();
            waterTrader.setText(Integer.toString(tWater));
            waterPlayer.setText(Integer.toString(pWater));
            money -= waterP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tWater <= 0) {
                showErr("Trader does not have enough \nwater.");
            } else if (ship.getCount() >= ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }
    /**
     * Sell Water.
     * @param event
     * @throws IOException
     */
    @FXML
    private void sWaterBAction(ActionEvent event) throws IOException {
        if (pWater > 0) {
            tWater++;
            pWater--;
            ship.decCount();
            waterTrader.setText(Integer.toString(tWater));
            waterPlayer.setText(Integer.toString(pWater));
            money += waterP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough water to sell.");
        }
    }
    /**
     * Stop trading.
     * @param event
     */
    @FXML
    private void stopTradingBAction(ActionEvent event) {
        update();
        tradingStage.close();
    }
    /**
    * Initialize trading.
    **/
    private void initTrading() {
        money = player.getCredit();
        playerMoney.setText(Integer.toString(money));
        pWater = ship.getWater();
        waterPlayer.setText(Integer.toString(pWater));
        pFur = ship.getFur();
        furPlayer.setText(Integer.toString(pFur));
        pFood = ship.getFood();
        foodPlayer.setText(Integer.toString(pFood));
        pOre = ship.getFood();
        orePlayer.setText(Integer.toString(pOre));
        pGame = ship.getGame();
        gamePlayer.setText(Integer.toString(pGame));
        pFirearm = ship.getFirearm();
        firearmPlayer.setText(Integer.toString(pFirearm));
        pMedicine = ship.getMedicine();
        medicinePlayer.setText(Integer.toString(pMedicine));
        pMachine = ship.getMachine();
        machinePlayer.setText(Integer.toString(pMachine));
        pNarcotics = ship.getNarcotic();
        narcoticPlayer.setText(Integer.toString(pNarcotics));
        pRobot = ship.getRobot();
        robotPlayer.setText(Integer.toString(pRobot));
        waterP = (int) ((Good.Water.basePrice * (1 + rand.nextInt(Good.Water.var) / 7)) * (1 - 0.01 * player.getTrader()));
        waterPrice.setText(Integer.toString(waterP));
        furP = (int) ((Good.Furs.basePrice * (1 + rand.nextInt(Good.Furs.var) / 7)) * (1 - 0.01 * player.getTrader()));
        furPrice.setText(Integer.toString(furP));
        foodP = (int) ((Good.Food.basePrice * (1 + rand.nextInt(Good.Food.var) / 7)) * (1 - 0.01 * player.getTrader()));
        foodPrice.setText(Integer.toString(foodP));
        oreP = (int) ((Good.Ore.basePrice * (1 + rand.nextInt(Good.Ore.var) / 7)) * (1 - 0.01 * player.getTrader()));
        orePrice.setText(Integer.toString(oreP));
        gameP = (int) ((Good.Games.basePrice * (1 + rand.nextInt(Good.Games.var) / 7)) * (1 - 0.01 * player.getTrader()));
        gamePrice.setText(Integer.toString(gameP));
        firearmP = (int) ((Good.Firearms.basePrice * (1 + rand.nextInt(Good.Firearms.var) / 7)) * (1 - 0.01 * player.getTrader()));
        firePrice.setText(Integer.toString(firearmP));
        medicineP = (int) ((Good.Medicine.basePrice * (1 + rand.nextInt(Good.Medicine.var) / 7))*(1 - 0.01 * player.getTrader()));
        medicinePrice.setText(Integer.toString(medicineP));
        machineP = (int) ((Good.Machines.basePrice * (1 + rand.nextInt(Good.Machines.var) / 7)) * (1 - 0.01 * player.getTrader()));
        machinePrice.setText(Integer.toString(machineP));
        narcoticsP = (int) ((Good.Narcotics.basePrice * (1 + rand.nextInt(Good.Narcotics.var) / 7)) * (1 - 0.01*player.getTrader()));
        narcoticPrice.setText(Integer.toString(narcoticsP));
        robotP = (int) ((Good.Robots.basePrice * (1 + rand.nextInt(Good.Robots.var) / 7)) * (1 - 0.01*player.getTrader()));
        robotPrice.setText(Integer.toString(robotP));
        tWater = rand.nextInt(30) + 20;
        waterTrader.setText(Integer.toString(tWater));
        tFur = rand.nextInt(20) + 10;
        furTrader.setText(Integer.toString(tFur));
        tFood = rand.nextInt(35) + 15;
        foodTrader.setText(Integer.toString(tFood));
        tOre = rand.nextInt(15) + 10;
        oreTrader.setText(Integer.toString(tOre));
        tGame = rand.nextInt(20) + 10;
        gameTrader.setText(Integer.toString(tGame));
        tFirearm = rand.nextInt(5) + 10;
        firearmTrader.setText(Integer.toString(tFirearm));
        tMedicine = rand.nextInt(10) + 10;
        medicineTrader.setText(Integer.toString(tMedicine));
        tMachine = rand.nextInt(5) + 10;
        machineTrader.setText(Integer.toString(tMachine));
        tNarcotics = rand.nextInt(5);
        narcoticTrader.setText(Integer.toString(tNarcotics));
        tRobot = rand.nextInt(3);
        robotTrader.setText(Integer.toString(tRobot));
    }
    // </editor-fold>
    /**
     * Update ship and player.
     */
    private void update() {
        ship.setWater(pWater);
        ship.setFur(pFur);
        ship.setFood(pFood);
        ship.setGame(pGame);
        ship.setFirearm(pFirearm);
        ship.setMachine(pMachine);
        ship.setMedicine(pMedicine);
        ship.setOre(pOre);
        ship.setNarcotic(pNarcotics);
        ship.setRobot(pRobot);
        player.setCredit(money);
        GameData.setShip(ship);
        GameData.setPlayer(player);
    }
    /**
     * Show fight stage.
     * @throws IOException IOException
     */
    private void showFight() throws IOException {
            final FXMLLoader localFightLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent/"
                            + "encounter/trader/traderFight.fxml"));
            final AnchorPane localFightPage
                    = (AnchorPane) localFightLoader.load();
            final Stage localFightStage = new Stage();
            localFightStage.setTitle("Trader Fight");
            final Scene scene = new Scene(localFightPage);
            localFightStage.setScene(scene);
            final TraderEncController traderController
                    = localFightLoader.getController();
            traderController.setFightStage(localFightStage);
            localFightStage.show();
    }
    /**
     * Show trading stage.
     * @throws IOException IOException
     */
    private void showTrading() throws IOException {
            final FXMLLoader localTraLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/trader/TradingWithTrader.fxml"));
            final AnchorPane localTradingPage
                    = (AnchorPane) localTraLoader.load();
            final Stage localTradingStage = new Stage();
            localTradingStage.setTitle("Trader Fight");
            final Scene scene = new Scene(localTradingPage);
            localTradingStage.setScene(scene);
            final TraderEncController traderController
                    = localTraLoader.getController();
            traderController.setTradingStage(localTradingStage);
            localTradingStage.show();
    }
    /**
     * Show winner stage.
     * @throws IOException IOException
     */
    private void showWinner() throws IOException {
            final FXMLLoader localWinnerLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/trader/FightWinner.fxml"));
            final AnchorPane localWinnerPage =
                    (AnchorPane) localWinnerLoader.load();
            final Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            final TraderEncController traderController
                    = localWinnerLoader.getController();
            traderController.setWinnerStage(localWinnerStage, winnerIsPlayer);
            localWinnerStage.show();
    }
    /**
     * Show error stage.
     * @param str error message
     * @throws IOException IOException
     */
    private void showErr(final String str) throws IOException {
            final FXMLLoader localErrLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/trader/TraderEncErr.fxml"));
            final AnchorPane localErrPage
                    = (AnchorPane) localErrLoader.load();
            final Stage localErrStage = new Stage();
            localErrStage.setTitle("Pirate Fight");
            final Scene scene = new Scene(localErrPage);
            localErrStage.setScene(scene);
            final TraderEncController traderController
                    = localErrLoader.getController();
            traderController.setErrStage(localErrStage, str);
            localErrStage.show();
    }
}
