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
    @Override
    public void start(final Stage stage) throws Exception {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        final Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static final void main(final String[] args) {
        launch(args);
    }
}
