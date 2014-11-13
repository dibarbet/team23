/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.newgame;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import spacefx.GameData;
import spacefx.Player;
import spacefx.Ship;
import spacefx.Gnat;
import spacefx.SpaceFX;
import spacefx.Universe;

/**
 * FXML Controller class.
 *
 * @author YaxiongLiu, David Barbet
 */
public class NewGameWinController implements Initializable {
    private int numPilot;
    private int numFighter;
    private int numTrader;
    private int numEngineer;
    private int numInvestor;
    private int pointsLeft;
    private String pilotName;
    private Stage theStage;
    private Player player;
    private boolean gameCreated;
    @FXML
    private TextField name;

    @FXML
    private Label pointsRemaining;

    @FXML
    private Label pilotPoints;

    @FXML
    private Label fighterPoints;

    @FXML
    private Label traderPoints;

    @FXML
    private Label engineerPoints;

    @FXML
    private Label investorPoints;

    @FXML
    private Button pilotMin;

    @FXML
    private Button pilotMax;

    @FXML
    private Button fighterMin;

    @FXML
    private Button fighterMax;

    @FXML
    private Button traderMin;

    @FXML
    private Button traderMax;

    @FXML
    private Button engineerMin;

    @FXML
    private Button engineerMax;

    @FXML
    private Button investorMin;

    @FXML
    private Button investorMax;

    @FXML
    private Button buttonOK;

    @FXML
    private Button cancel;

    /**
    * Setter for the stage.
    * @param stage the stage to be set
    */
    public final void setTheStage(final Stage stage) {
        theStage = stage;
    }

    @FXML
    private void handlePilotMin() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if (((pointsLeft + 1) > 15) || ((numPilot - 1) < 0)) {
            pilotMin.setDisable(true);
        } else {
            enableMax();
            numPilot--;
            pilotPoints.setText(Integer.toString(numPilot));
            pointsLeft++;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if (((pointsLeft + 1) > 15)) {
                pilotMin.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleFighterMin() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if (((pointsLeft + 1) > 15) || ((numFighter - 1) < 0)) {
            fighterMin.setDisable(true);
        } else {
            enableMax();
            numFighter--;
            fighterPoints.setText(Integer.toString(numFighter));
            pointsLeft++;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft + 1) > 15) {
                fighterMin.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleTraderMin() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if (((pointsLeft + 1) > 15) || ((numTrader - 1) < 0)) {
            traderMin.setDisable(true);
        } else {
            enableMax();
            numTrader--;
            traderPoints.setText(Integer.toString(numTrader));
            pointsLeft++;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft + 1) > 15) {
                traderMin.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleEngineerMin() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if (((pointsLeft + 1) > 15) || ((numEngineer - 1) < 0)) {
            engineerMin.setDisable(true);
        } else {
            enableMax();
            numEngineer--;
            engineerPoints.setText(Integer.toString(numEngineer));
            pointsLeft++;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft + 1) > 15) {
                engineerMin.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleInvestorMin() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if (((pointsLeft + 1) > 15) || ((numInvestor - 1) < 0)) {
            investorMin.setDisable(true);
        } else {
            enableMax();
            numInvestor--;
            investorPoints.setText(Integer.toString(numInvestor));
            pointsLeft++;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft + 1) > 15) {
                investorMin.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handlePilotMax() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if ((pointsLeft - 1) < 0) {
            pilotMax.setDisable(true);
        } else {
            enableMax();
            numPilot++;
            pilotPoints.setText(Integer.toString(numPilot));
            pointsLeft--;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft - 1) < 0) {
                pilotMax.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleFighterMax() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if ((pointsLeft - 1) < 0) {
            fighterMax.setDisable(true);
        } else {
            enableMax();
            numFighter++;
            fighterPoints.setText(Integer.toString(numFighter));
            pointsLeft--;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft - 1) < 0) {
                fighterMax.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleTraderMax() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if ((pointsLeft - 1) < 0) {
            traderMax.setDisable(true);
        } else {
            enableMax();
            numTrader++;
            traderPoints.setText(Integer.toString(numTrader));
            pointsLeft--;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft - 1) < 0) {
                traderMax.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleEngineerMax() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if ((pointsLeft - 1) < 0) {
            engineerMax.setDisable(true);
        } else {
            enableMax();
            numEngineer++;
            engineerPoints.setText(Integer.toString(numEngineer));
            pointsLeft--;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft - 1) < 0) {
                engineerMax.setDisable(true);
            }
            enableMax();
        }
    }
    @FXML
    private void handleInvestorMax() {
        pointsLeft = Integer.parseInt(pointsRemaining.getText());
        if ((pointsLeft - 1) < 0) {
            investorMax.setDisable(true);
        } else {
            enableMax();
            numInvestor++;
            investorPoints.setText(Integer.toString(numInvestor));
            pointsLeft--;
            pointsRemaining.setText(Integer.toString(pointsLeft));
            if ((pointsLeft - 1) < 0) {
                investorMax.setDisable(true);
            }
            enableMax();
        }
    }
    private void enableMax() {
        if ((pointsLeft - 1) >= 0) {
            if (numPilot + 1 <= 15) {
                pilotMax.setDisable(false);
            }
            if (numFighter + 1 <= 15) {
                fighterMax.setDisable(false);
            }
            if (numTrader + 1 <= 15) {
                traderMax.setDisable(false);
            }
            if (numEngineer + 1 <= 15) {
                engineerMax.setDisable(false);
            }
            if (numInvestor + 1 <= 15) {
                investorMax.setDisable(false);
            }
        }
        if (pointsLeft + 1 <= 15) {
            if (numPilot - 1 >= 0) {
                pilotMin.setDisable(false);
            }
            if (numFighter - 1 >= 0) {
                fighterMin.setDisable(false);
            }
            if (numTrader - 1 >= 0) {
                traderMin.setDisable(false);
            }
            if (numEngineer - 1 >= 0) {
                engineerMin.setDisable(false);
            }
            if (numInvestor - 1 >= 0) {
                investorMin.setDisable(false);
            }
        }
    }

    @FXML
    private boolean isValidName() {
        pilotName = name.getText();
        return !"".equals(pilotName);
    }
    private boolean checkPoints() {
        final int totalPoints = numPilot + numTrader + numFighter + numInvestor
                   + numEngineer;
        return totalPoints == 15;
    }
    private void handleBadName() {
        /*
        Stage dialogBox = new Stage();
        dialogBox.initStyle(StageStyle.UTILITY);
        String s = "Please enter a valid name"
        Scene aScene = new Scene(new Group(new Text(25, 25, s)));
        dialogBox.setHeight(80);
        dialogBox.setWidth(200);
        dialogBox.setScene(aScene);
        dialogBox.show();
        */
        try {
            String path = "newgame/emptyNameErr.fxml";
            final FXMLLoader loader
                    = new FXMLLoader(SpaceFX.class.getResource(path));
            final AnchorPane newPage = (AnchorPane) loader.load();
            final Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            final Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            final EmptyNameErrController controller = loader.getController();
            controller.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void handleBadPoints() {
        /*
        Stage dialogBox = new Stage();
        dialogBox.initStyle(StageStyle.UTILITY);
        String s = "Please make sure you have exactly 15 points";
        Scene aScene = new Scene(new Group(new Text(25, 25, s)));
        dialogBox.setHeight(80);
        dialogBox.setWidth(300);
        dialogBox.setScene(aScene);
        dialogBox.show();
        */
        try {
            String path = "newgame/unallocPointsErr.fxml";
            final FXMLLoader loader
                    = new FXMLLoader(SpaceFX.class.getResource(path));
            final AnchorPane newPage = (AnchorPane) loader.load();
            final Stage newGameStage = new Stage();
            newGameStage.setTitle("Error");
            final Scene scene = new Scene(newPage);
            newGameStage.setScene(scene);
            final UnallocPointsErrController controller
                    = loader.getController();
            controller.setTheStage(newGameStage);
            newGameStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void handleOK() {
        if (isValidName() && checkPoints()) {
            player = new Player(pilotName, numPilot, numFighter, numTrader, numEngineer, numInvestor);
            GameData.setPlayer(player);
            final Ship startShip = new Gnat();
            GameData.setShip(startShip);
            final Universe universe = new Universe();
            GameData.setUniverse(universe);
            gameCreated = true;
            theStage.close();
        } else {
            if (isValidName()) {
                handleBadPoints();
            } else {
                handleBadName();
            }
        }
    }
    @FXML
    private void handleCancel() {
        theStage.close();
    }
    /**
     * Checks if game is created.
     * @return gameCreated true if game is greated
     */
    public final boolean isGameCreated() {
        return gameCreated;
    }
    /**
     * Initializes the controller class.
     * @param url a URL
     * @param rebu a ResourceBundle
     */
    @Override
    public final void initialize(final URL url, final ResourceBundle rebu) {
        // TODO
        gameCreated = false;
        pilotMin.setDisable(true);
        fighterMin.setDisable(true);
        traderMin.setDisable(true);
        engineerMin.setDisable(true);
        investorMin.setDisable(true);
        pilotName = name.getText();
    }
}
