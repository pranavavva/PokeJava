package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class NormalMoveTest {
    
    private Move move = new NormalMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof NormalMove);
        Assert.assertTrue(move instanceof Move);
    }
}
