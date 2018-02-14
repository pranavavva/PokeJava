package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class FightMoveTest {
    
    private Move move = new FightMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof FightMove);
        Assert.assertTrue(move instanceof Move);
    }
}
