package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class FlyingMove extends Move {
    
    public FlyingMove(String name, int power, int points) {
        super(name, Type.FLYING, power, points);
    }
    
    public static Move wingAttack = new FlyingMove("Wing Attack", 60, 35);
}
