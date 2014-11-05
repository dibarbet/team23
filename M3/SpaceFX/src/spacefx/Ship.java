/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.Serializable;

/**
 *
 * @author Dillon
 */
public abstract class Ship implements Serializable {
    private int count = 0;
    private int limit, fuel, hull, price, weapons, shields, gadgets, crew;
    protected int nwater, nfur, nfood, nore, ngame, nfire, nmed, nmach, nnarc, nrob;
    protected String[] cargo = new String[limit];
    
    public Ship(int limit, int fuel, int hull, int price, int weapons, int shields, int gadgets, int crew) {
        this.limit = limit;
        this.fuel = fuel;
        this.hull = hull;
        this.price = price;
        this.weapons = weapons;
        this.shields = shields;
        this.gadgets = gadgets;
        this.crew = crew;
    }
    
    public abstract String getShipName();
    
    public String getShipType() {
        Ship ship = GameData.getShip();
        return ship.getShipName();
    }
    
    @Override
    public String toString() {
        return shipType;
                
    }
    public Ship setShip(String shipType) {
        switch (shipType) {
            case "Flea":
                return new Flea();
            case "Gnat":
                return new Gnat();
            case "Firefly":
                return new Firefly();
            case "Mosquito":
                return new Mosquito();
            case "Bumblebee":
                return new Bumblebee();
            default:
                return null;
        }
    }
    public int getCount() {
        return count;
    }
    
    public String getCargo(int i) {
        return cargo[i];
    }
    public int getPrice() {
        return price;
    }
    public void addCargo(int amount, String good) {
        int total = nwater + nfur + nfood + nore + ngame + nfire + nmed + nmach + nnarc + nrob;
        if (total <= limit) {
            if (good.equals("Water")) {
                nwater += amount;
                count++;
            }
            if (good.equals("Fur")) {
                nfur += amount;
                count++;
            }
            if (good.equals("Food")) {
                nfood += amount;
                count++;
            }
            if (good.equals("Ore")) {
                count++;
                nore += amount;
            }
            if (good.equals("Game")) {
                count++;
                ngame += amount;
            }
            if (good.equals("Firearm")) {
                count++;
                nfire += amount;
            }
            if (good.equals("Medicine")) {
                count++;
                nmed += amount;
            }
            if (good.equals("Machine")) {
                count++;
                nmach += amount;
            }
            if (good.equals("Narcotic")) {
                count++;
                nnarc += amount;
            }
            if (good.equals("Robot")) {
                count++;
                nrob += amount;
            }
        }
        
    }
    
    public void sellCargo(int amount, String good) {
        int total = nwater + nfur + nfood + nore + ngame + nfire + nmed + nmach + nnarc + nrob;
        if (total > 0) {
            if (good.equals("Water")) {
                count--;
                nwater -= amount;
            }
            if (good.equals("Fur")) {
                count--;
                nfur -= amount;
            }
            if (good.equals("Food")) {
                count--;
                nfood -= amount;
            }
            if (good.equals("Ore")) {
                count--;
                nore -= amount;
            }
            if (good.equals("Game")) {
                count--;
                ngame -= amount;
            }
            if (good.equals("Firearm")) {
                count--;
                nfire -= amount;
            }
            if (good.equals("Medicine")) {
                count--;
                nmed -= amount;
            }
            if (good.equals("Machine")) {
                count--;
                nmach -= amount;
            }
            if (good.equals("Narcotic")) {
                count--;
                nnarc -= amount;
            }
            if (good.equals("Robot")) {
                count--;
                nrob -= amount;
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
    
    public int getLimit() {
        return limit;
    }
    // <editor-fold defaultstate="collapsed" desc="Good get and set methods">
    public int getWater() {
        return nwater;
    }
    public void setWater(int i) {
        nwater = i;
    }
    public int getFur() {
        return nfur;
    }
    public void setFur(int i) {
        nfur = i;
    }
    public int getFood() {
        return nfood;
    }
    public void setFood(int i) {
        nfood = i;
    }
    public int getOre() {
        return nore;
    }
    public void setOre(int i) {
        nore = i;
    }
    public int getGame() {
        return ngame;
    }
    public void setGame(int i) {
        ngame = i;
    }
    public int getFirearm() {
        return nfire;
    }
    public void setFirearm(int i) {
        nfire = i;
    }
    public int getMedicine() {
        return nmed;
    }
    public void setMedicine(int i) {
        nmed = i;
    }
    public int getMachine() {
        return nmach;
    }
    public void setMachine(int i) {
        nmach = i;
    }
    public int getNarcotic() {
        return nnarc;
    }
    public void setNarcotic(int i) {
        nnarc = i;
    }
    public int getRobot() {
        return nrob;
    }
    public void setRobot(int i) {
        nrob = i;
    }
    
    // </editor-fold>
    
    public void emptyCargo() {
        count=0;
        nwater=0;
        nfur=0;
        nfood=0;
        nore=0;
        ngame=0;
        nfire=0;
        nmed=0;
        nmach=0;
        nnarc=0;
        nrob=0;
    }
    public void incCount() {
        count++;
    }
    public void decCount() {
        count--;
    }
}
