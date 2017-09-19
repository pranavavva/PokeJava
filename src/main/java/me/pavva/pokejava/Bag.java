package me.pavva.pokejava;

import java.util.ArrayList;

public class Bag {
    
    private final String   owner;
    private ArrayList<Item> contents;

    public Bag(String owner, Item i1, Item i2, Item, i3, Item i4, Item i5, Item i6, Item i7) {
        
        this.owner = owner;
        contents = {i1, i2, i3, i4, i5, i6, i7};

    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public ArrayList<Item> getArrayList() {
        return this.contents;
    }
}
