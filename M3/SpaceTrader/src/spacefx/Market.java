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
 * @author David Barbet, Guy, Seung Lee
 */
public class Market implements Serializable, CommandBuy {
    /**
     * Amount of cargo.
     */
    protected int nwater, nfurs, nfood, nore, ngames, nfirearms, nmedicine,
            nmachines, nnarcotics, nrobots;
    /**
     * Price of cargo.
     */
    protected int pwater, pfurs, pfood, pore, pgames, pfirearms, pmedicine,
            pmachines, pnarcotics, probots;
    /**
     * Amount of good available.
     */
    protected int mwater, mfurs, mfood, more, mgames, mfirearms, mmedicine,
            mmachines, mnarcotics, mrobots;
    /**
     * Amount of money.
     */
    private int money;
    /**
     * Current ship.
     */
    private Ship ship;
    /**
     * Current player.
     */
    private Player player;
    /**
     * Current stock.
     */
    private String[] stock;
    /**
     * Current tech level.
     */
    private int techLevel;
    /**
     * Initializes the market for a solar system.
     * @param techLevel the tech level for the solar system
     */
    public Market(final int techLevel) {
        ship = GameData.getShip();
        this.techLevel = techLevel;
        // Get the number of goods in the cargo space
        player = GameData.getPlayer();
        money = player.credit;
        nwater = ship.nwater;
        nfurs = ship.nfur;
        nfood = ship.nfood;
        nore = ship.nore;
        ngames = ship.ngame;
        nfirearms = ship.nfire;
        nmedicine = ship.nmed;
        nmachines = ship.nmach;
        nnarcotics = ship.nnarc;
        nrobots = ship.nrob;
        //Creates prices for goods based on a model
        Random rand = new Random();
        pwater = Good.Water.basePrice * (1 + rand.nextInt(Good.Water.var) / 10)
                + (Good.Water.ipl * (techLevel - Good.Water.mtlp));
        pfurs = Good.Furs.basePrice * (1 + rand.nextInt(Good.Furs.var) / 10)
                + (Good.Furs.ipl * (techLevel - Good.Furs.mtlp));
        pfood = Good.Food.basePrice * (1 + rand.nextInt(Good.Food.var) / 10)
                + (Good.Food.ipl * (techLevel - Good.Food.mtlp));
        pore = Good.Ore.basePrice * (1 + rand.nextInt(Good.Ore.var) / 10)
                + (Good.Ore.ipl * (techLevel - Good.Ore.mtlp));
        pgames = Good.Games.basePrice * (1 + rand.nextInt(Good.Games.var) / 10)
                + (Good.Games.ipl * (techLevel - Good.Games.mtlp));
        pfirearms = Good.Firearms.basePrice
                * (1 + rand.nextInt(Good.Firearms.var) / 10)
                + (Good.Firearms.ipl * (techLevel - Good.Firearms.mtlp));
        pmedicine = Good.Medicine.basePrice
                * (1 + rand.nextInt(Good.Medicine.var) / 10)
                + (Good.Medicine.ipl * (techLevel - Good.Medicine.mtlp));
        pmachines = Good.Machines.basePrice
                * (1 + rand.nextInt(Good.Machines.var) / 10)
                + (Good.Machines.ipl * (techLevel - Good.Machines.mtlp));
        pnarcotics = Good.Narcotics.basePrice
                * (1 + rand.nextInt(Good.Narcotics.var) / 10)
                + (Good.Narcotics.ipl * (techLevel - Good.Narcotics.mtlp));
        probots = Good.Robots.basePrice
                * (1 + rand.nextInt(Good.Robots.var) / 10)
                + (Good.Robots.ipl * (2 - Good.Robots.mtlp));
        mwater = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfurs = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfood = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        more = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mgames = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfirearms = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mmedicine = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mmachines = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mnarcotics = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mrobots = (1 + rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
    }
    /**
     * Buy method to buy a market item from interface.
     * @param item string item to buy
     * @return the amount of money left
     */
    @Override
    public final int buy(final String item) {
        if (item.equals("water")) {
            return buyWater();
        }
        if (item.equals("fur")) {
            return buyFur();
        }
        if (item.equals("ore")) {
            return buyOre();
        }
        if (item.equals("games")) {
            return buyGame();
        }
        if (item.equals("machines")) {
            return buyMachine();
        }
        if (item.equals("narcotics")) {
            return buyNarcotic();
        }
        if (item.equals("food")) {
            return buyFood();
        }
        if (item.equals("firearm")) {
            return buyFirearm();
        }
        if (item.equals("medicine")) {
            return buyMedicine();
        }
        if (item.equals("robot")) {
            return buyRobot();
        }
        return -1;
    }
    /**
     * Method to sell an item on the marketplace.
     * @param item the item to sell
     * @return amount of money in player
     */
    @Override
    public final int sell(final String item) {
        if (item.equals("water")) {
            return sellWater();
        }
        if (item.equals("fur")) {
            return sellFur();
        }
        if (item.equals("ore")) {
            return sellOre();
        }
        if (item.equals("games")) {
            return sellGame();
        }
        if (item.equals("machines")) {
            return sellMachine();
        }
        if (item.equals("narcotics")) {
            return sellNarcotic();
        }
        if (item.equals("food")) {
            return sellFood();
        }
        if (item.equals("firearm")) {
            return sellFirearm();
        }
        if (item.equals("medicine")) {
            return sellMedicine();
        }
        if (item.equals("robot")) {
            return sellRobot();
        }
        return -1;
    }
    /**
     * Returns a string representation of the marketplace.
     * @return a string representation of the marketplace.
     */
    @Override
    public final String toString() {
        return Integer.toString(nwater);
    }

    /**
     * Returns the amount of money after buying One water.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     */
    public final int buyWater() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pwater >= 0) && (mwater > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pwater;
            nwater++;
            mwater--;
            ship.addCargo(1, "Water");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One fur.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
    */
    public final int buyFur() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pfurs >= 0) && (mfurs > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pfurs;
            nfurs++;
            mfurs--;
            ship.addCargo(1, "Fur");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One food.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
    */
    public final int buyFood() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pfood >= 0) && (mfood > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pfood;
            nfood++;
            mfood--;
            ship.addCargo(1, "Food");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One ore.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
    */
    public final int buyOre() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pore >= 0) && (more > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pore;
            nore++;
            more--;
            ship.addCargo(1, "Ore");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One game.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     */
    public final int buyGame() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pgames >= 0) && (mgames > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pgames;
            ngames++;
            mgames--;
            ship.addCargo(1, "Game");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One firearm.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     */
    public final int buyFirearm() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pfirearms >= 0) && (mfirearms > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pfirearms;
            nfirearms++;
            mfirearms--;
            ship.addCargo(1, "Firearm");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One medicine.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
    */
    public final int buyMedicine() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pmedicine >= 0) && (mmedicine > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pmedicine;
            nmedicine++;
            mmedicine--;
            ship.addCargo(1, "Medicine");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One machine.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     */
    public final int buyMachine() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pmachines >= 0) && (mmachines > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pmachines;
            nmachines++;
            mmachines--;
            ship.addCargo(1, "Machine");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One narcotic.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     */
    public final int buyNarcotic() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - pnarcotics >= 0) && (mnarcotics > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - pnarcotics;
            nnarcotics++;
            mnarcotics--;
            ship.addCargo(1, "Narcotic");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after buying One robot.
     * @return money left after buying, or -1 if buying would make money
     * drop below 0
     **/
    public final int buyRobot() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player buys good
        int tempmoney = money;
        if ((tempmoney - probots >= 0) && (mrobots > 0)
                && ((ship.getCount() + 1) <= ship.getLimit())) {
            money = money - probots;
            nrobots++;
            mrobots--;
            ship.addCargo(1, "Robot");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Update market items.
     */
    private void updateMarketItems() {
        nwater = ship.nwater;
        nfurs = ship.nfur;
        nfood = ship.nfood;
        nore = ship.nore;
        ngames = ship.ngame;
        nfirearms = ship.nfire;
        nmedicine = ship.nmed;
        nmachines = ship.nmach;
        nnarcotics = ship.nnarc;
        nrobots = ship.nrob;
        money = player.credit;
    }
    /**
     * Returns the amount of money after selling one water.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellWater() {
        ship = GameData.getShip();
        updateMarketItems();
        int tempmoney = money;
        if (nwater > 0) {
            money = money + pwater;
            nwater--;
            mwater++;
            ship.sellCargo(1, "Water");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one fur.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellFur() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nfurs > 0) {
            money = money + pfurs;
            nfurs--;
            mfurs++;
            ship.sellCargo(1, "Fur");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one food.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellFood() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nfood > 0) {
            money = money + pfood;
            nfood--;
            mfood++;
            ship.sellCargo(1, "Food");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one ore.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellOre() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nore > 0) {
            money = money + pore;
            nore--;
            more++;
            ship.sellCargo(1, "Ore");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one game.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellGame() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (ngames > 0) {
            money = money + pgames;
            ngames--;
            mgames++;
            ship.sellCargo(1, "Game");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one firearm.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellFirearm() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nfirearms > 0) {
            money = money + pfirearms;
            nfirearms--;
            mfirearms++;
            ship.sellCargo(1, "Firearm");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one medicine.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellMedicine() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nmedicine > 0) {
            money = money + pmedicine;
            nmedicine--;
            mmedicine++;
            ship.sellCargo(1, "Medicine");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one machine.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellMachine() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nmachines > 0) {
            money = money + pmachines;
            nmachines--;
            mmachines++;
            ship.sellCargo(1, "Machine");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one narcotic.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellNarcotic() {
        ship = GameData.getShip();
        updateMarketItems();
       //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nnarcotics > 0) {
            money = money + pnarcotics;
            nnarcotics--;
            mnarcotics++;
            ship.sellCargo(1, "Narcotic");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Returns the amount of money after selling one robot.
     * @return money left after selling one, or -1 if it cannot be sold
     */
    public final int sellRobot() {
        ship = GameData.getShip();
        updateMarketItems();
        //Update money, number of water in cargo space and market stock when
        //player sells good
        int tempmoney = money;
        if (nrobots > 0) {
            money = money + probots;
            nrobots--;
            mrobots++;
            ship.sellCargo(1, "Robot");
            updateShip();
        } else {
            return -1;
        }
        return money;
    }
    /**
     * Updates the ship quantities.
     */
    public final void updateShip() {
        GameData.setShip(ship);
        player.setShip(ship);
    }
    /**
     * Set current market ship.
     * @param aShip the new market ship
     */
    public final void setMarketShip(final Ship aShip) {
        ship = aShip;
    }
}
