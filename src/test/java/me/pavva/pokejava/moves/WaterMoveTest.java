package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class WaterMoveTest {
    
    private Move move = new WaterMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof WaterMove);
        Assert.assertTrue(move instanceof Move);
    }
}
