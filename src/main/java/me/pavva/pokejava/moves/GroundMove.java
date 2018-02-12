package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class GroundMove extends Move {
    
    public GroundMove(String name, int power, int points) {
        super(name, Type.GROUND, power, points);
    }
    
    public static Move earthquake = new GroundMove("Earthquake", 100, 10);
    public static Move mudBomb = new GroundMove("Mud Bomb", 65, 10);
}
