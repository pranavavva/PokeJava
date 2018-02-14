package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class IceMoveTest {
    
    private Move move = new IceMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof IceMove);
        Assert.assertTrue(move instanceof Move);
    }
}
