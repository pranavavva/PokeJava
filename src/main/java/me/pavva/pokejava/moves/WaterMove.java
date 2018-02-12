package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class WaterMove extends Move {
    
    public WaterMove(String name, int power, int points) {
        super(name, Type.WATER, power, points);
    }
    
    public static Move waterPulse = new WaterMove("Water Pulse", 60, 20);
    public static Move hydroPump = new WaterMove("Hydro Pump", 150, 5);
}
