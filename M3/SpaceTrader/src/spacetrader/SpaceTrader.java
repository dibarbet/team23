/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author YaxiongLiu
 */
public class SpaceTrader extends Application {
    protected static Player player;
    @Override
    public void start(Stage primaryStage) {
        new WelcomeWin().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
