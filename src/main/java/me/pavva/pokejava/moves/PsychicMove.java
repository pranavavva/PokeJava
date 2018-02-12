package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;

public class PsychicMove extends Move {
    
    public PsychicMove(String name, int power, int points) {
        super(name, Type.PSYCHIC, power, points);
    }

    public static Move psyshock = new PsychicMove("Psyshock", 80, 10);
}
