package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class RockMoveTest {
    
    private Move move = new RockMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof RockMove);
        Assert.assertTrue(move instanceof Move);
    }
}
