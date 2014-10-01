/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * The Application class of Space Trader
 * 
 * @author YaxiongLiu
 */
public class SpaceTrader extends Application {
    protected static Player player; // The variavle holds represents the player of thi game
    @Override
    public void start(Stage primaryStage) {
        new WelcomeWin().setVisible(true);
    }

    /**
     * Launch this application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
