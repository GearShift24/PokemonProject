package pokemon.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
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
	private JLabel titleImage;
	private ImageIcon pokemonBigTitleImage;
	
	
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/beastball.png"));
		this.pokemonBigTitleImage = new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png"));
		this.updateButton = new JButton("Update Your Stats Fool!");
		this.nameField = new JTextField(25);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(baseController.buildPokedexText());
		this.combatLabel = new JLabel("Attack Points:");
		this.speedLabel = new JLabel("Speed Rate:");
		this.healthLabel = new JLabel("Health Points:");
		this.numberLabel = new JLabel("Pokemon Number:");
		this.nameLabel = new JLabel("Pokemon Name Is:");
		this.pokemonLabel = new JLabel("The Current Pokemon", pokemonIcon, SwingConstants.CENTER);
		this.advancedLabel = new JLabel("Advanced Poke-info");
		this.titleImage = new JLabel(pokemonBigTitleImage);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupDropdown();
	}
	
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		this.setBackground(Color.LIGHT_GRAY);
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
		this.add(titleImage);
		
	
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 510, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 175, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -168, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -155, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, healthField);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, 284, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		baseLayout.putConstraint(SpringLayout.NORTH, titleImage, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleImage, 57, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, titleImage, -79, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 181, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 14, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 6, SpringLayout.NORTH, numberField);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 290, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatLabel, 15, SpringLayout.SOUTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, 0, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, -302, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 6, SpringLayout.EAST, speedLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 14, SpringLayout.SOUTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 6, SpringLayout.EAST, combatLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 14, SpringLayout.SOUTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -217, SpringLayout.EAST, this);
		pokemonLabel.setBackground(Color.LIGHT_GRAY);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -56, SpringLayout.NORTH, updateButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -55, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -139, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonLabel, -133, SpringLayout.WEST, updateButton);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 259, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, 450, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 261, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -55, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -39, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleImage, 149, SpringLayout.NORTH, this);
	}
	
	
	private void setupDropdown()
	{
		
	}
	
	private void setupListeners()
	{
		
		pokedexSelector.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHealthPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() 
						+ "\n" + baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());
				
				
			}
		});
	
		updateButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection)
			{
			if(isValidName(nameField.getText()) && isValidInteger(combatField.getText()) && isValidInteger(healthField.getText()) && isValidDouble(speedField.getText()) && isValidInteger(speedField.getText()))
					{
						//what stuff in here
					}
			}
		});
	}
	
		
		private void changeColorBaseOnData(String data)
		{
		if(data.contains("Normal"))
		{
			this.setBackground(Color.LIGHT_GRAY);
		}
		else if (data.contains("Fighting"))
		{
			this.setBackground(Color.PINK);
		}
		repaint();
		}
		//do for ROCK WATER BUG
		
		
		
		private void changeImageDisplay(String name)
		{
			String path = "/pokemon/view/images/";
			String defaultName = "beastball";
			String extension = ".png";
			try
			{
				pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
				pokemonLabel.setIcon(pokemonIcon);
			}
			catch (NullPointerException missingFile)
			{
				pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
				pokemonLabel.setIcon(pokemonIcon);
			}
			repaint();
		}
		
		private boolean isValidDouble(String input)
		{
			
		}
		private boolean isValidInteger(String input)
		{
			
		}
		private boolean isValidName(String name)
		{
			
		}
}
