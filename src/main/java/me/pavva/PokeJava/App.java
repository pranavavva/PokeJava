package me.pavva.PokeJava;

import java.util.Scanner; // User input
import java.util.Random; // Random numbers
import java.util.ArrayList;

import me.pavva.PokeJava.moves.*;
import me.pavva.PokeJava.pokemon.*;

/**
 * me.pavva.PokeJava.App
 * 
 * Entry point to Pokemon Battle Simulator
 * 
 * @author  Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 3.0
 * @since Java 1.7
 * @see me.pavva.PokeJava.Pokemon
 * @see me.pavva.PokeJava.Type
 * @see me.pavva.PokeJava.Move
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


    private static final String          ANSI_RESET             = "\u001B[0m";             // ANSI Color Codes
    private static final String          ANSI_BLACK             = "\u001B[30m";
    private static final String          ANSI_RED               = "\u001B[31m";
    private static final String          ANSI_GREEN             = "\u001B[32m";
    private static final String          ANSI_YELLOW            = "\u001B[33m";
    private static final String          ANSI_BLUE              = "\u001B[34m";
    private static final String          ANSI_PURPLE            = "\u001B[35m";
    private static final String          ANSI_CYAN              = "\u001B[36m";
    private static final String          ANSI_WHITE             = "\u001B[37m";

    private static final String          ANSI_BLACK_BACKGROUND  = "\u001B[40m";            // ANSI Background Color Codes
    private static final String          ANSI_RED_BACKGROUND    = "\u001B[41m";
    private static final String          ANSI_GREEN_BACKGROUND  = "\u001B[42m";
    private static final String          ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String          ANSI_BLUE_BACKGROUND   = "\u001B[44m";
    private static final String          ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String          ANSI_CYAN_BACKGROUND   = "\u001B[46m";
    private static final String          ANSI_WHITE_BACKGROUND  = "\u001B[47m";

    private static Scanner               sc                     = new Scanner(System.in);  // Used for User Input
    private static Random                rand                   = new Random();            // Random Numbers for CPU move selection
    private static Pokemon               yourPoke               = new Pokemon();
    private static Pokemon               opponentPoke           = new Pokemon();
    private static int                   yourPick               = 0;
    private static int                   opponentPick           = 0;
    private static int                   decision               = 0;
    private static int                   newYourPick            = 0;
    private static int                   opponentDecision       = 0;
    private static ArrayList<Pokemon>    poke                   = new ArrayList<Pokemon>();


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

            // BEGIN PRE-FIGHT INFO UPDATE

            System.out.println(ANSI_BLUE + yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");
            System.out.println("The foe's " + opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.\n");

            // END PRE-FIGHT INFO UPDATE

            // BEGIN MOVE LIST
            System.out.println(yourPoke.getName() + " knows\n1 - " + yourPoke.getMove1().getName() + "\t2 - "
                               + yourPoke.getMove2().getName() + "\n3 - " + yourPoke.getMove3().getName() + "\t4 - "
                               + yourPoke.getMove4().getName() + ANSI_GREEN);
            System.out.print("Type the number corresponding to the move you would like " + yourPoke.getName()
                             + " to use. Select '5' to switch out to a different Pokemon.\n>> ");
            // END MOVE LIST

            // BEGIN YOUR MOVE
            yourMove();
            //END YOUR MOVE

            // BEGIN HEALTH CHECKING BLOCK
            healthCheck();
            // END HEALTH CHECKING BLOCK

            // BEGIN OPPONENT MOVE
            opponentMove();
            // END OPPONENT MOVE

            // BEGIN HEALTH CHECKING BLOCK
            healthCheck();
            // END HEALTH CHECKING BLOCK

        } // END GAME WHILE LOOP

        System.gc();
        sc.close();

    } //END MAIN

    // Begin yourMove subroutine
    private static void yourMove() {
        decision = sc.nextInt();

        switch (decision) {
            case 1:
                Move.attack(yourPoke, opponentPoke, yourPoke.getMove1());
                break;
            case 2:
                Move.attack(yourPoke, opponentPoke, yourPoke.getMove2());
                break;
            case 3:
                Move.attack(yourPoke, opponentPoke, yourPoke.getMove3());
                break;
            case 4:
                Move.attack(yourPoke, opponentPoke, yourPoke.getMove4());
                break;
            case 5:

                for (Pokemon p : poke) {

                    System.out.print(p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth()
                                     + " health points and it knows " + p.getMove1().getName() + ", " + p.getMove2().getName() + ", "
                                     + p.getMove3().getName() + ", " + p.getMove4().getName() + ".\n");
                }

                System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
                int newYourPick = sc.nextInt();

                if (newYourPick <= poke.size() && newYourPick > 0) {

                    yourPoke = poke.get(newYourPick - 1);
                    System.out.println("You have selected " + yourPoke.getName());
                    System.out.println("Your opponent has selected " + opponentPoke.getName());

                } else {

                    sc.close();
                    System.gc();
                    throw new IllegalArgumentException("\n\n" + ANSI_RESET + ANSI_RED + "Please pick an integer between 1 and "
                                                       + poke.size() + ", inclusive.\n" + ANSI_RESET);
                }
                break;

            default:
                throw new IllegalArgumentException("\n\n" + ANSI_RESET + ANSI_RED + "Please select an integer between 1 and 5, inclusive."
                                                   + ANSI_RESET);
        }
    } //END yourMove subroutine

    // BEGIN opponentMove subroutine
    private static void opponentMove() {

        opponentDecision = rand.nextInt(4);

        System.out.println(ANSI_RED);
        switch (opponentDecision) {
            case 0:
                Move.attack(opponentPoke, yourPoke, opponentPoke.getMove1());
                System.out.println(opponentPoke.getName() + " used " + opponentPoke.getMove1().getName());
                break;
            case 1:
                Move.attack(opponentPoke, yourPoke, opponentPoke.getMove2());
                System.out.println(opponentPoke.getName() + " used " + opponentPoke.getMove2().getName());
                break;
            case 2:
                Move.attack(opponentPoke, yourPoke, opponentPoke.getMove3());
                System.out.println(opponentPoke.getName() + " used " + opponentPoke.getMove3().getName());
                break;
            case 3:
                Move.attack(opponentPoke, yourPoke, opponentPoke.getMove4());
                System.out.println(opponentPoke.getName() + " used " + opponentPoke.getMove4().getName());
                break;
        }
        System.out.println(ANSI_GREEN);
    } //END opponenetMove subroutine

    //Begin Health chekcing subroutine
    private static void healthCheck() {
        if (yourPoke.getHealth() <= 0.0 && opponentPoke.getHealth() > 0.0) {

            System.out.println("Sorry, but your opponent won.");
            System.out.println(yourPoke.getName() + " has fainted.");
            System.out.println(opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.");
            System.exit(0);

        } else if (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() <= 0.0) {

            System.out.println("Congratulations! You won!");
            System.out.println("The foe's " + opponentPoke.getName() + " has fainted.");
            System.out.println(yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");
            System.exit(0);

        }
    } // END health checking subroutine
}
