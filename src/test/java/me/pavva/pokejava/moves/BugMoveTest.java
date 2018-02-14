package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class BugMoveTest {
    
    private Move move = new BugMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof BugMove);
        Assert.assertTrue(move instanceof Move);
    }
}
