package yaxiongliu;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import spacefx.Ship;
import spacefx.randomEvent.encounter.police.PoliceEncController;

/**
 *
 * @author YaxiongLiu
 */
public class FineInfoTest {
    /**
     * Controller initialization.
     */
    private transient PoliceEncController policeEncounter;
    /**
     * Ship initialization.
     */
    private transient Ship ship;
    /**
     * Variable declaration.
     */
    private static final transient int NUM5 = 5;
    /**
     * Variable declaration.
     */
    private static final transient int NUM10 = 10;
    /**
     * Variable declaration.
     */
    private static final transient String UNEXPECTED
            = "result is unexpected";
    /**
     * Variable declaration.
     */
    private final transient Random rand
            = new Random();
    /**
     * Test setup.
     */
    @Before
    public final void setUp() {
        policeEncounter = new PoliceEncController();
        ship = new Ship(rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)
                , rand.nextInt(NUM10)) {
            @Override
            public String getShipName() {
                throw new UnsupportedOperationException(
                        "Not supported yet.");
            }
        };
    }
    /**
     * test 1.
     */
    @Test
    public final void test1() {
        ship.setFirearm(NUM10);
        ship.setNarcotic(NUM10);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion = "Plice found illegal good 10"
                    + " firearms \nand "
                    + "10"
                    + " narcotics in your ship "
                    + "\nand took them away. You got a ticket \nand paid "
                    + "5000 for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 2.
     */
    @Test
    public final void test2() {
        ship.setFirearm(NUM5);
        ship.setNarcotic(NUM10);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion = "Plice found illegal good 5 firearms \nand "
                    + "10 narcotics in your ship "
                    + "\nand took them away. You got a ticket \nand paid "
                    + "3500 for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 3.
     */
    @Test
    public final void test3() {
        ship.setFirearm(NUM10);
        ship.setNarcotic(NUM5);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion = "Plice found illegal good "
                    + "10" + " firearms \nand "
                    + "5"
                    + " narcotics in your ship "
                    + "\nand took them away. You got a ticket \nand paid "
                    + "4000 for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 4.
     */
    @Test
    public final void test4() {
        ship.setFirearm(0);
        ship.setNarcotic(0);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion  = "Police did not find any illegal good "
                    + "\nin your ship, your are good to go.";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 5.
     */
    @Test
    public final void test5() {
        ship.setFirearm(NUM5);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion  = "Plice found illegal good "
                    + "5" + " firearms "
                    + "\nin your ship and took them "
                    + "away. \nYou got a ticket and paid "
                    + "1500 for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 6.
     */
    @Test
    public final void test6() {
        ship.setFirearm(NUM10);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion  = "Plice found illegal good "
                    + "10" + " firearms "
                    + "\nin your ship and took them "
                    + "away. \nYou got a ticket and paid "
                    + "3000"
                    + " for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 7.
     */
    @Test
    public final void test7() {
        ship.setFirearm(0);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion  = "Police did not find any illegal good "
                    + "\nin your ship, your are good to go.";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 8.
     */
    @Test
    public final void test8() {
        ship.setNarcotic(NUM5);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion = "Plice found illegal good 5"
                    + " narcotics \nin your ship and took them away. "
                    + "\nYou got a ticket and paid "
                    + "1000"
                    + " for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 9.
     */
    @Test
    public final void test9() {
        ship.setNarcotic(NUM10);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion = "Plice found illegal good 10"
                    + " narcotics \nin your ship and took them away. "
                    + "\nYou got a ticket and paid "
                    + "2000"
                    + " for it";
        assertEquals(UNEXPECTED, result, assertion);
    }
    /**
     * test 10.
     */
    @Test
    public final void test10() {
        ship.setNarcotic(0);
        final String result = policeEncounter.fineInfo(ship);
        final String assertion  = "Police did not find any illegal good "
                    + "\nin your ship, your are good to go.";
        assertEquals(UNEXPECTED, result, assertion);
    }
}
