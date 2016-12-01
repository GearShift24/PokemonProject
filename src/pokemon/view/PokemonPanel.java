package pokemon.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.updateButton = new JButton("Update Your Stats Fool!");
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, -60, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, -312, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -33, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -39, SpringLayout.EAST, this);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, updateButton);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -164, SpringLayout.EAST, this);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 284, SpringLayout.NORTH, this);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"BeWear", "Barbaracle", "Taros", "Golisopod", "Nosepass"});
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 58, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, 186, SpringLayout.WEST, this);
		this.combatLabel = new JLabel("Attack Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 6, SpringLayout.EAST, combatLabel);
		this.speedLabel = new JLabel("Speed Rate:");
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 6, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 14, SpringLayout.SOUTH, combatLabel);
		this.healthLabel = new JLabel("Health Points:");
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 290, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 15, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -302, SpringLayout.EAST, this);
		this.numberLabel = new JLabel("Pokemon Number:");
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 12, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 140, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -367, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, -295, SpringLayout.EAST, this);
		this.nameLabel = new JLabel("Pokemon Name Is:");
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, pokedexSelector);
		this.pokemonLabel = new JLabel("The Current Pokemon");
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 82, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 120, SpringLayout.SOUTH, pokedexSelector);
		this.advancedLabel = new JLabel("Advanced Poke-info");
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -34, SpringLayout.NORTH, updateButton);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -119, SpringLayout.EAST, this);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		this.setBackground(Color.GRAY);
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(healthField);
		this.add(healthLabel);
		this.add(combatField);
		this.add(combatLabel);
		this.add(speedField);
		this.add(speedLabel);
		this.add(pokemonLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(nameField);
		this.add(numberField);
	
	}
	
	public void setupLayout()
	{
		
	}
	
	
	public void setupListeners()
	{
		
	}
}
