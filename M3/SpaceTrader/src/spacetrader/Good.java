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
    public final Water water = new Water();
    public final Furs furs = new Furs();
    public final Food food = new Food();
    public final Ore ore = new Ore();
    public final Games games = new Games();
    public final Firearms firarms = new Firearms();
    public final Medicine medicine = new Medicine();
    public final Machines machines = new Machines();
    public final Narcotics narcotics = new Narcotics();
    public final Robots robots = new Robots();
    
    public class Water {
        final String name = "Water";
        final int mtlp = 0;
        final int mtlu = 0;
        final int ttp = 2;
        final int basePrice = 30;
        final int ipl = 3;
        final int var = 4;
        final String ie = "DROUGHT";
        final String cr = "LOTSOFWATER";
        final String er = "DESERT";
        final int mtl = 30;
        final int mth = 50;
    }
    
    public class Furs {
        final String name = "Furs";
        final int mtlp = 0;
        final int mtlu = 0;
        final int ttp = 0;
        final int basePrice = 250;
        final int ipl = 10;
        final int var = 10;
        final String ie = "COLD";
        final String cr = "RICHFAUNA";
        final String er = "LIFELESS";
        final int mtl = 230;
        final int mth = 280;
    }
    
    public class Food {
        final String name = "Food";
        final int mtlp = 1;
        final int mtlu = 0;
        final int ttp = 1;
        final int basePrice = 100;
        final int ipl = 5;
        final int var = 5;
        final String ie = "CROPFAIL";
        final String cr = "RICHSOIL";
        final String er = "POORSOIL";
        final int mtl = 90;
        final int mth = 160;
    }    
    public class Ore {
        final String name = "Ore";
        final int mtlp = 2;
        final int mtlu = 2;
        final int ttp = 3;
        final int basePrice = 350;
        final int ipl = 20;
        final int var = 10;
        final String ie = "WAR";
        final String cr = "MINERALRICH";
        final String er = "MINERALPOOR";
        final int mtl = 350;
        final int mth = 420;
    }
    
    public class Games {
        final String name = "Games";
        final int mtlp = 3;
        final int mtlu = 1;
        final int ttp = 6;
        final int basePrice = 250;
        final int ipl = -10;
        final int var = 5;
        final String ie = "BOREDOM";
        final String cr = "ARTISTIC";
        final String er = "Never";
        final int mtl = 160;
        final int mth = 270;
    }
    
    public class Firearms {
        final String name = "Firearms";
        final int mtlp = 3;
        final int mtlu = 1;
        final int ttp = 5;
        final int basePrice = 1250;
        final int ipl = -75;
        final int var = 100;
        final String ie = "WAR";
        final String cr = "WARLIKE";
        final String er = "Never";
        final int mtl = 600;
        final int mth = 1100;
    }
    
    public class Medicine {
        final String name = "Medicine";
        final int mtlp = 4;
        final int mtlu = 1;
        final int ttp = 6;
        final int basePrice = 650;
        final int ipl = -20;
        final int var = 10;
        final String ie = "PLAGUE";
        final String cr = "LOTSOFHERBS";
        final String er = "Never";
        final int mtl = 400;
        final int mth = 700;
    }
    
    public class Machines {
        final String name = "Machines";
        final int mtlp = 4;
        final int mtlu = 3;
        final int ttp = 5;
        final int basePrice = 900;
        final int ipl = -30;
        final int var = 5;
        final String ie = "LACKOFWORKERS";
        final String cr = "Never";
        final String er = "Never";
        final int mtl = 600;
        final int mth = 800;
    }
    
    public class Narcotics {
        final String name = "Narcotics";
        final int mtlp = 5;
        final int mtlu = 0;
        final int ttp = 5;
        final int basePrice = 3500;
        final int ipl = -125;
        final int var = 150;
        final String ie = "BOREDOM";
        final String cr = "WEIRDMUSHROOMS";
        final String er = "Never";
        final int mtl = 2000;
        final int mth = 3000;
    }
    
    public class Robots {
        final String name = "Robots";
        final int mtlp = 6;
        final int mtlu = 4;
        final int ttp = 7;
        final int basePrice = 5000;
        final int ipl = -150;
        final int var = 100;
        final String ie = "LACKOFWORKERS";
        final String cr = "Never";
        final String er = "Never";
        final int mtl = 3500;
        final int mth = 5000;
    }
}