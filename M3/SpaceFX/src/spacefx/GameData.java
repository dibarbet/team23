/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

/**
 *
 * @author David
 */
public final class GameData {
    private static Player player;
    private static Ship ship;
    private static SolarSystem solarsystem;
    private static Universe universe;
    private static Market market;
    private GameData() {
        
    }
    public static void setPlayer(Player aPlayer) {
        player = aPlayer;
    }
    public static Player getPlayer() {
        return player;
    }
    public static void setShip(Ship aShip) {
        ship = aShip;
    }
    public static Ship getShip() {
        return ship;
    }
    public static void setUniverse(Universe aUniverse) {
        universe = aUniverse;
    }
    public static Universe getUniverse() {
        return universe;
    }
}
