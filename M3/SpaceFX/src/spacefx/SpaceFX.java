/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class SpaceFX extends Application {
    private Player player;
    @Override
    public void start(Stage stage) throws Exception {
//        FXMLLoader load = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        FXMLDocumentController controller = new FXMLDocumentController();
//        load.setController(controller);
//        load.setRoot(controller);
//        Parent root = (Parent) load.load();
//        Scene scene = new Scene(root);
//        stage.setTitle("Space Traders");
//        stage.setScene(scene);
//        stage.show();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
