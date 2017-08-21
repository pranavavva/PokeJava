package me.pavva.PokeJava;

import org.junit.*;
import org.junit.Test;

public class TypeTest {
    
    @Test
    public void testDoStabCheck() {
        Move move1 = new Move(Type.NORMAL, 85, 20);
        Move move2 = new Move(Type.NORMAL, 85, 20);
        Move move3 = new Move(Type.NORMAL, 85, 20);
        Move move4 = new Move(Type.NORMAL, 85, 20);
        
        
        Pokemon pokemon1 = new Pokemon("Pokemon1", Type.NORMAL, 100, 85, 85, move1, move2, move3, move4);
        Pokemon pokemon2 = new Pokemon("Pokemon2", Type.WATER, 100, 85, 85, move1, move2, move3, move4);
        
        double stabValue = Type.doStabCheck(pokemon1.getMoveList().get(0), pokemon1);
        
        Assert.assertEquals(stabValue, 1.5, 0.1);
        
        double stabValue2 = Type.doStabCheck(pokemon2.getMoveList().get(0), pokemon2);
        
        Assert.assertEquals(stabValue2, 1.0, 0.1);
    }
}
