package pokemon.model;

public class Barbaracle extends Pokemon implements Water, Rock
{

	public Barbaracle()
	{
		super("Barbaracle", 689);
	}
	
	
	public Barbaracle(String name)
	{
		super(name, 689);
	}
	
	public int rockThrow()
	{
		return this.getAttackPoints() * 30 + this.getHealthPoints();
	}
	
	public int sandstorm()
	{
		return 0;
	}
	
	public int surf()
	{
		return 95;
	}
	
	public int rainDance()
	{
		return 0;
	}
}
