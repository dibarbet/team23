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
import spacefx.randomEvent.encounter.pirate.PirateEncController;
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
    private Label furPrice;
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
    private Label waterPrice;
    @FXML
    private Button sWaterB;
    @FXML
    private Label waterPlayer;
    @FXML
    private Button stopTradingB;
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
    @FXML
    private Label errMsg;

    
    private int money,amount,pWater,pFur,pFood,pOre,pGame,pFirearm,pMedicine,pMachine,pNarcotics,pRobot,
            tWater,tFur,tFood,tOre,tGame,tFirearm,tMedicine,tMachine,tNarcotics,tRobot,
            waterP,furP,foodP,oreP,gameP,firearmP,medicineP,machineP,narcoticsP,robotP;
    // </editor-fold>
    private Player player = GameData.getPlayer();
    private Ship ship = GameData.getShip();
    private int playerMaxHP=2000;
    private int playerHP=2000;
    private boolean hit;
    private boolean winnerIsPlayer=false;
    private Random rand = new Random();
    private int traderMaxHP=2000;
    private int traderHP=2000;
    private Stage theStage;
    private Stage tradingStage;
    private Stage fightStage;
    private Stage winnerStage;
    private Stage errStage;
    private boolean isTrading=false;

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
    
    public void setFightStage(Stage theFightStage) {
        this.fightStage = theFightStage;
        playerMaxHP=1000 + 200*player.getEngineer();
        playerHP=playerMaxHP;
        winnerIsPlayer=false;
        enemyHP.setText(Integer.toString(traderHP)+"/"+Integer.toString(traderMaxHP));
        myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
        fightStage.initStyle(StageStyle.UNDECORATED);
        fightStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public void setTradingStage(Stage theStage) {
        this.tradingStage = theStage;
        initTrading();
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
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
    
    public void setErrStage(Stage theErrStage, String str) {
        this.errStage=theErrStage;
        errMsg.setText(str);
        errStage.initStyle(StageStyle.UNDECORATED);
        errStage.initModality(Modality.APPLICATION_MODAL);
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
        System.out.println("This is where it is being used");
    }

    @FXML
    private void traderTraBAction(ActionEvent event) {
        traderTraB.setDisable(true);
        showTrading();
    }
    
    @FXML
    private void escBAction(ActionEvent event) {
        this.fightStage.close();
        spacefx.randomEvent.TravellingController.running=true;
        
    }

    @FXML
    private void surBAction(ActionEvent event) {
        ship.emptyCargo();
        GameData.setShip(ship);
        if(player.getCredit()>10000) {
            player.setCredit(10000);
            GameData.setPlayer(player);
        }
        attB.setDisable(true);
        surB.setDisable(true);
        showErr("Trader got everything you owned. \nBut left some money for you.");
    }

    @FXML
    private void attBAction(ActionEvent event) {
        if (traderHP>0 && playerHP>0) {
                if (rand.nextInt(10)<player.getFighter()/3) hit=true; 
                else hit=false;
                if (hit) {
                    if (traderHP>=500) traderHP-=500;
                    else traderHP=0;
                    enemyHP.setText(Integer.toString(traderHP)+"/"+Integer.toString(traderMaxHP));
                    battleInfo1.setText("Player hits Police and deals 500 damage.");
                } else {battleInfo1.setText("Player attacks Police but does not hit.");}
                if (rand.nextInt(10)>player.getPilot()/3) hit = true;
                else hit = false;
                if (hit) {
                    if (playerHP>=500) playerHP-=500;
                    else playerHP=0;
                    myHP.setText(Integer.toString(playerHP)+"/"+Integer.toString(playerMaxHP));
                    battleInfo2.setText("Trader hits Player and deals 500 damage.");
                } else {battleInfo2.setText("Trader attacks Plyaer but does not hit.");}
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
    
    @FXML
    private void errOKBAction(ActionEvent event) {
        errStage.close();
    }
    // <editor-fold defaultstate="collapsed" desc="trading Part">
    @FXML
    private void sNarcoticsBAction(ActionEvent event) {
        if(pNarcotics>0) {
            tNarcotics++;
            pNarcotics--;
            ship.decCount();
            narcoticTrader.setText(Integer.toString(tNarcotics));
            narcoticPlayer.setText(Integer.toString(pNarcotics));
            money+=narcoticsP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough narcotic to sell.");
        }
    }

    @FXML
    private void bNarcoticsBAction(ActionEvent event) {
        if(tNarcotics>0 && ship.getCount()<ship.getLimit() && money>narcoticsP) {
            tNarcotics--;
            pNarcotics++;
            ship.incCount();
            narcoticTrader.setText(Integer.toString(tNarcotics));
            narcoticPlayer.setText(Integer.toString(pNarcotics));
            money-=narcoticsP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tNarcotics<=0) {
                showErr("Trader does not have enough \nnarcotic.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        } 
    }

    @FXML
    private void bRobotsBAction(ActionEvent event) {
        if(tRobot>0 && ship.getCount()<ship.getLimit() && money>robotP) {
            tRobot--;
            pRobot++;
            ship.incCount();
            robotTrader.setText(Integer.toString(tRobot));
            robotPlayer.setText(Integer.toString(pRobot));
            money-=robotP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tRobot<=0) {
                showErr("Trader does not have enough \nrobot.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void sRobotsBAction(ActionEvent event) {
        if(pRobot>0) {
            tRobot++;
            pRobot--;
            ship.decCount();
            robotTrader.setText(Integer.toString(tRobot));
            robotPlayer.setText(Integer.toString(pRobot));
            money+=robotP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough robot to sell.");
        }
    }

    @FXML
    private void sGamesBAction(ActionEvent event) {
        if(pGame>0) {
            tGame++;
            pGame--;
            ship.decCount();
            gameTrader.setText(Integer.toString(tGame));
            gamePlayer.setText(Integer.toString(pGame));
            money+=gameP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough game to sell.");
        }
    }

    @FXML
    private void bGamesBAction(ActionEvent event) {
        if(tGame>0 && ship.getCount()<ship.getLimit() && money>gameP) {
            tGame--;
            pGame++;
            ship.incCount();
            gameTrader.setText(Integer.toString(tGame));
            gamePlayer.setText(Integer.toString(pGame));
            money-=gameP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tGame<=0) {
                showErr("Trader does not have enough \ngame.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void bFirearmsBAction(ActionEvent event) {
        if(tFirearm>0 && ship.getCount()<ship.getLimit() && money>firearmP) {
            tFirearm--;
            pFirearm++;
            ship.incCount();
            firearmTrader.setText(Integer.toString(tFirearm));
            firearmPlayer.setText(Integer.toString(pFirearm));
            money-=firearmP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFirearm<=0) {
                showErr("Trader does not have enough \nfirearm.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void sFirearmsBAction(ActionEvent event) {
        if(pFirearm>0) {
            tFirearm++;
            pFirearm--;
            ship.decCount();
            firearmTrader.setText(Integer.toString(tFirearm));
            firearmPlayer.setText(Integer.toString(pFirearm));
            money+=firearmP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough firearms to sell.");
        }
    }

    @FXML
    private void sMachinesBAction(ActionEvent event) {
        if(pMachine>0) {
            tMachine++;
            pMachine--;
            ship.decCount();
            machineTrader.setText(Integer.toString(tMachine));
            machinePlayer.setText(Integer.toString(pMachine));
            money+=machineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough machine to sell.");
        }
    }

    @FXML
    private void bMachinesBAction(ActionEvent event) {
        if(tMachine>0 && ship.getCount()<ship.getLimit() && money>machineP) {
            tMachine--;
            pMachine++;
            ship.incCount();
            machineTrader.setText(Integer.toString(tMachine));
            machinePlayer.setText(Integer.toString(pMachine));
            money-=machineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tMachine<=0) {
                showErr("Trader does not have enough \nmachine.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void bMedicineBAction(ActionEvent event) {
        if(tMedicine>0 && ship.getCount()<ship.getLimit() && money>medicineP) {
            tMedicine--;
            pMedicine++;
            ship.incCount();
            medicineTrader.setText(Integer.toString(tMedicine));
            medicinePlayer.setText(Integer.toString(pMedicine));
            money-=medicineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tMedicine<=0) {
                showErr("Trader does not have enough \nmedicine.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void sMedicineBAction(ActionEvent event) {
        if(pMedicine>0) {
            tMedicine++;
            pMedicine--;
            ship.decCount();
            medicineTrader.setText(Integer.toString(tMedicine));
            medicinePlayer.setText(Integer.toString(pMedicine));
            money+=medicineP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough medicine to sell.");
        }
    }

    @FXML
    private void sFoodBAction(ActionEvent event) {
        if(pFood>0) {
            tFood++;
            pFood--;
            ship.decCount();
            foodTrader.setText(Integer.toString(tFood));
            foodPlayer.setText(Integer.toString(pFood));
            money+=foodP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough food to sell.");
        }
    }

    @FXML
    private void bFoodBAction(ActionEvent event) {
        if(tFood>0 && ship.getCount()<ship.getLimit() && money>foodP) {
            tFood--;
            pFood++;
            ship.incCount();
            foodTrader.setText(Integer.toString(tFood));
            foodPlayer.setText(Integer.toString(pFood));
            money-=foodP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFood<=0) {
                showErr("Trader does not have enough \nfood.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void bOreBAction(ActionEvent event) {
        if(tOre>0 && ship.getCount()<ship.getLimit() && money>oreP) {
            tOre--;
            pOre++;
            ship.incCount();
            oreTrader.setText(Integer.toString(tOre));
            orePlayer.setText(Integer.toString(pOre));
            money-=oreP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tOre<=0) {
                showErr("Trader does not have enough \nore.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void sOreBAction(ActionEvent event) {
        if(pOre>0) {
            tOre++;
            pOre--;
            ship.decCount();
            oreTrader.setText(Integer.toString(tOre));
            orePlayer.setText(Integer.toString(pOre));
            money+=oreP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough ore to sell.");
        }
    }

    @FXML
    private void sFursBAction(ActionEvent event) {
        if(pFur>0) {
            tFur++;
            pFur--;
            ship.decCount();
            furTrader.setText(Integer.toString(tFur));
            furPlayer.setText(Integer.toString(pFur));
            money+=furP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough fur to sell.");
        }
    }

    @FXML
    private void bFursBAction(ActionEvent event) {
        if(tFur>0 && ship.getCount()<ship.getLimit() && money>furP) {
            tFur--;
            pFur++;
            ship.incCount();
            furTrader.setText(Integer.toString(tFur));
            furPlayer.setText(Integer.toString(pFur));
            money-=furP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tFur<=0) {
                showErr("Trader does not have enough \nfur.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void bWaterBAction(ActionEvent event) {
        if(tWater>0 && ship.getCount()<ship.getLimit() && money>waterP) {
            tWater--;
            pWater++;
            ship.incCount();
            waterTrader.setText(Integer.toString(tWater));
            waterPlayer.setText(Integer.toString(pWater));
            money-=waterP;
            playerMoney.setText(Integer.toString(money));
        } else {
            if (tWater<=0) {
                showErr("Trader does not have enough \nwater.");
            } else if (ship.getCount()>=ship.getLimit()) {
                showErr("Cargo is full.");
            } else {
                showErr("Not enough money.");
            }
        }
    }

    @FXML
    private void sWaterBAction(ActionEvent event) {
        if(pWater>0) {
            tWater++;
            pWater--;
            ship.decCount();
            waterTrader.setText(Integer.toString(tWater));
            waterPlayer.setText(Integer.toString(pWater));
            money+=waterP;
            playerMoney.setText(Integer.toString(money));
        } else {
            showErr("Not enough water to sell.");
        }
    }
    
    @FXML
    private void stopTradingBAction(ActionEvent event) {
        update();
        tradingStage.close();
    }
    
    private void initTrading() {
        money=player.getCredit();
        playerMoney.setText(Integer.toString(money));
        pWater=ship.getWater();
        waterPlayer.setText(Integer.toString(pWater));
        pFur=ship.getFur();
        furPlayer.setText(Integer.toString(pFur));
        pFood=ship.getFood();
        foodPlayer.setText(Integer.toString(pFood));
        pOre=ship.getFood();
        orePlayer.setText(Integer.toString(pOre));
        pGame=ship.getGame();
        gamePlayer.setText(Integer.toString(pGame));
        pFirearm=ship.getFirearm();
        firearmPlayer.setText(Integer.toString(pFirearm));
        pMedicine=ship.getMedicine();
        medicinePlayer.setText(Integer.toString(pMedicine));
        pMachine=ship.getMachine();
        machinePlayer.setText(Integer.toString(pMachine));
        pNarcotics=ship.getNarcotic();
        narcoticPlayer.setText(Integer.toString(pNarcotics));
        pRobot=ship.getRobot();
        robotPlayer.setText(Integer.toString(pRobot));
        waterP=(int) ((Good.Water.basePrice * (1 + rand.nextInt(Good.Water.var) / 7))*(1-0.01*player.getTrader()));
        waterPrice.setText(Integer.toString(waterP));
        furP=(int) ((Good.Furs.basePrice * (1 + rand.nextInt(Good.Furs.var) / 7))*(1-0.01*player.getTrader()));
        furPrice.setText(Integer.toString(furP));
        foodP=(int) ((Good.Food.basePrice * (1 + rand.nextInt(Good.Food.var) / 7))*(1-0.01*player.getTrader()));
        foodPrice.setText(Integer.toString(foodP));
        oreP=(int) ((Good.Ore.basePrice * (1 + rand.nextInt(Good.Ore.var) / 7))*(1-0.01*player.getTrader()));
        orePrice.setText(Integer.toString(oreP));
        gameP=(int) ((Good.Games.basePrice * (1 + rand.nextInt(Good.Games.var) / 7))*(1-0.01*player.getTrader()));
        gamePrice.setText(Integer.toString(gameP));
        firearmP=(int) ((Good.Firearms.basePrice * (1 + rand.nextInt(Good.Firearms.var) / 7))*(1-0.01*player.getTrader()));
        firePrice.setText(Integer.toString(firearmP));
        medicineP=(int) ((Good.Medicine.basePrice * (1 + rand.nextInt(Good.Medicine.var) / 7))*(1-0.01*player.getTrader()));
        medicinePrice.setText(Integer.toString(medicineP));
        machineP=(int) ((Good.Machines.basePrice * (1 + rand.nextInt(Good.Machines.var) / 7))*(1-0.01*player.getTrader()));
        machinePrice.setText(Integer.toString(machineP));
        narcoticsP=(int) ((Good.Narcotics.basePrice * (1 + rand.nextInt(Good.Narcotics.var) / 7))*(1-0.01*player.getTrader()));
        narcoticPrice.setText(Integer.toString(narcoticsP));
        robotP=(int) ((Good.Robots.basePrice * (1 + rand.nextInt(Good.Robots.var) / 7))*(1-0.01*player.getTrader()));
        robotPrice.setText(Integer.toString(robotP));
        tWater=rand.nextInt(30)+20;
        waterTrader.setText(Integer.toString(tWater));
        tFur=rand.nextInt(20)+10;
        furTrader.setText(Integer.toString(tFur));
        tFood=rand.nextInt(35)+15;
        foodTrader.setText(Integer.toString(tFood));
        tOre=rand.nextInt(15)+10;
        oreTrader.setText(Integer.toString(tOre));
        tGame=rand.nextInt(20)+10;
        gameTrader.setText(Integer.toString(tGame));
        tFirearm=rand.nextInt(5)+10;
        firearmTrader.setText(Integer.toString(tFirearm));
        tMedicine=rand.nextInt(10)+10;
        medicineTrader.setText(Integer.toString(tMedicine));
        tMachine=rand.nextInt(5)+10;
        machineTrader.setText(Integer.toString(tMachine));
        tNarcotics=rand.nextInt(5);
        narcoticTrader.setText(Integer.toString(tNarcotics));
        tRobot=rand.nextInt(3);
        robotTrader.setText(Integer.toString(tRobot));
    }
    // </editor-fold>
    
    private void update(){
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
    
    private void showWinner() {
        try {
            FXMLLoader localWinnerLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/trader/FightWinner.fxml"));
            AnchorPane localWinnerPage = (AnchorPane) localWinnerLoader.load();
            Stage localWinnerStage = new Stage();
            localWinnerStage.setTitle("Pirate Fight");
            Scene scene = new Scene(localWinnerPage);
            localWinnerStage.setScene(scene);
            TraderEncController traderController = localWinnerLoader.getController();
            traderController.setWinnerStage(localWinnerStage,winnerIsPlayer);
            localWinnerStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void showErr(String str) {
        try {
            FXMLLoader localErrLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/trader/TraderEncErr.fxml"));
            AnchorPane localErrPage = (AnchorPane) localErrLoader.load();
            Stage localErrStage = new Stage();
            localErrStage.setTitle("Pirate Fight");
            Scene scene = new Scene(localErrPage);
            localErrStage.setScene(scene);
            TraderEncController traderController = localErrLoader.getController();
            traderController.setErrStage(localErrStage,str);
            localErrStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
