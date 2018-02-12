package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class IceMove extends Move {

    
    public IceMove(String name, int power, int points) {
        super(name, Type.ICE, power, points);
    }

    public static Move blizzard = new IceMove("Blizzard", 110, 5);
    public static Move iceBall = new IceMove("Ice Ball", 30, 20);
}
