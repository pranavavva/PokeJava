package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class GrassMoveTest {
    
    private Move move = new GrassMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof GrassMove);
        Assert.assertTrue(move instanceof Move);
    }
}
