package me.pavva.pokejava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests {@link Move Move.java} for proper method returns.
 *
 * @author Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @since Java 1.7
 */
public class MoveTest {
    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Pokemon attacker = new Pokemon("attacker", Type.NORMAL, 100.0, 100, 100, move1, move1, move1, move1);
    private Pokemon defender = new Pokemon("attacker", Type.NORMAL, 100.0, 100, 100, move1, move1, move1, move1);

    /**
     * Tests {@link Move#setPoints(int) setPoints()} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void setPoints() throws Exception {
        move1.setPoints(10);
        Assert.assertEquals(10, move1.getPoints());
    }

    /**
     * Tests {@link Move#getName()} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Move", move1.getName());
    }

    /**
     * Tests {@link Move#getType()} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getType() throws Exception {
        Assert.assertEquals(Type.NORMAL, move1.getType());
    }

    /**
     * Tests {@link Move#getPower()} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getPower() throws Exception {
        Assert.assertEquals(100, move1.getPower());
    }

    /**
     * Tests {@link Move#getPoints()} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getPoints() throws Exception {
        Assert.assertEquals(100, move1.getPoints());
    }

    /**
     * Tests {@link Move#attack(Pokemon, Pokemon, Move)} for proper method returns
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void attack() throws Exception {
        Move.attack(attacker, defender, attacker.getMove1());
        Assert.assertEquals(defender.getHealth(), -29, 0.1);
    }

}