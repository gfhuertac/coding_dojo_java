package com.codingdojo.pokemon;

/**
 * PokedexTest
 */
public class PokedexTest {

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.createPokemon("ditto", 48, "normal");
        Pokemon p2 = pokedex.createPokemon("bulbasaur", 45, "poisson, grass");
        System.out.println(p2);
        pokedex.listPokemon();
    }
}