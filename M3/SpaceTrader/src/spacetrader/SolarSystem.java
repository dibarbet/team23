/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import java.util.Random;
/**
 *
 * @author David Barbet
 */
public class SolarSystem {
    private String solarName;
    private String[] planetNames;
    private int techLevel;
    private int resources;
    private int govType;
    private int policeEncounterChance;
    private int pirateEncounterChance;
    private int xLoc;
    private int yLoc;
    private int numPlanets;
    
    public SolarSystem(String name, int x, int y) {
        this(name, new String[1], x, y);
    }
    
    public SolarSystem(String name, String[] pNames, int x, int y) {
        if (pNames.length == 1) {
            pNames[0] = name;
        }
        solarName = name;
        planetNames = pNames;
        xLoc = x;
        yLoc = y;
        numPlanets = pNames.length;
        setAttributes();
    }
    
    public String getSolarName() {
        return solarName;
    }
    
    public String getPlanetName(int index) {
        return planetNames[index];
    }
    
    public int getTechLevel() {
        return techLevel;
    }
    
    public int getResourceType() {
        return resources;
    }
    
    public int getGovType() {
        return govType;
    }
    
    public int getPoliceChance() {
        return policeEncounterChance;
    }
    
    public int getPirateChance() {
        return pirateEncounterChance;
    }
    
    public int getX() {
        return xLoc;
    }
    
    public int getY() {
        return yLoc;
    }
    
    public int getNumPlanets() {
        return numPlanets;
    }
    
    public String toString() {
        return solarName;
    }
    private int randomIntRange(int minimum, int maximum) {
        Random randomThing = new Random();
        int randInt = randomThing.nextInt((maximum - minimum) + 1) + minimum;
        return randInt;
        
    }
    
    private int setResourceLevel() {
        int aResource = 0;
        int weightZero = randomIntRange(0,11);
        if (weightZero <= 7) {
            aResource = 0;
        } else {
            aResource = randomIntRange(1, 13);
        }
        return aResource;
    }
    
    private void setAttributes() {
        techLevel = randomIntRange(0, 8);
        resources = setResourceLevel();
        govType = randomIntRange(0, 18);
        policeEncounterChance = randomIntRange(25, 51);
        pirateEncounterChance = randomIntRange(10, 51);
    }
}
