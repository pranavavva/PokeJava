package me.pavva.pokejava;

import java.util.*;

import me.pavva.pokejava.pokemon.*;

/**
 * Entrypoint to Pokemon Battle Simulator.
 * 
 * Contains game setup. Uses subroutines in {@link me.pavva.pokejava.Helper
 * Helper} to seperate setup from logic.
 *
 * @author Pranav Avva Github: 20avva Web:
 *         <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @see me.pavva.pokejava.Pokemon
 * @see me.pavva.pokejava.Type
 * @see me.pavva.pokejava.Move
 * @see me.pavva.pokejava.Helper
 * @since Java 1.7
 */
public class App {

    /**
     * Scanner for user input
     */
    static Scanner sc = new Scanner(System.in); // Used for User Input

    /**
     * Random number generator, used for computer move and pokemon selection.
     */
    static Random rand = new Random(); // Random Numbers for CPU move selection

    /**
     * The user's pokemon
     * 
     * @see Pokemon
     */
    static Pokemon yourPoke = new Pokemon();

    /**
     * The opponent's (computer's) pokemon
     * 
     * @see Pokemon
     */
    static Pokemon opponentPoke = new Pokemon();

    /**
     * A temporary variable to store the user's move choice
     */
    static int decision = 0;

    /**
     * A temporary vaiable to store the opponent's move choice
     */
    static int opponentDecision = 0;

    /**
     * An ArrayList to hold all the pokemon from which the user and the computer can
     * pick pokemon from
     * 
     * @see Pokemon
     */
    static ArrayList<Pokemon> poke = new ArrayList<Pokemon>();

    /**
     * Main method in the Pokemon Battle Simulator.<br>
     * <br>
     * 
     * <code>main()</code> invokes methods from {@link Helper Helper} for the main
     * game loop. This method, however, adds all the pokemon to a master list, which
     * is then presented to the user with the {@link Pokemon Pokemon} that they can
     * choose, after whom the computer selects a pokemon.
     *
     * @param args A string array created from command-line arguments. Not used in
     *             this program.
     */
    public static void main(String[] args) {

        int yourPick;
        int opponentPick;

        Pokemon[][] pokemons = { BugPokemon.p, DarkPokemon.p, DragonPokemon.p, ElectricPokemon.p, FairyPokemon.p,
                FightPokemon.p, FirePokemon.p, FlyingPokemon.p, GhostPokemon.p, GrassPokemon.p, GroundPokemon.p,
                IcePokemon.p, NormalPokemon.p, PoisonPokemon.p, PsychicPokemon.p, RockPokemon.p, SteelPokemon.p,
                WaterPokemon.p };

        for (Pokemon[] pokeArr : pokemons) {
            poke.addAll(Arrays.asList(pokeArr));
        }

        poke.sort((poke1, poke2) -> poke1.getType().compareTo(poke2.getType()));

        int k = 1;
        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {
            System.out.printf("%s - %s is of type %s. It has %s health points and it knows %s, %s, %s, %s.\n",
                    Integer.toString(k), p.getName(), p.getType().toString(), Double.toString(p.getHealth()),
                    p.getMove1().getName(), p.getMove2().getName(), p.getMove3().getName(), p.getMove4().getName());

            k++;
        }

        System.out.print(
                "\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
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
            throw new IllegalArgumentException(
                    "\n\n" + "Please pick an integer between 1 and " + poke.size() + ", inclusive.\n");
        }
        // END POKEMON SELECTION BLOCK

        // BEGIN GAME WHILE LOOP
        while (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() > 0.0) {

            Helper.infoUpdate();

            Helper.moveList();

            Helper.userMove();

            Helper.healthCheck();

            Helper.opponentMove();

            Helper.healthCheck();

        } // END GAME WHILE LOOP

        sc.close();
        System.exit(0);

    } // END MAIN METHOD

} // END APP.JAVA
