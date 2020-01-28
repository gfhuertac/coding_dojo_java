package com.codingdojo.objectmaster;

/**
 * Samurai
 */
public class Samurai extends Human {

    private static int howMany = 0;

    public Samurai() {
        super();
        health = 200;
        ++Samurai.howMany;
    }

    public void deathBlow(Human target) {
        target.setHealth(0);
        health /= 2;
    }

    public void meditate() {
        health += health/2;
    }

    public static int howMany() {
        return Samurai.howMany;
    }

}