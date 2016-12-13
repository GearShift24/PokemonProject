package pokemon.controller;

import javax.swing.JOptionPane;

//import pokemon.model.Pokemon;
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.ArrayList;

public class PokemonController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame pokemonFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		pokemonFrame = new PokemonFrame(this);
	}
	
	
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(pokemonFrame,  "Welcome to Pokemon Stats Stuff!");
	}

	
	private void buildPokedex()
	{
		pokedex.add(new BeWear("Bear ( ͡° ͜ʖ ͡°)"));
		pokedex.add(new Barbaracle("HandFace"));
		pokedex.add(new Golisopod("TEAM SKULLS BOI"));
		pokedex.add(new Taros("The Bull"));
		pokedex.add(new Golisopod("Guzma"));
		pokedex.add(new Nosepass("THE ROCK"));
		
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		return pokemonNames;
	}

	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getPokemonFrame()
	{
		return pokemonFrame;
	}
}
