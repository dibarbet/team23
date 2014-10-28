package spacetrader;

/**
 *
 * @author Dillon
 */
public class Shipyard {
    
    /**
     * Allows the player to buy a ship if they have enough money and the 
     * tech level of the solar system allows it
     * @param shipType the type of ship that is being bought
     */
    public void buyShip(String shipType) {
        Ship s = new Ship(shipType);
        Player p = GameData.getPlayer();
        int price = s.getPrice();
        if (p.credit - price < 0) {
            System.out.println("Cannot purchase ship");
        } else if (!checkTechLevel()) {
            System.out.println("Cannot purchase ship");
        } else {
            p.loseCredit(price);
            p.setShip(shipType);
        }
    }
    
    /**
     * Checks the tech level of the current solar system
     * @return true if tech level is greater than 4, false otherwise
     */
    public boolean checkTechLevel() {
        return GameData.getCurrSolarSys().getTechLevel() >= 4;
    }
}

