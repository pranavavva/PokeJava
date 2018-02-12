package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class GrassMove extends Move {
    
    public GrassMove(String name, int power, int points) {
        super(name, Type.GRASS, power, points);
    }
    
    public static Move petalDance = new GrassMove("Petal Dance", 120, 10);
    public static Move solarBeam = new GrassMove("Solar Beam", 120, 10);
}
