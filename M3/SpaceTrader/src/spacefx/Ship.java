package spacefx;

import java.io.Serializable;

/**
 * @author Dillon, David Barbet
 */
public abstract class Ship implements Serializable {
    /**
     * Number of upgrades.
     */
    private int count, weaponCount, shieldCount, gadgetCount, crewCount;
    /**
     * Cost of ship.
     */
    private final int price;
    /**
     * Upgrade slots, fuel, and hull.
     */
    private int limit, fuel, hull, weaponSlots, shieldSlots, gadgetSlots,
            crewSlots;
    /**
     * Cargo items.
     */
    protected int nwater, nfur, nfood, nore, ngame, nfire, nmed, nmach, nnarc,
            nrob;
    /**
     * Weapons on ship
     */
    protected String[] weapons;
    /**
     * Shields on ship
     */
    protected String[] shields;
    /**
     * Gadgets on ship.
     */
    protected String[] gadgets;
    /**
     * Crew on ship.
     */
    protected String[] crew;
    /**
     * Constructor for ship.
     * @param limit the limit
     * @param fuel amount of fuel
     * @param hull size of hull
     * @param price cost
     * @param weaponSlots number of weapon slots
     * @param shieldSlots number of shield slots
     * @param gadgetSlots number of gadget slots
     * @param crewSlots number of crew slots
     */
    public Ship(final int limit, final int fuel, final int hull,
            final int price, final int weaponSlots, final int shieldSlots,
            final int gadgetSlots, final int crewSlots) {
        count = 0;
        weaponCount = 0;
        shieldCount = 0;
        gadgetCount = 0;
        crewCount = 0;
        this.limit = limit;
        this.fuel = fuel;
        this.hull = hull;
        this.price = price;
        this.weaponSlots = weaponSlots;
        this.shieldSlots = shieldSlots;
        this.gadgetSlots = gadgetSlots;
        this.crewSlots = crewSlots;
        weapons = new String[weaponSlots];
        shields = new String[shieldSlots];
        gadgets = new String[gadgetSlots];
        crew = new String[crewSlots];
    }
    /**
     * Abstract method to determine the subclasses ship name.
     * @return the ship name
     */
    public abstract String getShipName();
    /**
     * Returns the name of the ship type.
     * @return the current ships name
     */
    public final String getShipType() {
        Ship ship = GameData.getShip();
        return ship.getShipName();
    }
    /**
     * Returns the number of available weapon slots.
     * @return weaponSlots, the number for each ship
     */
    public final int getWeaponSlots() {
        return weaponSlots;
    }
    /**
     * Returns the number of available shield slots.
     * @return shieldSlots
     */
    public final int getShieldSlots() {
        return shieldSlots;
    }
    /**
     * Returns the number of available gadget slots.
     * @return gadgetSlots
     */
    public final int getGadgetSlots() {
        return gadgetSlots;
    }
    /**
     * Returns number of available crew slots.
     * @return crewSlots
     */
    public final int getCrewSlots() {
        return crewSlots;
    }
    @Override
    public final String toString() {
        Ship ship = GameData.getShip();
        return ship.getShipName();
    }
    /**
     * Sets the current ship type.
     * @param shipType the type of the ship
     * @return a ship of the type
     */
    public final Ship setShip(final String shipType) {
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
    /**
     * Count of goods in cargo.
     * @return the count
     */
    public final int getCount() {
        return count;
    }
    /**
     * Sets number of goods in cargo.
     * @param num number of goods
     */
    public final void setCount(final int num) {
        count = num;
    }
    /**
     * Gets price of current ship.
     * @return the price
     */
    public final int getPrice() {
        return price;
    }
    /**
     * Adds an amount of cargo to the ship, updates the count and number
     * of that cargo.
     * @param amount amount of good to add
     * @param good type of good to add
     */
    public final void addCargo(final int amount, final String good) {
        int total = nwater + nfur + nfood + nore + ngame + nfire + nmed + nmach
                + nnarc + nrob;
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
    /**
     * Sells an amount of a good from the cargo by decrementing that cargo.
     * and count
     * @param amount the amount to sell
     * @param good the type to sell
     */
    public final void sellCargo(final int amount, final String good) {
        int total = nwater + nfur + nfood + nore + ngame + nfire + nmed + nmach
                + nnarc + nrob;
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
    /**
     * Returns amount of fuel in ship.
     * @return amount of fuel
     */
    public final int getFuel() {
        return fuel;
    }
    /**
     * Return how many miles you can travel.
     * @param shipType type of ship
     * @param fuel amount of fuel
     * @return miles you can travel
     */
    public final int fuelToMiles(final int shipType, final int fuel) {
        return fuel * shipType;
    }
    /**
     * Return how much fuel need to travel a distance.
     * @param shipType type of ship
     * @param miles distance
     * @return fuel needed
     */
    public final int milesToFuel(final int shipType, final int miles) {
        return miles / shipType;
    }
    /**
     * If able to travel, sets the new location and updates the ships fuel.
     * @param dest the destination solar system
     * @return True if travel was successful
     */
    public final boolean travel(final SolarSystem dest) {
        int miles = fuelToMiles(1, fuel);
        Universe universe = GameData.getUniverse();
        double distance = universe.distance(universe.getCurrentSolarSystem(),
                dest);
        if (miles < distance) {
            System.out.println("Ship unable to travel that distance");
            return false;
        } else {
            universe.setCurrentSolarSystem(dest);
            miles = Math.abs((int) distance - miles);
            fuel = milesToFuel(1, miles);
            return true;
        }
    }
    /**
     * Returns the limit of the cargo on current ship.
     * @return the limit
     */
    public final int getLimit() {
        return limit;
    }
    // <editor-fold defaultstate="collapsed" desc="Good get and set methods">
    /**
     * Returns the water.
     * @return amount of water
     */
    public final int getWater() {
        return nwater;
    }
    /**
     * Sets the water.
     * @param i amount of water
     */
    public final void setWater(final int i) {
        nwater = i;
    }
    /**
     * Returns the fur.
     * @return amount of fur
     */
    public final int getFur() {
        return nfur;
    }
    /**
     * Sets the fur.
     * @param i amount of fur
     */
    public final void setFur(final int i) {
        nfur = i;
    }
    /**
     * Returns the food.
     * @return amount of food
     */
    public final int getFood() {
        return nfood;
    }
    /**
     * Sets the food.
     * @param i amount of food
     */
    public final void setFood(final int i) {
        nfood = i;
    }
    /**
     * Returns the ore.
     * @return amount of ore
     */
    public final int getOre() {
        return nore;
    }
    /**
     * Sets the ore.
     * @param i amount of ore
     */
    public final void setOre(final int i) {
        nore = i;
    }
    /**
     * Returns the game.
     * @return amount of games
     */
    public final int getGame() {
        return ngame;
    }
    /**
     * Sets the games.
     * @param i amount of games
     */
    public final void setGame(final int i) {
        ngame = i;
    }
    /**
     * Returns the firearm.
     * @return amount of firearms
     */
    public final int getFirearm() {
        return nfire;
    }
    /**
     * Sets the firearms.
     * @param i amount of firearms
     */
    public final void setFirearm(final int i) {
        nfire = i;
    }
    /**
     * Returns the medicine.
     * @return amount of medicine
     */
    public final int getMedicine() {
        return nmed;
    }
    /**
     * Sets the medicine.
     * @param i amount of medicine
     */
    public final void setMedicine(final int i) {
        nmed = i;
    }
    /**
     * Returns the machines.
     * @return amount of machines
     */
    public final int getMachine() {
        return nmach;
    }
    /**
     * Sets the machines.
     * @param i amount of machines
     */
    public final void setMachine(final int i) {
        nmach = i;
    }
    /**
     * Returns the narcotics.
     * @return amount of narcotics
     */
    public final int getNarcotic() {
        return nnarc;
    }
    /**
     * Sets the narcotics.
     * @param i amount of narcotics
     */
    public final void setNarcotic(final int i) {
        nnarc = i;
    }
    /**
     * Returns the robots.
     * @return amount of robots
     */
    public final int getRobot() {
        return nrob;
    }
    /**
     * Sets the robots.
     * @param i amount of robots
     */
    public final void setRobot(final int i) {
        nrob = i;
    }
    /**
     * Clear the cargo.
     */
    public final void emptyCargo() {
        count = 0;
        nwater = 0;
        nfur = 0;
        nfood = 0;
        nore = 0;
        ngame = 0;
        nfire = 0;
        nmed = 0;
        nmach = 0;
        nnarc = 0;
        nrob = 0;
    }
    /**
     * Increase count by 1.
     */
    public final void incCount() {
        count++;
    }
    /**
     * Decrease count by 1.
     */
    public final void decCount() {
        count--;
    }
    /**
     * Return how much of a type.
     * @param upgradeType value of upgrade type
     * @return the number of slots of that type
     */
    public final int getSlots(final String upgradeType) {
        switch(upgradeType) {
            case "weapon":
                return weaponSlots;
            case "shield":
                return shieldSlots;
            case "gadget":
                return gadgetSlots;
            case "crew":
                return crewSlots;
            default:
                return -1;
        }
    }
    /**
     * Returns the number of upgrades of a certain type.
     * @param upgradeType the type of upgrade
     * @return the number of upgrades
     */
    public final int getUpgradeCount(final String upgradeType) {
        switch(upgradeType) {
            case "weapon":
                return weaponCount;
            case "shield":
                return shieldCount;
            case "gadget":
                return gadgetCount;
            case "crew":
                return crewCount;
            default:
                return -1;
        }
    }
    /**
     * Returns upgrade list.
     * @param type type of upgrade
     * @return the list of upgrades of that type
     */
    public final String[] getUpgradeList(final String type) {
        switch(type) {
            case "weapon":
                return weapons;
            case "shield":
                return shields;
            case "gadget":
                return gadgets;
            case "crew":
                return crew;
            default:
                return null;
        }
    }
    /**
     * Upgrades the ship.
     * @param type type of upgrade
     * @param name name of upgrade
     */
    public final void addUpgrade(final String type, final String name) {
        switch(type) {
            case "weapon":
                weapons[weaponCount] = name;
                weaponCount++;
                weaponSlots--;
                break;
            case "shield":
                shields[shieldCount] = name;
                shieldCount++;
                shieldSlots--;
                break;
            case "gadget":
                gadgets[gadgetCount] = name;
                gadgetCount++;
                gadgetSlots--;
                break;
            case "crew":
                crew[crewCount] = name;
                crewCount++;
                crewSlots--;
                break;
            default:
                System.out.println("fail");
                break;
        }
    }
    /**
     * Sells the specified upgrade.
     * @param type type of upgrade
     * @param name name of upgrade
     * @param index index of upgrade
     */
    public final void sellUpgrade(final String type, final String name,
            final int index) {
        int pointer = index;
        switch(type) {
            case "weapon":
                weapons[index] = null;
                for (int i = index + 1; i < weaponSlots; i++) {
                    if (weapons[i] != null) {
                        weapons[pointer] = weapons[i];
                        weapons[i] = null;
                        pointer++;
                    }
                }
                weaponCount--;
                break;
            case "shield":
                shields[index] = null;
                for (int i = index + 1; i < shieldSlots; i++) {
                    if (shields[i] != null) {
                        shields[pointer] = shields[i];
                        shields[i] = null;
                        pointer++;
                    }
                }
                shieldCount--;
                break;
            case "gadget":
                gadgets[index] = null;
                for (int i = index + 1; i < gadgetSlots; i++) {
                    if (gadgets[i] != null) {
                        gadgets[pointer] = gadgets[i];
                        gadgets[i] = null;
                        pointer++;
                    }
                }
                gadgetCount--;
                break;
            case "crew":
                crew[index] = null;
                for (int i = index + 1; i < crewSlots; i++) {
                    if (crew[i] != null) {
                        crew[pointer] = crew[i];
                        crew[i] = null;
                        pointer++;
                    }
                }
                crewCount--;
                break;
            default:
                break;
        }
    }
}
