package me.pavva.pokejava;

import me.pavva.pokejava.pokemon.*;

import java.util.*;

/**
 * Entry point to Pokemon Battle Simulator
 *
 * @author Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @see me.pavva.pokejava.Pokemon
 * @see me.pavva.pokejava.Type
 * @see me.pavva.pokejava.Move
 * @see me.pavva.pokejava.Helper
 * @since Java 1.7
 */
public class App {

    private static final BugPokemon BUG = new BugPokemon();
    private static final DarkPokemon DARK = new DarkPokemon();
    private static final DragonPokemon DRAGON = new DragonPokemon();
    private static final ElectricPokemon ELECTRIC = new ElectricPokemon();
    private static final FairyPokemon FAIRY = new FairyPokemon();
    private static final FightPokemon FIGHT = new FightPokemon();
    private static final FirePokemon FIRE = new FirePokemon();
    private static final FlyingPokemon FLYING = new FlyingPokemon();
    private static final GhostPokemon GHOST = new GhostPokemon();
    private static final GrassPokemon GRASS = new GrassPokemon();
    private static final GroundPokemon GROUND = new GroundPokemon();
    private static final IcePokemon ICE = new IcePokemon();
    private static final NormalPokemon NORMAL = new NormalPokemon();
    private static final PoisonPokemon POISON = new PoisonPokemon();
    private static final PsychicPokemon PSYCHIC = new PsychicPokemon();
    private static final RockPokemon ROCK = new RockPokemon();
    private static final SteelPokemon STEEL = new SteelPokemon();
    private static final WaterPokemon WATER = new WaterPokemon();

    static Scanner sc = new Scanner(System.in);  // Used for User Input
    static Random rand = new Random();           // Random Numbers for CPU move selection
    static Pokemon yourPoke = new Pokemon();
    static Pokemon opponentPoke = new Pokemon();

    static int decision = 0;
    static int opponentDecision = 0;
    static ArrayList<Pokemon> poke = new ArrayList<Pokemon>();


    /**
     * Main method in the Pokemon Battle Simulator
     *
     * @param args A string array created from command-line arguments. Not used in this program.
     */
    public static void main(String[] args) throws IllegalArgumentException {

        int yourPick;
        int opponentPick;

        poke.addAll(Arrays.asList(BUG.p));
        poke.addAll(Arrays.asList(DARK.p));
        poke.addAll(Arrays.asList(DRAGON.p));
        poke.addAll(Arrays.asList(ELECTRIC.p));
        poke.addAll(Arrays.asList(FAIRY.p));
        poke.addAll(Arrays.asList(FIGHT.p));
        poke.addAll(Arrays.asList(FIRE.p));
        poke.addAll(Arrays.asList(FLYING.p));
        poke.addAll(Arrays.asList(GHOST.p));
        poke.addAll(Arrays.asList(GRASS.p));
        poke.addAll(Arrays.asList(GROUND.p));
        poke.addAll(Arrays.asList(ICE.p));
        poke.addAll(Arrays.asList(NORMAL.p));
        poke.addAll(Arrays.asList(POISON.p));
        poke.addAll(Arrays.asList(PSYCHIC.p));
        poke.addAll(Arrays.asList(ROCK.p));
        poke.addAll(Arrays.asList(STEEL.p));
        poke.addAll(Arrays.asList(WATER.p));

        Collections.sort(poke, new Comparator<Pokemon>() {
            public int compare(Pokemon p1, Pokemon p2) {
                return p1.getType().compareTo(p2.getType());
            }
        });

        int k = 1;
        // BEGIN POKEMON SELECTION BLOCK
        for (Pokemon p : poke) {

            System.out.print(k + " - " + p.getName() + " is of type " + p.getType() + ". It has " + p.getHealth() + " health points and it knows "
                    + p.getMove1().getName() + ", " + p.getMove2().getName() + ", " + p.getMove3().getName() + ", "
                    + p.getMove4().getName() + ".\n");
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
            throw new IllegalArgumentException("\n\n" + "Please pick an integer between 1 and " + poke.size()
                    + ", inclusive.\n");
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

