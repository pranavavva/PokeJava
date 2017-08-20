package me.pavva.PokeJava;

import java.util.Scanner; //User input
import java.util.Random; //Random numbers

/**
 * me.pavva.PokeJava.App
 * 
 * Entry point to Pokemon Battle Simulator
 * 
 * @author  Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
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

        //DEFINE POKEMON HERE

        Pokemon[] poke = new Pokemon[]{/* INSERT DEFINED POKEMON HERE*/};

        System.out.println(ANSI_GREEN);

        
        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {
            
            System.out.print(p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth()
                + " health points and it knows " + p.getMove1() + ", " + p.getMove2() + ", "
                + p.getMove3() + ", " + p.getMove4() + ".\n");
        }


        System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        int yourPick = s.nextInt();
        int opponentPick = rand.nextInt(poke.length);

        Pokemon yourPoke = new Pokemon();
        Pokemon opponentPoke = new Pokemon();

        System.out.println(ANSI_BLUE);

        if (yourPick < poke.length && yourPick > 0) {

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
        // END POKEMON SELECTION BLOCK

        // BEGIN GAME WHILE LOOP
        while (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() > 0.0) {

            // BEGIN PRE-FIGHT INFO UPDATE
            
            System.out.println(ANSI_BLUE + yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");
            System.out.println("The foe's " + opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.\n");
            
            // END PRE-FIGHT INFO UPDATE
            
            // BEGIN MOVE LIST
            System.out.println(yourPoke.getName() + " knows\n1 - " + yourPoke.getMove1() + "\t2 - " + yourPoke.getMove2() + "\n3 - "
                               + yourPoke.getMove3() + "\t4 - " + yourPoke.getMove4() + ANSI_GREEN);
            System.out.print("Type the number corresponding to the move you would like " + yourPoke.getName()
                             + " to use. Select '5' to switch out to a different Pokemon.\n>> ");
            // END MOVE LIST
            

            // LOOP WHICH ALLOWS USER TO PICK MOVE OR SWITCH POKEMON

            // LOOP WHICH ALLOWS CPU TO PICK MOVE OR SWITCH POKEMON
            
            //BEGIN HEALTH CHECKING BLOCK
            if (yourPoke.getHealth() < 0.0 && opponentPoke.getHealth() > 0.0) {

                System.out.println("Sorry, but your opponent won.");
                System.out.println(yourPoke.getName() + " has fainted.");
                System.out.println(opponentPoke.getName() + " has " + opponentPoke.getHealth() + " health left.");

            } else if (yourPoke.getHealth() > 0.0 && opponentPoke.getHealth() < 0.0) {

                System.out.println("Congratulations! You won!");
                System.out.println("The foe's " + opponentPoke.getName() + " has fainted.");
                System.out.println(yourPoke.getName() + " has " + yourPoke.getHealth() + " health left.");

            } //END HEALTH CHECKING BLOCK
            
        } // END GAME WHILE LOOP

        System.gc();
        s.close();

    }
}
