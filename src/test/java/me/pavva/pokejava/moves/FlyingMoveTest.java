package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class FlyingMoveTest {
    
    private Move move = new FlyingMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof FlyingMove);
        Assert.assertTrue(move instanceof Move);
    }
}
