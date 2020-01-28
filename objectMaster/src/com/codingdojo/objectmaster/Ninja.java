package com.codingdojo.objectmaster;

/**
 * Ninja
 */
public class Ninja extends Human {

    public Ninja() {
        super();
        stealth = 10;
    }

    public void steal(Human target) {
        target.setHealth(target.getHealth()-stealth);
        health += stealth;
    }

    public void runAway() {
        health -= 10;
    }
    
}