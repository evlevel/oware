
public class Pit
{
	private int numSeeds;
	private Pit next;
	private Pit previous;
	private int pitNumber;

	public Pit(int pnum)
	{
		numSeeds = 4;
		pitNumber = pnum;
	}
	
	public void setPrevious(Pit p)
	{
		previous = p;
	}
	
	public void setNext(Pit p)
	{
		next = p;
	}
	
	public Pit getNext()
	{
		return next;
	}
	
	public Pit getPrevious()
	{
		return previous;
	}
	
	public int getPitNumber()
	{
		return pitNumber;
	}
	
	public int getNumSeeds()
	{
		return this.numSeeds;
	}

	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public int getAllSeeds()
	{
		// get and remove all seeds
		
		int temp = numSeeds;
		numSeeds = 0;
		return temp;
	}
	
	public void emptyPit()
	{
		// Sometimes we want to only empty house
		numSeeds = 0;
	}
	
	public void sowOneSeed()
	{
		numSeeds++;
	}
	
	public static void main(String[] args)
	{
		// test the Pit...

		Pit test = new Pit(0);
		test.setNumSeeds(4);

	}

}
