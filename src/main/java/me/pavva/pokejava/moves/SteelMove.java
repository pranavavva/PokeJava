package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class SteelMove extends Move {
    
    public SteelMove(String name, int power, int points) {
        super(name, Type.STEEL, power, points);
    }
    
    public static Move flashCannon = new SteelMove("Flash Cannon", 80, 10);
}
