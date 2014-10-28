package spacefx;

import spacefx.GameData;
import spacefx.Player;
import spacefx.Ship;

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
        System.out.println("attempted buy");
        Ship s = new Ship(shipType);
        Player p = GameData.getPlayer();
        int price = getShipPrice(shipType);
        System.out.println(price);
        if ((p.getCredit() - price) < 0) {
            System.out.println("Failed buy");
            return false;
        } else if (!checkTechLevel()) {
            return false;
        } else {
            Ship oldShip = p.getShip();
            s.nwater = oldShip.nwater;
            s.nfur = oldShip.nfur;
            s.nfood = oldShip.nfood;
            s.nfire = oldShip.nfire;
            s.nore = oldShip.nore;
            s.ngame = oldShip.ngame;
            s.nmed = oldShip.nmed;
            s.nmach = oldShip.nmach;
            s.nrob = oldShip.nrob;
            s.nnarc = oldShip.nnarc;
            s.cargo = oldShip.cargo;
            p.loseCredit(price);
            p.setShip(s);
            GameData.setPlayer(p);
            GameData.setShip(s);
            return true;
        }
    }
    public int getShipPrice(String shipType) {
        int price = 0;
        if (shipType.equals("Flea")) price = 2000;
        if (shipType.equals("Gnat")) price = 10000;
        if (shipType.equals("Firefly")) price = 25000;
        if (shipType.equals("Mosquito")) price = 30000;
        if (shipType.equals("Bumblebee")) price = 60000;
        return price;
    }
    /**
     * Checks the tech level of the current solar system
     * @return true if tech level is greater than 4, false otherwise
     */
    public boolean checkTechLevel() {
        return GameData.getCurrSolarSys().getTechLevel() >= 4;
    }
}

