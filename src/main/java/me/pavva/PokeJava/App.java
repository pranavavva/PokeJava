package me.pavva.PokeJava;

import java.util.Scanner; //User input
import java.util.Random; //Random numbers

/**
 * me.pavva.PokeJava.App
 * 
 * Entry point to Pokemon Battle Simulator
 * 
 * @author  Pranav A.   Github: 20avva
 * @version 1.0
 * @see me.pavva.PokeJava.Pokemon
 */
public class App {

    @SuppressWarnings("unused")
    public static void main(String[] args) throws IllegalArgumentException {

        final String ANSI_RESET = "\u001B[0m"; //ANSI Color Codes
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m"; //ANSI Background Color Codes
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        Scanner s = new Scanner(System.in); //Used for User Input
        Random rand = new Random(); //Random Numbers

        Pokemon Chimchar = new Pokemon("Chimchar", "fire", 120, 0, "Flamethrower", "Flame Charge", "Tackle", "Skull Bash");
        Pokemon Bulbasaur = new Pokemon("Bulbasaur", "grass", 120, 0, "Energy Ball", "Solar Ball", "Vine Whip", "Tackle");
        Pokemon Squirtle = new Pokemon("Squirtle", "water", 120, 0, "Aqua Jet", "Hydro Cannon", "Skull Bash", "Crunch");
        Pokemon Pikachu = new Pokemon("Pikachu", "electric", 120, 0, "Thunderbolt", "Electro Ball", "Volt Tackle", "Thunder");

        Pokemon[] poke = new Pokemon[]{Chimchar, Bulbasaur, Squirtle, Pikachu};

        System.out.println(ANSI_GREEN);

        for (int i = 0; i < poke.length; i++) {

            System.out.println(poke[i].getName() + " is of type " + poke[i].getType() + ". It has " + poke[i].getHealth()
                               + " health points and it knows " + poke[i].getMove1() + ", " + poke[i].getMove2() + ", "
                               + poke[i].getMove3() + ", " + poke[i].getMove4() + ".");

        }

        System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        int yourPick = s.nextInt();
        int opponentPick = rand.nextInt(poke.length);

        Pokemon yourPoke = new Pokemon();
        Pokemon opponentPoke = new Pokemon();

        System.out.println(ANSI_BLUE);

        if (yourPick < poke.length && yourPick > poke.length) {

            yourPoke = poke[yourPick - 1];
            opponentPoke = poke[opponentPick];
            System.out.println("You have selected " + yourPoke.getName());
            System.out.println("Your opponent has selected " + opponentPoke.getName());

        } else {

            s.close();
            System.gc();
            throw new IllegalArgumentException("\n\n" + ANSI_RESET + ANSI_RED + "Please pick an integer between 1 and " + poke.length
                                               + ", inclusive.\n" + ANSI_RESET);
        }

        System.out.println(ANSI_RESET + ANSI_PURPLE);

        while (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() > 0.0) {

            System.out.println(ANSI_BLUE + yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");
            System.out.println("The foe's " + opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.\n");

            System.out.println(yourPoke.getName() + " knows\n1 - " + yourPoke.getMove1() + "\t2 - " + yourPoke.getMove2() + "\n3 - "
                               + yourPoke.getMove3() + "\t4 - " + yourPoke.getMove4() + ANSI_GREEN);
            System.out.print("Type the number corresponding to the move you would like " + yourPoke.getName()
                             + " to use. Select '5' to switch out to a different Pokemon.\n>> ");
            yourPoke.setUsedMove(s.nextInt());


            if (yourPoke.getUsedMove() == 1) {

                Pokemon.Attack(yourPoke, opponentPoke, 0.0, 20.0);
                System.out.println(yourPoke.getName() + " used " + yourPoke.getMove1());

            } else if (yourPoke.getUsedMove() == 2) {

                Pokemon.Attack(yourPoke, opponentPoke, 0.0, 18.0);
                System.out.println(yourPoke.getName() + " used " + yourPoke.getMove2());

            } else if (yourPoke.getUsedMove() == 3) {

                Pokemon.Attack(yourPoke, opponentPoke, 5, 25);
                System.out.println(yourPoke.getName() + " used " + yourPoke.getMove3());

            } else if (yourPoke.getUsedMove() == 4) {

                Pokemon.Attack(yourPoke, opponentPoke, 10, 30);
                System.out.println(yourPoke.getName() + " used " + yourPoke.getMove4());

            } else if (yourPoke.getUsedMove() == 5) {

                for (int j = 0; j < poke.length; j++) {

                    System.out.println(poke[j].getName() + " is of type " + poke[j].getType() + ". It has " + poke[j].getHealth()
                                       + " health points and it knows " + poke[j].getMove1() + ", " + poke[j].getMove2() + ", "
                                       + poke[j].getMove3() + ", " + poke[j].getMove4() + ".");

                }

                System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
                yourPick = s.nextInt();
                yourPoke = poke[yourPick - 1];

            } else {

                System.gc();
                s.close();
                throw new IllegalArgumentException(ANSI_RED + "Please enter a number between 1 and 4, inclusive" + ANSI_RESET);

            }

            opponentPoke.setUsedMove(rand.nextInt(4));

            if (opponentPoke.getUsedMove() == 1) {

                Pokemon.Attack(yourPoke, opponentPoke, 10.0, 0.0);
                System.out.println("The foe's " + opponentPoke.getName() + " used " + opponentPoke.getMove1() + "\n");

            } else if (opponentPoke.getUsedMove() == 2) {

                Pokemon.Attack(yourPoke, opponentPoke, 18.0, 0.0);
                System.out.println("The foe's " + opponentPoke.getName() + " used " + opponentPoke.getMove2() + "\n");

            } else if (opponentPoke.getUsedMove() == 3) {

                Pokemon.Attack(yourPoke, opponentPoke, 25.0, 5.0);
                System.out.println("The foe's " + opponentPoke.getName() + " used " + opponentPoke.getMove3() + "\n");

            } else if (opponentPoke.getUsedMove() == 4) {

                Pokemon.Attack(yourPoke, opponentPoke, 30.0, 10.0);
                System.out.println("The foe's " + opponentPoke.getName() + " used " + opponentPoke.getMove4() + "\n");

            }

            if (yourPoke.getHealth() < 0.0 && opponentPoke.getHealth() > 0.0) {

                System.out.println("Sorry, but your opponent won.");
                System.out.println(yourPoke.getName() + " has fainted.");
                System.out.println(opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.");

            } else if (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() < 0.0) {

                System.out.println("Congratulations! You won!");
                System.out.println("The foe's " + opponentPoke.getName() + " has fainted.");
                System.out.println(yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");

            }


        }

        System.gc();
        s.close();

    }
}
