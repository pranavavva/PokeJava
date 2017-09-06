package me.pavva.pokejava;

// TODO: Testing


/**
 * me.pavva.pokejava.Type
 * 
 * <p>An enum containing all 17 types in the Pokemon world. It also contains two 
 * methods, one for checking Same-Type-Attack-Bonus (STAB), and one for check 
 * effectivity.</p>
 * 
 * @see me.pavva.pokejava.App
 * @see me.pavva.pokejava.Pokemon
 * @see me.pavva.pokejava.Move
 */
public enum Type {
    NORMAL,
    FIGHT,
    FLYING,
    POISON,
    GROUND,
    ROCK,
    BUG,
    GHOST,
    STEEL,
    FIRE,
    WATER,
    GRASS,
    ELECTRIC,
    PSYCHIC,
    ICE,
    DRAGON,
    DARK,
    FAIRY;
    
    /**
     * Checks for STAB (Same-Type-Attack-Bonus).
     * 
     * @param move The Move being compared
     * @param pokemon The Pokemon to which the Move is being compared
     * @return The double value of the STAB. 1.5 if doStabCheck is true, 1.0 if doStabCheck is false.
     */
    public static double doStabCheck(Move move, Pokemon pokemon) {

        if (move.getType() == pokemon.getType()) {
            return 1.5;
        } else {
            return 1.0;
        }
    }
    
    /**
     * Checks type effectivity. Uses the chart found <a href="http://vignette3.wikia.nocookie.net/roblox-pokemon-brickbronze/images/b/bc/TypeChart.png/revision/latest?cb=20151025020421">here</a>.
     * 
     * @param move The Move which is being used.
     * @param pokemon The Pokemon which is receiving damage.
     * @return The double value of the type effictivity. 2.0 if Super Effective, 0.5 if Not Very Effective, 0.0 if Not Effective, and 1.0 otherwise.
     */
    public static double doEffectCheck(Move move, Pokemon pokemon) {
        Type moveType = move.getType();
        Type pokemonType = pokemon.getType();

        /*
         * ALL the type checking is ordered:
         * FIRST: by move type
         * SECOND: by return value
         * THIRD: return value is sorted in descending order. 2.0 to 0.5 to 0.0
         * 
         * Combos are taken from type chart which can be found here:
         * https://bulbapedia.bulbagarden.net/w/index.php?title=Type&oldid=2646973
         * 
         * Right-hand side of the && (conditional AND) in the if statements MUST go in parenthesis. That is to say,
         * it is needed for all of the || (conditional OR) linked items to be in parentheses to force them to the highest
         * operator precedence.
         */

        if (moveType.equals(NORMAL) && (pokemonType.equals(ROCK) || pokemonType.equals(STEEL))) {

            return 0.5;

        } else if (moveType.equals(NORMAL) && (pokemonType.equals(GHOST))) {

            return 0.0;

        } else if (moveType.equals(FIGHT)
                   && (pokemonType.equals(NORMAL) || pokemonType.equals(ROCK) || pokemonType.equals(STEEL) || pokemonType.equals(ICE) || pokemonType.equals(DARK))) {

            return 2.0;

        } else if (moveType.equals(FIGHT)
                   && (pokemonType.equals(FLYING) || pokemonType.equals(POISON) || pokemonType.equals(BUG) || pokemonType.equals(PSYCHIC) || pokemonType.equals(FAIRY))) {

            return 0.5;

        } else if (moveType.equals(FIGHT) && (pokemonType.equals(GHOST))) {

            return 0.0;

        } else if (moveType.equals(FLYING) && (pokemonType.equals(FIGHT) || pokemonType.equals(BUG) || pokemonType.equals(GRASS))) {

            return 2.0;

        } else if (moveType.equals(FLYING) && (pokemonType.equals(ROCK) || pokemonType.equals(STEEL) || pokemonType.equals(ELECTRIC))) {

            return 0.5;

        } else if (moveType.equals(POISON) && (pokemonType.equals(GRASS) || pokemonType.equals(FAIRY))) {

            return 2.0;

        } else if (moveType.equals(POISON)
                   && (pokemonType.equals(POISON) || pokemonType.equals(GROUND) || pokemonType.equals(ROCK) || pokemonType.equals(GHOST))) {

            return 0.5;

        } else if (moveType.equals(POISON) && (pokemonType.equals(STEEL))) {

            return 0.0;

        } else if (moveType.equals(GROUND)
                   && (pokemonType.equals(POISON) || pokemonType.equals(ROCK) || pokemonType.equals(STEEL) || pokemonType.equals(STEEL)
                       || pokemonType.equals(FIRE) || pokemonType.equals(ELECTRIC))) {

            return 2.0;

        } else if (moveType.equals(GROUND) && (pokemonType.equals(BUG) || pokemonType.equals(GRASS))) {

            return 0.5;

        } else if (moveType.equals(GROUND) && (pokemonType.equals(FLYING))) {

            return 0.0;

        } else if (moveType.equals(ROCK)
                   && (pokemonType.equals(FLYING) || pokemonType.equals(BUG) || pokemonType.equals(FIRE) || pokemonType.equals(ICE))) {

            return 2.0;

        } else if (moveType.equals(ROCK) && (pokemonType.equals(FIGHT) || pokemonType.equals(GROUND) || pokemonType.equals(STEEL))) {

            return 0.5;

        } else if (moveType.equals(BUG) && (pokemonType.equals(GRASS) || pokemonType.equals(PSYCHIC) || pokemonType.equals(DARK))) {

            return 2.0;

        } else if (moveType.equals(BUG)
                   && (pokemonType.equals(FIGHT) || pokemonType.equals(FLYING) || pokemonType.equals(POISON) || pokemonType.equals(GHOST)
                       || pokemonType.equals(STEEL) || pokemonType.equals(FIRE) || pokemonType.equals(FAIRY))) {

            return 0.5;

        } else if (moveType.equals(GHOST) && (pokemonType.equals(GHOST) || pokemonType.equals(PSYCHIC))) {

            return 2.0;

        } else if (moveType.equals(GHOST) && (pokemonType.equals(DARK))) {

            return 0.5;

        } else if (moveType.equals(GHOST) && (pokemonType.equals(NORMAL))) {

            return 0.0;

        } else if (moveType.equals(STEEL) && (pokemonType.equals(ROCK) || pokemonType.equals(ICE) || pokemonType.equals(FAIRY))) {

            return 2.0;

        } else if (moveType.equals(FIRE)
                   && (pokemonType.equals(BUG) || pokemonType.equals(STEEL) || pokemonType.equals(GRASS) || pokemonType.equals(ICE))) {

            return 2.0;

        } else if (moveType.equals(FIRE)
                   && (pokemonType.equals(ROCK) || pokemonType.equals(FIRE) || pokemonType.equals(WATER) || pokemonType.equals(DRAGON))) {

            return 0.5;

        } else if (moveType.equals(WATER) && (pokemonType.equals(GROUND) || pokemonType.equals(ROCK) || pokemonType.equals(FIRE))) {

            return 2.0;

        } else if (moveType.equals(WATER) && (pokemonType.equals(WATER) || pokemonType.equals(GRASS) || pokemonType.equals(DRAGON))) {

            return 0.5;

        } else if (moveType.equals(GRASS) && (pokemonType.equals(GROUND) || pokemonType.equals(ROCK) || pokemonType.equals(WATER))) {

            return 2.0;

        } else if (moveType.equals(GRASS)
                   && (pokemonType.equals(FLYING) || pokemonType.equals(POISON) || pokemonType.equals(BUG) || pokemonType.equals(STEEL)
                       || pokemonType.equals(FIRE) || pokemonType.equals(GRASS) || pokemonType.equals(DRAGON))) {

            return 0.5;

        } else if (moveType.equals(ELECTRIC) && (pokemonType.equals(FLYING) || pokemonType.equals(WATER))) {

            return 2.0;

        } else if (moveType.equals(ELECTRIC) && (pokemonType.equals(GRASS) || pokemonType.equals(ELECTRIC) || pokemonType.equals(DRAGON))) {

            return 0.5;

        } else if (moveType.equals(ELECTRIC) && (pokemonType.equals(GROUND))) {

            return 0.0;

        } else if (moveType.equals(PSYCHIC) && (pokemonType.equals(FIGHT) || pokemonType.equals(POISON))) {

            return 2.0;

        } else if (moveType.equals(PSYCHIC) && (pokemonType.equals(DARK))) {

            return 0.0;

        } else if (moveType.equals(ICE)
                   && (pokemonType.equals(FLYING) || pokemonType.equals(GROUND) || pokemonType.equals(GRASS) || pokemonType.equals(DRAGON))) {

            return 2.0;

        } else if (moveType.equals(ICE)
                   && (pokemonType.equals(STEEL) || pokemonType.equals(FIRE) || pokemonType.equals(WATER) || pokemonType.equals(ICE))) {

            return 0.5;

        } else if (moveType.equals(DRAGON) && (pokemonType.equals(DRAGON))) {

            return 2.0;

        } else if (moveType.equals(DRAGON) && (pokemonType.equals(STEEL))) {

            return 0.5;

        } else if (moveType.equals(DRAGON) && (pokemonType.equals(FAIRY))) {

            return 0.0;

        } else if (moveType.equals(DARK) && (pokemonType.equals(GHOST) || pokemonType.equals(PSYCHIC))) {

            return 2.0;

        } else if (moveType.equals(DARK) && (pokemonType.equals(FIGHT) || pokemonType.equals(DARK) || pokemonType.equals(FAIRY))) {

            return 0.5;

        } else if (moveType.equals(FAIRY) && (pokemonType.equals(FIGHT) || pokemonType.equals(DRAGON) || pokemonType.equals(DARK))) {

            return 2.0;

        } else if (moveType.equals(FAIRY) && (pokemonType.equals(POISON) || pokemonType.equals(STEEL) || pokemonType.equals(FIRE))) {

            return 0.5;

        } else {

            return 1;
        }
    }
}
