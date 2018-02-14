package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class FireMoveTest {
    
    private Move move = new FireMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof FireMove);
        Assert.assertTrue(move instanceof Move);
    }
}
