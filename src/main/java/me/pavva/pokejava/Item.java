package me.pavva.pokejava;

public class Item {

    private final String name;
    private final String effect;
    private final int    modifier;

    public Item(String name, String effect, int modifier) {
        this.name = name;
        this.effect = effect;
        this.modifier = modifier;
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
}
