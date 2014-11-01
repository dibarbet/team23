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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import spacefx.SpaceFX;
import spacefx.randomEvent.encounter.pirate.PirateEncController;
import spacefx.randomEvent.encounter.police.PoliceEncController;
import spacefx.randomEvent.encounter.police.policeGlobalData;
import spacefx.randomEvent.encounter.trader.TraderEncController;

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class EncounterMainController implements Initializable {
    private Stage theStage;
    private Random rand = new Random();
    private int encFac = 0;
    
    @FXML
    private Button encOKB;
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
    
    @FXML
    private void encOKBAction(){
        this.theStage.close();
        encFac = rand.nextInt(30);
        if (encFac<0) showEncPolice();
        else if (encFac>31) showEncPirate();
        else showEncTrader();
    }
    
    private void showEncPolice(){
        try {
            FXMLLoader policeLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/police/PoliceEnc.fxml"));
            AnchorPane policePage = (AnchorPane) policeLoader.load();
            Stage policeStage = new Stage();
            policeStage.setTitle("Encounter Police");
            Scene scene = new Scene(policePage);
            policeStage.setScene(scene);
            PoliceEncController policeController = policeLoader.getController();
            policeController.setTheStage(policeStage);
            policeStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void showEncPirate(){
        try {
            FXMLLoader pirateLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/pirate/PirateEnc.fxml"));
            AnchorPane piratePage = (AnchorPane) pirateLoader.load();
            Stage pirateStage = new Stage();
            pirateStage.setTitle("Encounter Pirate");
            Scene scene = new Scene(piratePage);
            pirateStage.setScene(scene);
            PirateEncController policeController = pirateLoader.getController();
            policeController.setTheStage(pirateStage);
            pirateStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void showEncTrader(){
        try {
            FXMLLoader traderLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/trader/TraderEnc.fxml"));
            AnchorPane traderPage = (AnchorPane) traderLoader.load();
            Stage traderStage = new Stage();
            traderStage.setTitle("Encounter Pirate");
            Scene scene = new Scene(traderPage);
            traderStage.setScene(scene);
            TraderEncController policeController = traderLoader.getController();
            policeController.setTheStage(traderStage);
            traderStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
