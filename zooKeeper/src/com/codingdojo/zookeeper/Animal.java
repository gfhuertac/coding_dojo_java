package com.codingdojo.zookeeper;

/**
 * Animal
 */
public class Animal {

    protected String name;

    public Animal() {
        this(null);
    }

    public Animal(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}