package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class FireMove extends Move {
    
    public FireMove(String name, int power, int points) {
        super(name, Type.FIRE, power, points);
    }
    
    public static Move flareBlitz = new FireMove("Flare Blitz", 120, 15);
    public static Move heatWave = new FireMove("Heat Wave", 95, 10);
}
