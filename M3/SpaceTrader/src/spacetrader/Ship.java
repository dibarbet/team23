/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;
import java.util.Random;
/**
 *
 * @author Dillon, Seung Lee
 */
public class Ship {
    private int count = 0;
    private int limit = 30;
    protected String[] cargo = new String[limit];

    /*public void testCase() {
        //testCase - will be modified later with actual ships.
        Random rand = new Random();
        for (int i = 0; i < cargo.length; i++) {
            int num = rand.nextInt(10);
            if (num == 0) {
                cargo[i] = "Water";
            } else if (num == 1) {
                cargo[i] = "Furs";
            } else if (num == 2) {
                cargo[i] = "Food";
            } else if (num == 3) {
                cargo[i] = "Ore";
            } else if (num == 4) {
                cargo[i] = "Games";
            } else if (num == 5) {
                cargo[i] = "Firearms";
            } else if (num == 6) {
                cargo[i] = "Medicine";
            } else if (num == 7) {
                cargo[i] = "Machines";
            } else if (num == 8) {
                cargo[i] = "Narcotics";
            } else if (num == 9) {
                cargo[i] = "Robots";
            } else if (num == 10) {
                cargo[i] = null;
            }
        }
    }*/
    public void addCargo(int amount, String good) {
        if (count + amount <= limit) {
            for (int i = 0; i < amount; i++) {
                cargo[count] = good;
                count++;
            }
        }
    }
    
    public void removeCargo(int amount, String good) {
        if (count - amount >= 0) {
            for (int i = 0; i < count; i++) {
                if (cargo[i].equals(good)) {
                    cargo[i] = null;
                    count--;
                    amount--;
                }
                if (amount == 0) {
                    return;
                }
            }
            if (amount > 0) {
                System.out.print("Not enough of that good in cargo, sold all that was available.");
            }
        }
    }
}
