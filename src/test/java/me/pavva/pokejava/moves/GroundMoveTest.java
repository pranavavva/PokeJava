package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class GroundMoveTest {
    
    private Move move = new GroundMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof GroundMove);
        Assert.assertTrue(move instanceof Move);
    }
}
