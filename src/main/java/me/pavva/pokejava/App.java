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

    private static final BugPokemon Bug = new BugPokemon();
    private static final DarkPokemon Dark = new DarkPokemon();
    private static final DragonPokemon Dragon = new DragonPokemon();
    private static final ElectricPokemon Electric = new ElectricPokemon();
    private static final FairyPokemon Fairy = new FairyPokemon();
    private static final FightPokemon Fight = new FightPokemon();
    private static final FirePokemon Fire = new FirePokemon();
    private static final FlyingPokemon Flying = new FlyingPokemon();
    private static final GhostPokemon Ghost = new GhostPokemon();
    private static final GrassPokemon Grass = new GrassPokemon();
    private static final GroundPokemon Ground = new GroundPokemon();
    private static final IcePokemon Ice = new IcePokemon();
    private static final NormalPokemon Normal = new NormalPokemon();
    private static final PoisonPokemon Poison = new PoisonPokemon();
    private static final PsychicPokemon Psychic = new PsychicPokemon();
    private static final RockPokemon Rock = new RockPokemon();
    private static final SteelPokemon Steel = new SteelPokemon();
    private static final WaterPokemon Water = new WaterPokemon();

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

        poke.addAll(Arrays.asList(Bug.p));
        poke.addAll(Arrays.asList(Dark.p));
        poke.addAll(Arrays.asList(Dragon.p));
        poke.addAll(Arrays.asList(Electric.p));
        poke.addAll(Arrays.asList(Fairy.p));
        poke.addAll(Arrays.asList(Fight.p));
        poke.addAll(Arrays.asList(Fire.p));
        poke.addAll(Arrays.asList(Flying.p));
        poke.addAll(Arrays.asList(Ghost.p));
        poke.addAll(Arrays.asList(Grass.p));
        poke.addAll(Arrays.asList(Ground.p));
        poke.addAll(Arrays.asList(Ice.p));
        poke.addAll(Arrays.asList(Normal.p));
        poke.addAll(Arrays.asList(Poison.p));
        poke.addAll(Arrays.asList(Psychic.p));
        poke.addAll(Arrays.asList(Rock.p));
        poke.addAll(Arrays.asList(Steel.p));
        poke.addAll(Arrays.asList(Water.p));

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
