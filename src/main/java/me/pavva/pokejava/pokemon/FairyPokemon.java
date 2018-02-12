package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.*;

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

public class FairyPokemon extends Pokemon {
    
    public FairyPokemon(String name, double health, int attack, int defense, Move move1, Move move2, Move move3, Move move4) {
        super(name, Type.FAIRY, health, attack, defense, move1, move2, move3, move4);
    }

    private static Pokemon  clefable = new FairyPokemon("Clefable", 394, 262, 269, disarmingVoice, psyshock, blizzard, thunderbolt);

    public static Pokemon[] p        = {clefable};
}
