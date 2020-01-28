package com.codingdojo.objectmaster;

/**
 * Wizard
 */
public class Wizard extends Human {

    public Wizard() {
        super();
        health = 50;
        intelligence = 8;
    }

    public void heal(Human target) {
        target.setHealth(target.getHealth()+intelligence);
    }

    public void fireball(Human target) {
        target.setHealth(target.getHealth()-intelligence*3);
    }
}