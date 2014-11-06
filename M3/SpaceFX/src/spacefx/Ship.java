package spacefx;

import java.io.Serializable;

/**
 *
 * @author Dillon, David Barbet
 */
public abstract class Ship implements Serializable {
    int count, weaponCount, shieldCount, gadgetCount, crewCount;
    private final int price;
    private int limit, fuel, hull, weaponSlots, shieldSlots, gadgetSlots, crewSlots;
    protected int nwater, nfur, nfood, nore, ngame, nfire, nmed, nmach, nnarc, nrob;
    protected String[] weapons;
    protected String[] shields;
    protected String[] gadgets;
    protected String[] crew;
    
    public Ship(int limit, int fuel, int hull, int price, int weaponSlots, int shieldSlots, int gadgetSlots, int crewSlots) {
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
     * Abstract method to determine the subclasses ship name
     * @return the ship name
     */
    public abstract String getShipName();
    /**
     * Returns the name of the ship type
     * @return the current ships name
     */
    public String getShipType() {
        Ship ship = GameData.getShip();
        return ship.getShipName();
    }
    /**
     * Returns the number of available weapon slots
     * @return weaponSlots, the number for each ship
     */
    public int getWeaponSlots() {
        return weaponSlots;
    }
    /**
     * Returns the number of available shield slots
     * @return shieldSlots
     */
    public int getShieldSlots() {
        return shieldSlots;
    }
    /**
     * Returns the number of available gadget slots
     * @return gadgetSlots 
     */
    public int getGadgetSlots() {
        return gadgetSlots;
    }
    /**
     * Returns number of available crew slots
     * @return crewSlots
     */
    public int getCrewSlots() {
        return crewSlots;
    }
    @Override
    public String toString() {
        Ship ship = GameData.getShip();
        return ship.getShipName();
                
    }
    /**
     * Sets the current ship type
     * @param shipType the type of the ship
     * @return a ship of the type
     */
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
    /**
     * Count of goods in cargo
     * @return the count
     */
    public int getCount() {
        return count;
    }
    /**
     * Sets number of goods in cargo
     * @param num number of goods
     */
    public void setCount(int num) {
        count = num;
    }
    /**
     * Gets price of current ship
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * Adds an amount of cargo to the ship, updates the count and number
     * of that cargo.
     * @param amount amount of good to add
     * @param good type of good to add
     */
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
    /**
     * Sells an amount of a good from the cargo by decrementing that cargo
     * and count
     * @param amount the amount to sell
     * @param good the type to sell
     */
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
    /**
     * Returns amount of fuel in ship.
     * @return amount of fuel
     */
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
    /**
     * Returns the limit of the cargo on current ship
     * @return the limit
     */
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
    
    public int getSlots(String upgradeType) {
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
    
    public int getUpgradeCount(String upgradeType) {
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
    
        public String[] getUpgradeList(String type) {
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
    
    public void addUpgrade(String type, String name) {
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
    
    public void sellUpgrade(String type, String name, int index) {
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
                for (int i = index + 1; i <gadgetSlots; i++) {
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
