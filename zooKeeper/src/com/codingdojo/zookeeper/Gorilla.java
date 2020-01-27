package com.codingdojo.zookeeper;

/**
 * Gorilla
 */
public class Gorilla extends Mammal {

    public Gorilla() {
        super("Gorilla");
    }

    public void throwSomething() {
        if (energyLevel < 5) {
            System.err.println("Gorilla has no energy left for throwing anythinf!");
            return;
        }
        energyLevel -= 5;
        System.out.println("The gorilla threw something: -5 energy!");
    }

    public void eatBananas() {
        energyLevel += 10;
        System.out.println("The gorilla ate some bananas: +10 energy!");
    }

    public void climb() {
        if (energyLevel < 10) {
            System.err.println("Gorilla has no energy left for climbing!");
            return;
        }
        energyLevel -= 10;
        System.out.println("The gorilla climbed: -10 energy!");
    }
    
}