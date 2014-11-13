package spacefx;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 * Unit test for add ship upgrade.
 * @author Dillon
 */
public class ShipUpgradeUnitTest {
    Ship ship;
    Ship initial;
    
    @Before
    public void initialize() {
        initial = new Bumblebee();
    }
    
    /**
     * Test add one weapon
     */
    @Test
    public void addWeapon() {
        ship = initial;
        ship.addUpgrade("weapon", "pulseLaser");
        String[] upgrades = ship.getUpgradeList("weapon");
        Assert.assertEquals("pulseLaser", upgrades[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("weapon"));
        Assert.assertEquals(0, ship.getSlots("weapon"));
    }
    
    /**
     * test add one shield
     */
    @Test
    public void addShield() {
        ship = initial;
        ship.addUpgrade("shield", "smallShield");
        String[] upgrades = ship.getUpgradeList("shield");
        Assert.assertEquals("smallShield", upgrades[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("shield"));
        Assert.assertEquals(1, ship.getSlots("shield"));
    }
    
    /**
     * test add one gadget
     */
    @Test
    public void addGadget() {
        ship = initial;
        ship.addUpgrade("gadget", "navigation");
        String[] upgrades = ship.getUpgradeList("gadget");
        Assert.assertEquals("navigation", upgrades[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("gadget"));
        Assert.assertEquals(1, ship.getSlots("gadget"));
    }
    
    /**
     * test add one crew
     */
    @Test
    public void addCrew() {
        ship = initial;
        ship.addUpgrade("crew", "badCrew");
        String[] upgrades = ship.getUpgradeList("crew");
        Assert.assertEquals("badCrew", upgrades[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("crew"));
        Assert.assertEquals(1, ship.getSlots("crew"));
    }
    
    /**
     * test add multiple upgrades
     */
    @Test
    public void addMultiple() {
        ship = initial;
        ship.addUpgrade("weapon", "beamLaser");
        ship.addUpgrade("crew", "goodCrew");
        String[] weapons = ship.getUpgradeList("weapon");
        String[] crews = ship.getUpgradeList("crew");
        Assert.assertEquals("pulseLaser", weapons[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("weapon"));
        Assert.assertEquals(0, ship.getSlots("weapon"));
        Assert.assertEquals("pulseLaser", crews[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("crew"));
        Assert.assertEquals(1, ship.getSlots("crew"));
    }
    
    /**
     * test add too many upgrades
     */
    @Test
    public void addTooMany() {
        ship = initial;
        ship.addUpgrade("weapon", "militaryLaser");
        ship.addUpgrade("weapon", "beamLaser");
        ship.addUpgrade("weapon", "beamLaser");
        String[] upgrades = ship.getUpgradeList("weapon");
        Assert.assertEquals("militaryLaser", upgrades[0]);
        Assert.assertEquals(1, ship.getUpgradeCount("weapon"));
        Assert.assertEquals(0, ship.getSlots("weapon"));
    }
}
