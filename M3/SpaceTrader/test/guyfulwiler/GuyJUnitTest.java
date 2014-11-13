/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacefx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for lostCredit method in Player.
 * @author Guy
 */
public class GuyJUnitTest {

    Player player;
    Player exPlayer;
    @Before
    public void setUp() {
        player = new Player("Guy", 3, 3, 3, 3, 3);
    }
    /**
     * Test when credit is greater than amount removed.
     */
    @Test
    public void basicCreditTest() {
        exPlayer = player;
        exPlayer.setCredit(1000);
        Assert.assertEquals(50, exPlayer.loseCredit(50));
        Assert.assertEquals(950, exPlayer.getCredit());
    }
    /**
     * Test when credit equals amount removed.
     */
    @Test
    public void exactCreditTest() {
        exPlayer = player;
        exPlayer.setCredit(30);
        Assert.assertEquals(30, exPlayer.loseCredit(30));
        Assert.assertEquals(0, exPlayer.getCredit());
    }
    /**
     * Test when credit is 0.
     */
    @Test
    public void noCreditTest() {
        exPlayer = player;
        exPlayer.setCredit(0);
        Assert.assertEquals(0, exPlayer.loseCredit(100));
        Assert.assertEquals(0, exPlayer.getCredit());
    }
    /**
     * Test when credit is less than amount.
     */
    @Test
    public void lessCreditTest() {
        exPlayer = player;
        exPlayer.setCredit(30);
        Assert.assertEquals(30, exPlayer.loseCredit(50));
        Assert.assertEquals(0, exPlayer.getCredit());
    }
    /**
     * Removes nothing from credit.
     */
    @Test
    public void nothingRemoved() {
        exPlayer = player;
        exPlayer.setCredit(50);
        Assert.assertEquals(0, exPlayer.loseCredit(0));
        Assert.assertEquals(0, exPlayer.getCredit());
    }
    /**
     * Negative credit removed.
     */
    @Test
    public void negativeCredit() {
        exPlayer = player;
        exPlayer.setCredit(100);
        Assert.assertEquals(0, exPlayer.loseCredit(-100));
        Assert.assertEquals(100, exPlayer.getCredit());
    }
}
