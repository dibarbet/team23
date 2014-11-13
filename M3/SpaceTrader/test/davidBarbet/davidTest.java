package davidBarbet;

import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import spacefx.GameData;
import spacefx.Player;
import spacefx.Ship;
import spacefx.ShipUpgrade;
import spacefx.Universe;
import spacefx.randomEvent.encounter.police.PoliceEncController;

/**
 *
 * @author YaxiongLiu
 */
public class davidTest {
    /**
     * Ship initialization.
     */
    private transient Ship ship;
    /**
     * Variable declaration.
     */
    private static final transient String UNEXPECTED
            = "result is unexpected";
    private ShipUpgrade shipUp1;
    private ShipUpgrade shipUp2;
    private ShipUpgrade shipUp3;
    private Ship aShip;
    private Player aPlayer;
    /**
     * Test setup.
     */
    @Before
    public final void setUp() {
        Random rand = new Random();
        shipUp1 = new ShipUpgrade("weapon", "pulseLaser");
        shipUp2 = new ShipUpgrade("shield", "smallShield");
        shipUp3 = new ShipUpgrade("gadget", "5cargo");
        aPlayer = new Player("test", 5, 5, 5, 0, 0);
        aShip = new Ship(rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)
                , rand.nextInt(10)) {

            @Override
            public String getShipName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        GameData.setShip(aShip);
        GameData.setPlayer(aPlayer);
        GameData.setUniverse(new Universe());
    }
    /**
     * test 1.
     */
    @Test
    public final void test1() {
        int weapSlots = aShip.getWeaponSlots();
        assertEquals(UNEXPECTED, shipUp1.getPrice(), 1000);
        aPlayer.setCredit(500);
        boolean buyUp = shipUp1.buyUpgrade("weapon", "pulseLaser");
        assertEquals(UNEXPECTED, buyUp, false);
        aPlayer.setCredit(1000);
        boolean buyUp2 = shipUp1.buyUpgrade("weapon", "pulseLaser");
        assertEquals(UNEXPECTED, buyUp2, true);
    }
}
