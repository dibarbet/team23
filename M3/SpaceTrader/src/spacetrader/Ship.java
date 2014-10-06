/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;
/**
 *
 * @author Dillon
 */
public class Ship {
    private int count = 0;
    private int limit = 30;
    private int fuel;
    private String[] cargo = new String[limit];
    
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
            }
        }
    }
    
    public void sellCargo(int amount, String good) {
        if (count - amount >= 0) {
            for (int i = 0; i < count; i++) {
                if (cargo[i].equals(good)) {
                    cargo[i] = null;
                    count--;
                    amount--;
                }
                if (amount == 0) {
                    return;
                }
            }
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
    public void travel(SolarSystem dest) {
        int miles = fuelToMiles(1, fuel);
        double distance = Universe.distance(Universe.getCurrentSolarSystem(), dest);
        if (miles > distance) {
            System.out.println("Ship unable to travel that distance");
        } else {
            Universe.setCurrentSolarSystem(dest);
            miles = (int)distance - miles;
            fuel = milesToFuel(1, miles);
        }
    }
}
