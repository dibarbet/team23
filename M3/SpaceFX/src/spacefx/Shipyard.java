package spacefx;

/**
 *
 * @author Dillon
 */
public class Shipyard {
    
    /**
     * Allows the player to buy a ship if they have enough money and the 
     * tech level of the solar system allows it
     * @param shipType the type of ship that is being bought
     * @return true if ship is bought, false otherwise
     */
    public boolean buyShip(String shipType) {
        Ship oldShip = GameData.getShip();
        Ship newShip = oldShip.setShip(shipType);
        Player player = GameData.getPlayer();
        int price = newShip.getPrice();
        if ((player.getCredit() - price) < 0) {
            System.out.println("Failed buy");
            return false;
        } else if (!checkTechLevel()) {
            return false;
        } else {
            newShip.nwater = oldShip.nwater;
            newShip.nfur = oldShip.nfur;
            newShip.nfood = oldShip.nfood;
            newShip.nfire = oldShip.nfire;
            newShip.nore = oldShip.nore;
            newShip.ngame = oldShip.ngame;
            newShip.nmed = oldShip.nmed;
            newShip.nmach = oldShip.nmach;
            newShip.nrob = oldShip.nrob;
            newShip.nnarc = oldShip.nnarc;
            newShip.setCount(oldShip.getCount());
            player.loseCredit(price);
            player.setShip(newShip);
            GameData.setPlayer(player);
            GameData.setShip(newShip);
            return true;
        }
    }
    
    public int getShipPrice(String shipType) {
        Ship s = GameData.getShip().setShip(shipType);
        return s.getPrice();
    }
    
    /**
     * Checks the tech level of the current solar system
     * @return true if tech level is greater than 4, false otherwise
     */
    public boolean checkTechLevel() {
        return GameData.getCurrSolarSys().getTechLevel() >= 4;
    }
}

