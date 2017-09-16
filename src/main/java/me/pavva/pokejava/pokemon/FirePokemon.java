package me.pavva.pokejava.pokemon;

import me.pavva.pokejava.Pokemon;
import me.pavva.pokejava.Type;
import me.pavva.pokejava.moves.*;


public class FirePokemon {
    private BugMoves bug = new BugMoves();
    private DarkMoves dark = new DarkMoves();
    private DragonMoves dragon = new DragonMoves();
    private ElectricMoves electric = new ElectricMoves();
    private FairyMoves fairy = new FairyMoves();
    private FightMoves flight = new FightMoves();
    private FireMoves fire = new FireMoves();
    private FlyingMoves flying = new FlyingMoves();
    private GhostMoves ghost = new GhostMoves();
    private GrassMoves grass = new GrassMoves();
    private GroundMoves ground = new GroundMoves();
    private IceMoves iceMoves = new IceMoves();
    private NormalMoves normal = new NormalMoves();
    private PoisonMoves poison = new PoisonMoves();
    private PsychicMoves psychic = new PsychicMoves();
    private RockMoves rock = new RockMoves();
    private SteelMoves steel = new SteelMoves();
    private WaterMoves water = new WaterMoves();

    private Pokemon charizard = new Pokemon("Charizard", Type.FIRE, 360.0, 293, 280, flying.wingAttack, fire.flareBlitz,
            fire.heatWave, dragon.dragonClaw);

    public Pokemon[] p = {charizard};
}