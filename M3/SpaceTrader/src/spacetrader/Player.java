/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 *
 * @author YaxiongLiu
 */
public class Player {
    // variable declariation
    private String name;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineer;
    private int investor;
    protected int credit;
    private Ship currShip;
    
    // constructor of Player, takes 5 argument
    public Player(String newName, int newPilot, int newFighter, int newTrader, int newEngineer, int newInvestor) {
        name = newName;
        pilot = newPilot;
        fighter = newFighter;
        trader = newTrader;
        engineer = newEngineer;
        investor = newInvestor;
        credit = 1000;
        currShip = new Ship();
    }
    
    public void debug() {
        System.out.println(name);
        System.out.println(pilot);
        System.out.println(fighter);
        System.out.println(trader);
        System.out.println(engineer);
        System.out.println(investor);
        System.out.println(credit);
        System.out.println(currShip);
    }
}
