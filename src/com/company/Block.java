package com.company;

public class Block {
    protected int durability;
    protected int size;
    protected String sound;

    public int getDurability() {
        return durability;
    }

    public int getSize() {
        return size;
    }

    public String getSound() {
        return sound;
    }

    public Block(int durability, int size) {
        this.durability = durability;
        this.size = size;
    }
}
