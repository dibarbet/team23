/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.swing.Timer;
import spacefx.GameData;
import spacefx.Player;
import spacefx.SpaceFX;
import spacefx.newgame.EmptyNameErrController;
import spacefx.randomEvent.encounter.EncounterMainController;

/**
 * FXML Controller class
 *
 * @author YaxiongLiu
 */
public class TravellingController implements Initializable {
    @FXML
    private Label remainDist;
    @FXML
    private Label dotdot;
    @FXML
    private Label randCreditInfo1;
    @FXML
    private Label randCreditInfo2;
    @FXML
    private Button randCreditOKB;
    @FXML
    private Button startTravellingB;
    
    Player player = GameData.getPlayer();
    Random rand = new Random();
    public int dist = 30;
    private int encFac;
    private int randOKBState=0;
    public static boolean running=true;
    final int delay = 500;
    
    private Stage theStage;
    private Stage randCreditStage;
    Timeline timeline = new Timeline(new KeyFrame(
        Duration.millis(500),
        ae -> checkRand()));
    
    public void setTheStage(Stage theStage, double newDist) {
        this.theStage = theStage;
        theStage.initStyle(StageStyle.UNDECORATED);
        theStage.initModality(Modality.APPLICATION_MODAL);
        dist = (int)newDist;
    }
    
    public void setRandCreditStage(Stage theStage) {
        this.randCreditStage = theStage;
        randCreditStage.initStyle(StageStyle.UNDECORATED);
        randCreditStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    private void update() {
        GameData.setPlayer(player);
    }
    
    private void showRandCreditWin() {
        try {
            FXMLLoader randCreditLoader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/RandCredit.fxml"));
            AnchorPane randCreditPage = (AnchorPane) randCreditLoader.load();
            Stage myRandCreditStage = new Stage();
            myRandCreditStage.setTitle("Error");
            Scene scene = new Scene(randCreditPage);
            myRandCreditStage.setScene(scene);
            TravellingController randCreditController = randCreditLoader.getController();
            randCreditController.setRandCreditStage(myRandCreditStage);
            myRandCreditStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void showEncWin() {
        try {
            FXMLLoader loader = new FXMLLoader(SpaceFX.class.getResource("randomEvent/encounter/EncounterMain.fxml"));
            AnchorPane newPage = (AnchorPane) loader.load();
            Stage newStage = new Stage();
            newStage.setTitle("Encounter");
            Scene scene = new Scene(newPage);
            newStage.setScene(scene);
            EncounterMainController randCreditController = loader.getController();
            randCreditController.setTheStage(newStage);
            newStage.show();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    @FXML
    private void startTravellingBAction(javafx.event.ActionEvent event) {
        startTravellingB.setDisable(true);
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    
    @FXML
    private void randCreditOKBAction(javafx.event.ActionEvent event) {
        if(randOKBState==0) {
            if (rand.nextInt(2)==0){
                randCreditInfo1.setText("You have gained " + player.gainCredit(rand.nextInt(1000)) + " credits");
                randCreditInfo2.setText("Lucky! Who lost credits in universe.");
            } else {
                randCreditInfo1.setText("You were stolen " + player.loseCredit(rand.nextInt(1000)) + " credits in your ship");
                randCreditInfo2.setText("HOW COULD THAT HAPPEN?");
            }
            randOKBState=1;
            randCreditOKB.setText("OK");
            update();
        } else if (randOKBState==1) {
            System.out.println(player.getCredit());
            update();
            running=true;
            randCreditOKB.setText("What happened?");
            randCreditInfo1.setText("Something happend...");
            randCreditInfo2.setText("");
            randOKBState=0;
            randCreditStage.close();
        }
    }
    
    private void checkRand(){
        if (running) {
            //System.out.println(dist);
            if (dist%3==0) {
                dotdot.setText("");
            }
            encFac = rand.nextInt(50);
            if (encFac<3) {
                running=false;
                showRandCreditWin();  
            } else if (encFac > 46) {
                running = false;
                showEncWin();
            }
            dist--;
            remainDist.setText("" + dist);
            dotdot.setText(dotdot.getText() + ".");
            if (dist<0) {
                update();
                timeline.stop();
                theStage.close();
            }
        }
    }
}
