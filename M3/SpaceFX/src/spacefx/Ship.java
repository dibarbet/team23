/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Dillon
 */
public class Ship implements Serializable {
    private int count = 0;
    private int limit = 30;
    private int fuel;
    private int shipType;
    protected int nwater, nfur, nfood, nore, ngame, nfire, nmed, nmach, nnarc, nrob;
    private String[] cargo = new String[limit];
    
    public Ship(int shipType) {
        this.fuel = 100;
        this.shipType = shipType;
    }
    public String toString() {
        return "cargo: " + Arrays.toString(cargo);
                
    }
    public int getCount() {
        return count;
    }
    
    public String getCargo(int i) {
        return cargo[i];
    }
    
    public void addCargo(int amount, String good) {
        if (count + amount <= limit) {
            for (int i = 0; i < amount; i++) {
                cargo[count] = good;
                count++;
                //System.out.println(count + "Added");
            }
            if (good.equals("Water")) nwater += amount;
            if (good.equals("Fur")) nfur += amount;
            if (good.equals("Food")) nfood += amount;
            if (good.equals("Ore")) nore += amount;
            if (good.equals("Game")) ngame += amount;
            if (good.equals("Firearm")) nfire += amount;
            if (good.equals("Medicine")) nmed += amount;
            if (good.equals("Machine")) nmach += amount;
            if (good.equals("Narcotic")) nnarc += amount;
            if (good.equals("Robot")) nrob += amount;
        }
    }
    
    public void sellCargo(int amount, String good) {
        if (count - amount >= 0) {
            for (int i = 0; i < limit; i++) {
                if (good.equals(cargo[i])) {
                    cargo[i] = "";
                    count--;
                    amount--;
                    //System.out.println(count + "Sell");
                }
                if (amount == 0) {
                    return;
                }
            }
            if (good.equals("Water")) nwater -= amount;
            if (good.equals("Fur")) nfur -= amount;
            if (good.equals("Food")) nfood -= amount;
            if (good.equals("Ore")) nore -= amount;
            if (good.equals("Game")) ngame -= amount;
            if (good.equals("Firearm")) nfire -= amount;
            if (good.equals("Medicine")) nmed -= amount;
            if (good.equals("Machine")) nmach -= amount;
            if (good.equals("Narcotic")) nnarc -= amount;
            if (good.equals("Robot")) nrob -= amount;
            if (amount > 0) {
                System.out.print("Not enough of that good in cargo, sold all that was available.");
            }
        }
    }
    
    public int getFuel() {
        return fuel;
    }
    
    public int fuelToMiles(int shipType, int fuel) {
        return fuel * shipType;
    }
    
    public int milesToFuel(int shipType, int miles) {
        return miles / shipType;
    }
    /**
     * If able to travel, sets the new location and updates the ships fuel.
     * @param dest the destination solar system
     */
    public boolean travel(SolarSystem dest) {
        int miles = fuelToMiles(1, fuel);
        Universe universe = GameData.getUniverse();
        double distance = universe.distance(universe.getCurrentSolarSystem(), dest);
        if (miles < distance) {
            System.out.println("Ship unable to travel that distance");
            return false;
        } else {
            universe.setCurrentSolarSystem(dest);
            miles = Math.abs((int)distance - miles);
            fuel = milesToFuel(1, miles);
            return true;
        }
    }
}
