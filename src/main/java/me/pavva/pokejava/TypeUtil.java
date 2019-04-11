package me.pavva.pokejava;

import com.google.common.collect.ArrayTable;
import java.util.*;
import static me.pavva.pokejava.Type.*;

public class TypeUtil {

    private static ArrayTable<Type, Type, Double> lookupTable;

    private static ArrayTable<Type, Type, Double> getLookupTable() {
        if (lookupTable != null) {
            return lookupTable;
        } else {
            lookupTable = ArrayTable.create(EnumSet.allOf(Type.class), EnumSet.allOf(Type.class));
            for (Type row : lookupTable.rowKeyList()) {
                for (Type column : lookupTable.columnKeyList()) {
                    lookupTable.put(row, column, 1.0);
                }
            }

            lookupTable.put(NORMAL, ROCK, 0.5);
            lookupTable.put(NORMAL, GHOST, 0.0);
            lookupTable.put(NORMAL, STEEL, 0.5);
            lookupTable.put(FIGHT, NORMAL, 2.0);
            lookupTable.put(FIGHT, FLYING, 0.5);
            lookupTable.put(FIGHT, POISON, 0.5);
            lookupTable.put(FIGHT, ROCK, 2.0);
            lookupTable.put(FIGHT, BUG, 0.5);
            lookupTable.put(FIGHT, GHOST, 0.0);
            lookupTable.put(FIGHT, STEEL, 2.0);
            lookupTable.put(FIGHT, PSYCHIC, 0.5);
            lookupTable.put(FIGHT, ICE, 2.0);
            lookupTable.put(FIGHT, DARK, 2.0);
            lookupTable.put(FIGHT, FAIRY, 0.5);
            lookupTable.put(FLYING, FIGHT, 2.0);
            lookupTable.put(FLYING, ROCK, 0.5);
            lookupTable.put(FLYING, BUG, 2.0);
            lookupTable.put(FLYING, STEEL, 0.5);
            lookupTable.put(FLYING, GRASS, 2.0);
            lookupTable.put(FLYING, ELECTRIC, 0.5);
            lookupTable.put(POISON, POISON, 0.5);
            lookupTable.put(POISON, GROUND, 0.5);
            lookupTable.put(POISON, ROCK, 0.5);
            lookupTable.put(POISON, GHOST, 0.5);
            lookupTable.put(POISON, STEEL, 0.0);
            lookupTable.put(POISON, GRASS, 2.0);
            lookupTable.put(POISON, FAIRY, 2.0);
            lookupTable.put(GROUND, FLYING, 0.0);
            lookupTable.put(GROUND, POISON, 2.0);
            lookupTable.put(GROUND, ROCK, 2.0);
            lookupTable.put(GROUND, BUG, 0.5);
            lookupTable.put(GROUND, STEEL, 2.0);
            lookupTable.put(GROUND, FIRE, 2.0);
            lookupTable.put(GROUND, GRASS, 0.5);
            lookupTable.put(GROUND, ELECTRIC, 2.0);



            return lookupTable;
        }
    }

    /**
     * Checks for STAB (Same-Type-Attack-Bonus).
     *
     * @param move    The Move being compared
     * @param pokemon The Pokemon to which the Move is being compared
     * @return The double value of the STAB. 1.5 if doStabCheck is true, REGULAR if doStabCheck is false.
     */
    public static double doStabCheck(Move move, Pokemon pokemon) {

        if (move.getType() == pokemon.getType()) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

    /**
     * Checks type effectivity. Uses the chart found <a href="http://vignette3.wikia.nocookie.net/roblox-pokemon-brickbronze/images/b/bc/TypeChart.png/revision/latest?cb=2NOT_EFFECTIVE1NOT_EFFECTIVEINEFFECTIVE421">here</a>.
     *
     * @param move    The Move which is being used.
     * @param pokemon The Pokemon which is receiving damage.
     * @return The double value of the type effictivity. SUPER_EFFECTIVE if Super Effective, NOT_EFFECTIVE if Not Very Effective, INEFFECTIVE if Not Effective, and REGULAR otherwise.
     */
    public static double doEffectCheck(Move move, Pokemon pokemon) {
        return getLookupTable().get(move.getType(), pokemon.getType());
    }
}