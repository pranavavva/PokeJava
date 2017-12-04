package me.pavva.pokejava;

import java.util.ArrayList;

public class Bag {
    
    private final String   owner;
    private ArrayList<Item> contents;

    public Bag(String owner, Item i1, Item i2, Item i3, Item i4, Item i5, Item i6, Item i7) {
        
        this.owner = owner;
        this.contents.add(i1);
        this.contents.add(i2);
        this.contents.add(i3);
        this.contents.add(i4);
        this.contents.add(i5);
        this.contents.add(i6);
        this.contents.add(i7);

    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public ArrayList<Item> getArrayList() {
        return this.contents;
    }
}
