/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacefx;

/**
 *
 * @author YaxiongLiu
 */
public class Player {
    // variable declariation
    private String name; // the name of the player
    private int pilot; // the pilot skill points of player
    private int fighter; // the fighter skill point of player
    private int trader; // the trader skill points of player
    private int engineer; // the engineer skill point of player
    private int investor; // the investor skill point of player
    protected int credit; // the credit skill point of player
    private Ship currShip; // the current ship that the player owns
    // end variable declariation
    
    /**
     * The constructor of Player class
     * 
     * @param newName  the name of the player
     * @param newPilot  the pilot skill points of player
     * @param newFighter  the fighter skill points of player
     * @param newTrader  the trader skill points of player
     * @param newEngineer  the engineer kill points of player
     * @param newInvestor the investor skill points of player
     */
    public Player(String newName, int newPilot, int newFighter, int newTrader, int newEngineer, int newInvestor) {
        name = newName; // set the player's name
        pilot = newPilot; // set player's pilot skill points
        fighter = newFighter; // set player's fighter skill point
        trader = newTrader; // set player's trader skill point
        engineer = newEngineer; // set player's engineer skill point
        investor = newInvestor; // set player's investor skill point
        credit = 1000; // initialize the amount of money that play owns to 1000
        currShip = new Ship(1); // initialize the ship of player
    } // end constructor
    
    public Ship getShip() {
        return currShip;
    }
    
    public int gainCredit(int gainedCredit) {
        credit = credit + gainedCredit;
        return gainedCredit;
    }
    
    public int loseCredit(int lostCredit) {
        if (credit > lostCredit) {
            credit = credit - lostCredit;
            return lostCredit;
        } else {
            int tempCredit = credit;
            credit = 0;
            return tempCredit;
        }
        
    }
}
