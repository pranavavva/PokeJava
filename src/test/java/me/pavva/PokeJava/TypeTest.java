package me.pavva.PokeJava;

import org.junit.*;
import org.junit.Test;

public class TypeTest {
    
    @Test
    public void testDoStabCheck() {
        Move move1 = new Move("move1", Type.NORMAL, 85, 20);
        Move move2 = new Move("move1", Type.NORMAL, 85, 20);
        Move move3 = new Move("move1", Type.NORMAL, 85, 20);
        Move move4 = new Move("move1", Type.NORMAL, 85, 20);
        
        
        Pokemon pokemon1 = new Pokemon("Pokemon1", Type.NORMAL, 100, 85, 85, move1, move2, move3, move4);
        Pokemon pokemon2 = new Pokemon("Pokemon2", Type.WATER, 100, 85, 85, move1, move2, move3, move4);
        
        double stabValue = Type.doStabCheck(pokemon1.getMoveList().get(0), pokemon1);
        
        Assert.assertEquals(stabValue, 1.5, 0.1);
        
        double stabValue2 = Type.doStabCheck(pokemon2.getMoveList().get(0), pokemon2);
        
        Assert.assertEquals(stabValue2, 1.0, 0.1);
    }
    
    @Test
    public void testDoEffeftCheck() {
        Move moveFire = new Move("FireMove", Type.FIRE, 85, 20);
        Move moveWater = new Move("WaterMove", Type.WATER, 85, 20);
        Move moveGrass = new Move("GrassMove", Type.GRASS, 85, 20);
        
        Pokemon pokemon1 = new Pokemon("Pokemon1", Type.FIRE, 100, 85, 85, moveFire, moveFire, moveFire, moveFire);
        Pokemon pokemon2 = new Pokemon("Pokemon2", Type.WATER, 100, 85, 85, moveWater, moveWater, moveWater, moveWater);
        Pokemon pokemon3 = new Pokemon("Pokemon3", Type.GRASS, 100, 85, 85, moveGrass, moveGrass, moveGrass, moveGrass);
        
        double effectValue1 = Type.doEffectCheck(pokemon1.getMoveList().get(0), pokemon1);
        double effectValue2 = Type.doEffectCheck(pokemon1.getMoveList().get(0), pokemon2);
        double effectValue3 = Type.doEffectCheck(pokemon1.getMoveList().get(0), pokemon3);
        
        double effectValue4 = Type.doEffectCheck(pokemon2.getMoveList().get(0), pokemon1);
        double effectValue5 = Type.doEffectCheck(pokemon2.getMoveList().get(0), pokemon2);
        double effectValue6 = Type.doEffectCheck(pokemon2.getMoveList().get(0), pokemon3);
        
        double effectValue7 = Type.doEffectCheck(pokemon3.getMoveList().get(0), pokemon1);
        double effectValue8 = Type.doEffectCheck(pokemon3.getMoveList().get(0), pokemon2);
        double effectValue9 = Type.doEffectCheck(pokemon3.getMoveList().get(0), pokemon3);
        
        Assert.assertEquals(effectValue1, 0.5, 0.1);
        Assert.assertEquals(effectValue2, 0.5, 0.1);
        Assert.assertEquals(effectValue3, 2.0, 0.1);
        
        Assert.assertEquals(effectValue4, 2.0, 0.1);
        Assert.assertEquals(effectValue5, 0.5, 0.1);
        Assert.assertEquals(effectValue6, 0.5, 0.1);
        
        Assert.assertEquals(effectValue7, 0.5, 0.1);
        Assert.assertEquals(effectValue8, 2.0, 0.1);
        Assert.assertEquals(effectValue9, 0.5, 0.1);
    }
}
