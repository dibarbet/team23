package spacefx;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Dillon
 */
public class Universe implements Serializable {
    /**
     * Serial version uid.
     */
    //private static final long serialVersionUID = 1L;
    /**
     * Current solar.
     */
    private SolarSystem current;
    /**
     * Game universe.
     */
    protected SolarSystem[] gameUniverse;
    /**
     * planets.
     */
    private static final int NUMPLANETS = 114;
    /**
     * XCORD.
     */
    private static final int XCORD = 150;
    /**
     * YCORD.
     */
    private static final int YCORD = 100;
    /**
     * TO STRING INT.
     */
    private static final int TOSTRINGINT = 113;
    /**
     * HALF.
     */
    private static final double HALF = .5;
    /**
     * Universe.
     */
    public Universe() {
        String[] names = new String[]{"Acamar", "Adahn", "Aldea", "Andevian",
            "Antedi", "Balosnee", "Baratas", "Brax", "Campor", "Capelle",
            "Carzon", "Castor", "Cestus", "Cheron", "Courteney", "Daled",
            "Damast", "Davlos", "Deneb", "Deneva", "Devidia", "Draylon",
            "Drema", "Endor", "Esmee", "Exo", "Ferris", "Festen", "Fourmi",
            "Frolix", "Gemulon", "Guinifer", "Hades", "Hamlet", "Helena",
            "Hulst", "Iodine", "Iralius", "Janus", "Japori", "Jarada", "Jason",
            "Kaylon", "Khefka", "Kira", "Klaatu", "Klaestron", "Korma",
            "Kravat", "Krios", "Laertes", "Largo", "Lave", "Ligon", "Lowry",
            "Magrat", "Malcoria", "Melina", "Mentar", "Merik", "Mintaka",
            "Montor", "Mordan", "Myrthe", "Nelvana", "Nix", "Nyle", "Odet",
            "Og", "Omega", "Omphalos", "Orias", "Othello", "Parade", "Penthara",
            "Picard", "Pollux", "Quator", "Rakhar", "Ran", "Regulas", "Relva",
            "Rhymus", "Rochani", "Rubicum", "Rutia", "Sarpeidon", "Sefalla",
            "Seltrice", "Sigma", "Sol", "Somari", "Stakoron", "Styris",
            "Talani", "Tamus", "Tantalos", "Tanuga", "Tarchannen", "Terosa",
            "Thera", "Titan", "Torin", "Triacus", "Turkana", "Tyrus",
            "Umberlee", "Utopia", "Vadera", "Vagra", "Vandor", "Ventax",
            "Xenon", "Xerxes", "Yew", "Yojimbo", "Zalkon", "Zuul"};
        gameUniverse = new SolarSystem[NUMPLANETS];
        final Random rand = new Random();
        String[] nStr;
        for (int i = 0; i < NUMPLANETS; i++) {
            int jay = rand.nextInt(NUMPLANETS);
            String name = names[jay];
            while (name == null) {
                jay = rand.nextInt(NUMPLANETS);
                name = names[jay];
            }
            names[jay] = null;
            nStr = new String[1];
            nStr[0] = name;
            gameUniverse[i] = new SolarSystem(name, nStr,
                    rand.nextInt(XCORD), rand.nextInt(YCORD));
        }
        current = gameUniverse[0];
    }
    @Override
    public final String toString() {
        final StringBuffer str = new StringBuffer();
        for (int i = 0; i < TOSTRINGINT; i++) {
            str.append(gameUniverse[i].getSolarName());
            str.append(": ");
            str.append(gameUniverse[i].getX());
            str.append(", ");
            str.append(gameUniverse[i].getY());
            str.append(", ");
            str.append(gameUniverse[i].getTechLevel());
            str.append(", ");
            str.append(gameUniverse[i].getResourceType());
            str.append(", ");
            str.append(gameUniverse[i].getGovType());
            str.append(" \n");
        }
        return str.toString();
    }
    /**
     *
     * @return the current solar system
     */
    public final SolarSystem getCurrentSolarSystem() {
        return current;
    }
    /**
     * Set current solar system.
     * @param solarSystem solarSystem
     */
    public final void setCurrentSolarSystem(final SolarSystem solarSystem) {
        current = solarSystem;
    }
    /**
     *
     * @param from the current solar system
     * @param toSolar the destination solar system
     * @return double the distance between the two solar systems
     */
    public static double distance(final SolarSystem from,
            final SolarSystem toSolar) {
        final double aPt = Math.pow(toSolar.getX() - from.getX(), 2);
        final double bPt = Math.pow(toSolar.getY() - from.getY(), 2);
        return Math.pow(aPt + bPt, HALF);
    }
}
