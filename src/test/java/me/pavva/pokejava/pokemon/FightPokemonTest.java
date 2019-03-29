package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class FightPokemonTest {
    
    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Pokemon poke = new FightPokemon("test", 100, 100, 100, move1, move1, move1, move1);
    
    @Test
    public void testPokemon() {
        Assert.assertTrue(poke instanceof FightPokemon);
        Assert.assertTrue(poke instanceof Pokemon);
    }
}