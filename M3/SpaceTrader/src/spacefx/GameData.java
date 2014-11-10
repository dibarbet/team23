/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.util.ArrayList;

/**
 *
 * @author David Barbet
 */
public final class GameData {
    private static Player player;
    private static Ship ship;
    private static SolarSystem solarsystem;
    private static Universe universe;
    private static Market market;
    private static String fileSaveString;
    /**
     * This is essentially a class to store all game data so that it can
     * be saved easier.
     */
    private GameData() {
        
    }
    /**
     * Sets the current game's player
     * @param aPlayer the player
     */
    public static void setPlayer(Player aPlayer) {
        player = aPlayer;
    }
    /**
     * Gets the current game's player
     * @return the player
     */
    public static Player getPlayer() {
        return player;
    }
    /**
     * Sets the current player's ship
     * @param aShip the ship
     */
    public static void setShip(Ship aShip) {
        ship = aShip;
    }
    /**
     * Gets the current ship
     * @return the ship
     */
    public static Ship getShip() {
        return ship;
    }
    /**
     * Sets current universe
     * @param aUniverse the universe
     */
    public static void setUniverse(Universe aUniverse) {
        universe = aUniverse;
    }
    /**
     * Gets the current universe
     * @return the current universe
     */
    public static Universe getUniverse() {
        return universe;
    }
    /**
     * Sets file save string
     * @param aString the file string
     */
    public static void setFileSaveString(String aString) {
        fileSaveString = aString;
    }
    /**
     * Gets file save string
     * @return the file string
     */
    public static String getFileSaveString() {
        return fileSaveString;
    }
    public static void setSolarSystem(SolarSystem aSolar) {
        solarsystem = aSolar;
    }
    public static void setMarket(Market aMarket) {
        market = aMarket;
    }
    
    public static SolarSystem getCurrSolarSys() {
        return universe.getCurrentSolarSystem();
    }
    
    public static void setCurrSolarSys(SolarSystem aSolar) {
        universe.setCurrentSolarSystem(aSolar);
    }
    
    /**
     * Returns list of all objects in class
     * @return the list
     */
    public static ArrayList<Object> getClassList() {
        ArrayList<Object> theList = new ArrayList<>();
        theList.add(player);
        theList.add(ship);
        theList.add(universe);
        theList.add(market);
        theList.add(solarsystem);
        return theList;
    }
}
