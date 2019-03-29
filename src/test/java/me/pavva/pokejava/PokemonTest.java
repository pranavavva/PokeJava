package me.pavva.pokejava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Tests {@link Pokemon Pokemon.java} for proper method returns.
 *
 * @author Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @since Java 1.7
 */
public class PokemonTest {

    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Pokemon pokemon1 = new Pokemon("Pokemon One", Type.NORMAL, 100.0, 100, 100, move1, move1, move1, move1);
    private ArrayList<Move> listOfMoves = new ArrayList<Move>();

    /**
     * Adds the same move to an {@link java.util.ArrayList ArrayList} 4 times to be able to test {@link Pokemon#getMoveList() getMoveList()}
     * properly.
     */
    @Before
    public void setUp() {
        listOfMoves.add(move1);
        listOfMoves.add(move1);
        listOfMoves.add(move1);
        listOfMoves.add(move1);
    }

    /**
     * Tests {@link Pokemon#setHealth(double) setHealth()} to make sure method is operating properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void setHealth() {
        pokemon1.setHealth(10);
        Assert.assertEquals(10.0, pokemon1.getHealth(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getName() getName()} to make sure method is operating properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getName() {
        Assert.assertEquals("Pokemon One", pokemon1.getName());
    }

    /**
     * Tests {@link Pokemon#getType() getType()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getType() {
        Assert.assertEquals(Type.NORMAL, pokemon1.getType());
    }

    /**
     * Tests {@link Pokemon#getHealth() getHealth()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getHealth() {
        Assert.assertEquals(100.0, pokemon1.getHealth(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getAttack() getAttack()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getAttack() {
        Assert.assertEquals(100, pokemon1.getAttack(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getDefense() getDefense()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getDefense() {
        Assert.assertEquals(100, pokemon1.getDefense(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getMoveList() getMoveList()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMoveList() {
        for (int k = 0; k < 3; k++) {
            Assert.assertEquals(listOfMoves.get(k).getName(), pokemon1.getMoveList().get(k).getName());
            Assert.assertEquals(listOfMoves.get(k).getType(), pokemon1.getMoveList().get(k).getType());
            Assert.assertEquals(listOfMoves.get(k).getPower(), pokemon1.getMoveList().get(k).getPower());
            Assert.assertEquals(listOfMoves.get(k).getPoints(), pokemon1.getMoveList().get(k).getPoints());
        }
    }

    /**
     * Tests {@link Pokemon#getMove1() getMove1()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMove1() {
        Assert.assertEquals(move1.getName(), pokemon1.getMove1().getName());
    }

    /**
     * Tests {@link Pokemon#getMove2() getMove2()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMove2() {
        Assert.assertEquals(move1.getName(), pokemon1.getMove2().getName());
    }

    /**
     * Tests {@link Pokemon#getMove3() getMove3()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMove3() {
        Assert.assertEquals(move1.getName(), pokemon1.getMove3().getName());
    }

    /**
     * Tests {@link Pokemon#getMove4() getMove4()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMove4() {
        Assert.assertEquals(move1.getName(), pokemon1.getMove4().getName());
    }


}
