/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacefx;

import java.io.Serializable;

/**
 *
 * @author YaxiongLiu
 */
public class Player implements Serializable {
    // variable declariation
    private String name; // the name of the player
    private int pilot; // the pilot skill points of player
    private int fighter; // the fighter skill point of player
    private int trader; // the trader skill points of player
    private int engineer; // the engineer skill point of player
    private int investor; // the investor skill point of player
    public int credit; // the credit skill point of player
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
        credit = 100000; // initialize the amount of money that play owns to 1000
        currShip = new Gnat(); // initialize the ship of player
    } // end constructor
    
    public Ship getShip() {
        return currShip;
    }
    public void setShip(Ship aShip) {
        currShip = aShip;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int amt) {
        credit = amt;
    }
    
    public int gainCredit(int gainedCredit) {
        credit = credit + gainedCredit;
        return gainedCredit;
    }
    
    public int loseCredit(int lostCredit) {
        int retcredit;
        if (credit > lostCredit) {
            credit = credit - lostCredit;
            retcredit = lostCredit;
        } else {
            int tempCredit = credit;
            credit = 0;
            retcredit = tempCredit;
        }
        return retcredit;
    }
    public String toString() {
        return name;
    }
    
    public int getPilot() {
        return pilot;
    }
    
    public int getFighter() {
        return fighter;
    }
    
    public int getEngineer() {
        return engineer;
    }
    
    public int getTrader() {
        return trader;
    }
    public int getInvestor() {
        return investor;
    }
}