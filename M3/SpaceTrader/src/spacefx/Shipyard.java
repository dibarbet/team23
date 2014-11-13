package spacefx;

/**
 *
 * @author Dillon
 */
public class Shipyard implements CommandBuy {
    /**
     * Allows the player to buy a ship if they have enough money and the
     * tech level of the solar system allows it.
     * @param shipType the type of ship that is being bought
     * @return true if ship is bought, false otherwise
     */
    private int price;
    /**
     * Buys an item with interface.
     * @param item the item to buy
     * @return 1 if bought, -1 otherwise
     */
    @Override
    public final int buy(final String item) {
        Player player = GameData.getPlayer();
        if (buyShip(item)) {
            return 1;
        }
        return -1;
    }
    /**
     * Buys an item with interface.
     * @param item the item to buy
     * @return 1 if bought, -1 otherwise
     */
    @Override
    public final int sell(final String item) {
        //Buying is same as selling in this case, you must always have 1 ship
        Player player = GameData.getPlayer();
        if (buyShip(item)) {
            return player.getCredit() - price;
        }
        return -1;
    }
    /**
     * Buys a ship, sets all GameData attributes, and transfers cargo to new
     * ship.
     * @param shipType the type to buy
     * @return true if bought, false otherwise.
     */
    public final boolean buyShip(final String shipType) {
        Ship oldShip = GameData.getShip();
        Ship newShip = oldShip.setShip(shipType);
        Player player = GameData.getPlayer();
        price = newShip.getPrice();
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
    /**
     * The price of a ship type.
     * @param shipType the type of ship
     * @return the price of the ship
     */
    public final int getShipPrice(final String shipType) {
        Ship s = GameData.getShip().setShip(shipType);
        return s.getPrice();
    }

    /**
     * Checks the tech level of the current solar system.
     * @return true if tech level is greater than 4, false otherwise
     */
    public final boolean checkTechLevel() {
        return GameData.getCurrSolarSys().getTechLevel() >= 4;
    }
}

