package me.pavva.PokeJava;

import org.junit.*;
import org.junit.Test;

public class PokemonTest {
    @Test
    public void testSetName() {
        Pokemon pokemon = new Pokemon();
        pokemon.setName("name");
        Assert.assertEquals(pokemon.getName(), "name");
    }
    
    @Test
    public void testSetHealth() {
        Pokemon pokemon = new Pokemon();
        pokemon.setHealth(120);
        Assert.assertEquals(pokemon.getHealth(), 120, 1);
    }
    
    @Test
    public void testSetType() {
        Pokemon pokemon = new Pokemon();
        pokemon.setType("type");
        Assert.assertEquals(pokemon.getType(), "type");
    }
}
