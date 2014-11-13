package spacefx;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Dillon
 */
public class Universe implements Serializable {
    Random rand = new Random();
    SolarSystem[] gameUniverse = new SolarSystem[114];
    private SolarSystem current;
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
    /**
     * Constructor for universe.
     */
    public Universe() {
        for (int i = 0; i < 114; i++) {
            int j = rand.nextInt(114);
            String name = names[j];
            while (name == null) {
                j = rand.nextInt(114);
                name = names[j];
            }
            names[j] = null;
            String[] n = new String[1];
            n[0] = name;
            gameUniverse[i] = new SolarSystem(name, n, rand.nextInt(150),
                    rand.nextInt(100));
        }
        current = gameUniverse[0];
    }

    @Override
    public final String toString() {
        String s = "";
        for (int i = 0; i < 113; i++) {
            s += (gameUniverse[i].getSolarName() + ": " + gameUniverse[i].getX()
                    + " " + gameUniverse[i].getY() + ", "
                    + gameUniverse[i].getTechLevel() + ", "
                    + gameUniverse[i].getResourceType() + ", "
                    + gameUniverse[i].getGovType() + "\n");
        }
        return s;
    }

    /**
     * Returns current solar system.
     * @return the current solar system
     */
    public final SolarSystem getCurrentSolarSystem() {
        return current;
    }
    /**
     * Sets the current solar system.
     * @param solarSystem new solar system
     */
    public final void setCurrentSolarSystem(final SolarSystem solarSystem) {
        current = solarSystem;
    }

    /**
     * Returns distance between 2 solar systems.
     * @param from the current solar system
     * @param to the destination solar system
     * @return double the distance between the two solar systems
     */
    public static double distance(final SolarSystem from,
            final SolarSystem to) {
        double a = Math.pow(to.getX() - from.getX(), 2);
        double b = Math.pow(to.getY() - from.getY(), 2);
        return Math.pow(a + b, 0.5);
    }
}
