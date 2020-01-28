package com.codingdojo.objectmaster;

/**
 * HumanTest
 */
public class HumanTest {

    public static void main(String[] args) {
        Human myself = new Human();
        Human another = new Human();
        System.out.println(another.getHealth());
        myself.attack(another);
        myself.attack(another);
        myself.attack(another);
        System.out.println(another.getHealth());
    }
}