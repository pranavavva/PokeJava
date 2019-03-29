package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.*;

// import static me.pavva.pokejava.moves.BugMove.*;
// import static me.pavva.pokejava.moves.DarkMove.*;
// import static me.pavva.pokejava.moves.DragonMove.*;
// import static me.pavva.pokejava.moves.ElectricMove.*;
// import static me.pavva.pokejava.moves.FairyMove.*;
// import static me.pavva.pokejava.moves.FightMove.*;
// import static me.pavva.pokejava.moves.FireMove.*;
// import static me.pavva.pokejava.moves.FlyingMove.*;
// import static me.pavva.pokejava.moves.GhostMove.*;
// import static me.pavva.pokejava.moves.GrassMove.*;
import static me.pavva.pokejava.moves.GroundMove.*;
// import static me.pavva.pokejava.moves.IceMove.*;
import static me.pavva.pokejava.moves.NormalMove.*;
import static me.pavva.pokejava.moves.PoisonMove.*;
// import static me.pavva.pokejava.moves.PsychicMove.*;
// import static me.pavva.pokejava.moves.RockMove.*;
// import static me.pavva.pokejava.moves.SteelMove.*;
// import static me.pavva.pokejava.moves.WaterMove.*;


public class PoisonPokemon extends Pokemon {
    
    public PoisonPokemon(String name, double health, int attack, int defense, Move move1, Move move2, Move move3, Move move4) {
        super(name, Type.POISON, health, attack, defense, move1, move2, move3, move4);
    }
    
    private static Pokemon muk = new PoisonPokemon("Muk", 414.0, 339, 273, gunkShot, pound, mudBomb, sludgeBomb);

    public static Pokemon[] p = {muk};
}
