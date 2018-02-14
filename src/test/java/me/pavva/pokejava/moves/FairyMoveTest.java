package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class FairyMoveTest {
    
    private Move move = new FairyMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof FairyMove);
        Assert.assertTrue(move instanceof Move);
    }
}
