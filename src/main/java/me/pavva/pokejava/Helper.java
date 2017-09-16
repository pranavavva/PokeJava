package me.pavva.pokejava;

/**
 * A helper class which contains all the game logic. Setup logic is preserved
 * in {@link me.pavva.pokejava.App App}. Variables are statically referenced
 * to {@link me.pavva.pokejava.App App}.
 *
 * @see me.pavva.pokejava.App
 */
public class Helper {

    /**
     * A static method which contains the code for the user's game turn.
     */
    static void yourMove() {
        App.decision = App.sc.nextInt();

        switch (App.decision) {
            case 1:
                Move.attack(App.yourPoke, App.opponentPoke, App.yourPoke.getMove1());
                break;
            case 2:
                Move.attack(App.yourPoke, App.opponentPoke, App.yourPoke.getMove2());
                break;
            case 3:
                Move.attack(App.yourPoke, App.opponentPoke, App.yourPoke.getMove3());
                break;
            case 4:
                Move.attack(App.yourPoke, App.opponentPoke, App.yourPoke.getMove4());
                break;
            case 5:

                int k = 1;

                for (Pokemon p : App.poke) {

                    System.out.print(k + " - " + p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth()
                            + " health points and it knows " + p.getMove1().getName() + ", " + p.getMove2().getName() + ", "
                            + p.getMove3().getName() + ", " + p.getMove4().getName() + ".\n");
                    k++;
                }

                System.out.print("\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
                int newYourPick = App.sc.nextInt();

                if (newYourPick <= App.poke.size() && newYourPick > 0) {

                    App.yourPoke = App.poke.get(newYourPick - 1);
                    System.out.println("You have selected " + App.yourPoke.getName());
                    System.out.println("Your opponent has selected " + App.opponentPoke.getName());

                } else {

                    App.sc.close();
                    System.gc();
                    throw new IllegalArgumentException("\n\n" + "Please pick an integer between 1 and "
                            + App.poke.size() + ", inclusive.\n");
                }
                break;

            default:
                throw new IllegalArgumentException("\n\n"
                        + "Please select an integer between 1 and 5, inclusive.");
        }
    }


    /**
     * A static method which contains the code for the CPU's game turn
     */
    static void opponentMove() {

        App.opponentDecision = App.rand.nextInt(4);

        switch (App.opponentDecision) {
            case 0:
                Move.attack(App.opponentPoke, App.yourPoke, App.opponentPoke.getMove1());
                System.out.println(App.opponentPoke.getName() + " used " + App.opponentPoke.getMove1().getName());
                break;
            case 1:
                Move.attack(App.opponentPoke, App.yourPoke, App.opponentPoke.getMove2());
                System.out.println(App.opponentPoke.getName() + " used " + App.opponentPoke.getMove2().getName());
                break;
            case 2:
                Move.attack(App.opponentPoke, App.yourPoke, App.opponentPoke.getMove3());
                System.out.println(App.opponentPoke.getName() + " used " + App.opponentPoke.getMove3().getName());
                break;
            case 3:
                Move.attack(App.opponentPoke, App.yourPoke, App.opponentPoke.getMove4());
                System.out.println(App.opponentPoke.getName() + " used " + App.opponentPoke.getMove4().getName());
                break;
        }
    }

    /**
     * A static method which checks the health value of each pokemon to determine the winner.
     * This is done by checking if a pokemon's health is at or below zero, whilst the other's
     * health value is above 0. If neither pokemon's health value is at or below 0, the game
     * continues.
     */
    static void healthCheck() {
        if (App.yourPoke.getHealth() <= 0.0 && App.opponentPoke.getHealth() > 0.0) {

            System.out.println("Sorry, but your opponent won.");
            System.out.println(App.yourPoke.getName() + " has fainted.");
            System.out.println(App.opponentPoke.getName() + " has " + App.opponentPoke.getHealth() + " health left.");
            System.exit(0);

        } else if (App.yourPoke.getHealth() > 0.0 && App.opponentPoke.getHealth() <= 0.0) {

            System.out.println("Congratulations! You won!");
            System.out.println("The foe's " + App.opponentPoke.getName() + " has fainted.");
            System.out.println(App.yourPoke.getName() + " has " + App.yourPoke.getHealth() + " health left.");
            System.exit(0);

        }
    }

    /**
     * A static method which lists the moves yourPoke known. Used at the beginning of each turn
     */
    static void moveList() {
        System.out.println(App.yourPoke.getName() + " knows\n1 - " + App.yourPoke.getMove1().getName() + "\t2 - "
                + App.yourPoke.getMove2().getName() + "\n3 - " + App.yourPoke.getMove3().getName() + "\t4 - "
                + App.yourPoke.getMove4().getName());
        System.out.print("Type the number corresponding to the move you would like " + App.yourPoke.getName()
                + " to use. Select '5' to switch out to a different Pokemon.\n>> ");
    }

    /**
     * Lists the amount of health each pokemon has left. Used at the beginning of each turn.
     */
    static void infoUpdate() {
        System.out.println( App.yourPoke.getName() + " has " + App.yourPoke.getHealth() + " health left.");
        System.out.println("The foe's " + App.opponentPoke.getName() + " has " + App.opponentPoke.getHealth() + " health left.\n");
    }
}
