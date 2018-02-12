package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class PoisonMove extends Move {
    
    public PoisonMove(String name, int power, int points) {
        super(name, Type.POISON, power, points);
    }
    
    public static Move sludgeBomb = new PoisonMove("Sludge Bomb", 90, 10);
    public static Move gunkShot = new PoisonMove("Gunk Shot", 120, 5);
}
