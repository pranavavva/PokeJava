package me.pavva.pokejava;

public class Item {

    private final String name;
    private final String effect;
    private final int    modifier;
    private boolean used;

    public Item(String name, String effect, int modifier) {
        this.name = name;
        this.effect = effect;
        this.modifier = modifier;
        this.used = false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEffect() {
        return this.effect;
    }
    
    public int getModifier() {
        return this.modifier;
    }
    
    public void setUsed(boolean bool) {
        this.used = bool;
    }
    
    public boolean getUsed() {
        return used;
    }
}
