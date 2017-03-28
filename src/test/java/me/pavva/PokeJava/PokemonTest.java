package me.pavva.PokeJava;

import org.junit.*;
import org.junit.Test;

public class PokemonTest {
    
    @Test //Convert Each one of these assertations into their own test methods
    public void testSetMethods() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("name");
        pokemon.setType("type");
        pokemon.setHealth(120.0);
        pokemon.setUsedMove(1);
        pokemon.setMove1("move1");
        pokemon.setMove2("move2");
        pokemon.setMove3("move3");
        pokemon.setMove4("move4");
        
        Assert.assertEquals(pokemon.getName(), "name");
        Assert.assertEquals(pokemon.getType(), "type");
        Assert.assertEquals(pokemon.getHealth(), 120.0, 0.0000001);
        Assert.assertEquals(pokemon.getUsedMove(), 1);
        Assert.assertEquals(pokemon.getMove1(), "move1");
        Assert.assertEquals(pokemon.getMove2(), "move2");
        Assert.assertEquals(pokemon.getMove3(), "move3");
        Assert.assertEquals(pokemon.getMove4(), "move4");
    }
    
    @Test //TODO Convert each one of these assertations into their own test method
    public void testGetMethods() {
        Pokemon pokemon = new Pokemon("name", "type", 120.0, 1, "move1", "move2", "move3", "move4");
        
        Assert.assertEquals(pokemon.getName(), "name");
        Assert.assertEquals(pokemon.getType(), "type");
        Assert.assertEquals(pokemon.getHealth(), 120.0, 0.0000001);
        Assert.assertEquals(pokemon.getUsedMove(), 1);
        Assert.assertEquals(pokemon.getMove1(), "move1");
        Assert.assertEquals(pokemon.getMove2(), "move2");
        Assert.assertEquals(pokemon.getMove3(), "move3");
        Assert.assertEquals(pokemon.getMove4(), "move4");
    }
}