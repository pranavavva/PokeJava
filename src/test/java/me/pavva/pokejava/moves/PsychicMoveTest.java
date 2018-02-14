package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

import org.junit.Assert;
import org.junit.Test;

public class PsychicMoveTest {
    
    private Move move = new PsychicMove("test", 10, 10);
    
    @Test
    public void testMove() {
        Assert.assertTrue(move instanceof PsychicMove);
        Assert.assertTrue(move instanceof Move);
    }
}
