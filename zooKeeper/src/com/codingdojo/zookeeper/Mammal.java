package com.codingdojo.zookeeper;

/**
 * Mammal
 */
public class Mammal extends Animal {

    protected int energyLevel;

    public Mammal(String name) {
        this(name, 100);
    }

    public Mammal(String name, int energyLevel) {
        super(name);
        this.energyLevel = energyLevel;
    }

    /**
     * @return the energyLevel
     */
    public int getEnergyLevel() {
        return energyLevel;
    }

    /**
     * @param energyLevel the energyLevel to set
     */
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }
    
}