package me.pavva.PokeJava;

// TODO: Testing and Javadoc
/**
 * me.pavva.PokeJava.Move
 * 
 * A class which contains a Move constuctor, the get-set methods for the 
 * associated variables, and the Damage Calculator. The Damage Calulator uses 
 * methods in me.pavva.PokeJava.Type
 * 
 * @see me.pavva.PokeJava.App
 * @see me.pavva.PokeJava.Type
 * @see me.pavva.PokeJava.Pokemon
 */
public class Move {
    
    private final String name;
    private final Type type;
    private final int power;
    private int points;
    
    /**
     * Constructor for a Move Object. The power and points values are taken from Bulbapedia and Smogon Pokedex
     * 
     * @param name A String which is the textual representation of the Move to the user.
     * @param type A Type from {@link me.pavva.PokeJava.Type} which Moves and Pokemon use for consistency.
     * @param power An int which represents the power of the Move.
     * @param points An int which represents the Power Points (PP) of the move. Power Points determine how many times a move can be used. This feature is not created yet.
     */
    public Move(String name, Type type, int power, int points) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.points = points;
    }
    
    /**
     * Sets the new number of Power Points of the Move.
     * 
     * @param points The int number of Power Points of the Move.
     */
    public void setPoints(int points) {
        this.points = points;
    }
    
    /**
     * Returns the name of the Move.
     * 
     * @return The String name of the Move
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Returns the Type of the Move
     * 
     * @return The Type type of the Move.
     */
    public Type getType() {
        return this.type;
    }
    
    /**
     * Returns the power of the Move.
     * 
     * @return The int power of the Move.
     */
    public int getPower() {
        return this.power;
    }
    
    /**
     * Returns the number of Power Points of the Move.
     * 
     * @return The int number of Power Points of the Move.
     */
    public int getPoints() {
        return this.points;
    }
    
    /**
     * The main Damage Calculator of the PokeJava program. This method is 
     * vital in setting the changing values of health of the Pokemon 
     * throught the game. It uses {@link me.pavva.PokeJava.Type#doStabCheck doStabCheck} method
     * and {@link me.pavva.PokeJava.Type#doEffectCheck doEffectCheck} method to realistically 
     * change the values of the health of the Pokemon.
     * 
     * @param attacker The Pokemon which is attacking. Its attack value is used in determining the damage done.
     * @param defender The Pokemon which is receiving damage. Its defense value is used in determing the damage done. Its health value is changed at the end of the method
     * @param attackerMove The Move which the attacking Pokemon is using. Its power and type are used to determine the damage, STAB, and effectivity.
     */
    public static void attack(Pokemon attacker, Pokemon defender, Move attackerMove) {
        int level = 100; //level is 100 by default. Might implement a create-your-pokemon feature where level may be chosen, but this is far in future
        int a = attacker.getAttack();
        int d = defender.getDefense();
        int power = attackerMove.getPower();
        double stab = Type.doStabCheck(attackerMove, attacker);
        double effectivity = Type.doEffectCheck(attackerMove, defender);
        double modifier = (stab * effectivity);
        
        double damage = (((((((((2 * level) / 5) + 2) * power) * (a / d))) / 50) + 2) * modifier);
        
        defender.setHealth(defender.getHealth() - damage);
    }
}
