package com.codingdojo.objectmaster;

/**
 * Human
 */
public class Human {

    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human() {
        this(3);
    }

    public Human(int strength) {
        this(strength, 3);
    }

    public Human(int strength, int stealth) {
        this(strength, stealth, 3);
    }

    public Human(int strength, int stealth, int intelligence) {
        this(strength, stealth, intelligence, 100);
    }

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Human target) {
        target.setHealth(target.getHealth()-strength);
    }
}