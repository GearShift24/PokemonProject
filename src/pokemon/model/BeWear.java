package pokemon.model;

public class BeWear extends Pokemon implements Normal, Fighting
{

	public BeWear()
	{
		super("BeWear",760);
	}
	
	public BeWear(String name)
	{
		super(name, 760);
	}
	
	
	public int tackle()
	{
		return 1;
	}
	
	public int maul()
	{
		return this.getHealthPoints() * 10;
	}
	
	public int punch()
	{
		return this.getAttackPoints() * 3;
	}
	
	public int kick()
	{
		return this.getAttackPoints() * 2;
	}
}
