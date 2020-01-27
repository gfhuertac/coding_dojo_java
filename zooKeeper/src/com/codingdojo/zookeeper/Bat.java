package com.codingdojo.zookeeper;

/**
 * Bat
 */
public class Bat extends Mammal {

    public Bat() {
        super("Bat");
    }

    public void fly() {
        if (energyLevel < 50) {
            System.err.println("Bat has no energy left for flying!");
            return;
        }
        energyLevel -= 50;
        System.out.println("The bat flew (whick whick whick): -50 energy!");
    }

    public void eatHumans() {
        energyLevel += 25;
        System.out.println("The bat ate some humans (horror screaming): +25 energy!");
    }

    public void attackTown() {
        if (energyLevel < 100) {
            System.err.println("Bat has no energy left for attacking!");
            return;
        }
        energyLevel -= 100;
        System.out.println("The bat attacked your town (crack crep): -100 energy!");
    }
    
}