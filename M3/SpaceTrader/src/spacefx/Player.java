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
    /**
     * Name of the player.
     */
    private final String name;
    /**
     * Pilot skill points.
     */
    private final int pilot;
    /**
     * Fighter skill points.
     */
    private final int fighter;
    /**
     * Trader skill points.
     */
    private final int trader;
    /**
     * Engineer skill points.
     */
    private final int engineer;
    /**
     * Investor skill points.
     */
    private final int investor;
    /**
     * Credit skill points.
     */
    public int credit;
    /**
     * Current ship.
     */
    private Ship currShip;
    /**
     * The constructor of Player class.
     * @param newName  the name of the player
     * @param newPilot  the pilot skill points of player
     * @param newFighter  the fighter skill points of player
     * @param newTrader  the trader skill points of player
     * @param newEngineer  the engineer kill points of player
     * @param newInvestor the investor skill points of player
     */
    public Player(final String newName, final int newPilot,
                  final int newFighter, final int newTrader,
                  final int newEngineer, final int newInvestor) {
        name = newName; // set the player's name
        pilot = newPilot; // set player's pilot skill points
        fighter = newFighter; // set player's fighter skill point
        trader = newTrader; // set player's trader skill point
        engineer = newEngineer; // set player's engineer skill point
        investor = newInvestor; // set player's investor skill point
        credit = 100000; // initialize the amount of money that play owns
        currShip = new Gnat(); // initialize the ship of player
    }
    /**
     * Getter for ship.
     * @return current ship
     */
    public final Ship getShip() {
        return currShip;
    }
    /**
     * Setter for ship.
     * @param aShip the new ship
     */
    public final void setShip(final Ship aShip) {
        currShip = aShip;
    }
    /**
     * Getter for credit.
     * @return current credit
     */
    public final int getCredit() {
        return credit;
    }
    /**
     * Setter for credit.
     * @param amt new credit
     */
    public final void setCredit(final int amt) {
        credit = amt;
    }
    /**
     * Adds credit to total credit.
     * @param gainedCredit credit to add
     * @return credit added
     */
    public final int gainCredit(final int gainedCredit) {
        credit = credit + gainedCredit;
        return gainedCredit;
    }
    /**
     * Takes away credit from total credit.
     * @param lostCredit credit to subtract
     * @return credit lost
     */
    public final int loseCredit(final int lostCredit) {
        int retcredit;
        if (lostCredit < 0) {
            return 0;
        }
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
    /**
     * Returns the string representation.
     * @return the string representation
     */
    @Override
    public final String toString() {
        return name;
    }
    /**
     * Getter for pilot.
     * @return value of pilot
     */
    public final int getPilot() {
        return pilot;
    }
    /**
     * Getter for fighter.
     * @return value of fighter
     */
    public final int getFighter() {
        return fighter;
    }
    /**
     * Getter for engineer.
     * @return value of engineer
     */
    public final int getEngineer() {
        return engineer;
    }
    /**
     * Getter for trader.
     * @return value of trader
     */
    public final int getTrader() {
        return trader;
    }
    /**
     * Getter for investor.
     * @return value for investor
     */
    public final int getInvestor() {
        return investor;
    }
}
