package com.codingdojo.objectmaster;

/**
 * FullTest
 */
public class FullTest {

    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Wizard wizard = new Wizard();
        System.out.println(ninja.getHealth());
        System.out.println(samurai.getHealth());
        System.out.println(wizard.getHealth());
        ninja.steal(samurai);
        ninja.attack(samurai);
        wizard.fireball(samurai);
        samurai.meditate();
        samurai.deathBlow(wizard);
        ninja.runAway();
        System.out.println(ninja.getHealth());
        System.out.println(samurai.getHealth());
        System.out.println(wizard.getHealth());
    }
}