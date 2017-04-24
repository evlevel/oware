
public class Pit
{
	private int numSeeds;
	private Pit next; 
	private Pit previous; 

	public Pit()
	{

	}

	public int getNumSeeds()
	{
		return this.numSeeds;
	}

	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public static void main(String[] args)
	{
		// test the Pit...

		Pit test = new Pit();
		test.setNumSeeds(4);

	}

}
