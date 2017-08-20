package me.pavva.PokeJava;

public class Move {
    
    private Type type;
    private int power;
    private int points;
    
    public Move(Type type, int power, int points) {
        this.type = type;
        this.power = power;
        this.points = points;
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
    
    public Type getType() {
        return this.type;
    }
    
    public int getPower() {
        return this.power;
    }
    
    public int getPoints() {
        return this.points;
    }
    public void Attack(Pokemon attacker, Pokemon defender, Move attackerMove) {
        int level = 100; //level is 100 by default. Might implement a create-your-pokemon feature where level may be chosen, but this is far in future
        int a = attacker.getAttack();
        int d = defender.getDefense();
        int power = attackerMove.getPower();
        double stab = Type.doStabCheck(attackerMove, attacker);
        double effectivity = Type.doEffectCheck(attackerMove, defender);
        
        double damage = ((((((2 * level) / 5) + 2) * power * (a / d)) / 50) + 2) * stab * effectivity;
        
        defender.setHealth(defender.getHealth() - damage);
    }
}
