package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class PoisonMoveTest {
    
    private Move move = new PoisonMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof PoisonMove);
        Assert.assertTrue(move instanceof Move);
    }
}
