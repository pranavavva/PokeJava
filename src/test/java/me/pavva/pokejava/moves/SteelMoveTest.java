package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class SteelMoveTest {
    
    private Move move = new SteelMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof SteelMove);
        Assert.assertTrue(move instanceof Move);
    }
}
