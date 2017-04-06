package me.pavva.PokeJava;
/**
 * me.pavva.PokeJava.Pokemon
 * 
 * The class file which contains the constructor, get-set methods, and damage calculation function for pokemon
 * 
 * @author  Pranav A.   Github: 20avva
 * @version 1.0
 * @see     me.pavva.PokeJava.App
 */
public class Pokemon { //Pokemon Object Constructors and get-set methods

    private String name;
    private String type;
    private double health;
    private int    usedMove;
    private String move1;
    private String move2;
    private String move3;
    private String move4;

    /**
     * Pokemon object constuctor with optional params passed in
     * 
     * @param  pokemon_name        -   The name of the created pokemon as reffered to by the user
     * @param  pokemon_type        -   The type of the pokemon, used in damage calculation
     * @param  pokemon_health      -   The health of the pokemon, used in damage calculation
     * @param  pokemon_used_move   -   The move a pokemon used, used by move checking
     * @param  pokemon_move1       -   The name of the first move a pokemon can use, reffered to by the user
     * @param  pokemon_move2       -   The name of the second move a pokemon can use, reffered to by the user
     * @param  pokemon_move3       -   The name of the third move a pokemon can use, reffered to by the user
     * @param  pokemon_move4       -   The name of the fourth move a pokemon can use, reffered to by the user
     * 
     * @see     Pokemon.Pokemon()
     * @see     Pokemon.Attack(Pokemon, Pokemon, double, double)
     */
    public Pokemon(String pokemon_name,
                   String pokemon_type,
                   double pokemon_health,
                   int pokemon_used_move,
                   String pokemon_move1,
                   String pokemon_move2,
                   String pokemon_move3,
                   String pokemon_move4) {

        this.name = pokemon_name;
        this.type = pokemon_type;
        this.health = pokemon_health;
        this.usedMove = pokemon_used_move;
        this.move1 = pokemon_move1;
        this.move2 = pokemon_move2;
        this.move3 = pokemon_move3;
        this.move4 = pokemon_move4;

    }

    /**
     * Default pokemon object constructor, no params passed in
     * 
     * @see Pokemon.Pokemon(String, String, double, int, String, String, String, String)
     */
    public Pokemon() {
        this.name = null;
        this.type = null;
        this.health = 0.0;
        this.usedMove = 0;
        this.move1 = null;
        this.move2 = null;
        this.move3 = null;
        this.move4 = null;
    }

    /**
     * Sets the name of a pokemon object
     * 
     * @param   name    The new name of the pokemon
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * Sets the new type of a pokemon
     * 
     * @param  type     The new type of the pokemon
     */
    public void setType(String type) {

        this.type = type;
    }

    /**
     * Sets the new health value of a pokemon
     * 
     * @param   health  The new health of a pokemon
     * @see     Pokemon.Attack(Pokemon, Pokemon, double, double)
     */
    public void setHealth(double health) {

        this.health = health;
    }

    /**
     * Sets the usedMove of a pokemon
     * 
     * @param   usedMove    The used to be moved in the next damage checking turn
     * @see     App.main(String[] args)
     */
    public void setUsedMove(int usedMove) {

        this.usedMove = usedMove;
    }

    /**
     * Sets the first move of a pokemon
     * 
     * @param   move1   The new move name, seen only by the user
     */
    public void setMove1(String move1) {

        this.move1 = move1;
    }

    /**
     * Sets the second move of a pokemon
     * 
     * @param  move2   The new move name, seen only by the user
     */
    public void setMove2(String move2) {

        this.move2 = move2;
    }

    /**
     * Sets the third move of a pokemon
     * 
     * @param  move3   The new move name, seen only by the user
     */
    public void setMove3(String move3) {

        this.move3 = move3;
    }

    /**
     * Sets the fourth move of a pokemon
     * 
     * @param   move4   The new move name, seen only by the user
     */
    public void setMove4(String move4) {

        this.move4 = move4;
    }

    /**
     * Returns the name of the pokemon
     * 
     * @return  name    The name of the pokemon
     */
    public String getName() {

        return this.name;
    }

    /**
     * Returns the type of the pokemon
     * 
     * @return  type    The type of the pokemon
     */
    public String getType() {

        return this.type;
    }

    /**
     * Returns the current health of the pokemon
     * 
     * @return  health  The health of the pokemon
     */
    public double getHealth() {

        return this.health;
    }

    /**
     * Returns the used move of the pokemon
     * 
     * @return  usedMove    The used move of the pokemon
     */
    public int getUsedMove() {

        return this.usedMove;
    }

    /**
     * Returns the first move of the pokemon
     * 
     * @return  move1   The first move of the pokemon
     */
    public String getMove1() {

        return this.move1;
    }

    /**
     * Returns the second move of the pokemon
     * 
     * @return  move2   The second move of the pokemon
     */
    public String getMove2() {

        return this.move2;
    }

    /**
     * Returns the third move of the pokemon
     * 
     * @return  move3   The third move of the pokemon
     */
    public String getMove3() {

        return this.move3;
    }

    /**
     * Returns the fourth move of the pokemon
     * 
     * @return  move4   The fourth move of the pokemon
     */
    public String getMove4() {

        return this.move4;
    }

    /**
     * The main damage calculation step of the battle simulations.
     * Takes into account type effectivity and returns damage based on it
     * 
     * @param   your            The pokemon which is controlled by the user
     * @param   oppponent       The pokemon which is controlled by the CPU
     * @param   yourDamage      The unmodified damage yourPoke recieves
     * @param   opponentDamage  The unmodified damage opponentPoke recieves
     */
    public static void Attack(Pokemon your, Pokemon opponent, double yourDamage, double opponentDamage) {

        /*
         * yourPoke needs to be passed in for "your" ALWAYS
         * opponentPoke needs to be passed in for "opponent" ALWAYS
         * yourDamage refers to the unmodified damage yourPoke gets
         * opponentDamage refers to the unmodified damage opponentPoke gets
         */

        double yourTypeBonus; // Initializing type bonus variables
        double opponentTypeBonus;

        //Type Checking
        //This system uses a permutation system to cover all possible events
        //TODO finish all 171 permutations in this damage checking system
        //TODO begin type checking block

        if (your.getType() == "water" && opponent.getType() == "fire") {

            yourTypeBonus = 2.0;
            opponentTypeBonus = 0.5;

        } else if (your.getType() == "water" && opponent.getType() == "grass") {

            yourTypeBonus = 0.5;
            opponentTypeBonus = 2.0;

        } else if (your.getType() == "water" && opponent.getType() == "electric") {

            yourTypeBonus = 0.5;
            opponentTypeBonus = 2.0;

        } else if (your.getType() == "fire" && opponent.getType() == "water") {

            yourTypeBonus = 0.5;
            opponentTypeBonus = 2.0;

        } else if (your.getType() == "fire" && opponent.getType() == "grass") {

            yourTypeBonus = 2.0;
            opponentTypeBonus = 0.5;

        } else if (your.getType() == "grass" && opponent.getType() == "water") {

            yourTypeBonus = 2.0;
            opponentTypeBonus = 0.5;

        } else if (your.getType() == "grass" && opponent.getType() == "fire") {

            yourTypeBonus = 0.5;
            opponentTypeBonus = 2.0;

        } else if (your.getType() == "electric" && opponent.getType() == "water") {

            yourTypeBonus = 2.0;
            opponentTypeBonus = 0.5;

        } else if (your.getType() == opponent.getType()) { //In the event both Pokemon are of the same type

            yourTypeBonus = 0.5;
            opponentTypeBonus = 0.5;

        } else {

            yourTypeBonus = 1.0;
            opponentTypeBonus = 1.0;

        }

        //TODO end type checking block

        your.setHealth(your.getHealth() - (yourDamage * opponentTypeBonus));
        opponent.setHealth(opponent.getHealth() - (opponentDamage * yourTypeBonus));

    }

}
