package me.pavva.PokeJava;

public class Move {
    
    private String name;
    private Type type;
    private int power;
    private int points;
    
    public Move(String name, Type type, int power, int points) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.points = points;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setType(Type type) {
        this.type = type;
    }
    
    public void setPower(int power) {
        this.power = power;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Type getType() {
        return this.type;
    }
    
    public int getPower() {
        return this.power;
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public static void attack(Pokemon attacker, Pokemon defender, Move attackerMove) {
        int level = 100; //level is 100 by default. Might implement a create-your-pokemon feature where level may be chosen, but this is far in future
        int a = attacker.getAttack();
        int d = defender.getDefense();
        int power = attackerMove.getPower();
        double stab = Type.doStabCheck(attackerMove, attacker);
        double effectivity = Type.doEffectCheck(attackerMove, defender);
        double modifier = (stab * effectivity);
        
        double damage = (((((((((2 * level) / 5) + 2) * power) * (a / d))) / 50) + 2) * modifier);
        
        defender.setHealth(defender.getHealth() - damage);
    }
}
