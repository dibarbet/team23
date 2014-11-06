package spacefx;

/**
 *
 * @author Dillon
 */
public class ShipUpgrade {
    
    private final String type, name;
    private final int price;
    /**
     * Creates an upgrade of type weapon, shield, gadget, or crew
     * @param type the type of upgrade
     * @param name the subtype of the upgrade
     */
    public ShipUpgrade(String type, String name) {
        this.type = type;
        this.name = name;
        this.price = getPrice(name);
    }
    /**
     * Returns the price of a certain subtype upgrade
     * @param name the name of the type.
     * @return the price of that type.
     */
    private int getPrice(String name) {
        switch (name) {
            case "pulseLaser":
                return 1000;
            case "beamLaser":
                return 2000;
            case "militaryLaser":
                return 2500;
            case "smallShield":
                return 1000;
            case "bigShield":
                return 2000;
            case "navigation":
                return 5000;
            case "5cargo":
                return 2000;
            case "autoRepair":
                return 2200;
            case "targeting":
                return 2200;
            case "cloaking":
                return 10000;
            case "badCrew":
                return 10000;
            case "goodCrew":
                return 20000;
            default:
                return 1;
        }
    }
    /**
     * Returns the price of the current instance's type
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * Determine if tech level is high enough to buy/sell upgrades
     * @return 
     */
    public boolean checkTechLevel() {
        return GameData.getCurrSolarSys().getTechLevel() >= 6;
    }
    /**
     * Buy an upgrade
     * @param type the type: weapon, shield, gadget, crew
     * @param name the subtype: pulse cannon, energy shield...
     * @return true if bought, false otherwise.
     */
    public boolean buyUpgrade(String type, String name) {
        Ship ship = GameData.getShip();
        Shipyard shipyard = new Shipyard();
        Player player = GameData.getPlayer();
        ShipUpgrade upgrade = new ShipUpgrade(type, name);
        if ((player.getCredit() - upgrade.price) < 0) {
            System.out.println("price");
            return false;
        } else if (!shipyard.checkTechLevel()) {
            return false;
        } else if (upgrade.name.equals("beamLaser") | upgrade.name.equals("bigShield") |
                upgrade.name.equals("navigation")) {
            if(!checkTechLevel()) {
                return false;
            }
        } else if (ship.getUpgradeCount(upgrade.type) >= ship.getSlots(upgrade.type)) {
            System.out.println("Already full");
            System.out.println(ship.getUpgradeCount(upgrade.type));
            System.out.println(ship.getSlots(upgrade.type));
            System.out.println(upgrade.type);
            return false;
        }
        player.loseCredit(price);
        ship.addUpgrade(upgrade.type, upgrade.name);
        GameData.setPlayer(player);
        GameData.setShip(ship);
        return true;
    }
    /**
     * Sells an upgrade from the ship
     * @param type the class of the item to sell
     * @param name the name of the item to sell
     * @return true if sold, false otherwise.
     */
    public boolean sellUpgrade(String type, String name) {
        Ship ship = GameData.getShip();
        Player player = GameData.getPlayer();
        ShipUpgrade sUpgrade = new ShipUpgrade(type, name);
        int uPrice = sUpgrade.price;
        String[] upgrades = ship.getUpgradeList(type);
        for (String upgrade: upgrades) {
            if (upgrade.equals(name) && upgrades.length > 0) {
                ship.sellUpgrade(type, name, findIndex(upgrades, name));
                player.gainCredit(uPrice);
                GameData.setPlayer(player);
                GameData.setShip(ship);
                return true;
            }
        }
        return false;
    }
    /**
     * Find index of specific upgrade name or type
     * @param arr the array of names
     * @param name the name to find
     * @return the index of the name in the array
     */
    private int findIndex(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
