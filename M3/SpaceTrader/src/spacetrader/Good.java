/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spacetrader;

/**
 *
 * @author YaxiongLiu
 */
public class Good {
    public static final Water water = new Water();
    public static final Furs furs = new Furs();
    public static final Food food = new Food();
    public static final Ore ore = new Ore();
    public static final Games games = new Games();
    public static final Firearms firearms = new Firearms();
    public static final Medicine medicine = new Medicine();
    public static final Machines machines = new Machines();
    public static final Narcotics narcotics = new Narcotics();
    public static final Robots robots = new Robots();
    
    public static class Water {
        final static String name = "Water";
        final static int mtlp = 0;
        final static int mtlu = 0;
        final static int ttp = 2;
        final static int basePrice = 30;
        final static int ipl = 3;
        final static int var = 4;
        final static String ie = "DROUGHT";
        final static String cr = "LOTSOFWATER";
        final static String er = "DESERT";
        final static int mtl = 30;
        final static int mth = 50;
    }
    
    public static class Furs {
        final static String name = "Furs";
        final static int mtlp = 0;
        final static int mtlu = 0;
        final static int ttp = 0;
        final static int basePrice = 250;
        final static int ipl = 10;
        final static int var = 10;
        final static String ie = "COLD";
        final static String cr = "RICHFAUNA";
        final static String er = "LIFELESS";
        final static int mtl = 230;
        final static int mth = 280;
    }
    
    public static class Food {
        final static String name = "Food";
        final static int mtlp = 1;
        final static int mtlu = 0;
        final static int ttp = 1;
        final static int basePrice = 100;
        final static int ipl = 5;
        final static int var = 5;
        final static String ie = "CROPFAIL";
        final static String cr = "RICHSOIL";
        final static String er = "POORSOIL";
        final static int mtl = 90;
        final static int mth = 160;
    }    
    public static class Ore {
        final static String name = "Ore";
        final static int mtlp = 2;
        final static int mtlu = 2;
        final static int ttp = 3;
        final static int basePrice = 350;
        final static int ipl = 20;
        final static int var = 10;
        final static String ie = "WAR";
        final static String cr = "MINERALRICH";
        final static String er = "MINERALPOOR";
        final static int mtl = 350;
        final static int mth = 420;
    }
    
    public static class Games {
        final static String name = "Games";
        final static int mtlp = 3;
        final static int mtlu = 1;
        final static int ttp = 6;
        final static int basePrice = 250;
        final static int ipl = -10;
        final static int var = 5;
        final static String ie = "BOREDOM";
        final static String cr = "ARTISTIC";
        final static String er = "Never";
        final static int mtl = 160;
        final static int mth = 270;
    }
    
    public static class Firearms {
        final static String name = "Firearms";
        final static int mtlp = 3;
        final static int mtlu = 1;
        final static int ttp = 5;
        final static int basePrice = 1250;
        final static int ipl = -75;
        final static int var = 100;
        final static String ie = "WAR";
        final static String cr = "WARLIKE";
        final static String er = "Never";
        final static int mtl = 600;
        final static int mth = 1100;
    }
    
    public static class Medicine {
        final static String name = "Medicine";
        final static int mtlp = 4;
        final static int mtlu = 1;
        final static int ttp = 6;
        final static int basePrice = 650;
        final static int ipl = -20;
        final static int var = 10;
        final static String ie = "PLAGUE";
        final static String cr = "LOTSOFHERBS";
        final static String er = "Never";
        final static int mtl = 400;
        final static int mth = 700;
    }
    
    public static class Machines {
        final static String name = "Machines";
        final static int mtlp = 4;
        final static int mtlu = 3;
        final static int ttp = 5;
        final static int basePrice = 900;
        final static int ipl = -30;
        final static int var = 5;
        final static String ie = "LACKOFWORKERS";
        final static String cr = "Never";
        final static String er = "Never";
        final static int mtl = 600;
        final static int mth = 800;
    }
    
    public static class Narcotics {
        final static String name = "Narcotics";
        final static int mtlp = 5;
        final static int mtlu = 0;
        final static int ttp = 5;
        final static int basePrice = 3500;
        final static int ipl = -125;
        final static int var = 150;
        final static String ie = "BOREDOM";
        final static String cr = "WEIRDMUSHROOMS";
        final static String er = "Never";
        final static int mtl = 2000;
        final static int mth = 3000;
    }
    
    public static class Robots {
        final static String name = "Robots";
        final static int mtlp = 6;
        final static int mtlu = 4;
        final static int ttp = 7;
        final static int basePrice = 5000;
        final static int ipl = -150;
        final static int var = 100;
        final static String ie = "LACKOFWORKERS";
        final static String cr = "Never";
        final static String er = "Never";
        final static int mtl = 3500;
        final static int mth = 5000;
    }
}