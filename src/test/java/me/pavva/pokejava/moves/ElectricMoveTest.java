package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class ElectricMoveTest {
    
    private Move move = new ElectricMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof ElectricMove);
        Assert.assertTrue(move instanceof Move);
    }
}
