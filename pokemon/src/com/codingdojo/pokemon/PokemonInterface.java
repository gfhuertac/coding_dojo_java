package com.codingdojo.pokemon;

/**
 * PokemonInterface
 */
public interface PokemonInterface {
    /**
     * This method creates and returns Pokemon.
     * 
     * @param name
     * @param health
     * @param type
     * @return
     */
    Pokemon createPokemon(String name, int health, String type); 

    /**
     * This method returns a String with the name, health, and type of the pokemon.
     * @param pokemon
     * @return
     */
    String pokemonInfo(Pokemon pokemon);
    
    /**
     * List all the pokemon names that you have in your pokedex.
     */
    void listPokemon();
}