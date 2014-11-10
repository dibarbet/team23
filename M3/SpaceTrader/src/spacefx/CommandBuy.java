/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

/**
 *
 * @author David
 */
public interface CommandBuy {

    /**Buys any string item
     * Sells any string item
     */
    public  int buy(String item);
    public int sell(String item);
}
