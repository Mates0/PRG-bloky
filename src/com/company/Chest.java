package com.company;

public class Chest extends Block implements ICanBeOpened{
    public Chest(int durability, int size) {
        super(durability, size);
    }

    public String getSound() {
        sound = "eeeeeh";
        return sound;
    }

    @Override
    public void canBeOpened() {
        System.out.println("Tento blok může být otevřen!");
    }
}
