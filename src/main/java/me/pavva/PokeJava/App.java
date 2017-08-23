package me.pavva.PokeJava;

import java.util.Scanner; // User input
import java.util.Random; // Random numbers
import java.util.ArrayList;

/**
 * me.pavva.PokeJava.App
 * 
 * Entry point to Pokemon Battle Simulator
 * 
 * @author  Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 3.0
 * @since Java 1.7
 * @see me.pavva.PokeJava.Pokemon
 */
public class App {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws IllegalArgumentException {

        final String ANSI_RESET = "\u001B[0m"; // ANSI Color Codes
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m"; // ANSI Background Color Codes
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        Scanner sc = new Scanner(System.in); // Used for User Input
        Random rand = new Random(); // Random Numbers for CPU move selection

        // DEFINE MOVES HERE 
        // TODO: Sort by Type
        // TODO: Move moves into a seperate class. Moves.java
        Move wingAttack = new Move("Wing Attack", Type.FLYING, 60, 35);
        Move flareBlitz = new Move("Flare Blitz", Type.FIRE, 120, 15);
        Move heatWave = new Move("Heat Wave", Type.FIRE, 95, 10);
        Move dragonClaw = new Move("Dragon Claw", Type.DRAGON, 80, 15);
        Move flashCannon = new Move("Flash Cannon", Type.STEEL, 80, 10);
        Move waterPulse = new Move("Water Pulse", Type.WATER, 60, 20);
        Move bite = new Move("Bite", Type.DARK, 60, 25);
        Move hydroPump = new Move("Hydro Pump", Type.WATER, 150, 5);
        Move petalDance = new Move("Petal Dance", Type.GRASS, 120, 10);
        Move solarBeam = new Move("Solar Beam", Type.GRASS, 120, 10);
        Move sludgeBomb = new Move("Sludge Bomb", Type.POISON, 90, 10);
        Move earthquake = new Move("Earthquake", Type.GROUND, 100, 10);

        // DEFINE POKEMON HERE
        Pokemon charizard = new Pokemon("Charizard", Type.FIRE, 360.0, 293, 280, wingAttack, flareBlitz, heatWave, dragonClaw);
        Pokemon blastoise = new Pokemon("Blastoise", Type.WATER, 362.0, 291, 328, flashCannon, waterPulse, bite, hydroPump);
        Pokemon venusaur = new Pokemon("Venusaur", Type.GRASS, 364.0, 289, 291, petalDance, solarBeam, sludgeBomb, earthquake);


        ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
        poke.add(charizard);
        poke.add(blastoise);
        poke.add(venusaur);

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
