package me.pavva.PokeJava;

//TODO Create JavaDoc

public class Pokemon { //Pokemon Object Constructors and get-set methods

    private String name;
    private String type;
    private double health;
    private int    usedMove;
    private String move1;
    private String move2;
    private String move3;
    private String move4;

    public Pokemon(String pokemon_name,
                   String pokemon_type,
                   double pokemon_health,
                   int pokemon_used_move,
                   String pokemon_move1,
                   String pokemon_move2,
                   String pokemon_move3,
                   String pokemon_move4) {

        this.name = pokemon_name;
        this.type = pokemon_type;
        this.health = pokemon_health;
        this.usedMove = pokemon_used_move;
        this.move1 = pokemon_move1;
        this.move2 = pokemon_move2;
        this.move3 = pokemon_move3;
        this.move4 = pokemon_move4;

    }

    public Pokemon() {
        this.name = null;
        this.type = null;
        this.health = 0.0;
        this.usedMove = 0;
        this.move1 = null;
        this.move2 = null;
        this.move3 = null;
        this.move4 = null;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void setHealth(double health) {

        this.health = health;
    }

    public void setUsedMove(int usedMove) {

        this.usedMove = usedMove;
    }

    public void setMove1(String move1) {

        this.move1 = move1;
    }

    public void setMove2(String move2) {

        this.move2 = move2;
    }

    public void setMove3(String move3) {

        this.move3 = move3;
    }

    public void setMove4(String move4) {

        this.move4 = move4;
    }

    public String getName() {

        return this.name;
    }

    public String getType() {

        return this.type;
    }

    public double getHealth() {

        return this.health;
    }

    public int getUsedMove() {

        return this.usedMove;
    }

    public String getMove1() {

        return this.move1;
    }

    public String getMove2() {

        return this.move2;
    }

    public String getMove3() {

        return this.move3;
    }

    public String getMove4() {

        return this.move4;
    }

}