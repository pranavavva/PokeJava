package me.pavva.pokejava;

import java.util.Scanner; // User input
import java.util.Random; // Random numbers
import java.util.ArrayList;

// import me.pavva.pokejava.moves.*;

import me.pavva.pokejava.pokemon.*;

@SuppressWarnings("unused")
/** 
 * Entry point to Pokemon Battle Simulator
 * 
 * @author  Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.0
 * @since Java 1.7
 * @see me.pavva.pokejava.Pokemon
 * @see me.pavva.pokejava.Type
 * @see me.pavva.pokejava.Move
 * @see me.pavva.pokejava.Helper
 */
public class App {

    private static final BugPokemon      bug                    = new BugPokemon();
    private static final DarkPokemon     dark                   = new DarkPokemon();
    private static final DragonPokemon   dragon                 = new DragonPokemon();
    private static final ElectricPokemon electric               = new ElectricPokemon();
    private static final FairyPokemon    fairy                  = new FairyPokemon();
    private static final FightPokemon    flight                 = new FightPokemon();
    private static final FirePokemon     fire                   = new FirePokemon();
    private static final FlyingPokemon   flying                 = new FlyingPokemon();
    private static final GhostPokemon    ghost                  = new GhostPokemon();
    private static final GrassPokemon    grass                  = new GrassPokemon();
    private static final GroundPokemon   ground                 = new GroundPokemon();
    private static final IcePokemon      ice                    = new IcePokemon();
    private static final NormalPokemon   normal                 = new NormalPokemon();
    private static final PoisonPokemon   poison                 = new PoisonPokemon();
    private static final PsychicPokemon  psychic                = new PsychicPokemon();
    private static final RockPokemon     rock                   = new RockPokemon();
    private static final SteelPokemon    steel                  = new SteelPokemon();
    private static final WaterPokemon    water                  = new WaterPokemon();


    static final String                  ANSI_RESET             = "\u001B[0m";             // ANSI Color Codes
    static final String                  ANSI_BLACK             = "\u001B[30m";
    static final String                  ANSI_RED               = "\u001B[31m";
    static final String                  ANSI_GREEN             = "\u001B[32m";
    static final String                  ANSI_YELLOW            = "\u001B[33m";
    static final String                  ANSI_BLUE              = "\u001B[34m";
    static final String                  ANSI_PURPLE            = "\u001B[35m";
    static final String                  ANSI_CYAN              = "\u001B[36m";
    static final String                  ANSI_WHITE             = "\u001B[37m";

    static final String                  ANSI_BLACK_BACKGROUND  = "\u001B[40m";            // ANSI Background Color Codes
    static final String                  ANSI_RED_BACKGROUND    = "\u001B[41m";
    static final String                  ANSI_GREEN_BACKGROUND  = "\u001B[42m";
    static final String                  ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static final String                  ANSI_BLUE_BACKGROUND   = "\u001B[44m";
    static final String                  ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static final String                  ANSI_CYAN_BACKGROUND   = "\u001B[46m";
    static final String                  ANSI_WHITE_BACKGROUND  = "\u001B[47m";

    static Scanner                       sc                     = new Scanner(System.in);  // Used for User Input
    static Random                        rand                   = new Random();            // Random Numbers for CPU move selection
    static Pokemon                       yourPoke               = new Pokemon();
    static Pokemon                       opponentPoke           = new Pokemon();
    static int                           yourPick               = 0;
    static int                           opponentPick           = 0;
    static int                           decision               = 0;
//  static int                           newYourPick            = 0;
    static int                           opponentDecision       = 0;
    static ArrayList<Pokemon>            poke                   = new ArrayList<Pokemon>();


    /**
     * Main method in the Pokemon Battle Simulator
     * @param args A string array created from command-line arguments. Not used in this program.
     */
    public static void main(String[] args) throws IllegalArgumentException {


        poke.add(fire.charizard);
        poke.add(water.blastoise);
        poke.add(grass.venusaur);
        poke.add(ice.avalugg);
        poke.add(poison.muk);

        System.out.println(ANSI_GREEN);


        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {

            System.out.print(p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth() + " health points and it knows "
                             + p.getMove1().getName() + ", " + p.getMove2().getName() + ", " + p.getMove3().getName() + ", "
                             + p.getMove4().getName() + ".\n");
        }


        System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        yourPick = sc.nextInt();
        opponentPick = rand.nextInt(poke.size());

        System.out.println(ANSI_BLUE);

        if (yourPick <= poke.size() && yourPick > 0) {

            yourPoke = poke.get(yourPick - 1);
            opponentPoke = poke.get(opponentPick);
            System.out.println("You have selected " + yourPoke.getName());
            System.out.println("Your opponent has selected " + opponentPoke.getName());

        } else {

            sc.close();
            System.gc();
            throw new IllegalArgumentException("\n\n" + ANSI_RESET + ANSI_RED + "Please pick an integer between 1 and " + poke.size()
                                               + ", inclusive.\n" + ANSI_RESET);
        }

        System.out.println(ANSI_RESET + ANSI_PURPLE);
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

    } //END MAIN METHOD

} // END APP.JAVA
