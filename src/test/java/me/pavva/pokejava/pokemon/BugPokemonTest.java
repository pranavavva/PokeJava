package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class BugPokemonTest {
    
    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Pokemon bugPoke = new BugPokemon("test", 100, 100, 100, move1, move1, move1, move1);
    
    @Test
    public void bugPokemon() {
        Assert.assertTrue(bugPoke instanceof BugPokemon);
        Assert.assertTrue(bugPoke instanceof Pokemon);
    }
}
