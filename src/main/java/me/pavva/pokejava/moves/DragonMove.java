package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class DragonMove extends Move {
    
    public DragonMove(String name, int power, int points) {
        super(name, Type.DRAGON, power, points);
    }
    
    public static Move dragonClaw = new DragonMove("Dragon Claw", 80, 15);
}
