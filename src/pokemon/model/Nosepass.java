package pokemon.model;

public class Nosepass extends Pokemon implements Rock
{

	public Nosepass()
	{
		super("Nosepass",299);
	}
	
	public Nosepass(String name)
	{
		super(name,299);
	}
	
	public int rockThrow()
	{
		return this.getAttackPoints() * 30 + this.getHealthPoints();
	}
	
	public int sandstorm()
	{
		return 0;
	}
}
