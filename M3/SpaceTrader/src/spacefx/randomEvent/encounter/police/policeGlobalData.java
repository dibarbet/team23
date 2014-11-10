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
public class policeGlobalData {
    private static String situation ="initial";
    public static void setSitu(String input) {
        situation = input;
    }
    public static String getSitu() {
        return situation;
    }
}
