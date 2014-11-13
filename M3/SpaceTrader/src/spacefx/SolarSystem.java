/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author David Barbet
 */
public class SolarSystem implements Serializable {
    /**
     * Tech levels for solar systems.
     */
    private static String[] techLevels = {"Pre-Agriculture",
                                          "Agriculture",
                                          "Medieval",
                                          "Renaissance",
                                          "Early Industrial",
                                          "Industrial",
                                          "Post-Industrial",
                                          "Hi-Tech"};
    /**
     * Resource levels for solar systems.
     */
    private static String[] resourceLevels = {"No Special Resources",
                                              "Mineral Rich",
                                              "MineralPoor",
                                              "Desert",
                                              "Lots of Water",
                                              "Rich Soil",
                                              "Poor Soil",
                                              "Rich Fauna",
                                              "Lifeless",
                                              "Weird Mushrooms",
                                              "Lots of Herbs",
                                              "Artistic",
                                              "Warlike"};
    /**
     * Government types for solar systems
     */
    private static String[] governmentTypes = {"Anarchy",
                                               "Capitalist State",
                                               "Communist State",
                                               "Confederacy",
                                               "Corporate State",
                                               "Cybernetic State",
                                               "Democracy",
                                               "Dictatorship",
                                               "Fascist State",
                                               "Feudal State",
                                               "Military State",
                                               "Monarchy",
                                               "Pacifist State",
                                               "Socialist State",
                                               "State of Satori",
                                               "Technocracy",
                                               "Theocracy"};
    /**
     * Solar system name.
     */
    private String solarName;
    /**
     * Names of plants in solar system.
     */
    private String[] planetNames;
    /**
     * Current tech level.
     */
    private int techLevel;
    /**
     * Current resource level.
     */
    private int resources;
    /**
     * Current government type.
     */
    private int govType;
    /**
     * Chance of police encounter.
     */
    private int policeEncounterChance;
    /**
     * Chance of pirate encounter.
     */
    private int pirateEncounterChance;
    /**
     * X coordinate.
     */
    private int xLoc;
    /**
     * Y coordinate.
     */
    private int yLoc;
    /**
     * Number of planets in solar system.
     */
    private int numPlanets;
    /**
     * Current marketplace.
     */
    private Market solarMarket;
    /**
     * Creates Solar system with 1 planet.
     * @param name the name of the solar system and planet
     * @param x the x coordinate of the solar system
     * @param y the y coordinate of the solar system
     */
    public SolarSystem(final String name, final int x, final int y) {
        this(name, new String[1], x, y);
    }
    /**
     * Creates Solar system with many planets.
     * @param name the name of the solar system
     * @param pNames the planet names
     * @param x x coordinate of solar system
     * @param y the y coordinate of solar system.
     */
    public SolarSystem(final String name, final String[] pNames, final int x,
            final int y) {
        if (pNames.length == 1) {
            pNames[0] = name;
        }
        solarName = name;
        planetNames = pNames;
        xLoc = x;
        yLoc = y;
        numPlanets = pNames.length;
        setAttributes();
        solarMarket = new Market(techLevel);
    }
    /**
     * Get Marketplace for this solar system.
     * @return solarMarket, the market
     */
    public final Market getMarket() {
        return solarMarket;
    }

    /**
     * Returns the name of the solar system.
     *@return solarname, the name
     */
    public final String getSolarName() {
        return solarName;
    }
    /**
     * Returns the tech level of the solar system.
     * @return techLevel, the tech level as an int
     */
    public final int getTechLevel() {
        return techLevel;
    }
    /**
     * Returns the tech level of the solar system.
     * @return techLevels, the name of the tech level as a string
     */
    public final String getTechString() {
        return techLevels[techLevel];
    }
    /**
     * Returns the resource type.
     * @return resources, the resource type as an int
     */
    public final int getResourceType() {
        return resources;
    }
    /**
     * Returns the resource type.
     * @return resourceLevels, the resource level as a string
     */
    public final String getResourceString() {
        return resourceLevels[resources];
    }
    /**
     * Returns the government type.
     * @return govType, the government type as an int
     */
    public final int getGovType() {
        return govType;
    }
    /**
     * Returns the government type.
     * @return governmentTypes, the government type as a string
     */
    public final String getGovString() {
        return governmentTypes[govType];
    }
    /**
     * Returns the chance of this solar system having
     * a police encounter when entering.
     * @return policeEncounterChance, the percent chance
     */
    public final int getPoliceChance() {
        return policeEncounterChance;
    }
    /**
     * Returns the chance of this solar system having
     * a pirate encounter when entering.
     * @return pirateEncounterChance, the percent chance
     */
    public final int getPirateChance() {
        return pirateEncounterChance;
    }
    /**
     * Returns the x location of the solar system.
     * @return xLoc, the x coordinate
     */
    public final int getX() {
        return xLoc;
    }
    /**
     * Returns the y location of the solar system.
     * @return yLoc, the y coordinate
     */
    public final int getY() {
        return yLoc;
    }
    /**
     * Returns number of planets in solar system.
     * @return numPlanets, the number as an int
     */
    public final int getNumPlanets() {
        return numPlanets;
    }
    @Override
    public final String toString() {
        return solarName;
    }
    /**
     * Returns an random int within the range of min and max.
     * @param minimum the minimum value of the range
     * @param maximum the maximum value of the range
     * @return randInt the random int within the range
     */
    private int randomIntRange(final int minimum, final int maximum) {
        Random randomThing = new Random();
        int randInt = randomThing.nextInt((maximum - minimum) + 1) + minimum;
        return randInt;
    }
    /**
     * Returns a resource level, with 0 being the most common
     * Finds a random int between 0 and 11, if it is less than
     * or equal to 7, the resource is set to 0, otherwise
     * its set to a random resource between 1 and 13.
     * @return aResource, the resource level
    */
    private int setResourceLevel() {
        int aResource = 0;
        int weightZero = randomIntRange(0, 11);
        if (weightZero <= 7) {
            aResource = 0;
        } else {
            aResource = randomIntRange(1, 11);
        }
        return aResource;
    }
    /**
     * Sets attributes of the solar system.
     */
    private void setAttributes() {
        techLevel = randomIntRange(0, 7);
        resources = setResourceLevel();
        govType = randomIntRange(0, 16);
        policeEncounterChance = randomIntRange(25, 51);
        pirateEncounterChance = randomIntRange(10, 51);
    }
}
