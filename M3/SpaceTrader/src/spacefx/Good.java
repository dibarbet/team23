/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;
/**
 *  This is information holder class, It holds all information of 
 *   10 types of goods
 * 
 * @author YaxiongLiu
 */
public class Good {
    //initialize all 10 types of good
    public static final Water WATER = new Water();
    public static final Furs FURS = new Furs();
    public static final Food FOOD = new Food();
    public static final Ore ORE = new Ore();
    public static final Games GAMES = new Games();
    public static final Firearms FIREARMS = new Firearms();
    public static final Medicine MEDICINE = new Medicine();
    public static final Machines MACHINES = new Machines();
    public static final Narcotics NARCOTICS = new Narcotics();
    public static final Robots ROBOTS = new Robots();
    //end initialization
    // this class uses defalt constructor
    //innner class for Good Water
    public static class Water {
        final static String name = "Water"; // The name of Water
        final static int mtlp = 0; // Minimum Tech Level to Produce Water
        final static int mtlu = 0; // Minimum Tech Level to Use Water
        final static int ttp = 2; // Tech Level which produces the most of Water
        final public static int basePrice = 30; // Base price of Water
        final static int ipl = 3; // The Price of Water increase per tech level
        final public static int var = 4; // the maximum percentage that 
                                    // the price of Water can vary above or below the base
        final static String ie = "DROUGHT"; // when event drought happens on a planet, 
                                            // the price of Water may increase astronomically
        final static String cr = "LOTSOFWATER"; // when event lots of water happends on a planet,
                                                // the price of Water is usullay low
        final static String er = "DESERT"; // When event desert happends on a planet,
                                            // the resource of Water is expensive
        final static int mtl = 30; // Min price of Water offered in space trade with random trader
        final static int mth = 50; // Max price of Water offered in space trade with random trader
    } // end Water
    
    // the inner class of Good Furs
    public static class Furs {
        final static String name = "Furs"; // The name of Furs
        final static int mtlp = 0; // Minimum Tech Level to Produce Furs
        final static int mtlu = 0; // Minimum Tech Level to Use Furs
        final static int ttp = 0;  // Tech Level which produces the most of Furs
        final public static int basePrice = 250; // Base price of Furs
        final static int ipl = 10; // The Price of Furs increase per tech level
        final public static int var = 10; // the maximum percentage that 
                                    // the price of Furs can vary above or below the base
        final static String ie = "COLD"; // when event cold happens on a planet, 
                                         // the price of Furs may increase astronomically
        final static String cr = "RICHFAUNA"; // when event rich fauna happends on a planet,
                                                // the price of Furs is usullay low
        final static String er = "LIFELESS"; // When event lifeless happends on a planet,
                                            // the resource of Furs is expensive
        final static int mtl = 230; // Min price of Furs offered in space trade with random trader
        final static int mth = 280; // Max price of Furs offered in space trade with random trader
    } // end Furs
    // The inner class of Food
    public static class Food {
        final static String name = "Food"; // The name of Food
        final static int mtlp = 1;  // Minimum Tech Level to Produce Food
        final static int mtlu = 0; // Minimum Tech Level to Use Food
        final static int ttp = 1; // Tech Level which produces the most of Food
        final public static int basePrice = 100;  // Base price of Food
        final static int ipl = 5; // The Price of Food increase per tech level
        final public static int var = 5;  // the maximum percentage that
                                    // the price of Food can vary above or below the base
        final static String ie = "CROPFAIL";  // when event cold happens on a planet, 
                                         // the price of Food may increase astronomically
        final static String cr = "RICHSOIL"; // when event rich fauna happends on a planet,
                                                // the price of Food is usullay low
        final static String er = "POORSOIL"; // When event lifeless happends on a planet,
                                            // the resource of Food is expensive
        final static int mtl = 90; // Min price of Food offered in space trade with random trader
        final static int mth = 160; // Max price of Food offered in space trade with random trader
    }// end Food
    
    // inner class of Ore
    public static class Ore {
        final static String name = "Ore"; // The name of Ore
        final static int mtlp = 2; // Minimum Tech level to produce Ore
        final static int mtlu = 2; // Minimum tech level to use Ore
        final static int ttp = 3; // Tech level which produces the most of Ore
        final public static int basePrice = 350; // the base price of Ore
        final static int ipl = 20; // Price of Ore increase per tech level
        final public static int var = 10; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "WAR"; // When the event war happens on a planet
                                        // the price of Ore may increase astronomically
        final static String cr = "MINERALRICH"; // when the event mineral rich happends on a planet,
                                                // the price of Ore is usually low
        final static String er = "MINERALPOOR"; // the event mineral poor happends on a planet,
                                                // Ore is expensive
        final static int mtl = 350; // Min price of Ore offered in space trade with random trader
        final static int mth = 420; // Max price of Ore offered in space trade with random trader
    }// end Ore
    
    //inner class of Good Games
    public static class Games {
        final static String name = "Games"; // The name of the resource Games
        final static int mtlp = 3; // min tech level to produce Games
        final static int mtlu = 1; // min tech level to use Games
        final static int ttp = 6; // tech level which produce most of Games
        final public static int basePrice = 250; // base price of Games
        final static int ipl = -10; // price of Games increase per tech level
        final public static int var = 5; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "BOREDOM"; // When the event boredom happens on a planet
                                        // the price of Games may increase astronomically
        final static String cr = "ARTISTIC";  // when the event artistic happends on a planet,
                                                // the price of Games is usually low
        final static String er = "Never"; // This event does not affact the price of Games
        final static int mtl = 160; // Min price of Games offered in space trade with random trader
        final static int mth = 270; // Max price of Games offered in space trade with random trader
    } // end Games
    
    //inner class of Good Firearms
    public static class Firearms {
        final static String name = "Firearms"; // The name of the resource Firearms
        final static int mtlp = 3; // min tech level to produce Firearms
        final static int mtlu = 1; // min tech level to use Firearms
        final static int ttp = 5; // tech level which produce most of Firearms
        final public static int basePrice = 1250; // base price of Firearms
        final static int ipl = -75; // price of Firearms increase per tech level
        final public static int var = 100; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "WAR"; // When the event boredom happens on a planet
                                        // the price of Firearms may increase astronomically
        final static String cr = "WARLIKE"; // when the event artistic happends on a planet,
                                            // the price of Firearms is usually low
        final static String er = "Never"; // This event does not affact the price of Firearms
        final static int mtl = 600; // Min price of Firearms offered in space trade with random trader
        final static int mth = 1100; // Max price of Firearms offered in space trade with random trader
    } // end Firearms
    
    //inner class of Good Medicine
    public static class Medicine {
        final static String name = "Medicine"; // The name of the resource Medicine
        final static int mtlp = 4; // min tech level to produce Medicine
        final static int mtlu = 1; // min tech level to use Medicine
        final static int ttp = 6; // tech level which produce most of Medicine
        final public static int basePrice = 650; // base price of Medicine
        final static int ipl = -20; // price of Medicine increase per tech level
        final public static int var = 10; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "PLAGUE"; // When the event boredom happens on a planet
                                        // the price of Medicine may increase astronomically
        final static String cr = "LOTSOFHERBS"; // when the event artistic happends on a planet,
                                            // the price of Medicine is usually low
        final static String er = "Never";  // This event does not affact the price of Games
        final static int mtl = 400; // Min price of Medicine offered in space trade with random trader
        final static int mth = 700; // Max price of Medicine offered in space trade with random trader
    } // end Games
        
    //inner class of Good Machines
    public static class Machines {
        final static String name = "Machines"; // The name of the resource Machines
        final static int mtlp = 4; // min tech level to produce Machines
        final static int mtlu = 3; // min tech level to use Machines
        final static int ttp = 5; // tech level which produce most of Machines
        final public static int basePrice = 900; // base price of Machines
        final static int ipl = -30; // price of Machines increase per tech level
        final public static int var = 5; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "LACKOFWORKERS"; // When the event boredom happens on a planet
                                        // the price of Machines may increase astronomically
        final static String cr = "Never"; // This event does not affact the price of Machines
        final static String er = "Never"; // This event does not affact the price of Machines
        final static int mtl = 600; // Min price of Machines offered in space trade with random trader
        final static int mth = 800; // Max price of Machines offered in space trade with random trader
    } // end Machines
    
    //inner class of Good Narcotics
    public static class Narcotics {
        final static String name = "Narcotics"; // The name of the resource Games
        final static int mtlp = 5; // min tech level to produce Narcotics
        final static int mtlu = 0; // min tech level to use Narcotics
        final static int ttp = 5; // tech level which produce most of Narcotics
        final public static int basePrice = 3500; // base price of Narcotics
        final static int ipl = -125; // price of Narcotics increase per tech level
        final public static int var = 150; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "BOREDOM"; // When the event boredom happens on a planet
                                        // the price of Narcotics may increase astronomically
        final static String cr = "WEIRDMUSHROOMS"; // when the event artistic happends on a planet,
                                            // the price of Narcotics is usually low
        final static String er = "Never"; // This event does not affact the price of Narcotics
        final static int mtl = 2000; // Min price of Narcotics offered in space trade with random trader
        final static int mth = 3000; // Max price of Narcotics offered in space trade with random trader
    } // end Narcotics
    
    //inner class of Good Robots
    public static class Robots {
        final static String name = "Robots"; // The name of the resource Robots
        final static int mtlp = 6; // min tech level to produce Robots
        final static int mtlu = 4; // min tech level to use Robots
        final static int ttp = 7; // tech level which produce most of Robots
        final public static int basePrice = 5000; // base price of Robots
        final static int ipl = -150; // price of Robots increase per tech level
        final public static int var = 100; // The max perentage that the price can vary
                                    // above or below the base
        final static String ie = "LACKOFWORKERS"; // When the event boredom happens on a planet
                                        // the price of Robots may increase astronomically
        final static String cr = "Never"; // This event does not affact the price of Robots
        final static String er = "Never"; // This event does not affact the price of Robots
        final static int mtl = 3500; // Min price of Robots offered in space trade with random trader
        final static int mth = 5000; // Max price of Robots offered in space trade with random trader
    } // end Robots
    
} // end Good class