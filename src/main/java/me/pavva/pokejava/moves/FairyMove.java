package me.pavva.pokejava.moves;

import me.pavva.pokejava.*;

public class FairyMove extends Move{

    public FairyMove(String name, int power, int points) {
        super(name, Type.FAIRY, power, points);
    }

    public static Move disarmingVoice = new FairyMove("Disarming Voice", 40, 15);
}
