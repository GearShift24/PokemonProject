package pokemon.model;

public class Golisopod extends Pokemon implements Bug, Water
{

	public Golisopod()
	{
		super("Golisopod", 768);
	}
	
	public Golisopod(String name)
	{
		super(name,768);
	}
	
	public int surf()
	{
		return 95;
	}
	
	public int rainDance()
	{
		return 0;
	}
	
	public int nibble()
	{
		return 5;
	}
	
	public int stringShot()
	{
		return this.getAttackPoints() + 4;
	}
}
