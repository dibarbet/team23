/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import spacefx.SpaceFX;
import spacefx.randomEvent.encounter.pirate.PirateEncController;
import spacefx.randomEvent.encounter.police.PoliceEncController;
import spacefx.randomEvent.encounter.trader.TraderEncController;

/**
 *
 * @author YaxiongLiu
 */
public class EncounterMainController implements Initializable {
    /**
     * The main stage.
     */
    private transient Stage mainStage;
    /**
     * Random.
     */
    private final transient Random rand = new Random();
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
     * Set main stage.
     * @param theStage target stage
     */
    public final void setTheStage(final Stage theStage) {
        mainStage = theStage;
        mainStage.initStyle(StageStyle.UNDECORATED);
        mainStage.initModality(Modality.APPLICATION_MODAL);
    }
    /**
     * Encounter OK.
     * @throws IOException IOException
     */
    @FXML
    private void encOKBAction() throws IOException {
        int encFac;
        mainStage.close();
        encFac = rand.nextInt(30);
        if (encFac < 10) {
            showEncPolice();
        } else if (encFac > 20) {
            showEncPirate();
        } else {
            showEncTrader();
        }
    }
    /**
     * Show encounter police.
     * @throws IOException IOException
     */
    private void showEncPolice() throws IOException {
            final FXMLLoader policeLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/police/PoliceEnc.fxml"));
            final AnchorPane policePage = (AnchorPane) policeLoader.load();
            final Stage policeStage = new Stage();
            policeStage.setTitle("Encounter Police");
            final Scene scene = new Scene(policePage);
            policeStage.setScene(scene);
            final PoliceEncController policeController
                    = policeLoader.getController();
            policeController.setTheStage(policeStage);
            policeStage.show();
    }
    /**
     * Show Encounter pirate.
     * @throws IOException IOException
     */
    private void showEncPirate() throws IOException {
            final FXMLLoader pirateLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/pirate/PirateEnc.fxml"));
            final AnchorPane piratePage = (AnchorPane) pirateLoader.load();
            final Stage pirateStage = new Stage();
            pirateStage.setTitle("Encounter Pirate");
            final Scene scene = new Scene(piratePage);
            pirateStage.setScene(scene);
            final PirateEncController policeController
                    = pirateLoader.getController();
            policeController.setTheStage(pirateStage);
            pirateStage.show();
    }
    /**
     * Show encounter trader.
     * @throws IOException IOExcption
     */
    private void showEncTrader() throws IOException {
            final FXMLLoader traderLoader = new FXMLLoader(
                    SpaceFX.class.getResource("randomEvent"
                            + "/encounter/trader/TraderEnc.fxml"));
            final AnchorPane traderPage = (AnchorPane) traderLoader.load();
            final Stage traderStage = new Stage();
            traderStage.setTitle("Encounter Pirate");
            final Scene scene = new Scene(traderPage);
            traderStage.setScene(scene);
            final TraderEncController policeController
                    = traderLoader.getController();
            policeController.setTheStage(traderStage);
            traderStage.show();
    }
}
