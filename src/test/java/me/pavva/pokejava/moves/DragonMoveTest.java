package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class DragonMoveTest {
    
    private Move move = new DragonMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof DragonMove);
        Assert.assertTrue(move instanceof Move);
    }
}