package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class DarkMove extends Move {
    
    public DarkMove(String name, int power, int points) {
        super(name, Type.DARK, power, points);
    }
    
    public static Move bite = new DarkMove("Bite", 60, 25);
}
