package me.pavva.PokeJava;

import java.util.*;

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

    private String          name;
    private Type            type;
    private double          health;
    private int             attack;
    private int             defense;
    private ArrayList<Move> moveList;
    private Move            move1;
    private Move            move2;
    private Move            move3;
    private Move            move4;

    /**
     * Pokemon object constuctor with params passed in
     * 
     * @param  pokemon_name        -   The name of the created pokemon as reffered to by the user
     * @param  pokemon_type        -   The type of the pokemon, used in damage calculation
     * @param  pokemon_health      -   The health of the pokemon, used in damage calculation
     * @param  pokemon_used_move   -   The move a pokemon used, used by move checking
     * @param  pokemon_move1       -   The name of the first move a pokemon can use, reffered to by the user
     * @param  pokemon_move2       -   The name of the second move a pokemon can use, reffered to by the user
     * @param  pokemon_move3       -   The name of the third move a pokemon can use, reffered to by the user
     * @param  pokemon_move4       -   The name of the fourth move a pokemon can use, reffered to by the user
     */
    public Pokemon(String name, Type type, double health, int attack, int defense, Move move1, Move move2, Move move3, Move move4) {

        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;

        moveList.add(move1);
        moveList.add(move2);
        moveList.add(move3);
        moveList.add(move4);

    }

    /**
     * Default pokemon object constructor, no params passed in
     */
    public Pokemon() {
        this.name = null;
        this.type = null;
        this.health = 0.0;
        this.attack = 0;
        this.defense = 0;
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
    public void setType(Type type) {

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

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Sets the first move of a pokemon
     * 
     * @param   move1   The new move name, seen only by the user
     */
    public void setMove1(Move move1) {

        this.move1 = move1;
    }

    /**
     * Sets the second move of a pokemon
     * 
     * @param  move2   The new move name, seen only by the user
     */
    public void setMove2(Move move2) {

        this.move2 = move2;
    }

    /**
     * Sets the third move of a pokemon
     * 
     * @param  move3   The new move name, seen only by the user
     */
    public void setMove3(Move move3) {

        this.move3 = move3;
    }

    /**
     * Sets the fourth move of a pokemon
     * 
     * @param   move4   The new move name, seen only by the user
     */
    public void setMove4(Move move4) {

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
    public Type getType() {

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

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    /**
     * Returns the first move of the pokemon
     * 
     * @return  move1   The first move of the pokemon
     */
    public Move getMove1() {

        return this.move1;
    }

    /**
     * Returns the second move of the pokemon
     * 
     * @return  move2   The second move of the pokemon
     */
    public Move getMove2() {

        return this.move2;
    }

    /**
     * Returns the third move of the pokemon
     * 
     * @return  move3   The third move of the pokemon
     */
    public Move getMove3() {

        return this.move3;
    }

    /**
     * Returns the fourth move of the pokemon
     * 
     * @return  move4   The fourth move of the pokemon
     */
    public Move getMove4() {

        return this.move4;
    }

}
