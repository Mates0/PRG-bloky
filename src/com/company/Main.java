package com.company;

public class Main {

    public static void main(String[] args) {
        Grass grass = new Grass(400, 100);
        grass.canBeTurnedIntoSoil();
        System.out.println(grass.getSound());
        Chest chest = new Chest(200,200);
        chest.canBeOpened();
        System.out.println(chest.getSound());
    }
}
