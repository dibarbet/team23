/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import java.util.Random;

/**
 *
 * @author Dillon
 */
public class Universe {
    Random rand = new Random();
    SolarSystem[] Universe = new SolarSystem[114];
    String[] names = {
        "Acamar",
        "Adahn",		
        "Aldea",
        "Andevian",
        "Antedi",
        "Balosnee",
        "Baratas",
        "Brax",			
        "Campor",
        "Capelle",		
        "Carzon",
        "Castor",		
        "Cestus",
        "Cheron",		
        "Courteney",	
        "Daled",
        "Damast",
        "Davlos",
        "Deneb",
        "Deneva",
        "Devidia",
        "Draylon",
        "Drema",
        "Endor",
        "Esmee",		
        "Exo",
        "Ferris",		
        "Festen",		
        "Fourmi",		
        "Frolix",		
        "Gemulon",
        "Guinifer",		
        "Hades",		
        "Hamlet",		
        "Helena",		
        "Hulst",		
        "Iodine",		
        "Iralius",
        "Janus",		
        "Japori",
        "Jarada",
        "Jason",		
        "Kaylon",
        "Khefka",
        "Kira",			
        "Klaatu",		
        "Klaestron",
        "Korma",		
        "Kravat",		
        "Krios",
        "Laertes",		
        "Largo",
        "Lave",			
        "Ligon",
        "Lowry",		
        "Magrat",		
        "Malcoria",
        "Melina",
        "Mentar",		
        "Merik",
        "Mintaka",
        "Montor",		
        "Mordan",
        "Myrthe",		
        "Nelvana",
        "Nix",			
        "Nyle",			
        "Odet",
        "Og",			
        "Omega",		
        "Omphalos",		
        "Orias",
        "Othello",		
        "Parade",		
        "Penthara",
        "Picard",		
        "Pollux",		
        "Quator",
        "Rakhar",
        "Ran",			
        "Regulas",
        "Relva",
        "Rhymus",
        "Rochani",
        "Rubicum",		
        "Rutia",
        "Sarpeidon",
        "Sefalla",
        "Seltrice",
        "Sigma",
        "Sol",			
        "Somari",
        "Stakoron",
        "Styris",
        "Talani",
        "Tamus",
        "Tantalos",		
        "Tanuga",
        "Tarchannen",
        "Terosa",
        "Thera",		
        "Titan",		
        "Torin",		
        "Triacus",
        "Turkana",
        "Tyrus",
        "Umberlee",		
        "Utopia",		
        "Vadera",
        "Vagra",
        "Vandor",
        "Ventax",
        "Xenon",
        "Xerxes",		
        "Yew",			
        "Yojimbo",		
        "Zalkon",
        "Zuul"		
    };
    public Universe() {
        for (int i = 0; i < 113; i++) {
            int j = rand.nextInt(114);
            String name = names[j];
            while (name == null) {
                j = rand.nextInt(114);
                name = names[j];
            }
            names[j] = null;
            String[] n = new String[1];
            n[0] = name;
            Universe[i] = new SolarSystem(name, n, rand.nextInt(150), rand.nextInt(100));
        }
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < 113; i++) {
            s += (Universe[i].getSolarName() + ": " + Universe[i].getX() + " " + Universe[i].getY() + ", " + Universe[i].getTechLevel() + ", " + Universe[i].getResourceType() + ", " + Universe[i].getGovType() + "\n");
        }
        return s;
    }
    
    public static void main(String[] args) {
        Universe uni = new Universe();
        System.out.println(uni.toString());
    }
}
