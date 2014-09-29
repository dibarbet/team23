/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

/**
 *
 * @author Dillon
 */
public class Ship {
    private int count = 0;
    private int limit = 30;
    private String[] cargo = new String[limit];
    
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
