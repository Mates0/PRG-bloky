package com.company;

public class Grass extends Block implements ICanBeTurnedIntoSoil {
    public Grass(int durability, int size) {
        super(durability, size);
    }

    public String getSound() {
        sound = "chrchrchr";
        return sound;
    }

    @Override
    public void canBeTurnedIntoSoil() {
        System.out.println("Tento blok může být zorán!");
    }
}
