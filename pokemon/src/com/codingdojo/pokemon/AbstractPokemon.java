package com.codingdojo.pokemon;

/**
 * AbstractPokemon
 */
public abstract class AbstractPokemon implements PokemonInterface {

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        ++Pokemon.numberOfPokemons;
        return new Pokemon(name, health, type);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return pokemon.toString();
    }
    
}