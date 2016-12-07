package pokemon.model;

public class Taros extends Pokemon implements Normal
{
	
	public Taros()
	{
		super("Taros",128);
	}
	
	public Taros(String name)
	{
		super(name,128);
	}
	
	
	public int tackle()
	{
		return 1;
	}
	
	public int maul()
	{
		return this.getHealthPoints() * 10;
	}
	
}
