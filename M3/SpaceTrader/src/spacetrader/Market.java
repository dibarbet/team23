/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;
import java.util.Random;
/**
 *
 * @author David Barbet, Guy, Seung Lee
 */
public class Market {
    private int nwater, nfurs, nfood, nore, ngames, nfirearms, nmedicine, nmachines, nnarcotics, nrobots;
    private int pwater, pfurs, pfood, pore, pgames, pfirearms, pmedicine, pmachines, pnarcotics, probots;
    private int mwater, mfurs, mfood, more, mgames, mfirearms, mmedicine, mmachines, mnarcotics, mrobots;
    private int money;
    private Ship ship = new Ship(1);
    private String[] stock;
    private SolarSystem solarsystem;
    
    public Market(SolarSystem solarsystem) {
        this.solarsystem = solarsystem;
        // Get the number of goods in the cargo space
        for (int i = 0; i < ship.getCount(); i++) {
            if (ship.getCargo(i).equals("Water")) {
                nwater++;
            } else if (ship.getCargo(i).equals("Furs")) {
                nfurs++;
            } else if (ship.getCargo(i).equals("Food")) {
                nfood++;
            } else if (ship.getCargo(i).equals("Ore")) {
                nore++;
            } else if (ship.getCargo(i).equals("Games")) {
                ngames++;
            } else if (ship.getCargo(i).equals("Firearms")) {
                nfirearms++;
            } else if (ship.getCargo(i).equals("Medicine")) {
                nmedicine++;
            } else if (ship.getCargo(i).equals("Machines")) {
                nmachines++;
            } else if (ship.getCargo(i).equals("Narcotics")) {
                nnarcotics++;
            } else if (ship.getCargo(i).equals("Robots")) {
                nrobots++;
            }            
        }
        int techLevel = solarsystem.getTechLevel();
        //Creates prices for goods based on a model    
        Random rand = new Random(); 
        pwater = Good.Water.basePrice * (1 + rand.nextInt(Good.Water.var) / 10) + (Good.Water.ipl * (techLevel - Good.Water.mtlp));
        pfurs = Good.Furs.basePrice * (1 + rand.nextInt(Good.Furs.var) / 10) + (Good.Furs.ipl * (techLevel - Good.Furs.mtlp));
        pfood = Good.Food.basePrice * (1 + rand.nextInt(Good.Food.var) / 10) + (Good.Food.ipl * (techLevel - Good.Food.mtlp));
        pore = Good.Ore.basePrice * (1 + rand.nextInt(Good.Ore.var) / 10) + (Good.Ore.ipl * (techLevel - Good.Ore.mtlp));
        pgames = Good.Games.basePrice * (1 + rand.nextInt(Good.Games.var) / 10) + (Good.Games.ipl * (techLevel - Good.Games.mtlp));
        pfirearms = Good.Firearms.basePrice * (1 + rand.nextInt(Good.Firearms.var) / 10) + (Good.Firearms.ipl * (techLevel - Good.Firearms.mtlp));
        pmedicine = Good.Medicine.basePrice * (1 + rand.nextInt(Good.Medicine.var) / 10) + (Good.Medicine.ipl * (techLevel - Good.Medicine.mtlp));
        pmachines = Good.Machines.basePrice * (1 + rand.nextInt(Good.Machines.var) / 10) + (Good.Machines.ipl * (techLevel - Good.Machines.mtlp));
        pnarcotics = Good.Narcotics.basePrice * (1 + rand.nextInt(Good.Narcotics.var) / 10) + (Good.Narcotics.ipl * (techLevel - Good.Narcotics.mtlp));
        probots = Good.Robots.basePrice * (1 + rand.nextInt(Good.Robots.var) / 10) + (Good.Robots.ipl * (2 - Good.Robots.mtlp));
        mwater = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfurs = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfood = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        more = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mgames = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mfirearms = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mmedicine = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mmachines = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mnarcotics = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
        mrobots = (1+ rand.nextInt(10)) * techLevel + 10 + rand.nextInt(20);
    }
    /*Returns the amount of money after buying One water
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyWater() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pwater >= 0 && mwater >0) {
            money = money - pwater;
            nwater++;
            mwater--;
            ship.addCargo(1, "Waters");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One fur
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyFur() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pfurs >= 0 && mfurs >0) {
            money = money - pfurs;
            nfurs++;
            mfurs--;
            ship.addCargo(1, "Furs");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One food
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyFood() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pfood >= 0 && mfood >0) {
            money = money - pfood;
            nfood++;
            mfood--;
            ship.addCargo(1, "Food");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One ore
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyOre() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pore >= 0&& more > 0) {
            money = money - pore;
            nore++;
            more--;
            ship.addCargo(1, "Ore");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One game
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyGame() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pgames >= 0 && mgames > 0) {
            money = money - pgames;
            ngames++;
            mgames--;
            ship.addCargo(1, "Games");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One firearm
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyFirearm() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pfirearms >= 0 && mfirearms > 0) {
            money = money - pfirearms;
            nfurs++;
            mfurs--;
            ship.addCargo(1, "Firearms");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One medicine
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyMedicine() {                                         
    //Update money, number of water in cargo space and market stock when player buys good        
        int tempmoney = money;
        if (tempmoney - pmedicine >= 0 && mmedicine > 0) {
            money = money - pmedicine;
            nmedicine++;
            mmedicine--;
            ship.addCargo(1, "Medicine");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One machine
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyMachine() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pmachines >= 0 && mmachines > 0) {
            money = money - pmachines;
            nmachines++;
            mmachines--;
            ship.addCargo(1, "Machines");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One narcotic
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyNarcotic() {                                         
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - pnarcotics >= 0 && mnarcotics > 0) {
            money = money - pnarcotics;
            nnarcotics++;
            mnarcotics--;
            ship.addCargo(1, "Narcotics");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after buying One robot
     *@return money left after buying, or -1 if buying would make money
     *drop below 0
    */
    public int buyRobot() {                                          
        //Update money, number of water in cargo space and market stock when player buys good
        int tempmoney = money;
        if (tempmoney - probots >= 0 && mrobots > 0) {
            money = money - probots;
            nrobots++;
            mrobots--;
            ship.addCargo(1, "Robots");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one water
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellWater() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nwater > 0) {
            money = money + pwater;
            nwater--;
            mwater++;
            ship.sellCargo(1, "Water");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one fur
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellFur() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nfurs > 0) {
            money = money + pfurs;
            nfurs--;
            mfurs++;
            ship.sellCargo(1, "Furs");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one food
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellFood() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nfood > 0) {
            money = money + pfood;
            nfood--;
            mfood++;
            ship.sellCargo(1, "Food");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one ore
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellOre() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nore > 0) {
            money = money + pore;
            nore--;
            more++;
            ship.sellCargo(1, "Ore");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one game
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellGame() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (ngames > 0) {
            money = money + pgames;
            ngames--;
            mgames++;
            ship.sellCargo(1, "Games");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one firearm
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellFirearm() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nfirearms > 0) {
            money = money + pfirearms;
            nfirearms--;
            mfirearms++;
            ship.sellCargo(1, "Firearms");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one medicine
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellMedicine() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nmedicine > 0) {
            money = money + pmedicine;
            nmedicine--;
            mmedicine++;
            ship.sellCargo(1, "Medicine");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one machine
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellMachine() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nmachines > 0) {
            money = money + pmachines;
            nmachines--;
            mmachines++;
            ship.sellCargo(1, "Machines");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one narcotic
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellNarcotic() {                                          
       //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nnarcotics > 0) {
            money = money + pnarcotics;
            nnarcotics--;
            mnarcotics++;
            ship.sellCargo(1, "Narcotics");
        } else {
            return -1;
        }
        return money;
    }
    /*Returns the amount of money after selling one robot
     *@return money left after selling one, or -1 if it cannot be sold
    */
    public int sellRobot() {                                          
        //Update money, number of water in cargo space and market stock when player sells good
        int tempmoney = money;
        if (nrobots > 0) {
            money = money + probots;
            nrobots--;
            mrobots++;
            ship.sellCargo(1, "Robots");
        } else {
            return -1;
        }
        return money;
    }
}
