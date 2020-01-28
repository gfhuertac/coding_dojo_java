package com.codingdojo.pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Pokedex
 */
public class Pokedex extends AbstractPokemon {

    private List<Pokemon> storedPokemons;

    public Pokedex() {
        storedPokemons = new ArrayList<>();
    }

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon p = super.createPokemon(name, health, type);
        storedPokemons.add(p);
        return p;
    }

    @Override
    public void listPokemon() {
        for(Pokemon p: storedPokemons) {
            System.out.println(p.name);
        }
    }
    
}