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
    static final BugPokemon      bug                    = new BugPokemon();
    static final DarkPokemon     dark                   = new DarkPokemon();
    static final DragonPokemon   dragon                 = new DragonPokemon();
    static final ElectricPokemon electric               = new ElectricPokemon();
    static final FairyPokemon    fairy                  = new FairyPokemon();
    static final FightPokemon    flight                 = new FightPokemon();
    static final FirePokemon     fire                   = new FirePokemon();
    static final FlyingPokemon   flying                 = new FlyingPokemon();
    static final GhostPokemon    ghost                  = new GhostPokemon();
    static final GrassPokemon    grass                  = new GrassPokemon();
    static final GroundPokemon   ground                 = new GroundPokemon();
    static final IcePokemon      ice                    = new IcePokemon();
    static final NormalPokemon   normal                 = new NormalPokemon();
    static final PoisonPokemon   poison                 = new PoisonPokemon();
    static final PsychicPokemon  psychic                = new PsychicPokemon();
    static final RockPokemon     rock                   = new RockPokemon();
    static final SteelPokemon    steel                  = new SteelPokemon();
    static final WaterPokemon    water                  = new WaterPokemon();


    static final String          ANSI_RESET             = "\u001B[0m";          // ANSI Color Codes
    static final String          ANSI_BLACK             = "\u001B[30m";
    static final String          ANSI_RED               = "\u001B[31m";
    static final String          ANSI_GREEN             = "\u001B[32m";
    static final String          ANSI_YELLOW            = "\u001B[33m";
    static final String          ANSI_BLUE              = "\u001B[34m";
    static final String          ANSI_PURPLE            = "\u001B[35m";
    static final String          ANSI_CYAN              = "\u001B[36m";
    static final String          ANSI_WHITE             = "\u001B[37m";

    static final String          ANSI_BLACK_BACKGROUND  = "\u001B[40m";         // ANSI Background Color Codes
    static final String          ANSI_RED_BACKGROUND    = "\u001B[41m";
    static final String          ANSI_GREEN_BACKGROUND  = "\u001B[42m";
    static final String          ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    static final String          ANSI_BLUE_BACKGROUND   = "\u001B[44m";
    static final String          ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    static final String          ANSI_CYAN_BACKGROUND   = "\u001B[46m";
    static final String          ANSI_WHITE_BACKGROUND  = "\u001B[47m";

    /**
     * Main method in the Pokemon Battle Simulator
     * @param args A string array created from command-line arguments. Not used in this program.
     */
    public static void main(String[] args) throws IllegalArgumentException {


        Scanner sc = new Scanner(System.in); // Used for User Input
        Random rand = new Random(); // Random Numbers for CPU move selection

        ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
        poke.add(fire.charizard);
        poke.add(water.blastoise);
        poke.add(grass.venusaur);

        System.out.println(ANSI_GREEN);


        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {

            System.out.print(p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth() + " health points and it knows "
                             + p.getMove1().getName() + ", " + p.getMove2().getName() + ", " + p.getMove3().getName() + ", "
                             + p.getMove4().getName() + ".\n");
        }


        System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        int yourPick = sc.nextInt();
        int opponentPick = rand.nextInt(poke.size());

        Pokemon yourPoke = new Pokemon();
        Pokemon opponentPoke = new Pokemon();

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
            int decision = sc.nextInt();

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
                    throw new IllegalArgumentException("\n\n" + ANSI_RESET + ANSI_RED
                                                       + "Please select an integer between 1 and 5, inclusive." + ANSI_RESET);
            }
            //END YOUR MOVE

            // BEGIN HEALTH CHECKING BLOCK
            if (yourPoke.getHealth() < 0.0 && opponentPoke.getHealth() > 0.0) {

                System.out.println("Sorry, but your opponent won.");
                System.out.println(yourPoke.getName() + " has fainted.");
                System.out.println(opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.");
                System.exit(0);

            } else if (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() < 0.0) {

                System.out.println("Congratulations! You won!");
                System.out.println("The foe's " + opponentPoke.getName() + " has fainted.");
                System.out.println(yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");
                System.exit(0);

            } // END HEALTH CHECKING BLOCK

            // BEGIN OPPONENT MOVE

            int opponentDecision = rand.nextInt(4);

            switch (opponentDecision) {
                case 0:
                    Move.attack(opponentPoke, yourPoke, opponentPoke.getMove1());
                    break;
                case 1:
                    Move.attack(opponentPoke, yourPoke, opponentPoke.getMove2());
                    break;
                case 2:
                    Move.attack(opponentPoke, yourPoke, opponentPoke.getMove3());
                    break;
                case 3:
                    Move.attack(opponentPoke, yourPoke, opponentPoke.getMove4());
                    break;
            }

            // END OPPONENT MOVE

            // BEGIN HEALTH CHECKING BLOCK
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

            } // END HEALTH CHECKING BLOCK

        } // END GAME WHILE LOOP

        System.gc();
        sc.close();

    }
}
