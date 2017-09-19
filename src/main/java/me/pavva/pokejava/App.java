package me.pavva.pokejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import me.pavva.pokejava.pokemon.*;

/**
 * Entry point to Pokemon Battle Simulator. Contains game setup. Uses subroutines in {@link me.pavva.pokejava.Helper Helper.java} to seperate setup from logic.
 *
 * @author Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @see me.pavva.pokejava.Pokemon
 * @see me.pavva.pokejava.Type
 * @see me.pavva.pokejava.Move
 * @see me.pavva.pokejava.Helper
 * @see me.pavva.pokejava.moves
 * @see me.pavva.pokejava.pokemon
 * @since Java 1.7
 */
public class App {

    private static final BugPokemon      BUG_POKEMON      = new BugPokemon();
    private static final DarkPokemon     DARK_POKEMON     = new DarkPokemon();
    private static final DragonPokemon   DRAGON_POKEMON   = new DragonPokemon();
    private static final ElectricPokemon ELECTRIC_POKEMON = new ElectricPokemon();
    private static final FairyPokemon    FAIRY_POKEMON    = new FairyPokemon();
    private static final FightPokemon    FIGHT_POKEMON    = new FightPokemon();
    private static final FirePokemon     FIRE_POKEMON     = new FirePokemon();
    private static final FlyingPokemon   FLYING_POKEMON   = new FlyingPokemon();
    private static final GhostPokemon    GHOST_POKEMON    = new GhostPokemon();
    private static final GrassPokemon    GRASS_POKEMON    = new GrassPokemon();
    private static final GroundPokemon   GROUND_POKEMON   = new GroundPokemon();
    private static final IcePokemon      ICE_POKEMON      = new IcePokemon();
    private static final NormalPokemon   NORMAL_POKEMON   = new NormalPokemon();
    private static final PoisonPokemon   POISON_POKEMON   = new PoisonPokemon();
    private static final PsychicPokemon  PSYCHIC_POKEMON  = new PsychicPokemon();
    private static final RockPokemon     ROCK_POKEMON     = new RockPokemon();
    private static final SteelPokemon    STEEL_POKEMON    = new SteelPokemon();
    private static final WaterPokemon    WATER_POKEMON    = new WaterPokemon();

    static Scanner                       sc               = new Scanner(System.in);  // Used for User Input
    static Random                        rand             = new Random();            // Random Numbers for CPU move selection
    static Pokemon                       yourPoke         = new Pokemon();
    static Pokemon                       opponentPoke     = new Pokemon();

    static int                           decision         = 0;
    static int                           opponentDecision = 0;
    static ArrayList<Pokemon>            poke             = new ArrayList<Pokemon>();


    /**
     * Main method in the Pokemon Battle Simulator
     *
     * @param args A string array created from command-line arguments. Not used in this program.
     */
    public static void main(String[] args) throws IllegalArgumentException {

        int yourPick;
        int opponentPick;

        poke.addAll(Arrays.asList(BUG_POKEMON.p));
        poke.addAll(Arrays.asList(DARK_POKEMON.p));
        poke.addAll(Arrays.asList(DRAGON_POKEMON.p));
        poke.addAll(Arrays.asList(ELECTRIC_POKEMON.p));
        poke.addAll(Arrays.asList(FAIRY_POKEMON.p));
        poke.addAll(Arrays.asList(FIGHT_POKEMON.p));
        poke.addAll(Arrays.asList(FIRE_POKEMON.p));
        poke.addAll(Arrays.asList(FLYING_POKEMON.p));
        poke.addAll(Arrays.asList(GHOST_POKEMON.p));
        poke.addAll(Arrays.asList(GRASS_POKEMON.p));
        poke.addAll(Arrays.asList(GROUND_POKEMON.p));
        poke.addAll(Arrays.asList(ICE_POKEMON.p));
        poke.addAll(Arrays.asList(NORMAL_POKEMON.p));
        poke.addAll(Arrays.asList(POISON_POKEMON.p));
        poke.addAll(Arrays.asList(PSYCHIC_POKEMON.p));
        poke.addAll(Arrays.asList(ROCK_POKEMON.p));
        poke.addAll(Arrays.asList(STEEL_POKEMON.p));
        poke.addAll(Arrays.asList(WATER_POKEMON.p));

        Collections.sort(poke, new Comparator<Pokemon>() {
            public int compare(Pokemon p1, Pokemon p2) {
                return p1.getType().compareTo(p2.getType());
            }
        });

        int k = 1;
        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {

            System.out.print(k + " - " + p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth()
                             + " health points and it knows " + p.getMove1().getName() + ", " + p.getMove2().getName() + ", "
                             + p.getMove3().getName() + ", " + p.getMove4().getName() + ".\n");
            k++;
        }


        System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        yourPick = sc.nextInt();
        System.out.println("\n");
        opponentPick = rand.nextInt(poke.size());

        if (yourPick <= poke.size() && yourPick > 0) {

            yourPoke = poke.get(yourPick - 1);
            opponentPoke = poke.get(opponentPick);
            System.out.println("You have selected " + yourPoke.getName());
            System.out.println("Your opponent has selected " + opponentPoke.getName());

        } else {

            sc.close();
            System.gc();
            throw new IllegalArgumentException("\n\n" + "Please pick an integer between 1 and " + poke.size() + ", inclusive.\n");
        }
        // END POKEMON SELECTION BLOCK

        // BEGIN GAME WHILE LOOP
        while (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() > 0.0) {

            Helper.infoUpdate();

            Helper.moveList();

            Helper.yourMove();

            Helper.healthCheck();

            Helper.opponentMove();

            Helper.healthCheck();

        } // END GAME WHILE LOOP

        System.gc();
        sc.close();
        System.exit(0);

    } //END MAIN METHOD

} // END APP.JAVA

