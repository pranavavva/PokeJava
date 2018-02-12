package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;

public class ElectricMove extends Move {
    
    public ElectricMove(String name, int power, int points) {
        super(name, Type.ELECTRIC, power, points);
    }
    
    public static Move thunderbolt = new ElectricMove("Thunderbolt", 80, 10);
}
