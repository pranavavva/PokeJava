package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class DarkMoveTest {
    
    private Move move = new DarkMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof DarkMove);
        Assert.assertTrue(move instanceof Move);
    }
}
