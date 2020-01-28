package com.codingdojo.pokemon;

public class Pokemon {
    
    protected static int numberOfPokemons = 0;

    protected String name;
    protected double health;
    protected String type;

	protected Pokemon(String name, double health, String type) {
		this.name = name;
		this.health = health;
        this.type = type;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }

	@Override
	public String toString() {
		return "Pokemon [health=" + health + ", name=" + name + ", type=" + type + "]";
	}
    
}
