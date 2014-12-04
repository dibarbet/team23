/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx.randomEvent.encounter.police;

/**
 *
 * @author YaxiongLiu
 */
public class PoliceGlobalData {
    /**
     * Situation String.
     */
    private static String situation = "initial";
    /**
     * Setter.
     * @param input input
     */
    public static void setSitu(final String input) {
        situation = input;
    }
    /**
     * Getter.
     * @return situation
     */
    public static String getSitu() {
        return situation;
    }
}
