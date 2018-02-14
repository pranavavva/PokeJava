package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class GhostMoveTest {
    
    private Move move = new GhostMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof GhostMove);
        Assert.assertTrue(move instanceof Move);
    }
}
