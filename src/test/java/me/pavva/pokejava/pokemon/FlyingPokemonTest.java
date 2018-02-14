package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.*;

// Importing moves
import static me.pavva.pokejava.moves.BugMove.*;
import static me.pavva.pokejava.moves.DarkMove.*;
import static me.pavva.pokejava.moves.DragonMove.*;
import static me.pavva.pokejava.moves.ElectricMove.*;
import static me.pavva.pokejava.moves.FairyMove.*;
import static me.pavva.pokejava.moves.FightMove.*;
import static me.pavva.pokejava.moves.FireMove.*;
import static me.pavva.pokejava.moves.FlyingMove.*;
import static me.pavva.pokejava.moves.GhostMove.*;
import static me.pavva.pokejava.moves.GrassMove.*;
import static me.pavva.pokejava.moves.GroundMove.*;
import static me.pavva.pokejava.moves.IceMove.*;
import static me.pavva.pokejava.moves.NormalMove.*;
import static me.pavva.pokejava.moves.PoisonMove.*;
import static me.pavva.pokejava.moves.PsychicMove.*;
import static me.pavva.pokejava.moves.RockMove.*;
import static me.pavva.pokejava.moves.SteelMove.*;
import static me.pavva.pokejava.moves.WaterMove.*;

import org.junit.Assert;
import org.junit.Test;

public class FlyingPokemonTest {
    
    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Pokemon poke = new FlyingPokemon("test", 100, 100, 100, move1, move1, move1, move1);
    
    @Test
    public void testPokemon() {
        Assert.assertTrue(poke instanceof FlyingPokemon);
        Assert.assertTrue(poke instanceof Pokemon);
    }
}